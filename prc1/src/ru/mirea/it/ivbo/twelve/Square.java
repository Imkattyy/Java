package ru.mirea.it.ivbo.twelve;

import java.awt.*;

public class Square extends Shape{
    int sideLength;

    Square(int x, int y, int a, Color color) {
        this.posx = x;
        this.posy = y;
        this.sideLength = a;
        this.color = color;
    }

    public void drawSquare(Graphics2D graphics2D) {
        graphics2D.setColor(color);
        graphics2D.fillRect(posx, posy, sideLength, sideLength);
    }
}
