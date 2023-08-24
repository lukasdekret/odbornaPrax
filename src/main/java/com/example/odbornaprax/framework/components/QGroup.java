package com.example.odbornaprax.framework.components;

import javafx.scene.Group;
import javafx.scene.Node;

public class QGroup extends Group {
    public QGroup() {
        super();
    }

    public void addComponents(Node... nodes) {
        for (int i = 0; i < nodes.length; i++){
            super.getChildren().add(nodes[i]);
        }
    }

}
