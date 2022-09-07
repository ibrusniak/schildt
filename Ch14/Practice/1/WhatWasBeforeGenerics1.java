
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class WhatWasBeforeGenerics1 {

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {

        List rawList = new ArrayList();

        rawList.add("String value");
        rawList.add(2.34);
        rawList.add(3);
        
        Iterator iterator = rawList.iterator();
        
        while (iterator.hasNext())
            System.out.println(iterator.next());
        
        System.out.println();

        iterator = rawList.iterator();
        while (iterator.hasNext()) {
            try {
                Object next = iterator.next();
                System.out.println(next.getClass().getName() + " " + next);
                System.out.println("Trying to cast next to Integer...");
                Integer i = (Integer)(next);
                System.out.println("Succeeded!");
            } catch (Exception e) {
                System.out.println("Ooops! Something went wrong! " + e.getClass() + " occurs.");
            }
        }
    }
}


