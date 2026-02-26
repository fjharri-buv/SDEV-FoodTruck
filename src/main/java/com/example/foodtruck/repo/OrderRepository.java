package com.example.foodtruck.repo;

import com.example.foodtruck.model.Order;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class OrderRepository {
    private final List<Order> orders = new ArrayList<>();
    private int nextId = 1;

    public List<Order> findAll() {
        return new ArrayList<>(orders);
    }

    public Order findById(int id) {
        for (Order order : orders) {
            if (order.getId() == id) {
                return order;
            }
        }
        return null;
    }

    public Order save(Order order) {
        order.setId(nextId++);
        orders.add(order);
        return order;
    }

    public boolean delete(int id) {
        return orders.removeIf(order -> order.getId() == id);
    }

    public Order updateStatus(int id, String status) {
        Order order = findById(id);
        if (order == null) {
            return null;
        }
        order.setStatus(status);
        return order;
    }
}
