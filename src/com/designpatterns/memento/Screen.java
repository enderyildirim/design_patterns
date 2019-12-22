package com.designpatterns.memento;

import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Screen extends JFrame {

    public static void main(String[] args) {
        History history = new History();

        GraphicsEditor graphicsEditor = new GraphicsEditor();
        graphicsEditor.addShape(new Rectangle(300, 300));
        graphicsEditor.addShape(new Circle(500));
        graphicsEditor.addMouseMotionListener(new GraphicsEditor.EditorMouseListener(graphicsEditor));
        graphicsEditor.addMouseListener(new GraphicsEditor.EditorMouseListener(graphicsEditor));
        graphicsEditor.addMouseListener(new HistoryMouseListener(history, graphicsEditor));

        Screen screen = new Screen();
        screen.setTitle("Memento Pattern Example");
        screen.add(graphicsEditor);
        screen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        screen.setVisible(true);
        screen.setSize(1366, 768);
        screen.setResizable(false);
        screen.addKeyListener(new HistoryKeyListener(history, graphicsEditor));
    }

    public static class HistoryMouseListener extends MouseAdapter {
        private History history;
        private GraphicsEditor graphicsEditor;

        public HistoryMouseListener(History history, GraphicsEditor graphicsEditor) {
            this.history = history;
            this.graphicsEditor = graphicsEditor;
        }

        @Override
        public void mousePressed(MouseEvent e) {
            history.push(graphicsEditor.save());
        }

    }

    public static class HistoryKeyListener extends KeyAdapter {
        private History history;
        private GraphicsEditor graphicsEditor;

        public HistoryKeyListener(History history, GraphicsEditor graphicsEditor) {
            this.history = history;
            this.graphicsEditor = graphicsEditor;
        }

        @Override
        public void keyReleased(KeyEvent e) {
            if ((e.getKeyCode() == KeyEvent.VK_Z) && ((e.getModifiers() & KeyEvent.CTRL_MASK) != 0)) {
                graphicsEditor.restore(history.pull());
            }
        }
    }

}
