package com.bilgin.accounting;

public class Amount {
    private final int value;

    public Amount(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Amount)) return false;

        Amount amount = (Amount) o;

        return value == amount.value;
    }

    @Override
    public int hashCode() {
        return value;
    }

    public void print(StatementPrinter printer) {
        printer.printRaw("Amount: " + value);
    }

    public Amount sum(Amount amount) {
        return new Amount(value + amount.value);
    }

    public Amount subtract(Amount amount) {
        return new Amount(value - amount.value);
    }
}
