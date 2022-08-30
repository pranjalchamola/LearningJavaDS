package com.pranjal.DataStructureScratch;

public class LinkedList {
    public class Node{
        public Node next;
        public int value;

    }

    public Node first;
    public Node last;

    public Node temp;

    public void addFirst(int value)
    {
        if(first==null) {
            var node=new Node();
            node.value = value;
            first=node;
            last=first;
        }
        else {
            var node=new Node();
            node.value = value;
            node.next=first;
            first=node;
        }
    }

    public void print()
    {
        temp=first;
        while(temp!=null)
        {
            System.out.println(temp.value);
            temp=temp.next;
        }
    }

    public void addLast(int value)
    {
        if(first==null)
        {
            var node=new Node();
            node.value=value;
            first=node;
            last=first;
        }

        else
        {
            var node=new Node();
            node.value=value;
            last.next=node;
            last=node;
        }
    }

    public void removeFirst()
    {
        if(first==null)
            return;
        temp=first;
        first=null;
        first=temp.next;

    }

    public void indexOf(int value)
    {
        int count=0;
        var node=new Node();
        node=first;
        while(node.next!=null)
        {
            if(node.value==value)
            {
                System.out.println(count);
                break;
            }
            count++;
            node=node.next;
        }
    }

    public void removeLast()
    {
        if(first==null)
            return;

        if(first.next==null)
        {
        first=last=null;
        return;
        }

        var current= new Node();
        current=first.next;
        var previous=new Node();
        previous=first;
        while (current.next!=null)
        {
            previous=current;
            current=current.next;
        }
        last=null;
        previous.next=null;
        last=previous;
    }

    public void size()
    {
        if(first==null)
        {
            System.out.println("0");
            return;
        }
        int size=1;
        var current=new Node();
        current=first;
        while (current.next!=null)
        {
            size++;
            current=current.next;
        }
        System.out.println(size);
    }
}
