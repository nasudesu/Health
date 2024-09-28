package org.example;
import jakarta.persistence.*;
import java.util.*;

@Entity
public class Clinic {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int clinicId;

    private double location;

    @ManyToMany(fetch = FetchType.EAGER)
    private List<Customer> customers = new ArrayList<>();

    public Clinic() {
    }

    public Clinic(double location) {
        this.location = location;
    }

    public int getClinicId() {
        return clinicId;
    }

    public void setClinicId(int clinicId) {
        this.clinicId = clinicId;
    }

    public double getLocation() {
        return location;
    }

    public void setLocation(double location) {
        this.location = location;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(Customer customer) {
        this.customers.add(customer);

    }
}
