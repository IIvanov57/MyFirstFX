package com.example.myfirstfx;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private Button degreeButtom;

    @FXML
    private Button increaseButton;

    @FXML
    private TextField inputNumberOne;

    @FXML
    private TextField inputNumberTwo;

    @FXML
    private Button minusButton;

    @FXML
    private Button plusButton;

    @FXML
    private Button resetButtom;

    @FXML
    private Button splittingButtom;

    @FXML
    void initialize() {
        increaseButton.setOnAction(event -> {
            System.out.println("hello");
        });

    }

}