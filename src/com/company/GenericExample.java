package com.company;

public class GenericExample <A>{

    private A title;

    public void setTitle(A title) {
        this.title = title;
    }

    public A test(){
        return title;
    }
}
