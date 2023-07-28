package com.example.odbornaprax.application_test;

import com.example.odbornaprax.framework.components.QApplication;
import com.example.odbornaprax.framework.components.QButton;
import com.example.odbornaprax.framework.components.QStage;
import javafx.application.Application;

public class Main extends QApplication {

    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(QStage qstage) {
        qstage.setHeadline("HBox Experiment 1");
        QButton qbutton = new QButton();
        qbutton.setHeadline("test");
        qbutton.setDimensions(30, 50);
        qstage.setParent(qbutton);
    }
}
