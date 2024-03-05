package com.mycompany.hotelfollowers;

public class Empleado {
    private String name;
    private long id;
    private long phoneNo;
    private String location;

    public Empleado() {
    }

    public Empleado(String name, long id, long phoneNo, String location) {
        this.name = name;
        this.id = id;
        this.phoneNo = phoneNo;
        this.location = location;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(long phoneNo) {
        this.phoneNo = phoneNo;
    }
    

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Empleado{" + "name=" + name + ", id=" + id + ", phoneNo=" + phoneNo + ", location=" + location + '}';
    }

    
}
