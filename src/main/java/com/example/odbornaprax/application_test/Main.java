package com.example.odbornaprax.application_test;

import com.example.odbornaprax.framework.components.*;
import javafx.application.Application;
import javafx.scene.layout.VBox;

public class Main extends QApplication {

    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(QStage qstage) {
        qstage.setHeadline("HBox Experiment 1");
//        QButton qbutton = new QButton();
//        qbutton.setHeadline("test");
//        qbutton.setDimensions(30, 50);
//        qstage.setParent(qbutton);

//        QProgressBar qProgressBar = new QProgressBar();
//        qProgressBar.setDimensions(50,300);
//        qProgressBar.setProgressValue(0.5); // 0.5 = 50%
//        System.out.println(qProgressBar.getProgressValue());
//        qstage.setParent(qProgressBar);

//        QProgressIndicator qProgressIndicator = new QProgressIndicator();
//        qProgressIndicator.setDimensions(10,10);
//        qProgressIndicator.setProgressValue(0.14);
//        System.out.println(qProgressIndicator.getProgressValue());
//        qstage.setParent(qProgressIndicator);

//        VBox vBox = new VBox(); // TODO: Replace with own QVBox
//        QText qText = new QText();
//        qText.setContent("lalala");
//        qText.setWrapperWidth(10.0); // 10 pixels
//        vBox.getChildren().add(qText); // TODO: Replace with own QVBox
//        qstage.setParent(vBox);

//        QTextArea qTextArea = new QTextArea();
//        qTextArea.setTextValue("haluska");
//        System.out.println(qTextArea.getTextValue());
//        qTextArea.appendText("lol");
//        System.out.println(qTextArea.getTextValue());
//        qstage.setParent(qTextArea);

    }
}
