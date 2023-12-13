package Lab7;

import Lab6.EconomyClassWagon;
import Lab6.Wagon;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        WagonSet wagonSet = new WagonSet();
        wagonSet.add(new EconomyClassWagon(100, 90));
        EconomyClassWagon ew1 = new EconomyClassWagon(100, 70);
        EconomyClassWagon ew2 = new EconomyClassWagon(85, 60);
        EconomyClassWagon ew3 = new EconomyClassWagon(120, 100);
        WagonArrayList wagonList = new WagonArrayList(new ArrayList<>(
                Arrays.asList(ew1, ew2, ew3, ew2)));
        System.out.println("Current size of wagon list %s".formatted(wagonList.size()));
        wagonList.add(ew1);
        wagonList.add(ew3);
        System.out.println("Current size of wagon list %s".formatted(wagonList.size()));
    }
}
