package com.bilgin.accounting;

import org.junit.Test;

import java.util.List;

import static org.mockito.Matchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class AccountStatementTest {
    @SuppressWarnings("unchecked")
    @Test
    public void testStatementPrinting() {
        AccountStatement accountStatement = new AccountStatement();
        StatementPrinter printer = mock(StatementPrinter.class);
        accountStatement.print(printer);
        verify(printer).printTransactions(any(List.class));
        verify(printer).printTotalBalance(any(Amount.class));
    }
}
