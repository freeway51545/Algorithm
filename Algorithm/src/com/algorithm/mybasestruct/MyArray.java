package com.algorithm.mybasestruct;

public class MyArray {
    private int[] data;
    private int size;

    public MyArray(int capacity){
        this.data = new int[capacity];
        this.size = 0;
    }
    public MyArray(){
        this(15);
    }
    public int getSize(){
        return this.size;
    }
    public int getCapacity(){
        return this.data.length;
    }
    public void addLast(int e){
        if (getSize()==getCapacity()){
            resize(this.size*2);
        }
        data[size] = e;
        size++;
    }
    public void addFirst(int e){
        add(0,e);
    }
    public void add(int index,int e){
        if (getSize()==getCapacity()){
            resize(this.size*2);
        }
        for (int i = size; i > index; i--) {
            data[i] = data[i-1];
        }
        data[index] = e;
    }
    public void get(int index){

    }
    public void set(int index,int e){

    }

    public void resize(int capacity){
        int[] tmp = new int[capacity];

    }

    public boolean isEmpty(){
        return this.size == 0;
    }

}
