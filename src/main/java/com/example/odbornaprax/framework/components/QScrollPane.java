package com.example.odbornaprax.framework.components;

import javafx.scene.Node;
import javafx.scene.control.ScrollPane;

public class QScrollPane extends ScrollPane {
    public QScrollPane() {
        super();
    }
    public enum QScrollBarPolicy {
        NEVER,
        ALWAYS,
        AS_NEEDED
    }

    public void setBody(Node body){
        super.setContent(body);
    }
    public void setPannable(Boolean choice){
        super.pannableProperty().set(choice);
    }
    public void setWidthFit(Boolean choice){
        super.fitToWidthProperty().set(choice);
    }
    public void setHeightFit(Boolean choice){
        super.fitToHeightProperty().set(choice);
    }
    public void displayVbarNever(){
        super.vbarPolicyProperty().setValue(ScrollBarPolicy.NEVER);
    }
    public void displayVbarAlways(){
        super.vbarPolicyProperty().setValue(ScrollBarPolicy.ALWAYS);
    }
    public void displayVbarAsNeeded(){
        super.vbarPolicyProperty().setValue(ScrollBarPolicy.AS_NEEDED);
    }
    public void displayHbarNever(){
        super.hbarPolicyProperty().setValue(ScrollBarPolicy.NEVER);
    }
    public void displayHbarAlways(){
        super.hbarPolicyProperty().setValue(ScrollBarPolicy.ALWAYS);
    }
    public void displayHbarAsNeeded(){
        super.hbarPolicyProperty().setValue(ScrollBarPolicy.AS_NEEDED);
    }
}
