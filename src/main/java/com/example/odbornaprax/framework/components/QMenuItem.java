package com.example.odbornaprax.framework.components;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.MenuItem;
import javafx.scene.paint.Color;

public class QMenuItem extends MenuItem {
    private String itemName;
    public QMenuItem(String name) {
        super(name);
        itemName = name;
    }
    public String returnName(){
        return this.itemName;
    }

    // TODO: QEventHandler, QActionEvent?
    public void setAction(EventHandler<ActionEvent> action) {
        super.setOnAction(action);
    }

    public void setImage(QImageView image) {
        super.setGraphic(image);
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
}
