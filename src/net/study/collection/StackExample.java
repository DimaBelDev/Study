package net.study.collection;

import java.util.Arrays;
import java.util.Stack;

public class StackExample<E> {
    private E[] array;
    private int count;


    public StackExample(){
        array = (E[]) new Object[10];
        count = -1;
    }

    public E push(E value){
        count++;
        if(count == array.length){
            array = Arrays.copyOf(array, array.length + 10);
        }
        array[count] = value;
        return value;
    }

    public E peek(){
        return array[count];
    }

    public E pop(){
        count--;
        return array[count + 1];
    }

    public boolean isEmpty(){
        if(count == -1){
            return true;
        }
        return false;
    }

    public String toString(){
        E[] temp = Arrays.copyOf(array, count  + 1);
        return Arrays.toString(temp);
    }


}
