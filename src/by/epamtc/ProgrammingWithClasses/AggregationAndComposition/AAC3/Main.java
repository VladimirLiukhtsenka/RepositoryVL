package by.epamtc.ProgrammingWithClasses.AggregationAndComposition.AAC3;

import by.epamtc.ProgrammingWithClasses.AggregationAndComposition.AAC3.View.StateView;
import by.epamtc.ProgrammingWithClasses.AggregationAndComposition.AAC3.beans.City;
import by.epamtc.ProgrammingWithClasses.AggregationAndComposition.AAC3.beans.District;
import by.epamtc.ProgrammingWithClasses.AggregationAndComposition.AAC3.beans.Region;
import by.epamtc.ProgrammingWithClasses.AggregationAndComposition.AAC3.beans.State;

import java.util.ArrayList;

/*
3. Создать объект класса Государство, используя классы Область, Район, Город.
Методы: вывести на консоль столицу, количество областей, площадь, областные центры.
 */
public class Main {
    public static void main(String[] args) {
        District district = new District(new City("Витебск"), 2270.07, "Браславский");
        ArrayList<Region> regions = new ArrayList<>();
        regions.add(new Region(new City("Брест"), 32.8, "Брестская"));
        regions.add(new Region(new City("Витебск"), 40, "Витебская"));
        regions.add(new Region(new City("Гомель"), 40.4, "Гомельская"));
        regions.add(new Region(new City("Гродно"), 25.1, "Гродненская"));
        regions.add(new Region(new City("Минск"), 39.9, "Минская"));
        regions.add(new Region(new City("Могилев"), 29.1, "Могилевская"));
        State state = new State("Беларусь", "Минск", 0.3, regions);
        StateView stateView = new StateView(state);
        stateView.printCapital();
        stateView.printQuantityOfRegions();
        stateView.printSquareOfState();
        stateView.printCenterOfRegions();
    }
}
