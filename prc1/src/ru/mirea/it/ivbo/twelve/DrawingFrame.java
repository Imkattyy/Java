package ru.mirea.it.ivbo.twelve;

import javax.swing.*;

public class DrawingFrame extends JFrame {
    DrawingPanel drawingPanel;

    DrawingFrame() {
        drawingPanel = new DrawingPanel();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(drawingPanel);
        pack();
        setVisible(true);
    }
}
