package com.thoughtworks.tddintro.accountbalance;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class AccountTests {

    Account account  = new Account();

    @Test
    public void shouldIncreaseMyBalanceWhenIDepositMoney(){
        account.setStartingBalance(100);
        account.deposit(50);
        assertThat(account.getBalance(), is(150));
    }

    @Test
    public void shouldDecreaseMyBalanceWhenIWithdrawMoney(){
        account.setStartingBalance(100);
        account.withdraw(50);
        assertThat(account.getBalance(), is(50));

    }

    @Test
    public void shouldNotDecreaseMyBalanceWhenIWithdrawMoneyAndDoNotHaveEnoughToCoverTheWithdrawal(){
        account.setStartingBalance(50);
        account.withdraw(100);
        assertThat(account.getBalance(), is(50));
    }
}
