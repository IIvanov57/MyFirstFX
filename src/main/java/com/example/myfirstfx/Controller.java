package com.example.myfirstfx;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private Button degreeButton;

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
    private Button resetButton;

    @FXML
    private Button splittingButton;

    @FXML
    private TextField outputResult;

    @FXML
    void actionMinusButton() {
        System.out.println("interaction minus button");
        double result = getNumberOne() - getNumberTwo();
        outputResult.setText(String.valueOf(result));
    }

    double getNumberOne() {
        if (inputNumberOne.getText().isEmpty()) {
            return 0;
        }
        System.out.println("number1 " + inputNumberOne.getText());
        return Double.parseDouble(inputNumberOne.getText());
    }

    double getNumberTwo() {
        if (inputNumberTwo.getText().isEmpty()) {
            return 0;
        }
        System.out.println("number1 " + inputNumberTwo.getText());
        return Double.parseDouble(inputNumberTwo.getText());
    }

    @FXML
    void actionPlusButton() {
        System.out.println("interaction Plus");
    }

    @FXML
    void actionDegreeButton() {
        System.out.println("int dgree");
    }

    @FXML
    void actionIncreaseButton() {
        System.out.println("increaseButton");
    }

    @FXML
    void actionResetButton() {
        System.out.println("resetButton");
    }

    @FXML
    void actionSplittingButton() {
        System.out.println("splittingButton");
    }
}