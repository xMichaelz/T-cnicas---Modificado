package com.mycompany.hotelfollowers;

public class Manager extends Empleado{
    private String role;
    private String schedule;

    public Manager() {
    }

    public Manager(String role, String schedule) {
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
        return "Manager{" + "role=" + role + ", schedule=" + schedule + '}';
    }
    
}
