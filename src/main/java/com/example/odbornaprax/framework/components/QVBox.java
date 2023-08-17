package com.example.odbornaprax.framework.components;

import javafx.scene.Node;
import javafx.scene.layout.VBox;


public class QVBox extends VBox {

    public QVBox() {
        super ();
    }
    public void addComponents(Node... nodes) {
        for (int i = 0; i < nodes.length; i++){
            super.getChildren().add(nodes[i]);
        }
    }
    public void setLayout(double x, double y){
        super.setLayoutX(x);
        super.setLayoutY(y);
    }
    public void setPrefWidthHeight(double width,double height){
        super.setPrefWidth(width);
        super.setPrefHeight(height);
    }
    public void setMinWidthHeight(double width, double height){
        super.setMinWidth(width);
        super.setMinHeight(height);
    }
    public void setMaxWidthHeight(double width, double height){
        super.setMaxWidth(width);
        super.setMaxHeight(height);
    }
}

