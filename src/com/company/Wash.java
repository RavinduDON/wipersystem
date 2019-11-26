package com.company;

public class Wash {

    private boolean washState;

    public Wash() {
    }

    public Wash(boolean washState) {
        this.washState = washState;
    }

    public boolean isWashState() {
        return washState;
    }

    public void setWashState(boolean washState) {
        this.washState = washState;
    }
}
