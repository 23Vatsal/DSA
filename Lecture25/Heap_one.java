package Lecture25;

import java.util.ArrayList;

public class Heap_one {
    //Min heap.i.e. min element at root
    ArrayList<Integer> list=new ArrayList<>();

    private int parent(int i){
        return (i-1)/2;
    }
    private int left_child(int i){
        return (2*i)+1;
    }
    private int right_child(int i){
        return (2*i)+2;
    }
    public void insert(int value){
        list.add(value);
        upheap(list.size()-1);
    }
    private void upheap(int index){
        if(index==0)
            return;
        int p=parent(index);
        if(list.get(p)>list.get(index)){
            swap(p,index);
            upheap(p);
        }
    }

    private void swap(int p, int index) {
        int temp=list.get(p);
        list.set(p,list.get(index));
        list.set(index,temp);
    }
    public void display(){
        System.out.println(list);
    }
    public int remove() throws Exception{
        if(list.isEmpty())
            throw new Exception("khaali hai");
        int temp=list.get(0);
        int last=list.remove(list.size()-1);
        if(!list.isEmpty()){
            list.set(0,last);
            downheap(0);
        }
        return temp;
    }
    private void downheap(int index){
        int min=index;
        int left=left_child(index);
        int right=right_child(index);
        if(left<list.size() && list.get(min)>list.get(left))
            min=left;
        if(right<list.size() && list.get(min)>list.get(right))
            min=right;
        if(min!=index){
            swap(min,index);
            downheap(min);
        }
    }
}
