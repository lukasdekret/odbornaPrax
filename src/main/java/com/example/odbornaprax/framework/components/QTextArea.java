package com.example.odbornaprax.framework.components;

import javafx.scene.control.TextArea;

public class QTextArea extends TextArea {

    public QTextArea() {
        super();
    }

    public void setTextValue(String text) {
        super.setText(text);
    }

    public String getTextValue() {
        return super.getText();
    }

    public void appendText(String text) {
        super.appendText(text);
    }

}
