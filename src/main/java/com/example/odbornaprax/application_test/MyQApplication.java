package com.example.odbornaprax.application_test;

import com.example.odbornaprax.framework.components.QApplication;
import com.example.odbornaprax.framework.components.QBorderPane;
import com.example.odbornaprax.framework.components.QScene;
import com.example.odbornaprax.framework.components.QStage;

import com.example.odbornaprax.framework.components.*;

import javafx.stage.Stage;

public class MyQApplication extends QApplication {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(QStage qstage) {
        QBorderPane rootPane = new QBorderPane();
        QScene scene = new QScene(rootPane, 800, 600);

        // Creating the navigation menu
        QMenu mainMenu = new QMenu("Main Menu");
        QMenu quizesMenu = new QMenu("Quizes");
        quizesMenu.addItems(new QMenuItem("Example Quiz 1"), new QMenuItem("Example Quiz 2"), new QMenuItem("Example Quiz 3"));

        // Adding menus to the menu bar
        QMenuBar menuBar = new QMenuBar();
        menuBar.addMenus(mainMenu, quizesMenu);

        // Placing the menu bar at the top of the window
        rootPane.setPosition("TOP", menuBar);

        qstage.setQScene(scene);
        qstage.showScene();
    }
}



