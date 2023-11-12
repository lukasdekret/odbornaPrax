package com.example.odbornaprax.framework.components;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.RadioButton;

public class QRadioButton extends RadioButton {
    private int index;
    public QRadioButton() {
        super();
    }
    public void setIndex(int index){
        this.index = index;
    }
    public void setTitle(String text){
        super.setText(text);
    }
    public boolean isChecked(){
        return super.isSelected();
    }


    public void setPrefWidthHeight(double width, double height) {
        super.setPrefWidth(width);
        super.setPrefHeight(height);
    }

    public int getIndex() {
        return index;
    }
}
