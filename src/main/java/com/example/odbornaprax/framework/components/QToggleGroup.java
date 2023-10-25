package com.example.odbornaprax.framework.components;

import javafx.scene.Node;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleGroup;

import java.util.HashMap;

public class QToggleGroup extends ToggleGroup {

    private HashMap<Toggle, Integer> indexes = new HashMap<Toggle, Integer>();
    public QToggleGroup() {
        super();
    }

    public void addToggles(Toggle... nodes) {
        for (int i = 0; i < nodes.length; i++){
            super.getToggles().add(nodes[i]);
            indexes.put(nodes[i], i);
        }
    }

    public void disable(){
        super.getToggles().forEach(toggle -> {
            Node node = (Node) toggle ;
            node.setDisable(true);
        });
    }

    public HashMap<Toggle, Integer> getIndexes() {
        return indexes;
    }
}
