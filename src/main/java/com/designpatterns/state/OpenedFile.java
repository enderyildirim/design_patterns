package com.designpatterns.state;

public class OpenedFile extends FileState {

    @Override
    public void write(int data) {
        System.out.println(String.format("Writing %s to file...", data));
    }

    @Override
    public int read() {
        System.out.println("Reading from file...");
        return 0;
    }
}
