package com.ly;

public class BankAccount {
    private String accountNumber;
    private String owner;
    private boolean premium;
    private double amount;



    public BankAccount(Builder builder) {
        this.accountNumber = builder.accountNumber;
        this.owner = builder.owner;
        this.premium = builder.premium;
        this.amount = builder.amount;
    }

      public String toString(){
        return "Account Number: "+accountNumber+"\n"+"Owner: "+owner+"\n"+"Premium: "+premium+"\n"+"Amount: "+amount;
      }
    public static class Builder{
        private String accountNumber;
        private String owner;
        private boolean premium=false;
        private double amount=0.0;


        public Builder setAccountNumber(String accountNumber){
            this.accountNumber=accountNumber;
            return this;
        }
        public Builder setOwner(String owner){
            this.owner=owner;
            return this;
        }
        public Builder setPremium(boolean premium){
            this.premium=premium;
            return this;
        }
        public BankAccount build(){
            return new BankAccount(this);
        }

    }
}
