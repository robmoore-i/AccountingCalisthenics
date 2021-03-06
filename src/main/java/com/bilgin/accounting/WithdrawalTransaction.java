package com.bilgin.accounting;

import java.util.Date;

public class WithdrawalTransaction implements Transaction {
    private final Date date;
    private final Amount amount;

    public WithdrawalTransaction(Amount amount, Date date) {
        this.amount = amount;
        this.date = date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        WithdrawalTransaction that = (WithdrawalTransaction) o;

        if (!amount.equals(that.amount)) return false;
        return date.equals(that.date);
    }

    @Override
    public int hashCode() {
        int result = date.hashCode();
        result = 31 * result + amount.hashCode();
        return result;
    }

    public void print(StatementPrinter printer) {
        printer.printRaw("Withdrawal transaction: " + date + ": ");
        amount.print(printer);
    }

    public Amount applyTo(Amount amount) {
        return amount.subtract(this.amount);
    }
}
