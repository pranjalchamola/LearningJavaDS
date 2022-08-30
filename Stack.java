package com.pranjal.DataStructureScratch;

public class Stack {
    int[] arr=new int[3];
    int[] arr2;
    int top=-1;

    public void push(int value)
    {
        if(top<arr.length-1)
        {
            arr[++top]=value;
        }
        else
            expand(value);

    }

    private void expand(int value)
    {
        arr2=new int[top*2];
        for(int i=0;i<arr.length;i++)
        {
            arr2[i]=arr[i];
        }
        arr=arr2;
        arr[++top]=value;
    }

    public void peek()
    {
        if(top>=0)
        System.out.println(arr[top]);
    }

    public void pop()
    {
        if(top>=0)
            top--;
    }

    public void isEmpty()
    {
        if(top>=0)
            System.out.println(false);
        else
            System.out.println(true);
    }
}
