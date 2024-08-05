package com.aurionpro.behavioural.iterator.model;

public interface  Aggregate<T> {
    Iterator<T> createIterator();
}