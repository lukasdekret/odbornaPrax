package com.example.odbornaprax.framework.components;

import javafx.collections.ObservableList;
import javafx.scene.control.ComboBox;


public class QComboBox extends ComboBox {
    public QComboBox() {
        super();
    }

    public void addList(ObservableList list) {
        for (int i = 0; i < list.size(); i++) {
            super.getItems().add(list.get(i));
        }

    }

    public void onAction(QButton button) {
        button.setOnAction((e) -> {
            System.out.println(super.getSelectionModel().getSelectedItem());
        });
    }
}
