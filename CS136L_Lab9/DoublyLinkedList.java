package com.linkedlist;

import java.util.AbstractSequentialList;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/**
  Doubly-linked list implementation that extends
  AbstractSequentialList&lt;E&gt; and implements List&lt;E&gt;
*/
public class DoublyLinkedList<E> extends AbstractSequentialList<E>
implements List<E>
{
  private int numelements;
  /**
    Constructs an empty doubly-linked list.
  */
  public DoublyLinkedList()
  {
    //TODO
    //instantiate initial nodes here i.e. //first = new Node(); first.next = ...
  }

  /**
    Returns the number of elements in this collection.
    @return the number of elements in this collection
  */
  public int size()
  {
    //TODO
    return this.numelements;
  }

  /**
    Returns a list iterator over the elements in this list (in proper sequence).
    @param nextIndex index of first element to be returned from the list
    iterator (by a call to the next method)
    @return a list iterator over the elements in this list (in proper sequence)
    @throws IndexOutOfBoundsException if the index is out of range (index &lt; 0
    || index &gt; size())
  */
  public ListIterator<E> listIterator(int nextIndex)// throws IndexOutOfBoundsException
  {
    //TODO
    if (nextIndex > this.size()+1) throw new IndexOutOfBoundsException();
    return new DoublyLinkedListIterator();
  }

  /**
    A node with pointers to the next and previous nodes. The node contains an
    element.
  */
  private class Node
  {
    private Node next;
    private Node prev;
    private E contents;

    /**
      Constructs a node that contains an element. The previous and next nodes
      are initially initially set to null.
      @param e the intitial element in the node
    */
    public Node(E e)
    {
      //TODO DONE (?)
      this.next = null; //not necessary to put these here, but
      this.prev = null; //it helps with the reader's perception
      this.contents = e;
    }
  }

  /**
    An iterator for lists that allows the programmer to traverse the list in
    either direction, modify the list during iteration, and obtain the
    iterator's current position in the list. A ListIterator has no current
    element; its cursor position always lies between the element that would be
    returned by a call to previous() and the element that would be returned by
    a call to next()
  */
  private class DoublyLinkedListIterator implements ListIterator<E>
  {
    private int pointer = 0;
    private Node current; //current node
    private Node prevNode;   //most recently accessed node
    /**
      Constructs an iterator that points to the front of the linked list.
    */
    public DoublyLinkedListIterator()
    {
      //TODO
    }

    /**
      Returns true if this list iterator has more elements when traversing the
      list in the reverse direction. (In other words, returns true if
      previous() would return an element rather than throwing an exception.)
      @return true if the list iterator has more elements when traversing the
      list in the reverse direction
    */
    public boolean hasPrevious()
    {
      return (pointer > 0);
      //also:
      //if (this.previous() == null) return false;
      //return true;
      //also:
      //return this.previous()!=null
    }

    /**
      Returns true if this list iterator has more elements when traversing the
      list in the forward direction. (In other words, returns true if next()
      would return an element rather than throwing an exception.)
      @return true if the list iterator has more elements when traversing the
      list in the forward direction
    */
    public boolean hasNext()
    {
      return (pointer > numelements);
      //also:
      //if (this.next() == null) return false;
      //return true;
      //also:
      //return this.next()!=null
    }

    /**
      Returns the index of the element that would be returned by a subsequent
      call to next(). (Returns list size if the list iterator is at the end of
      the list.)
      @return the index of the element that would be returned by a subsequent
      call to next, or list size if the list iterator is at the end of the list
    */
    public int nextIndex()
    {
      if (this.hasNext()) return pointer;
      return size();

      /* Old: returns the element that would be returned by a subsequent call to next().
	     try {
         return this.next();
       }
       catch (NoSuchElementException e){
         return this.size();
       }
      return 0;
      */
    }

    /**
      Returns the index of the element that would be returned by a subsequent
      call to previous(). (Returns -1 if the list iterator is at the beginning
      of the list.)
      @return the index of the element that would be returned by a subsequent
      call to previous, or -1 if the list iterator is at the beginning of the
      list
    */
    public int previousIndex()
    {
      if (this.hasNext()) return (pointer-1);
      return -1;

      /* Old: returns the element that would be returned by a subsequent call to previous().
      try {
        return this.previous();
      }
      catch (NoSuchElementException e){
        return -1;
      }
     return 0;
     */
    }

    /**
      Returns the next element in the list and advances the cursor position.
      This method may be called repeatedly to iterate through the list, or
      intermixed with calls to previous() to go back and forth. (Note that
      alternating calls to next and previous will return the same element
      repeatedly.)
      @return the next element in the list
      @throws NoSuchElementException if the iteration has no next element-
    */
    //NOTE: returns E, not Node
    public E next()
    {
      if (!this.hasNext()) throw new NoSuchElementException();
      prevNode = current; //last accessed
      //NOTE: not sure yet, might need to move this down one line:
      E temp = current.contents;
      current = current.next;
      pointer+=1;
      return temp;
    }

    /**
      Returns the previous element in the list and moves the cursor position
      backwards. This method may be called repeatedly to iterate through the
      list backwards, or intermixed with calls to next() to go back and forth.
      (Note that alternating calls to next and previous will return the same
      element repeatedly.)
      @return the previous element in the list
      @throws NoSuchElementException if the iteration has no previous element
    */
    //NOTE: returns E, not Node
    public E previous()
    {
      if (!this.hasPrevious()) throw new NoSuchElementException();
      //NOTE: not sure yet, probably need to move this down one line:
      E temp = current.contents;
      current = current.prev;
      pointer-=1;
      prevNode = current; //last accessed
      return temp;
    }

    /**
      Inserts the specified element into the list (optional operation). The
      element is inserted immediately before the element that would be
      returned by next(), if any, and after the element that would be returned
      by previous(), if any. (If the list contains no elements, the new element
      becomes the sole element on the list.) The new element is inserted before
      the implicit cursor: a subsequent call to next would be unaffected, and a
      subsequent call to previous would return the new element. (This call
      increases by one the value that would be returned by a call to nextIndex
      or previousIndex.)
      @param e the element to insert
    */
    public void add(E e)
    {
      numelements++;
      Node theNode = new Node(e);
      if (numelements==1) {current = theNode; return;}  //adding to an empty list
      theNode.next = current; //NOTE: current.next? Not sure here
      theNode.prev = current.prev;
      theNode.next.prev = theNode;
      theNode.prev.next = theNode;

    }

    /**
      Removes from the list the last element that was returned by next() or
      previous() (optional operation). This call can only be made once per call
      to next or previous. It can be made only if add(E) has not been called
      after the last call to next or previous.
      @throws IllegalStateException if neither next nor previous have been
      called, or remove or add have been called after the last call to next or
      previous
    */
    public void remove()
    {
      //TODO
    }

    /**
      Replaces the last element returned by next() or previous() with the
      specified element (optional operation). This call can be made only if
      neither remove() nor add(E) have been called after the last call to next
      or previous.
      @param e the element with which to replace the last element returned
      by next or previous
      @throws IllegalStateException if neither next nor previous have been
      called, or remove or add have been called after the last call to next or
      previous
    */
    public void set(E e)
    {
      //TODO
    }
  }
}
