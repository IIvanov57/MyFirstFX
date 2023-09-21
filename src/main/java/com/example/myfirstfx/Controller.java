package com.example.myfirstfx;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.util.Arrays;

public class Controller {

    @FXML
    private Button degreeButton; //кнопка возведения в степень x^y

    @FXML
    private Button increaseButton; //кнопка умножения

    @FXML
    private TextField inputNumberOne;//поле ввода первого числа

    @FXML
    private TextField inputNumberTwo;//поле ввода второго числа

    @FXML
    private Button minusButton;//кнопка операции вычитания

    @FXML
    private Button plusButton;//копка операции сложения
    @FXML
    private Button resetButton;//кнопка сброса полей ввода

    @FXML
    private Button splittingButton;//кнопка деления

    @FXML
    private TextField outputResult;//поле вывода результа операции

    @FXML
    void actionMinusButton() {
        System.out.println("interaction minus button");
        outputResult.setText(String.valueOf(Math.abs(getNumberOne() - getNumberTwo())));
    }

    double getNumberOne() {
        if (inputNumberOne.getText().isEmpty()) {
            return 0;
        }
        System.out.println("number1 " + inputNumberOne.getText());
        try {
            return Double.parseDouble(inputNumberOne.getText());
        } catch (Exception e) {
            System.out.println(Arrays.toString(e.getStackTrace()));
        }
        return 0;
    }

    double getNumberTwo() {
        if (inputNumberTwo.getText().isEmpty()) {
            return 0;
        }
        System.out.println("number1 " + inputNumberTwo.getText());
        try {
            return Double.parseDouble(inputNumberTwo.getText());
        } catch (Exception e) {
            System.out.println(Arrays.toString(e.getStackTrace()));
        }
        return 0;
    }

    @FXML
    void actionPlusButton() {
        System.out.println("interaction Plus");
        outputResult.setText(String.valueOf(Math.abs(getNumberOne() + getNumberTwo())));
    }

    @FXML
    void actionDegreeButton() {
        System.out.println("int dgree");
        outputResult.setText(String.valueOf(Math.pow(getNumberOne(),getNumberTwo())));
    }

    @FXML
    void actionIncreaseButton() {
        System.out.println("increaseButton");
        outputResult.setText(String.valueOf(getNumberOne() * getNumberTwo()));
    }

    @FXML
    void actionResetButton() {
        System.out.println("resetButton");
        inputNumberOne.setText("");
        inputNumberTwo.setText("");
        outputResult.setText("");
    }

    @FXML
    void actionSplittingButton() {
        System.out.println("splittingButton");
        outputResult.setText(String.valueOf(getNumberOne() / getNumberTwo()));
    }
}