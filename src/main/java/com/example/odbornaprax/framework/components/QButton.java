package com.example.odbornaprax.framework.components;

import javafx.scene.control.Button;

public class QButton extends Button {

    public QButton() {
        super();
    }

    public void setDimensions(int h, int w) {
        super.setHeight(h);
        super.setWidth(w);
    }

    public void setHeadline(String s) {

        super.setText(s);
    }


}
