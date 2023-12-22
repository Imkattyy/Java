package ru.mirea.it.ivbo.twelve;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class DrawingPanel extends JPanel {

    DrawingPanel() {
        this.setPreferredSize(new Dimension(850, 450));
    } // конструктор, создает панель размером 850х400

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D graphics2D = (Graphics2D) g;
        Random random = new Random();

        for (int i = 0; i < 20; i++) {
            int red = random.nextInt(255);
            int green = random.nextInt(255);
            int blue = random.nextInt(255);

            int shape = random.nextInt(2);

            int xCoordinate = random.nextInt(800);
            int yCoordinate = random.nextInt(400);


            Color color = new Color(red, green, blue);

            switch (shape){
                case 0:
                    Square square = new Square(xCoordinate, yCoordinate, random.nextInt(50), color);
                    square.drawSquare(graphics2D);
                    break;
                case 1:
                    Circle circle = new Circle(xCoordinate, yCoordinate, random.nextInt(50), color);
                    circle.drawCircle(graphics2D);
                    break;
            }
        }

    }

}
