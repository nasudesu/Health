package org.example;
import jakarta.persistence.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        DAO dao = new DAO();

        Customer customer1 = new Customer("John", "Doe");
        BasicProfile basicProfile1 = new BasicProfile(1990, 80, 180);
        Clinic clinic1 = new Clinic(1.0);
        ContractCustomer contractCustomer1 = new ContractCustomer(new Date(), new Date());
        RegularCustomer regularCustomer1 = new RegularCustomer("Mike", "Ford", "Gold");

        dao.persist(customer1);
        dao.persist(basicProfile1);
        dao.persist(clinic1);
        dao.persist(contractCustomer1);
        dao.persist(regularCustomer1);

        customer1.setBasicprofile(basicProfile1);
        customer1.setClinics(clinic1);
        basicProfile1.setRegularCustomer(regularCustomer1);
        basicProfile1.setCustomer(customer1);
        clinic1.setCustomers(customer1);
        contractCustomer1.setCustomers(customer1);

        dao.update(customer1);
        dao.update(basicProfile1);
        dao.update(clinic1);
        dao.update(contractCustomer1);
        dao.update(regularCustomer1);
    }
}
