package com.example.odbornaprax.framework.components;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;

public class QMenu extends Menu {

    private boolean pom = false;

    public QMenu() {
        super();
    }

    public QMenu(String text) {
        super(text);
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

    public ObservableList<MenuItem> getMenuItems() {
        return super.getItems();
    }

    /* Not working? */
//    public void setAction(QText text) {
//        super.setOnAction(new EventHandler<>() {
//            @Override
//            public void handle(ActionEvent actionEvent) {
//                if (pom == false) {
//                    text.setContent("Menu is pressed!");
//                    pom = true;
//                } else {
//                    text.setContent("");
//                    pom = false;
//                }
//            }
//
//        });
//    }

}
