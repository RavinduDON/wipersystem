package com.company;

public class Wiper {
    private boolean wiperState;

    public Wiper() {
    }

    public Wiper(boolean wiperState) {
        this.wiperState = wiperState;
    }

    public boolean isWiperState() {
        return wiperState;
    }

    public void setWiperState(boolean wiperState) {
        this.wiperState = wiperState;
    }
}
