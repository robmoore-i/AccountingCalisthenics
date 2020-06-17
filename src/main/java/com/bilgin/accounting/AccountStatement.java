package com.bilgin.accounting;

import java.util.ArrayList;
import java.util.List;

public class AccountStatement {
    private final List<Transaction> accountTransactions = new ArrayList<Transaction>();

    public AccountStatement(List<Transaction> accountTransactions) {
        this.accountTransactions.addAll(accountTransactions);
    }

    public AccountStatement() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AccountStatement)) return false;

        AccountStatement that = (AccountStatement) o;

        return accountTransactions.equals(that.accountTransactions);
    }

    @Override
    public int hashCode() {
        return accountTransactions.hashCode();
    }

    public void print(StatementPrinter printer) {
        printer.printTransactions(accountTransactions);
        printer.printTotalBalance(calculateBalance());
    }

    private Amount calculateBalance() {
        Amount amount = new Amount(0);
        for (Transaction transaction : accountTransactions) {
            amount = transaction.applyTo(amount);
        }
        return amount;
    }
}
