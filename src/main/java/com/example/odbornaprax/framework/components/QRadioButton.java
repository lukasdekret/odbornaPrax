package com.example.odbornaprax.framework.components;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.RadioButton;

public class QRadioButton extends RadioButton {
    private boolean pom = false;
    public QRadioButton() {
        super();
    }
    public void setTitle(String text){
        super.setText(text);
    }
    public boolean isChecked(){
        return super.isSelected();
    }
    //TODO: QToggleGroup implementation

}
