package com.kaniademianchuk.model;

public class Device {
    private long id;
    private String name;

    public Device(long id, String name){
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void describe(){
        System.out.println("Id: " + id + " \nName: " + name);
    }
}
