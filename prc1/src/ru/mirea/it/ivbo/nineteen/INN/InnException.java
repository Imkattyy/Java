package ru.mirea.it.ivbo.nineteen.INN;

class InnException extends Exception {
    public InnException(String INN) {
        super("INN " + INN + " does not exist");
    }
}
