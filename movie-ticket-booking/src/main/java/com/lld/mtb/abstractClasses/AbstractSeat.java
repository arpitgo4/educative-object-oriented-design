package com.lld.mtb.abstractClasses;

public abstract class AbstractSeat {

    private String number;
    private String type;
    private String status;

    public AbstractSeat(String number, String type, String status) {
        this.number = number;
        this.type = type;
        this.status = status;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Seat{" +
                "number='" + number + '\'' +
                ", type='" + type + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
