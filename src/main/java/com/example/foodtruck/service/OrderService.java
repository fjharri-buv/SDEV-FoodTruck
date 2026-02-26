package com.example.foodtruck.service;

import com.example.foodtruck.model.Order;
import com.example.foodtruck.repo.OrderRepository;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.List;
import java.util.Set;

@Service
public class OrderService {
    private static final Set<String> ALLOWED_STATUSES = Set.of("NEW", "COOKING", "READY", "COLLECTED");

    private final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public List<Order> getAll() {
        return orderRepository.findAll();
    }

    public Order getById(int id) {
        return orderRepository.findById(id);
    }

    public Order create(String item, String notes) {
        validateItem(item);

        Order order = new Order();
        order.setItem(item.trim());
        order.setNotes(notes == null ? "" : notes.trim());
        order.setStatus("NEW");
        order.setCreatedAt(Instant.now().toString());

        return orderRepository.save(order);
    }

    public Order updateStatus(int id, String status) {
        validateStatus(status);
        return orderRepository.updateStatus(id, status.trim().toUpperCase());
    }

    public boolean delete(int id) {
        return orderRepository.delete(id);
    }

    private void validateItem(String item) {
        if (item == null || item.trim().isEmpty()) {
            throw new IllegalArgumentException("item must not be blank");
        }
    }

    private void validateStatus(String status) {
        if (status == null || status.trim().isEmpty()) {
            throw new IllegalArgumentException("status must not be blank");
        }

        String normalizedStatus = status.trim().toUpperCase();
        if (!ALLOWED_STATUSES.contains(normalizedStatus)) {
            throw new IllegalArgumentException("invalid status");
        }
    }
}
