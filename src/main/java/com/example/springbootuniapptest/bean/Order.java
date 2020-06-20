package com.example.springbootuniapptest.bean;
/**
 * 订单实体类
 * **/
public class Order {
    private  Integer id;
    private String openid;
    private String goodsname;
    private Integer countt;
    private Integer singleprice;
    private Integer price;
    private String address;
    private String state;
    private String dayy;
    private String imageurl;
    private String paystate;

    public String getPaystate() {
        return paystate;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", openid='" + openid + '\'' +
                ", goodsname='" + goodsname + '\'' +
                ", countt=" + countt +
                ", singleprice=" + singleprice +
                ", price=" + price +
                ", address='" + address + '\'' +
                ", state='" + state + '\'' +
                ", dayy='" + dayy + '\'' +
                ", imageurl='" + imageurl + '\'' +
                ", paystate='" + paystate + '\'' +
                '}';
    }

    public void setPaystate(String paystate) {
        this.paystate = paystate;
    }

    public String getImageurl() {
        return imageurl;
    }

    public void setImageurl(String imageurl) {
        this.imageurl = imageurl;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public String getGoodsname() {
        return goodsname;
    }

    public void setGoodsname(String goodsname) {
        this.goodsname = goodsname;
    }

    public Integer getCountt() {
        return countt;
    }

    public void setCountt(Integer countt) {
        this.countt = countt;
    }

    public Integer getSingleprice() {
        return singleprice;
    }

    public void setSingleprice(Integer singleprice) {
        this.singleprice = singleprice;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getDayy() {
        return dayy;
    }

    public void setDayy(String dayy) {
        this.dayy = dayy;
    }
}
