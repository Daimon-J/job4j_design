package ru.job4j.it;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class BackwardArrayIt implements Iterator<Integer> {

    private final int[] date;
    private int point = 0;

    public BackwardArrayIt(int[] data){
        this.date = data;
        this.point = data.length-1;
    }

    @Override
    public boolean hasNext(){
        if(point == -1){
            return false;
        }
        return point < date.length;
    }

    @Override
    public Integer next(){
        if (!hasNext()){
            throw new NoSuchElementException();
        }
        return date[point--];
    }
}

