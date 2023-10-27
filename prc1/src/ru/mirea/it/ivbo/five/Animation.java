package ru.mirea.it.ivbo.five;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Animation {
    private int currentFrame = 0;
    private Image[] frames;

    public Animation() {
        JFrame frame = new JFrame("Animation");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(498, 400);

        // задержка по времени (через сколько происходит смена изображений)
        int delay = 100;
        Timer timer = new Timer(delay, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                currentFrame = (currentFrame + 1) % frames.length;
                frame.repaint();
                frame.setVisible(true);

            }
        });

        timer.start();

        frames = new Image[9];
        String currentPath = "/Users/imkattyy/Desktop/Алгоритмы/untitled folder/autumn-seasons";
        for (int i = 0; i < frames.length; i++) {
            frames[i] = new ImageIcon(currentPath + Integer.toString(i) + ".jpg").getImage();
        }

        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(frames[currentFrame], 0, 0, null);
            }
        };

        frame.add(panel);
        panel.setVisible(true);
    }

    public static void main(String[] args) {
        Animation MyAnimation = new Animation();
    }




}
