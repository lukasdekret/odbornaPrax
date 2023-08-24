package com.example.odbornaprax.framework.components;

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

}