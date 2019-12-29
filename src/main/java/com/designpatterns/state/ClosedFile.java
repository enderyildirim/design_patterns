package com.designpatterns.state;

public class ClosedFile extends FileState {

    @Override
    public void write(int data) {
        System.out.println("Couldn't write to file. File is closed!");
    }

    @Override
    public int read() {
        System.out.println("Couldn't read from file. File is closed!");
        return -1;
    }

}
