package com.accountant.entities;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/*
3 -
Кошелек должен содержать текущий баланс в выбранной валюте.
Пользователь должен иметь возможность создавать записи со своими расходами и доходами.
Поля :
Баланс
Доходы (это уже в отдельную таблицу)
Расходы
 */

//@Component
@Entity
@Table(name="wallet")
public class Wallet {

    @Id
    @Column (name="id")
    private int id; //генерит БД

    @Column (name="name")
    private String name;

    @Column (name="balance")
    private int balance;

    public Wallet() {
    }

    public Wallet(String name, int balance) {
        this.name = name;
        this.balance = balance;
    }

    public void info(){
        System.out.println("Hello it's " + name + " and my balance is " + balance);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Wallet{" +
                "id=" + id +
                ", balance=" + balance +
                ", name='" + name + '\'' +
                '}';
    }

}
/*
    private int id;
    private String name;
    private int balance;

    public Wallet() {
    }

    public Wallet(String name, int balance) {
        this.name = name;
        this.balance = balance;
    }

    public void info(){
        System.out.println("Hello it's Wallet");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Wallet{" +
                "id=" + id +
                ", balance=" + balance +
                ", name='" + name + '\'' +
                '}';
    }
    ====================
    public Wallet() {
    }

    public void info(){
        System.out.println("Hello it's Wallet");
    }
 */