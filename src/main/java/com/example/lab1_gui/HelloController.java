package com.example.lab1_gui;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    @FXML
    private Label clues;

    @FXML
    private Button b1, b2, b3, b4, b5;

    @FXML
    protected void onVBoxClick() {
        PuzzleColumn col = new PuzzleColumn();

        //show clues on label
        clues.setText(col.getColClue());
        System.out.println("***\n" + col.getColClue());

        //clear button text fields and set color
        set_Buttons(b1, col.getValue(0));
        set_Buttons(b2, col.getValue(1));
        set_Buttons(b3, col.getValue(2));
        set_Buttons(b4, col.getValue(3));
        set_Buttons(b5, col.getValue(4));
    }

    public void set_Buttons(Button but, int value) {
        if (value == 0)
            but.setStyle("-fx-background-color: beige");
        else
            but.setStyle("-fx-background-color: black");
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        onVBoxClick();
    }
}