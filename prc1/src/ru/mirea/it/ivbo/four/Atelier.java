package ru.mirea.it.ivbo.four;


enum ClothingSize {
    XXS(32){
        @Override
        public String getDescription() {
            return "Детский размер";
        }
    }, XS(34), S(36), M(38), L(40);

    private int euroSize;

    ClothingSize(int euroSize) {
        this.euroSize = euroSize;
    }

    public String getDescription() {
            return "Взрослый размер";
    }
}

interface MenClothing {
    void dressMan();
}

interface WomenClothing {
    void dressWoman();
}

abstract class Clothes {
    private ClothingSize size;
    private double cost;
    private String color;

    public Clothes(ClothingSize size, double cost, String color) {
        this.size = size;
        this.cost = cost;
        this.color = color;
    }

    public ClothingSize getSize() {
        return size;
    }

    public double getCost() {
        return cost;
    }

    public String getColor() {
        return color;
    }
}

class TShirt extends Clothes implements MenClothing, WomenClothing {
    public TShirt(ClothingSize size, double cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Мужчина надевает футболку");
    }

    @Override
    public void dressWoman() {
        System.out.println("Женщина надевает футболку");
    }

}

class Pants extends Clothes implements MenClothing, WomenClothing {
    public Pants(ClothingSize size, double cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Мужчина надевает штаны");
    }

    @Override
    public void dressWoman() {
        System.out.println("Женщина надевает штаны");
    }
}

class Skirt extends Clothes implements WomenClothing {
    public Skirt(ClothingSize size, double cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressWoman() {
        System.out.println("Женщина надевает юбку");
    }
}

class Tie extends Clothes implements MenClothing {
    public Tie(ClothingSize size, double cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Мужчина надевает галстук");
    }
}


public class Atelier {
    public static void dressWoman(Clothes[] clothes) {
        System.out.println("Одеваем женщину:");
        for (Clothes item : clothes) {
            if (item instanceof WomenClothing) {
                System.out.println("Размер: " + item.getSize().getDescription());
                System.out.println("Цвет: " + item.getColor());
                System.out.println("Стоимость: " + item.getCost());
                ((WomenClothing) item).dressWoman();
                System.out.println("-------------------");
            }
        }
    }

    public static void dressMan(Clothes[] clothes) {
        System.out.println("Одеваем мужчину:");
        for (Clothes item : clothes) {
            if (item instanceof MenClothing) {
                System.out.println("Размер: " + item.getSize().getDescription());
                System.out.println("Цвет: " + item.getColor());
                System.out.println("Стоимость: " + item.getCost());
                ((MenClothing) item).dressMan();
                System.out.println("-------------------");
            }
        }
    }
    public static void main(String[] args) {
        Clothes[] clothes = {
                new TShirt(ClothingSize.M, 25.99, "Синяя"),
                new Skirt(ClothingSize.S, 45.50, "Розовая"),
                new Pants(ClothingSize.L, 34.75, "Черные"),
                new Tie(ClothingSize.XS, 12.99, "Красный"),
                new TShirt(ClothingSize.XXS, 19.99, "Зеленая")
        };

        Atelier.dressWoman(clothes);
        System.out.println();
        Atelier.dressMan(clothes);
    }
}
