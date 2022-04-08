package com.example.smarthouse_javafx;

import javafx.scene.control.Label;

public class Socket  implements Electro {

    private boolean onOff;
    private String device;
    public Label text_socket;

    public Socket(Label text_socket) {
        this.text_socket = text_socket;
    }


    public String getDevice() {
        return device;
    }

    public void setOnOff(boolean onOff) {
        if (onOff == true){
        this.onOff = onOff;
        text_socket.setText("Вкл");
        text_socket.setStyle("-fx-text-fill: #7FFF00;");

        }
    }

    public void setDevice(String device) {
        this.device = device;
    }
}
