package Lecture7;
//optimized.front is also used.

public class CircularQueue {
    public int end;
    public int front;
    public int[] data;
    public int size=0;
    public int DEFAULT_SIZE=5;
    public CircularQueue(){
        this.data=new int[DEFAULT_SIZE];
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
        end=end%data.length;
        size++;

    }
    public int remove(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return -1;
        }
        int temp=data[0];
        front++;
        front=front%data.length;
        size--;
        return temp;
    }
    private boolean isFull() {
        return size ==data.length;
    }
    private boolean isEmpty(){
        return size==0;
    }
}
