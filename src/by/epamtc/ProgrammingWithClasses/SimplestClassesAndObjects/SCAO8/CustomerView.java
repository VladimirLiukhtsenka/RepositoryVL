package by.epamtc.ProgrammingWithClasses.SimplestClassesAndObjects.SCAO8;

import java.util.Scanner;

public class CustomerView {
    public void printCustInAlphabet(CustomersBase customersBase) {
        CustomersBaseLogic customersBaseLogic = new CustomersBaseLogic(customersBase);
        customersBase = customersBaseLogic.sortInAlphabet();
        System.out.println("список покупателей в алфавитном порядке:");
        for (Customer customer : customersBase.getCustomers()) {
            System.out.println(customer.getSurname() + " " + customer.getName() + " " + customer.getFathername());
        }
    }

    public void printInInternalCredCardNum(CustomersBase customersBase) {
        CustomersBaseLogic customersBaseLogic = new CustomersBaseLogic(customersBase);
        Scanner sc = new Scanner(System.in);
        int from;
        int to;
        System.out.println("Введите номер кредитной карточки, c которого будет начинаться интервал: ");
        from = sc.nextInt();
        System.out.println("Введите номер кредитной карточки, которым будет заканчиваться интервал: ");
        to = sc.nextInt();
        for (Customer customer : customersBase.getCustomers()) {
            if (customersBaseLogic.isIntervalCredCardNum(customer, from, to)) {
                System.out.println(customer.getSurname() + " " + customer.getName() + " " + customer.getFathername());
            }
        }
    }
}
