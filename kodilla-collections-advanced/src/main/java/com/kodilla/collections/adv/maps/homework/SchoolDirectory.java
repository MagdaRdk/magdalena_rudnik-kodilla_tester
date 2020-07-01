package com.kodilla.collections.adv.maps.homework;

import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<Principal, School> info = new HashMap<>();

        Principal waldek = new Principal("Waldemar Kowalski", "Podstawowa");
        Principal ewa = new Principal("Ewa Koziol", "Gimnazjum");
        Principal barbara = new Principal("Barbara Nowak", "Liceum Ogolnoksztalcace");

        School waldekStudents = new School(25.0, 27.0, 24.0, 21.0);
        School ewaStudents = new School(22.0, 23.0, 21.0);
        School barbaraStudents = new School(28.0, 26.0, 24.0, 30.0);

        info.put(waldek, waldekStudents);
        info.put(ewa, ewaStudents);
        info.put(barbara,barbaraStudents);

        for (Map.Entry<Principal, School> principalEntry  : info.entrySet())
           System.out.println(principalEntry.getKey().getName() + " , "  + principalEntry.getKey().getSchoolName() + " , number of students is " +  principalEntry.getValue().getSum());


    }
}
