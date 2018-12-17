package com.itschool;

import java.util.Arrays;

public class Main
{

    public static void main(String[] args)
    {
        ListModel list = new ListModel();

        list.Add(5);
        list.Add(10);
        list.Add(2);
        list.Add(-5);
        list.Add(50);
        list.Add(10);
        list.Add(10);
        list.Add(20);

        System.out.println("Full list:\n" + list.toString() + "\n");

        list.Add(555, 3);
        System.out.println("Full list after adding of 555:\n" + list.toString() + "\n");

        list.Remove(3);
        System.out.println("Full list after removing the element with index = 3:\n" + list.toString() + "\n");

        System.out.println("\nPart of array: " + Arrays.toString(list.part(3)));

        int key = 55;
        if (list.isContains(key))
        {
            System.out.println("Contains the value of " + key);
        }
        else
        {
            System.out.println("Not contains the value of " + key);
        }

        int value = list.getElementAt(key);
        if (!list.getLastError().equals(""))
        {
            System.out.println("\nError getting the value at position [" + key + "]: " + list.getLastError() + "\n");
        }
        else
        {
            System.out.println("At position " + key + " is situated the number: " + value);
        }

        key = 5;
        value = list.getElementAt(key);
        if (!list.getLastError().equals(""))
        {
            System.out.println("\nError getting the value at position [" + key + "]: " + list.getLastError() + "\n");
        }
        else
        {
            System.out.println("At position " + key + " is situated the number: " + value);
        }


        System.out.println("\nFull list:\n" + list.toString() + "\n");
        System.out.println("First position of 10: " + list.getFirstIndex(10));
        System.out.println("Last position of 10: " + list.getLastIndex(10));


        ListModel list2 = new ListModel();
        list2.Add(5);
        list2.Add(10);
        list2.Add(2);
        list2.Add(-5);
        list2.Add(50);
        list2.Add(10);
        list2.Add(10);
        list2.Add(20);

        if (list.equals(list2))
        {
            System.out.println("\nLists are equal!");
        }
        else
        {
            System.out.println("\nLists are NOT equal!");
        }

        list2.Add(20);
        System.out.println("\nAfter adding one value to the second list:");
        if (list.equals(list2))
        {
            System.out.println("\nLists are equal!");
        }
        else
        {
            System.out.println("\nLists are NOT equal!");
        }

    }
}
