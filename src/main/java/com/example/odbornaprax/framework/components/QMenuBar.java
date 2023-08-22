package com.example.odbornaprax.framework.components;

import javafx.scene.control.MenuBar;

public class QMenuBar extends MenuBar {

    public QMenuBar() {
        super();
    }


    public void addMenu(QMenu menuItem) {
        super.getMenus().add(menuItem);
    }

    public void addMenus(QMenu ...menuItems) {
        super.getMenus().addAll(menuItems);
    }

}
