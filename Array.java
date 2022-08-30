package com.pranjal.DataStructureScratch;

public class Array {
    int[] arr;
    int size;
    int count=0;
    public Array(int length)
    {
        this.size=length;
        arr=new int[size];
    }

    public void insert(int value)
    {
        if(count<arr.length)
            arr[count++]=value;
        else{
            int[] arr2=new int[count+1];
            for(int i=0;i<arr.length;i++)
            {
                arr2[i]=arr[i];
            }
            arr=arr2;
            arr[count++]=value;
        }
    }

    public void print()
    {
        for(int i=0;i<count;i++)
        {
            System.out.println(arr[i]);
        }
    }

    public void removeAt(int index)
    {
        if(index<count && index>=0) {
            for (int i = index; i < count - 1; i++) {
                arr[i] = arr[i + 1];
            }
            count--;
        }
    }

    public void indexOf(int value)
    {
        for(int i=0;i<count;i++)
        {
            if(arr[i]==value) {
                System.out.println(i);
                return;
            }
        }
        System.out.println(-1);
    }
}
