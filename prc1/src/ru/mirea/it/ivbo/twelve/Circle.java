package ru.mirea.it.ivbo.twelve;

import java.awt.*;

public class Circle extends Shape{
    int radius;

    Circle(int x, int y, int r, Color color) {
        this.posx = x;
        this.posy = y;
        this.color = color;
        this.radius = r;
    }

    public void drawCircle(Graphics2D graphics2D) {
        graphics2D.setColor(color);
        graphics2D.fillOval(posx, posy, radius, radius);
    }
}
