package com.example.odbornaprax.framework.components;

import javafx.scene.control.Menu;

public class QMenu extends Menu {

    public QMenu() {
        super();
    }

    public QMenu(String text) {
        super(text);
    }

    public void addItems(QMenuItem ...menuItems) {
        super.getItems().addAll(menuItems);
    }

    public void addItem(QMenuItem menuItem) {
        super.getItems().add(menuItem);
    }
}
