package com.example.smarthouse_javafx;



import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public  class HelloController {
    List<Socket> socketsList  = new ArrayList<>();


    public HelloController() {
        socketsList.add(socket1);
        socketsList.add(socket2);
        socketsList.add(socket3);
        socketsList.add(socket4);
        socketsList.add(socket5);
        socketsList.add(socket6);
        socketsList.add(socket7);
        socketsList.add(socket8);
        socketsList.add(socket9);
        socketsList.add(socket10);
    }

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button device_floor2;

    @FXML
    private Button device_floor21;

    @FXML
    private Label offOn;

    @FXML
    private Button off_electro;

    @FXML
    private Button off_two_floor1;

    @FXML
    private Button off_two_floor2;

    @FXML
    private Button on_electro;

    @FXML
    private Button on_one_floor1;

    @FXML
    private Button on_two_floor2;

    @FXML
    private Button socket_1;

    @FXML
    private Button socket_10;

    @FXML
    private Button socket_2;

    @FXML
    private Button socket_3;

    @FXML
    private Button socket_4;

    @FXML
    private Button socket_5;

    @FXML
    private Button socket_6;

    @FXML
    private Button socket_7;

    @FXML
    private Button socket_8;

    @FXML
    private Button socket_9;

    @FXML
    private Label text_Smart_House;

    @FXML
    private Label text_socket_1;



    @FXML
    private Label text_socket_10;

    @FXML
    private Label text_socket_2;

    @FXML
    private Label text_socket_3;

    @FXML
    private Label text_socket_4;

    @FXML
    private Label text_socket_5;

    @FXML
    private Label text_socket_6;

    @FXML
    private Label text_socket_7;

    @FXML
    private Label text_socket_8;

    @FXML
    private Label text_socket_9;


    Socket socket1 = new Socket(text_socket_1);
    Socket socket2 = new Socket(text_socket_2);
    Socket socket3 = new Socket(text_socket_3);
    Socket socket4 = new Socket(text_socket_4);
    Socket socket5 = new Socket(text_socket_5);
    Socket socket6 = new Socket(text_socket_6);
    Socket socket7 = new Socket(text_socket_7);
    Socket socket8 = new Socket(text_socket_8);
    Socket socket9 = new Socket(text_socket_9);
    Socket socket10 = new Socket(text_socket_10);

    @FXML
    void initialize() {
        assert device_floor2 != null : "fx:id=\"device_floor2\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert device_floor21 != null : "fx:id=\"device_floor21\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert offOn != null : "fx:id=\"offOn\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert off_electro != null : "fx:id=\"off_electro\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert off_two_floor1 != null : "fx:id=\"off_two_floor1\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert off_two_floor2 != null : "fx:id=\"off_two_floor2\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert on_electro != null : "fx:id=\"on_electro\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert on_one_floor1 != null : "fx:id=\"on_one_floor1\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert on_two_floor2 != null : "fx:id=\"on_two_floor2\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert socket_1 != null : "fx:id=\"socket_1\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert socket_10 != null : "fx:id=\"socket_10\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert socket_2 != null : "fx:id=\"socket_2\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert socket_3 != null : "fx:id=\"socket_3\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert socket_4 != null : "fx:id=\"socket_4\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert socket_5 != null : "fx:id=\"socket_5\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert socket_6 != null : "fx:id=\"socket_6\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert socket_7 != null : "fx:id=\"socket_7\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert socket_8 != null : "fx:id=\"socket_8\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert socket_9 != null : "fx:id=\"socket_9\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert text_Smart_House != null : "fx:id=\"text_Smart_House\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert text_socket_1 != null : "fx:id=\"text_socket_1\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert text_socket_10 != null : "fx:id=\"text_socket_10\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert text_socket_2 != null : "fx:id=\"text_socket_2\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert text_socket_3 != null : "fx:id=\"text_socket_3\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert text_socket_4 != null : "fx:id=\"text_socket_4\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert text_socket_5 != null : "fx:id=\"text_socket_5\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert text_socket_6 != null : "fx:id=\"text_socket_6\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert text_socket_7 != null : "fx:id=\"text_socket_7\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert text_socket_8 != null : "fx:id=\"text_socket_8\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert text_socket_9 != null : "fx:id=\"text_socket_9\" was not injected: check your FXML file 'hello-view.fxml'.";


        on_electro.setOnAction(actionEvent -> {
            offOn.setStyle("-fx-text-fill-color: green;");
            offOn.setStyle("-fx-text-fill: #7FFF00;");
            offOn.setText("On");
            socketsList.forEach(socket -> {socket.setOnOff(true);});


        });


    }

}
