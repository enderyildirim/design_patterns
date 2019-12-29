package com.designpatterns.state;

public class Application {

    public static void main(String[] args) {
        ClosedFile initialState = new ClosedFile();
        File file = new File(initialState);
        file.write(5);
        file.setFileState(new OpenedFile());
        file.write(6);
        file.read();
        file.setFileState(new ClosedFile());
        file.read();
    }
}
