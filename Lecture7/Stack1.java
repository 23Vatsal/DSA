package Lecture7;

import java.util.*;

public class Stack1 {
    public int[] data;
    public int top;
    private int size=5;
    public Stack1(){
        this.data=new int[size];
        this.top=-1;

    }
    public void push(int element){
        if(isFull()){
            System.out.println("Stack Overflow");
            return;
        }
        this.data[++top]=element;
    }
    public int pop() throws Exception{
            if(isEmpty()){
                System.out.println("Empty Stack");
                return -1;
            }

        int temp=data[top];
        top--;
        return temp;
    }
    public boolean isFull(){
        return top==data.length-1;
    }
    public boolean isEmpty(){
        return top==-1;
    }

    }

