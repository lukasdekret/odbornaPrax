package com.example.odbornaprax.application_test;

import com.example.odbornaprax.framework.components.*;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.CheckBox;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class Main extends QApplication {

    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(QStage qstage)  {
        /*qstage.setHeadline("HBox Experiment 1");
        QButton qbutton = new QButton();
        qbutton.setHeadline("test");
        qbutton.setDimensions(30, 50);
        qstage.setParent(qbutton);*/

//        QTextField qtextfield = new QTextField();
//        qtextfield.setDimensions(30,50);
//        qtextfield.promptText("Enter Text");
//        qtextfield.getTextFromTextField();
//        qstage.setParent(qtextfield);



        //TODO ImageView
        /*QImageView qimageView = new QImageView();
        qimageView.setNewImage("C:\\Users\\Erik\\Desktop\\Projects-Prax\\odbornaPrax-master-Kulka\\src\\main\\java\\com\\example\\odbornaprax\\pictures\\test.png");
        qstage.setParent(qimageView);*/

        /*QHyperlink qhyperlink = new QHyperlink();
        qhyperlink.setFontStyle("-fx-underline: true; -fx-font-size:20px;-fx-font-family:'Roboto Regular';");
        qhyperlink.setHyperlinkText("Click!");
        qhyperlink.setAction("Clicked!");
        qstage.setParent(qhyperlink);*/

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

        // VBox vBox = new VBox(); TODO: Replace with own QVBox
        // QProgressBar qProgressBar = new QProgressBar();
        // qProgressBar.setDimensions(2,3);
        // qProgressBar.setProgressValue(0.5); // 0.5 = 50%
        // System.out.println(qProgressBar.getProgressValue());
        // vBox.getChildren().add(qProgressBar);
        // qstage.setParent(vBox);

        // QProgressIndicator qProgressIndicator = new QProgressIndicator();
        // qProgressIndicator.setDimensions(10,10);
        // qProgressIndicator.setProgressValue(0.14);
        // System.out.println(qProgressIndicator.getProgressValue());
        // qstage.setParent(qProgressIndicator);

        // VBox vBox = new VBox(); // TODO: Replace with own QVBox
        // QText qText = new QText();
        // qText.setContent("lalala");
        // qText.setWrapperWidth(10.0); // 10 pixels
        // vBox.getChildren().add(qText); // TODO: Replace with own QVBox
        // qstage.setParent(vBox);

        // QTextArea qTextArea = new QTextArea();
        // qTextArea.setTextValue("haluska");
        // System.out.println(qTextArea.getTextValue());
        // qTextArea.appendText("lol");
        // System.out.println(qTextArea.getTextValue());
        // qstage.setParent(qTextArea);

        VBox vBox = new VBox();
        QMenuBar qMenuBar = new QMenuBar();
        QMenu menu1 = new QMenu("Test");
        qMenuBar.addMenu(menu1);

        QMenu menuA = new QMenu("Tlacidlo A");
        QMenu menuB = new QMenu("Tlacidlo B");
        qMenuBar.addMenus(menuA, menuB);
        vBox.getChildren().add(qMenuBar);
        qstage.setParent(vBox);

        QMenuItem menuItem = new QMenuItem("TestMenuItem");
        menuItem.setAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                System.out.println(actionEvent);
            }
        });
        System.out.println(menuB.getItems());
        menuB.getItems().add(menuItem);
        System.out.println(menuB.getItems());

        QMenuButton qMenuButton = new QMenuButton("Test2");
        qMenuButton.getItems().add(menuItem);
        vBox.getChildren().add(qMenuButton);

        QMenuButton qMenuButton2 = new QMenuButton("Test3", null,  new QMenuItem("Test3A"),  new QMenuItem("Test3B"),  new QMenuItem("Test3C"));
        vBox.getChildren().add(qMenuButton2);

        QPagination qPagination = new QPagination();
        qPagination.setPageNumber(10);
        qPagination.setCurrentPage(0); // -1, ako pole
        qPagination.setMaxPageIndicatorValue(5);
        qPagination.setContentFactory((index) -> {
            QLabel label = new QLabel("Strana " + (index + 1));

            return new VBox(label);
        });
        vBox.getChildren().add(qPagination);
        System.out.println(qPagination.getPageNumber());
    }
}
