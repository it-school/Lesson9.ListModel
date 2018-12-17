package com.itschool;

public class ListModel
{
    private int MAX_LENGTH = 1000;
    int list[];
    int length;

    public ListModel()
    {
        list = new int[MAX_LENGTH];
        length = 0;
    }

    public boolean Add(int value)
    {
        if (this.length < MAX_LENGTH)
        {
            list[length] = value;
            length++;
            return true;
        }
        return false;
    }

    public boolean Add(int value, int index)
    {
        if (index >= this.length)
        {
            return this.Add(value);
        }
        else
        {
            for (int i = this.length; i > index; i--)
            {
                list[i] = list[i-1];
            }
            list[index] = value;
            this.length++;
        }
        return false;
    }

    public ListModel(int maxLength)
    {
        this.MAX_LENGTH = maxLength;
        this.length = 0;
        list = new int[MAX_LENGTH];
    }
}
