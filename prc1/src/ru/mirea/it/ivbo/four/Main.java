package ru.mirea.it.ivbo.four;

enum ComputerBrand {
    ASUS, HP, DELL, LENOVO, ACER, APPLE
}

class Processor {
    private String model;
    private int speedGHz;

    public Processor(String model, int speedGHz) {
        this.model = model;
        this.speedGHz = speedGHz;
    }

    public String getModel() {
        return model;
    }

    public int getSpeedGHz() {
        return speedGHz;
    }

    // Другие методы для процессора
}

class Memory {
    private int sizeGB;
    private String type;

    public Memory(int sizeGB, String type) {
        this.sizeGB = sizeGB;
        this.type = type;
    }

    public int getSizeGB() {
        return sizeGB;
    }

    public String getType() {
        return type;
    }

    // Другие методы для оперативной памяти
}

class Monitor {
    private String model;
    private int sizeInches;

    public Monitor(String model, int sizeInches) {
        this.model = model;
        this.sizeInches = sizeInches;
    }

    public String getModel() {
        return model;
    }

    public int getSizeInches() {
        return sizeInches;
    }

    // Другие методы для монитора
}

class Computer {
    private ComputerBrand brand;
    private Processor processor;
    private Memory memory;
    private Monitor monitor;

    public Computer(ComputerBrand brand, Processor processor, Memory memory, Monitor monitor) {
        this.brand = brand;
        this.processor = processor;
        this.memory = memory;
        this.monitor = monitor;
    }

    public ComputerBrand getBrand() {
        return brand;
    }

    public Processor getProcessor() {
        return processor;
    }

    public Memory getMemory() {
        return memory;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    // Другие методы для компьютера
}

public class Main {
    public static void main(String[] args) {
        Processor processor = new Processor("Intel Core i7", 3);
        Memory memory = new Memory(16, "DDR4");
        Monitor monitor = new Monitor("Dell Ultrasharp", 27);

        Computer computer = new Computer(ComputerBrand.DELL, processor, memory, monitor);

        System.out.println("Марка компьютера: " + computer.getBrand());
        System.out.println("Процессор: " + computer.getProcessor().getModel());
        System.out.println("Оперативная память: " + computer.getMemory().getSizeGB() + " GB");
        System.out.println("Монитор: " + computer.getMonitor().getModel() + ", " + computer.getMonitor().getSizeInches() + " дюймов");
    }
}
