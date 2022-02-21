package lesson3.dz.task2;

import java.util.ArrayList;

public class RunClass {

    public static void main(String[] args) {
        Euro[] euros = new Euro[10];
        ArrayList<Euro> eurosList = new ArrayList<>(10);

        Euro euro0 = new Euro(86);
        Euro euro1 = new Euro(86);
        Euro euro2 = new Euro(86);
        Euro euro3 = new Euro(86);
        euros[0] = euro0;
        eurosList.add(euro0);
        euros[1] = euro1;
        eurosList.add(euro1);
        euros[2] = euro2;
        eurosList.add(euro2);
        euros[3] = euro3;
        eurosList.add(euro3);
        Deposit<Euro> deposit1 = new Deposit<>(euros,eurosList);
        
        Euro[] euros2 = new Euro[10];
        ArrayList<Euro> eurosList2 = new ArrayList<>();
        euros2[0] = euro0;
        eurosList2.add(euro0);
        euros2[1] = euro1;
        eurosList2.add(euro1);
        euros2[2] = euro2;
        eurosList2.add(euro2);
        euros2[3] = euro3;
        eurosList2.add(euro3);
        Euro euro4 = new Euro(86);
        euros2[4] = euro4;
        Deposit<Euro> deposit2 = new Deposit<>(euros2,eurosList2);

        System.out.println(deposit1.getRubArray());
        System.out.println(deposit2.getRubList());

        System.out.println(deposit1.compare(deposit2));
        System.out.println(deposit1.compareList(deposit2));

        deposit1.toEmptyArray(deposit2);
        deposit1.toEmptyList(deposit2);

        System.out.println(deposit2);

        Dollar[] dollars = new Dollar[10];
        ArrayList<Dollar> dollarArrayList = new ArrayList<>(10);
        Deposit<Dollar> deposit3 = new Deposit<>(dollars,dollarArrayList);
        deposit1.compare(deposit3);
        //deposit1.compareList(deposit3);

    }
}
