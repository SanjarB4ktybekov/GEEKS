package com.example.demo.model;

public class Task {
    private int id;
    private String title;
    private String description;
    private Boolean completed = false;
    private Boolean created = false;
    public Task() {
        this.created = true;
    }


    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String discription) {
        this.description = discription;
    }

    public void setCompleted(Boolean completed) {
        this.completed = completed;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public Boolean getCompleted() {
        return completed;
    }

    public Boolean getCreated() {
        return created;
    }
}