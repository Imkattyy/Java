package ru.mirea.it.ivbo.practice24;

public class MagicChair implements Chair{
    @Override
    public String getType() {
        return "MagicChair";
    }
    public void doMagic(){
        System.out.println("THIS IS MAGIC");
    }
}
