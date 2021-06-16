package com.methodReferences;

public class Square {

    int sideLength;

    public Square(int sideLength){
        this.sideLength = sideLength;
    }

    public int calculateAre() {
        return sideLength * sideLength;
    }
}
