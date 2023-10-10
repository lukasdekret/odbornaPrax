package com.example.odbornaprax.framework.components;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;

import java.io.FileInputStream;

public class QButton extends Button {
    private boolean pom = false;

    public QButton() {
        super();
    }

    public void setDimensions(int h, int w) {
        super.setHeight(h);
        super.setWidth(w);
    }
    public void setPrefSize(int w, int h){
        super.setPrefSize(w,h);
    }

    public void setHeadline(String s) {

        super.setText(s);
    }

    public void sceneSwitcher(QScene qScene, QStage qStage){
        super.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                qStage.setQScene(qScene);
                qStage.show();
            }
        });
    }
    public void setImage(FileInputStream stream){
        QImageView qImageView = new QImageView();
        qImageView.setNewImage(stream);
        qImageView.setDimensions(15,15);
        super.setGraphic(qImageView);
    }
    public void setAction(QText button){
        super.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if (pom == false){
                    button.setContent("Button is Pressed!");
                    pom = true;
                }else{
                    button.setContent("");
                    pom = false;
                }
            }
        });
    }
}
