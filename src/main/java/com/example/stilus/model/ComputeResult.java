package com.example.stilus.model;

public class ComputeResult {
    private float ilkDeger;
    private float ikinciDeger;
    private String islem;
    private float result;

    public ComputeResult(){}


    public ComputeResult(float ilkDeger, float ikinciDeger, String islem, float result) {
        this.ilkDeger = ilkDeger;
        this.ikinciDeger = ikinciDeger;
        this.islem = islem;
        this.result = result;
    }

    public float getIlkDeger() {
        return ilkDeger;
    }

    public void setIlkDeger(float ilkDeger) {
        this.ilkDeger = ilkDeger;
    }

    public float getIkinciDeger() {
        return ikinciDeger;
    }

    public void setIkinciDeger(float ikinciDeger) {
        this.ikinciDeger = ikinciDeger;
    }

    public String getIslem() {
        return islem;
    }

    public void setIslem(String islem) {
        this.islem = islem;
    }

    public float getResult() {
        return result;
    }

    public void setResult(float result) {
        this.result = result;
    }
}
