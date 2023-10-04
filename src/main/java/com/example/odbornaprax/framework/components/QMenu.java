package com.example.odbornaprax.framework.components;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Menu;

public class QMenu extends Menu {

    public QMenu() {
        super();
    }

    public void QMenu(String text) {
        super.setText(text);
    }

    public void addItems(QMenuItem ...menuItems) {
        super.getItems().addAll(menuItems);
    }

    public void addItem(QMenuItem menuItem) {
        super.getItems().add(menuItem);
    }


}
