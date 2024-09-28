package org.example;
import jakarta.persistence.*;
import java.util.*;

@Entity
public class BasicProfile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int profileId;

    private int birthyear;

    private int weight;

    private int height;

    @OneToOne
    @JoinColumn(name = "customer_id", referencedColumnName = "custId")
    private Customer customer;

    @OneToOne
    @JoinColumn(name = "regular_customer_id", referencedColumnName = "custId")
    private RegularCustomer regularCustomer;

    public BasicProfile() {
    }

    public BasicProfile(int birthyear, int weight, int height) {
        this.birthyear = birthyear;
        this.weight = weight;
        this.height = height;
    }

    public int getProfileId() {
        return profileId;
    }

    public void setProfileId(int profileId) {
        this.profileId = profileId;
    }

    public int getBirthyear() {
        return birthyear;
    }

    public void setBirthyear(int birthyear) {
        this.birthyear = birthyear;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public RegularCustomer getRegularCustomer() {
        return regularCustomer;
    }

    public void setRegularCustomer(RegularCustomer regularCustomer) {
        this.regularCustomer = regularCustomer;
    }
}
