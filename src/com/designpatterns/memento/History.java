package com.designpatterns.memento;

import java.util.Stack;

public class History {
    private Stack<GraphicEditorMemento> snapshots = new Stack<>();

    public void push(GraphicEditorMemento editorMemento) {
        snapshots.push(editorMemento);
    }

    public GraphicEditorMemento pull() {
        return !snapshots.isEmpty() ? snapshots.pop() : null;
    }

}
