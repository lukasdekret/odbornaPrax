package com.example.odbornaprax.application_test;

import com.example.odbornaprax.framework.components.*;
import javafx.application.Application;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.HBox;

public class Main extends QApplication {

    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(QStage qstage) {
        qstage.setHeadline("HBox Experiment 1");
        QButton qbutton = new QButton();
        qbutton.setHeadline("test");
        qbutton.setDimensions(50, 50);

        /*
        QCheckBox qCheckBox = new QCheckBox();
        qCheckBox.setTitle("Test");
        System.out.println(qCheckBox.isChecked());
        qstage.setParent(qCheckBox);
        */
        /*
        QRadioButton qRadioButton = new QRadioButton();
        qRadioButton.setTitle("Testing");
        System.out.println(qRadioButton.isChecked());
        qstage.setParent(qRadioButton);
        */
        /*
        QLabel qLabel = new QLabel();
        qLabel.setTitle("Test Label");
        qstage.setParent(qLabel);
        */
    }
}
