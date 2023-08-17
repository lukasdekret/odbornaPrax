package com.example.odbornaprax.framework.components;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public abstract class QApplication extends Application {

    public QApplication() {
        super();
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        QStage qstage = new QStage();
        start(qstage);

        primaryStage.setTitle(qstage.getHeadline());

        /*QScene qScene = new QScene(qstage.getParent(), 800, 600);
        primaryStage.setScene(qScene);
        primaryStage.show();*/
    }

    public static void main(String[] args) {
        Application.launch(args);
    }

    public abstract void start(QStage qstage);
}
