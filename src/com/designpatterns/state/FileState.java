package com.designpatterns.state;

public abstract class FileState {
    protected File file;

    public void setFile(File file) {
        this.file = file;
    }

    public abstract void write(int data);

    public abstract int read();

}

