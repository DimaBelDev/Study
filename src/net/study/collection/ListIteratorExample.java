package net.study.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorExample {
    public static void main(String[] args) {

        String word = "madam";
        List<Character> list = new ArrayList<>();
        boolean isPalindrome = true;


        for(Character ch: word.toCharArray()){
            list.add(ch);
        }

        ListIterator<Character> listIterator = list.listIterator();
        ListIterator<Character> reversIterator = list.listIterator(list.size());

        while(listIterator.hasNext() && reversIterator.hasPrevious()){
            if(listIterator.next() != reversIterator.previous()){
              isPalindrome = false;
            }
        }
        if(isPalindrome){
            System.out.println("Palindrome");
        } else {
            System.out.println("Is not palindrome");
        }
    }
}
