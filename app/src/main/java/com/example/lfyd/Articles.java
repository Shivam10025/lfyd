package com.example.lfyd;

public class Articles {
    String name , location , offer1 , offer2, discount1 , discount2, discount3 , product1, product2, product3;

    public Articles(String name, String location, String offer1, String offer2, String discount1, String discount2, String discount3, String product1, String product2, String product3) {
        this.name = name;
        this.location = location;
        this.offer1 = offer1;
        this.offer2 = offer2;
        this.discount1 = discount1;
        this.discount2 = discount2;
        this.discount3 = discount3;
        this.product1 = product1;
        this.product2 = product2;
        this.product3 = product3;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getOffer1() {
        return offer1;
    }

    public void setOffer1(String offer1) {
        this.offer1 = offer1;
    }

    public String getOffer2() {
        return offer2;
    }

    public void setOffer2(String offer2) {
        this.offer2 = offer2;
    }

    public String getDiscount1() {
        return discount1;
    }

    public void setDiscount1(String discount1) {
        this.discount1 = discount1;
    }

    public String getDiscount2() {
        return discount2;
    }

    public void setDiscount2(String discount2) {
        this.discount2 = discount2;
    }

    public String getDiscount3() {
        return discount3;
    }

    public void setDiscount3(String discount3) {
        this.discount3 = discount3;
    }

    public String getProduct1() {
        return product1;
    }

    public void setProduct1(String product1) {
        this.product1 = product1;
    }

    public String getProduct2() {
        return product2;
    }

    public void setProduct2(String product2) {
        this.product2 = product2;
    }

    public String getProduct3() {
        return product3;
    }

    public void setProduct3(String product3) {
        this.product3 = product3;
    }
}
