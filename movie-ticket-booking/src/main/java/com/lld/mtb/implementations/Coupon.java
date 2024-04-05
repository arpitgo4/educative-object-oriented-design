package com.lld.mtb.implementations;

public class Coupon {

    private String id;
    private String code;
    private int discount;
    private String validity;

    public Coupon(String id, String code, int discount, String validity) {
        this.id = id;
        this.code = code;
        this.discount = discount;
        this.validity = validity;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public String getValidity() {
        return validity;
    }

    public void setValidity(String validity) {
        this.validity = validity;
    }

    @Override
    public String toString() {
        return "Coupon{" +
                "id='" + id + '\'' +
                ", code='" + code + '\'' +
                ", discount=" + discount +
                ", validity='" + validity + '\'' +
                '}';
    }
}
