package com.neoteric.accountcreate;

import java.util.List;

public class Account {
   private int age;
   private String accountNumber;
   private   String addharNumber;
   private String panNumber;
   private String dateofBirth;
     List<Address> address;
    List<Nominee> nomainee;


    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddharNumber() {
        return addharNumber;
    }

    public void setAddharNumber(String addharNumber) {
        this.addharNumber = addharNumber;
    }

    public String getPanNumber() {
        return panNumber;
    }

    public void setPanNumber(String panNumber) {
        this.panNumber = panNumber;
    }

    public String getDateofBirth() {
        return dateofBirth;
    }

    public void setDateofBirth(String dateofBirth) {
        this.dateofBirth = dateofBirth;
    }

    public List<Address> getAddress() {
        return address;
    }

    public void setAddress(List<Address> address) {
        this.address = address;
    }

    public List<Nominee> getNomainee() {
        return nomainee;
    }

    public void setNomainee(List<Nominee> nomainee) {
        this.nomainee = nomainee;
    }
}
