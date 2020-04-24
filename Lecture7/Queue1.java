package Lecture7;
//not optimized approach. uses only end.

public class Queue1 {
    public int end;
    public int[] data;
    public int size=5;
    public Queue1(){
        this.data=new int[size];
        this.end=0;
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
        for(int i=1;i<end;i++)
            data[i-1]=data[i];
        end--;
        return temp;
    }
    private boolean isFull() {
        return end ==data.length;
    }
    private boolean isEmpty(){
        return end==0;
    }

}
