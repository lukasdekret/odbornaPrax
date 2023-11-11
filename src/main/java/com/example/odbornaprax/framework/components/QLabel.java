package com.example.odbornaprax.framework.components;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.text.Font;
import javafx.scene.text.TextAlignment;

public class QLabel extends Label {
    public QLabel() {
        super();
    }

    public QLabel(String text) {
        super(text);
    }

    public void setSize(double w, double h) {
        super.setScaleX(w);
        super.setScaleY(h);
    }

    public void setPrefWidthHeight(double width,double height){
        super.setPrefWidth(width);
        super.setPrefHeight(height);
    }

    public void setTitle(String text){
        super.setText(text);
    }
    //TODO: graphic functionality (ImageView)
    public void font(String font){
        Font setfont = Font.font(font);
        super.setFont(setfont);
    }


    public void applyStyle(String value) {
        super.setStyle(value);
    }

    public void enableTextWrapping(boolean value) {
        super.setWrapText(value);
    }

    public void setAlignment(TextAlignment value) {
        super.setTextAlignment(value);
    }

}
