package com.example.odbornaprax.framework.components;

import javafx.beans.Observable;
import javafx.collections.ObservableList;
import javafx.scene.control.Menu;
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

    public void setUseSystem(boolean t){
        super.setUseSystemMenuBar(t);
    }

    public ObservableList<Menu> getMenusList() {
        return super.getMenus();
    }

}
