package com.example.odbornaprax.framework.components;

import javafx.scene.Node;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleGroup;

public class QToggleGroup extends ToggleGroup {
    public QToggleGroup() {
        super();
    }

    public void addToggles(Toggle... nodes) {
        for (int i = 0; i < nodes.length; i++){
            super.getToggles().add(nodes[i]);
        }
    }
}
