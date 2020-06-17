package com.bilgin.accounting;

import java.util.List;

public interface StatementPrinter {
    void print(AccountStatement statement);

    void printTransactions(List<Transaction> transactions);

    void printTotalBalance(Amount amount);

    void printRaw(String text);
}
