package com.example.odbornaprax.framework.components;

import javafx.scene.control.CheckBox;

public class QCheckBox extends CheckBox {
    public QCheckBox() {
        super();
    }
    public void setTitle(String text){
        super.setText(text);
    }
    public boolean isChecked(){
        return super.isSelected();
    }

}
