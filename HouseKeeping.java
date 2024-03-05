package com.mycompany.hotelfollowers;

public class HouseKeeping extends Empleado{
    private String role;
    private String schedule;

    public HouseKeeping() {
    }

    public HouseKeeping(String role, String schedule) {
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
        return "HouseKeeping{" + "role=" + role + ", schedule=" + schedule + '}';
    }
    
    
}
