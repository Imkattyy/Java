package ru.mirea.it.ivbo.twenty;

import java.io.Serializable;

public class GenericClass<T extends Number, U extends Serializable, V> {
    private T numericParam;
    private U serializableParam;
    private V genericParam;

    public GenericClass(T numericParam, U serializableParam, V genericParam) {
        this.numericParam = numericParam;
        this.serializableParam = serializableParam;
        this.genericParam = genericParam;
    }

    public T getNumericParam() {
        return numericParam;
    }

    public U getSerializableParam() {
        return serializableParam;
    }

    public V getGenericParam() {
        return genericParam;
    }

    public void outputTypeAndValue() {
        System.out.println("Numeric Parameter: " + numericParam + " (" + numericParam.getClass() + ")");
        System.out.println("Serializable Parameter: " + serializableParam + " (" + serializableParam.getClass() + ")");
        System.out.println("Generic Parameter: " + genericParam + " (" + genericParam.getClass() + ")");
    }
}
