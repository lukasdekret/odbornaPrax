package com.example.odbornaprax.framework.components;

import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.control.MultipleSelectionModel;
import javafx.scene.control.TreeCell;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;

public class QTreeView extends TreeView {
    EventHandler<MouseEvent> handler;
    public QTreeView() {
        super();
    }

    public void setRootItem(QTreeItem item){
        super.setRoot(item);
    }

    public MultipleSelectionModel getCurrentlySelectedModel() {
        return super.getSelectionModel();
    }

    public void showRoot(Boolean choice){
        super.setShowRoot(choice);
    }


}
