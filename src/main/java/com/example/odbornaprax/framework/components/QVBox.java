package com.example.odbornaprax.framework.components;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
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
    public void setMarginOfNode(Node node,double fromTop,double fromRight, double fromBottom, double fromLeft){
        super.setMargin(node,new Insets(fromTop,fromRight,fromBottom,fromLeft));
    }
    public void setPositionOfChildNodes(String string){
        switch (string){
            case "TOP":
                super.setAlignment(Pos.TOP_CENTER);
                break;
            case "CENTER":
                super.setAlignment(Pos.CENTER);
                break;
            case "BOTTOM":
                super.setAlignment(Pos.BOTTOM_CENTER);
                break;
            case "LEFT":
                super.setAlignment(Pos.BASELINE_LEFT);
                break;
            case "RIGHT":
                super.setAlignment(Pos.BASELINE_RIGHT);
                break;
            case "":
                System.out.println("Wrong Input!");
                break;
        }
    }

    public void setPosition(Pos value) {
        super.setAlignment(value);
    }

    public void applyPadding(Insets value) {
        super.setPadding(value);
    }

    public void reset() {
        super.getChildren().clear();
    }

}

