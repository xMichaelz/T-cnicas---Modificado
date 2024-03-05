package com.mycompany.hotelfollowers;

public class Recepcionist extends Empleado {
    private String role;
    private String schedule;

    public Recepcionist() {
    }

    public Recepcionist(String role, String schedule) {
        this.role = role;
        this.schedule = schedule;
    }

    public Recepcionist(String name, long id, long phoneNo, String location, String role, String schedule) {
        super(name, id, phoneNo, location);
        this.role = role;
        this.schedule = schedule;
    }

    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "Recepcionist{" +
                "name='" + getName() + '\'' +
                ", id=" + getId() +
                ", phoneNo=" + getPhoneNo() +
                ", location='" + getLocation() + '\'' +
                ", role='" + role + '\'' +
                ", schedule='" + schedule + '\'' +
                '}';
    }
}
