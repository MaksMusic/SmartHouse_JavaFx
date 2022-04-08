package com.example.smarthouse_javafx;

public class Socket implements Electro {
    private boolean onOff;
    private String device;

    public boolean isOnOff() {
        return onOff;
    }

    public String getDevice() {
        return device;
    }

    public void setOnOff(boolean onOff) {
        this.onOff = onOff;
    }

    public void setDevice(String device) {
        this.device = device;
    }
}
