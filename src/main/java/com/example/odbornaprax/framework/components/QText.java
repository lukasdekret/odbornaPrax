package com.example.odbornaprax.framework.components;

import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class QText extends Text {

    public QText() {
        super();
    }

    public void setContent(String text) {
        super.setText(text);
    }

    public void setWrapperWidth(double width) {
        super.setWrappingWidth(width);
    }


    public void setPosition(double x, double y) {
        super.setX(x);
        super.setY(y);
    }
    public void setSize(double height, double width){
        super.setScaleX(height);
        super.setScaleY(width);
    }
    public void font(String font){
        Font setfont = Font.font(font);
        super.setFont(setfont);
    }
}
