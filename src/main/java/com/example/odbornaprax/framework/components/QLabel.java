package com.example.odbornaprax.framework.components;

import javafx.scene.control.Label;

public class QLabel extends Label {
    public QLabel() {
        super();
    }

    public QLabel(String text) {
        super(text);
    }

    public void setTitle(String text){
        super.setText(text);
    }
    //TODO: graphic functionality (ImageView)
}
