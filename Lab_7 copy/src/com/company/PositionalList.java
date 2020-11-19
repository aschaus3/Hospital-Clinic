package com.company;
public interface PositionalList<E>
{
    int size();
    boolean isEmpty();
    Position<E> first();
    Position<E> last();
    Position<E> before(Position <E> p) throws IllegalArgumentException;
    Position<E> after(Position <E> p) throws  IllegalArgumentException;
    Position<E> addFirst(E e);
    Position<E> addLast(E e);
    Position<E> addBefore(Position<E> p, E e);
    Position<E> addAfter(Position <E> p, E e);
    E set(Position<E> p, E e) throws IllegalArgumentException;
    E remove(Position<E> p) throws IllegalArgumentException;

}
