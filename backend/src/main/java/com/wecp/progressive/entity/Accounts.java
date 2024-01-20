package com.wecp.progressive.entity;
public class Accounts {
    private int account_id;
    private int customer_id;
    private double balance;

    public Accounts(){

    }
    public void setAccountId(int account_id){
        this.account_id = account_id;
    }
    public void setCustomerId(int customer_id){
        this.customer_id=customer_id;
    }
    public void setBalance(double balance){
        this.balance=balance;
    }
    public int getAccountId(){
        return account_id;
    }
    public int getCustomerId(){
        return customer_id;
    }
    public double getBalance(){
        return balance;
    }

}