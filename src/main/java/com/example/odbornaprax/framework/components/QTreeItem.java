package com.example.odbornaprax.framework.components;

import javafx.scene.Node;
import javafx.scene.control.TreeItem;

public class QTreeItem extends TreeItem {
    public QTreeItem(Object value) {
        super(value);
    }
    public void addItems(QTreeItem... items) {
        for (int i = 0; i < items.length; i++){
            super.getChildren().add(items[i]);
        }
    }
    public void setImage(Node graphic){
        super.setGraphic(graphic);
    }
}
