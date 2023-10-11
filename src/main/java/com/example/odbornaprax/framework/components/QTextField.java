package com.example.odbornaprax.framework.components;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.TextField;

public class QTextField extends TextField {

    public QTextField() {
        super();
    }
    public void setDimensions(int h, int w) {
        super.setPrefHeight(h);
        super.setPrefWidth(w);
    }
    public void setMaxSize(int h, int w) {
        super.setMaxSize(w, h);
    }
    public void promptText(String s){
        super.setPromptText(s);
        super.setFocusTraversable(false);
    }
    EventHandler<ActionEvent> getText = new EventHandler<ActionEvent>() {
        public void handle(ActionEvent e)
        {
            String text = QTextField.super.getText();
            System.out.println(text);
        }
    };
    public void getTextFromTextField(){
        super.setOnAction(getText);
    }
}
