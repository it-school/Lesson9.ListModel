package com.itschool;

public class Main
{

    public static void main(String[] args)
    {
        ListModel list = new ListModel();
        list.Add(5);
        list.Add(2);
        list.Add(-5);
        list.Add(50);
        list.Add(10);

        for (int i = 0; i < list.length; i++)
        {
            System.out.print(list.list[i] + "\t");
        }
        System.out.println( );

        list.Add(555, 3);
        for (int i = 0; i < list.length; i++)
        {
            System.out.print(list.list[i] + "\t");
        }
    }
}
