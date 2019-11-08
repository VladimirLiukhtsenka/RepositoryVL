package by.epamtc.ProgrammingWithClasses.SimplestClassesAndObjects.SCAO8;

import java.util.ArrayList;
import java.util.Objects;

public class CustomersBase {

    private ArrayList<Customer> customers;

    public CustomersBase(ArrayList<Customer> customers) {
        this.customers = customers;
    }

    public CustomersBase() {
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(ArrayList<Customer> customers) {
        this.customers = customers;
    }

    @Override
    public String toString() {
        return "CustomersBase{" +
                "customers=" + customers +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomersBase that = (CustomersBase) o;
        return Objects.equals(customers, that.customers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customers);
    }
}
