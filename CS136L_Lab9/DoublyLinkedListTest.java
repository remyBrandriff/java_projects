package com.linkedlist;

import java.util.*;
import static org.junit.Assert.*;
import org.junit.Test;

public class DoublyLinkedListTest {

    @Test()
    public void canInstantiate(){
        DoublyLinkedList dll = new DoublyLinkedList();
    }

    //You must be able to retrieve an iterator object with listIterator(int)
    public void canRetrieveIterator(){
        DoublyLinkedList dll = new DoublyLinkedList();
        ListIterator li = dll.listIterator(0);
    }

    //You must be able to add to an empty list using an iterator
    public void canAddToEmptyList(){
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.add(new int[]{42});
    }

    //You must be able to read the first element of a list using an iterator
    public void canReadFirst(){
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.add(new String("Hello Worlt"));
        ListIterator li = dll.listIterator(0);
        System.out.println(li);
      }

    //You must be able to move forward and backwards through your list using an iterator
    public void canTraverse(){
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.add(new String[]{"Traverse", "Town"});
        ListIterator li = dll.listIterator(0);
        li.next();
        li.previous();
      }
    //*/

    /*

    //You must be able to add arbitrary elements using an iterator
    //You must be able to read arbitrary elements using an iterator
    //You must be able to remove elements using an iterator
    //You must be able to replace a value in the list using an iterator
    //You must be able to determine if you are at the beginning or end of a list using an iterator
    //You must be able to determine your current index using an iterator
    //You must be able to retrieve iterator objects at a non-zero index from listIterator(int)
    //You must be able to correctly retrieve the size of the list after adding and removing elements correctly
    //You must be able to use addAll(Collection) to add every item in an existing collection.
    //You must be able to read from the list by index
    //You must be able to remove from the list by index
    //You must be able to add to the list by index
    //You must be able to replace an element by index
    //Trying to iterate past the end of the list, or previous to the beginning should throw a NoSuchElementException


    */
}