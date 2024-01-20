package com.wecp.progressive.entity;
import java.sql.Date;
public class Transactions {
    private int transaction_id;
    private int account_id;
    private double amount;
    private Date transaction_date;
    private String transaction_type;

    Transactions(){

    }
    public void setTId(int transaction_id){
        this.transaction_id=transaction_id;
    }
    public void setAId(int account_id){
        this.account_id=account_id;
    }
    public void setAmount(double amount){
        this.amount=amount;
    }
    public void setType(String transaction_type){
        this.transaction_type=transaction_type;
    }

    public int getTId(){
        return transaction_id;
    }
    public int getAId(){
        return account_id;
    }
    public double getAmount(){
        return amount;
    }
    public String getType(){
        return transaction_type;
    }

    


}

