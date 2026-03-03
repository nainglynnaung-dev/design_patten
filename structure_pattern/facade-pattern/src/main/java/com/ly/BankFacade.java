package com.ly;

public class BankFacade {
    private AccountService accountService;
    private BalanceService balanceService;
    private TransactionService transactionService;

    public BankFacade(){
        accountService = new AccountService();
        balanceService = new BalanceService();
        transactionService = new TransactionService();
    }

    public void withdraw(String accountNo,double amount){
        accountService.checkAccount(accountNo);
        balanceService.checkBalance(accountNo);
        transactionService.withDraw(accountNo,amount);


    }
}
