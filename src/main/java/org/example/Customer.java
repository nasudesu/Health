package org.example;
import jakarta.persistence.*;
import java.util.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int custId;

    private String firstname;

    private String lastname;

    @ManyToMany(mappedBy = "customers", fetch = FetchType.EAGER)
    private List<Clinic> clinics = new ArrayList<>();

    @OneToOne(mappedBy = "customer", fetch = FetchType.EAGER)
    private BasicProfile basicprofile;

    public Customer() {
    }

    public Customer(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public int getCustId() {
        return custId;
    }

    public void setCustId(int custId) {
        this.custId = custId;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public List<Clinic> getClinics() {
        return clinics;
    }

    public void setClinics(Clinic clinic) {
        this.clinics.add(clinic);
    }

    public BasicProfile getBasicprofile() {
        return basicprofile;
    }

    public void setBasicprofile(BasicProfile basicprofile) {
        this.basicprofile = basicprofile;
    }
}
