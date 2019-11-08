package by.epamtc.ProgrammingWithClasses.SimplestClassesAndObjects.SCAO8;

import java.util.ArrayList;
import java.util.Arrays;

/*
8. Создать класс Customer, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и метод toString().
Создать второй класс, агрегирующий массив типа Customer, с подходящими конструкторами и методами.
Задать критерии выбора данных и вывести эти данные на консоль.
Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.
Найти и вывести:
a) список покупателей в алфавитном порядке;
b) список покупателей, у которых номер кредитной карточки находится в заданном интервале
 */
public class Main {
    public static void main(String[] args) {
        ArrayList <Customer> customers = new ArrayList<Customer>();
        customers.add(new Customer(1,"Pavlov","Aleksandr","Vitalievich","Brest",1234,33331232));
        customers.add(new Customer(2,"Pileiko","Sergey","Igorevich","Vitebsk",1745,43567812));
        customers.add(new Customer(3,"Chukin","Petr","Kirilovich","Grodno",2063,12435634));
        customers.add(new Customer(4,"Gorevoy","Aleksey","Izmailovich","Mogilev",996,87988756));
        customers.add(new Customer(5,"Akimov","Egor","Vladimirivich","Minsk",2546,98635478));
        CustomersBase customersBase = new CustomersBase(customers);
        CustomerView customerView = new CustomerView();
        //список покупателей в алфавитном порядке;
        customerView.printCustInAlphabet(customersBase);
        //список покупателей, у которых номер кредитной карточки находится в заданном интервале
        customerView.printInInternalCredCardNum(customersBase);
    }
}
