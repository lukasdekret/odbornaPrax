package com.example.odbornaprax.framework.components;

import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;

import java.util.List;
import java.util.Observable;

public class QMenuButton extends MenuButton {

    public QMenuButton(String name) {
        super(name);
    }

    public QMenuButton(String name, QImageView icon, QMenuItem... menuItems) {
        super(name, icon, menuItems);
    }

    public void addItems(QMenuItem ...menuItems) {
        super.getItems().addAll(menuItems);
    }

    public void setMaxWidthHeight(double width, double height) {
        super.setMaxSize(width, height);
    }

    public void addItem(QMenuItem menuItem) {
        super.getItems().add(menuItem);
    }

}
