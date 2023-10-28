package ru.mirea.it.ivbo.six;

interface Movable {
    void moveUp();

    void moveDown();

    void moveLeft();

    void moveRight();
}

class MovablePoint implements Movable {
    private int x;
    private int y;
    private int xSpeed;
    private int ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getxSpeed() {
        return xSpeed;
    }

    public int getySpeed() {
        return ySpeed;
    }

    @Override
    public String toString() {
        return "Координаты точки: (" + x + ", " + y + ") ";
    }

    public void moveUp() {
        y += ySpeed;
        System.out.println("Точка переместилась на " + ySpeed + " клеточек вверх.");
    }

    public void moveDown() {
        y -= ySpeed;
        System.out.println("Точка переместилась на " + ySpeed + " клеточек вниз.");
    }

    public void moveLeft() {
        x -= xSpeed;
        System.out.println("Точка переместилась на " + xSpeed + " клеточек влево.");
    }

    public void moveRight() {
        x += xSpeed;
        System.out.println("Точка переместилась на " + xSpeed + " клеточек вправо.");
    }

}

class MovableCircle extends MovablePoint implements Movable {
    private int radius;
    private MovablePoint center;

    public MovableCircle(int x, int y, int radius, int xSpeed, int ySpeed) {
        super(x, y, xSpeed, ySpeed);
        this.radius = radius;
        this.center = new MovablePoint(x, y, xSpeed, ySpeed);
    }

    @Override
    public String toString() {
        return "Координаты центра окружности: (" + center.getX() + ", " + center.getY() + ") ";
    }

    public void moveUp() {
        center.setY(center.getY() + center.getySpeed());
        System.out.println("Центр окружности переместился на " + center.getySpeed() + " клеточек вверх.");
    }

    public void moveDown() {
        center.setY(center.getY() - center.getySpeed());
        System.out.println("Центр окружности переместился на " + center.getySpeed() + " клеточек вниз.");
    }

    public void moveLeft() {
        center.setX(center.getX() - center.getxSpeed());
        System.out.println("Центр окружности переместился на " + center.getxSpeed() + " клеточек влево.");
    }

    public void moveRight() {
        center.setX(center.getX() - center.getxSpeed());
        System.out.println("Центр окружности переместился на " + center.getxSpeed() + " клеточек вправо.");
    }
}

class MovableRectangle extends MovablePoint implements Movable {
    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
        super(x1, y1, xSpeed, ySpeed);
        topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }

    public boolean checkTheSpeed(int speed1, int speed2) {
        return speed1 == speed2;
    }

    @Override
    public String toString() {
        return "Координаты точек прямоугольника: (" + topLeft.getX() + ", " + topLeft.getY() + ")" + " и (" +
                bottomRight.getX() + ", " + bottomRight.getY() + ")";
    }

    public void moveUp() {
        if (checkTheSpeed(topLeft.getySpeed(), bottomRight.getySpeed())) {
            bottomRight.setY(bottomRight.getY() + bottomRight.getySpeed());
            topLeft.setY(topLeft.getY() + topLeft.getySpeed());
            System.out.println("Центр окружности переместился на " + topLeft.getySpeed() + " клеточек вверх.");
        } else
            System.out.println("Скорости точек различаются разных концов прямоугольника различаются. Действие не может быть выполненщ.");
    }

    public void moveDown() {
        if (checkTheSpeed(topLeft.getySpeed(), bottomRight.getySpeed())) {
            bottomRight.setY(bottomRight.getY() - bottomRight.getySpeed());
            topLeft.setY(topLeft.getY() - topLeft.getySpeed());
            System.out.println("Центр окружности переместился на " + topLeft.getySpeed() + " клеточек вниз.");
        } else
            System.out.println("Скорости точек различаются разных концов прямоугольника различаются. Действие не может быть выполненщ.");
    }

    public void moveLeft() {
        if (checkTheSpeed(topLeft.getxSpeed(), bottomRight.getxSpeed())) {
            bottomRight.setX(bottomRight.getX() - bottomRight.getxSpeed());
            topLeft.setX(topLeft.getX() - topLeft.getxSpeed());
            System.out.println("Центр окружности переместился на " + topLeft.getxSpeed() + " клеточек влево.");
        } else
            System.out.println("Скорости точек различаются разных концов прямоугольника различаются. Действие не может быть выполненщ.");
    }

    public void moveRight() {
        if (checkTheSpeed(topLeft.getxSpeed(), bottomRight.getxSpeed())) {
            bottomRight.setX(bottomRight.getX() - bottomRight.getxSpeed());
            topLeft.setX(topLeft.getX() - topLeft.getxSpeed());
            System.out.println("Центр окружности переместился на " + topLeft.getxSpeed() + " клеточек вправо.");
        } else
            System.out.println("Скорости точек различаются разных концов прямоугольника различаются. Действие не может быть выполненщ.");
    }
}

public class MoveFigure {
    public static void main(String[] args) {
        MovableCircle circle = new MovableCircle(6, 7, 2, 3, 14);

        System.out.println(circle);

        circle.moveDown();

        System.out.println(circle);

        MovableRectangle rectangle = new MovableRectangle(0, 5, 0, 0, 12, 12);
        System.out.println(rectangle);

        rectangle.moveDown();
        System.out.println(rectangle);
    }
}

