package by.epamtc.ProgrammingWithClasses.SimplestClassesAndObjects.SCAO8;

import java.util.Comparator;


public class CustomersBaseLogic {
    private CustomersBase customersBase;

    public CustomersBaseLogic(CustomersBase customersBase) {
        this.customersBase = customersBase;
    }

    public void add(Customer customer) {
        customersBase.getCustomers().add(customer);
    }

    public void remove(Customer customer) {
        customersBase.getCustomers().remove(customer);
    }

    public CustomersBase sortInAlphabet() {
        customersBase.getCustomers().sort(Comparator.comparing(Customer::getSurname));
        return customersBase;
    }

    public boolean isIntervalCredCardNum(Customer customer, int from, int to) {
        return (customer.getCreditCardNumber() >= from && customer.getCreditCardNumber() <= to);
    }

    @Override
    public String toString() {
        return "CustomersBaseLogic{" +
                "customersBase=" + customersBase +
                '}';
    }
}
