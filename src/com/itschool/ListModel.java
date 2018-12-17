package com.itschool;

import java.util.Arrays;

public class ListModel implements IListModel
{
    private String lastError;
    private int MAX_LENGTH = 1000;
    private int list[];
    private int length;

    public ListModel()
    {
        list = new int[MAX_LENGTH];
        length = 0;
        lastError = "";
    }

    public ListModel(int maxLength)
    {
        this.MAX_LENGTH = maxLength;
        this.length = 0;
        list = new int[MAX_LENGTH];
    }

    public int[] getList()
    {
        return list;
    }

    public String getLastError()
    {
        return lastError;
    }

    public int getLength()
    {
        return this.length;
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
                list[i] = list[i - 1];
            }
            list[index] = value;
            this.length++;
        }
        return false;
    }

    public boolean Remove(int index)
    {
        if (index < this.length)
        {
            for (int i = index; i < this.length - 1; i++)
            {
                list[i] = list[i + 1];
            }
            this.length--;
        }
        return false;
    }

    public void Clear()
    {
        for (int i = 0; i < this.length; i++)
        {
            list[i] = 0;
        }
        this.length = 0;
    }

    public boolean isContains(int value)
    {
        for (int element : this.list)
        {
            if (element == value)
            {
                return true;
            }
        }
        return false;
    }

    public int[] part(int elements)
    {
        /*
        int [] tempArray = new int [elements];
        for (int i = 0; i < elements; i++)
        {
            tempArray[i] = this.list[i];
        }
        return tempArray;
        */

        return Arrays.copyOf(this.list, elements);
    }

    public int getElementAt(int index)
    {
        if (index < this.length)
        {
            this.lastError = "";
            return this.list[index];
        }
        else
        {
            this.lastError = "Array index of bounds";
        }
        return 0;
    }

    public int getFirstIndex(int value)
    {
        if (this.length > 0)
        {
            for (int i = 0; i < length; i++)
            {
                if (list[i] == value)
                {
                    return i;
                }
            }
        }
        return -1;
    }

    public int getLastIndex(int value)
    {
        if (this.length > 0)
        {
            for (int i = length; i >= 0; i--)
            {
                if (list[i] == value)
                {
                    return i;
                }
            }
        }
        return -1;
    }

    @Override
    public boolean equals(Object obj)
    {
        if (((ListModel) obj).length != this.length)
        {
            return false;
        }

        for (int i = 0; i < this.length; i++)
        {
            if (this.list[i] != ((ListModel) obj).list[i])
            {
                return false;
            }
        }

        return true;
    }

    @Override
    public String toString()
    {
        return Arrays.toString(Arrays.copyOf(this.list, this.length));
    }
}
