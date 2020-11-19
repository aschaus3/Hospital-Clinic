package com.company;
import java.util.Date;
public class Main
{
    public static void main(String[] args)
    {
        Date d = new Date(2020,11,11);


        SortedPriorityQueue<Integer,String> patients = new SortedPriorityQueue<>();

        patients.insert((int) d.getTime(),"Alice");
        patients.insert(3,"Bob");
        patients.insert((int) d.getTime(),"Cat");
        patients.insert((int) d.getTime(),"Dan");
        patients.insert(1,"Eric");


        System.out.println(patients.removeMin().getValue());
        System.out.println(patients.removeMin().getValue());
        System.out.println(patients.removeMin().getValue());
        System.out.println(patients.removeMin().getValue());
        System.out.println(patients.removeMin().getValue());


    }

}
