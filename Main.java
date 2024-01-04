package Lab7;

import Lab6.EconomyClassWagon;
import Lab6.Wagon;
import Lab8.WagonOverloadedException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws WagonOverloadedException {
        WagonSet wagonSet = new WagonSet();
        wagonSet.add(new EconomyClassWagon(100, 90));
        EconomyClassWagon ew1 = new EconomyClassWagon(100, 70);
        EconomyClassWagon ew2 = new EconomyClassWagon(85, 60);
        EconomyClassWagon ew3 = new EconomyClassWagon(120, 100);
        EconomyClassWagon ew4 = new EconomyClassWagon(85, 60);
        EconomyClassWagon ew5 = new EconomyClassWagon(120, 100);
        EconomyClassWagon ew6 = new EconomyClassWagon(85, 60);
        WagonArrayList wagonList = new WagonArrayList(new ArrayList<>(
                Arrays.asList(ew1, ew2, ew3, ew4)));
        System.out.println("Current size of wagon list %s".formatted(wagonList.size()));
        wagonList.add(ew5);
        wagonList.add(ew6);
        System.out.println("Current size of wagon list %s".formatted(wagonList.size()));
        System.out.println(wagonList.getAll());
        System.out.println(wagonList.contains(ew2));
        List<Wagon> wagonList1 = new WagonArrayList();


    }
}
