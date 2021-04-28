package com.accountant.entities;

import org.springframework.stereotype.Component;
/*
1:
Система должна обеспечивать возможность создания / обновления / удаления учетной записи пользователя.
Пользователь должен быть идентифицирован по логину и паролю и иметь возможность установить фото в качестве аватара профиля.
2:
 Учетная запись пользователя должна содержать набор «кошельков», которые могут быть созданы,
переименованы и удалены владельцем (пользователем).
Заметки :
Пользователь -> Кошельки (связь в БД "один ко многим").
пока-что сделаю, по одному кошельку на пользователя...
 */

//@Component
public class UserAccount {

    private int id;
    private String name;
    private String surname;
    private Wallet wallet;

    public UserAccount() {
    }

    public UserAccount(String name, String surname, Wallet wallet) {
        this.name = name;
        this.surname = surname;
        this.wallet = wallet;
    }

    public void info(){
        System.out.println("Hello it's " + name + " " + surname + ", my wallet is " + wallet);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Wallet getWallet() {
        return wallet;
    }

    public void setWallet(Wallet wallet) {
        this.wallet = wallet;
    }

    @Override
    public String toString() {
        return "UserAccount{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", wallet=" + wallet +
                '}';
    }
}

/*
private int id;
    private String name;
    private String surname;
    private Wallet wallet;

    public UserAccount() {
    }

    public UserAccount(String name, String surname, Wallet wallet) {
        this.name = name;
        this.surname = surname;
        this.wallet = wallet;
    }

    public void info(){
        System.out.println("Hello it's UserAccount");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Wallet getWallet() {
        return wallet;
    }

    public void setWallet(Wallet wallet) {
        this.wallet = wallet;
    }

    @Override
    public String toString() {
        return "UserAccount{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", wallet=" + wallet +
                '}';
    }
 */