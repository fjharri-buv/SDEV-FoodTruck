package com.example.foodtruck.model;

public class Order {
    private int id;
    private String item;
    private String notes;
    private String status;
    private String createdAt;

    public Order() {
    }

    public Order(int id, String item, String notes, String status, String createdAt) {
        this.id = id;
        this.item = item;
        this.notes = notes;
        this.status = status;
        this.createdAt = createdAt;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }
}
