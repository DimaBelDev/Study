package net.study.collection;

import java.util.Arrays;

public class LinkedListExample<E> {
    private Node<E> head;
    private int size;

    public void add(E value) {
        if (head == null) {
            this.head = new Node(value);
        } else {
             Node<E> temp = head;
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            temp.setNext(new Node(value));
        }
        size++;
    }

    public E get(int index) {
        Node<E> temp = head;
        if(index >= size){
            throw new IllegalArgumentException();
        }else {
            for (int i = 1; i <= index; i++) {
                temp = temp.getNext();
            }
            return temp.getValue();
        }
    }

    public void remove(int number) {
        Node<E> temp = head;
        int current = 0;

      if(number == 0){
          head = head.getNext();
          size--;
          return;
      }else {
          while (temp != null) {
              if ((current + 1) == number) {
                  temp.setNext(temp.getNext().getNext());
                  size--;
                  return;
              } else {
                  temp = temp.getNext();
                  current++;
              }
          }
      }
    }


          public String toString(){
              Node<E> temp = head;
              E [] result = (E[]) new Object[size];
              int inx = 0;

              while (temp != null){
                      result[inx++] = temp.getValue();
                      temp = temp.getNext();
              }
              return Arrays.toString(result);
          }


     private static class Node<E>{
         private E value;
         private Node<E> next;

         public Node(E value) {
             this.value = value;
         }

         public E getValue() {
             return value;
         }

         public void setValue(E value) {
             this.value = value;
         }

         public Node<E> getNext() {
             return next;
         }

         public void setNext(Node<E> next) {
             this.next = next;
         }
     }
}
