package com.example.odbornaprax.framework.components;

import javafx.scene.Node;
import javafx.scene.layout.HBox;

public class QHBox extends HBox {
    public QHBox() {
        super();
    }
    public void addComponents(Node... nodes) {
        for (int i = 0; i < nodes.length; i++){
            super.getChildren().add(nodes[i]);
        }
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
