package Lecture7;
//optimized.front is also used.

public class Queue2 {
    public int end;
    public int front;
    public int[] data;
    public int size=5;
    public Queue2(){
        this.data=new int[size];
        this.end=0;
        this.front=0;
    }
    public void insert(int value){
        if(isFull()){
            System.out.println("Queue is full.");
            return;
        }
        data[end]=value;
        end++;

    }
    public int remove(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return -1;
        }
        int temp=data[0];
        front++;
        return temp;
    }
    private boolean isFull() {
        return end ==data.length;
    }
    private boolean isEmpty(){
        return front==end;
    }
}
