package ru.netology.jdbc;

import java.sql.Date;

public class Products{
    private String productName;
    private Date date;
    private int amount;


    public Products(String productName, Date date, int amount) {
        this.productName = productName;
        this.date = date;
        this.amount=amount;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Products{" +
                "productName='" + productName + '\'' +
                ", date=" + date +
                ", стоимость=" + amount +
                '}';
    }
}
