package com.example.odbornaprax.framework.components;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
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
    public void setMarginOfNode(Node node,double fromTop,double fromRight, double fromBottom, double fromLeft){
        setMargin(node,new Insets(fromTop,fromRight,fromBottom,fromLeft));
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
                super.setAlignment(Pos.CENTER_LEFT);
                break;
            case "RIGHT":
                super.setAlignment(Pos.BASELINE_RIGHT);
                break;
            case "":
                System.out.println("Wrong Input!");
                break;
        }
    }
}
