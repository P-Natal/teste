package com.mocking.controller;

public class GenericObject {
    private long id;
    private String description;

    @Override
    public String toString() {
        return "GenericObject{" +
                "id=" + id +
                ", description='" + description + '\'' +
                '}';
    }
}
