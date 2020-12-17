package com.example.stilus.model;

public class ComputeRequest {
    private Float ilkDeger;
    private Float ikinciDeger;

    public ComputeRequest() {
    }

    public ComputeRequest(Float ilkDeger, Float ikinciDeger) {
        this.ilkDeger = ilkDeger;
        this.ikinciDeger = ikinciDeger;
    }

    public Float getIlkDeger() {
        return ilkDeger;
    }

    public void setIlkDeger(Float ilkDeger) {
        this.ilkDeger = ilkDeger;
    }

    public Float getIkinciDeger() {
        return ikinciDeger;
    }

    public void setIkinciDeger(Float ikinciDeger) {
        this.ikinciDeger = ikinciDeger;
    }
}
