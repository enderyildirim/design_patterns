package com.designpatterns.state;

public class File {
    private FileState fileState;

    public File(FileState fileState) {
        this.fileState = fileState;
        fileState.setFile(this);
    }

    public void setFileState(FileState fileState) {
        this.fileState = fileState;
    }

    public void write(int data) {
        fileState.write(data);
    }

    public int read() {
        return fileState.read();
    }

}
