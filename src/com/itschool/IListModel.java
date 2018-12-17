package com.itschool;

public interface IListModel
{
    public int[] getList();

    public String getLastError();

    public int getLength();

    public boolean Add(int value);

    public boolean Add(int value, int index);

    public boolean Remove(int index);

    public void Clear();

    public boolean isContains(int value);

    public int[] part(int elements);

    public int getElementAt(int index);

    public int getFirstIndex(int value);

    public int getLastIndex(int value);

    @Override
    public boolean equals(Object obj);

    @Override
    public String toString();
}
