package com.example.springbootuniapptest.bean;

public class Goods {
    private Integer id;
    private String calling;
    private String imageurl;
    private int price;
    private int years;
    private int salecount;
    private String place;
    private int transfare;

    @Override
    public String toString() {
        return "Goods{" +
                "id=" + id +
                ", calling='" + calling + '\'' +
                ", imageurl='" + imageurl + '\'' +
                ", price=" + price +
                ", years=" + years +
                ", salecount=" + salecount +
                ", place='" + place + '\'' +
                ", transfare=" + transfare +
                ", information='" + information + '\'' +
                ", store=" + store +
                ", imageurl01='" + imageurl01 + '\'' +
                '}';
    }

    private String information;
    private int store;

    public String getImageurl01() {
        return imageurl01;
    }

    public void setImageurl01(String imageurl01) {
        this.imageurl01 = imageurl01;
    }

    private String imageurl01;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCalling() {
        return calling;
    }

    public void setCalling(String calling) {
        this.calling = calling;
    }

    public String getImageurl() {
        return imageurl;
    }

    public void setImageurl(String imageurl) {
        this.imageurl = imageurl;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public int getSalecount() {
        return salecount;
    }

    public void setSalecount(int salecount) {
        this.salecount = salecount;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public int getTransfare() {
        return transfare;
    }

    public void setTransfare(int transfare) {
        this.transfare = transfare;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }

    public int getStore() {
        return store;
    }

    public void setStore(int store) {
        this.store = store;
    }
}
