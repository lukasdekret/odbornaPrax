package com.example.odbornaprax.framework.components;

import javafx.collections.ObservableList;
import javafx.scene.control.ComboBox;
import javafx.scene.control.SingleSelectionModel;

import java.util.ArrayList;


public class QComboBox extends ComboBox {
    public QComboBox() {
        super();
    }

    public void addList(ArrayList list) {
        for (int i = 0; i < list.size(); i++) {
            super.getItems().add(list.get(i));
        }

    }

    public void onAction(QButton button) {
        button.setEventHandler((e) -> {
            System.out.println(super.getSelectionModel().getSelectedItem());
        });
    }
}
