package com.example.odbornaprax.framework.components;

import javafx.scene.Node;
import javafx.scene.control.TreeView;

public class QTreeView extends TreeView {
    public QTreeView() {
        super();
    }

    public void setRootItem(QTreeItem item){
        super.setRoot(item);
    }

    public void showRoot(Boolean choice){
        super.setShowRoot(choice);
    }
}
