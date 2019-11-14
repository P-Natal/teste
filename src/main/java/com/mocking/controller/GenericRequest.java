package com.mocking.controller;

public class GenericRequest {
    private String param1;
    private int param2;
    private boolean param3;
    private GenericObject param4;

    @Override
    public String toString() {
        return "GenericRequest{" +
                "param1='" + param1 + '\'' +
                ", param2=" + param2 +
                ", param3=" + param3 +
                ", param4=" + param4.toString() +
                '}';
    }
}
