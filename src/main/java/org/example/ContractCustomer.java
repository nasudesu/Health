package org.example;
import jakarta.persistence.*;
import java.util.*;


@Entity
public class ContractCustomer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int contractId;

    private Date startDate;

    private Date endDate;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "contract_id")
    private List<Customer> customers = new ArrayList<>();

    public ContractCustomer() {
    }

    public ContractCustomer(Date startDate, Date endDate) {
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public int getContractId() {
        return contractId;
    }

    public void setContractId(int contractId) {
        this.contractId = contractId;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(Customer customer) {
        this.customers.add(customer);
    }
}
