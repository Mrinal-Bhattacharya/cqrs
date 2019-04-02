package com.eventsourcing.services;

import java.util.concurrent.CompletableFuture;

import com.eventsourcing.dto.commands.AccountCreateDTO;
import com.eventsourcing.dto.commands.MoneyCreditDTO;
import com.eventsourcing.dto.commands.MoneyDebitDTO;

public interface AccountCommandService {
	public CompletableFuture<String> createAccount(AccountCreateDTO accountCreateDTO);
    public CompletableFuture<String> creditMoneyToAccount(String accountNumber, MoneyCreditDTO moneyCreditDTO);
    public CompletableFuture<String> debitMoneyFromAccount(String accountNumber, MoneyDebitDTO moneyDebitDTO);
}
