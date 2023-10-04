package com.example.odbornaprax.framework.components;

import javafx.scene.Node;
import javafx.scene.layout.BorderPane;

public class QBorderPane extends BorderPane {
    public QBorderPane() {
        super();
    }
    public void setPosition(String string, Node node){
        switch (string){
            case "TOP":
                super.setTop(node);
                break;
            case "BOTTOM":
                super.setBottom(node);
                break;
            case "LEFT":
                super.setLeft(node);
                break;
            case "RIGHT":
                super.setRight(node);
                break;
            case "CENTER":
                super.setCenter(node);
                break;
            case "":
                System.out.println("Wrong Input!");
                break;

        }
    }


}
