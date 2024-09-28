package org.example;

import jakarta.persistence.*;

@Entity
public class RegularCustomer extends Customer {

    private String membershipLevel;

    public RegularCustomer() {
    }

    public RegularCustomer(String firstname, String lastname, String membershipLevel) {
        super(firstname, lastname);
        this.membershipLevel = membershipLevel;
    }

    public String getMembershipLevel() {
        return membershipLevel;
    }

    public void setMembershipLevel(String membershipLevel) {
        this.membershipLevel = membershipLevel;
    }
}