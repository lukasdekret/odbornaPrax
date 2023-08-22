package com.example.odbornaprax.framework.components;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.MenuItem;
import javafx.scene.paint.Color;

public class QMenuItem extends MenuItem {

    public QMenuItem(String name) {
        super(name);
    }

    // TODO: QEventHandler, QActionEvent?
    public void setAction(EventHandler<ActionEvent> action) {
        super.setOnAction(action);
    }

    public void setImage(QImageView image) {
        super.setGraphic(image);
    }

}
