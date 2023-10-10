package com.example.odbornaprax.framework.components;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Map;

public class QComponentMenu {

    public QComponentMenu() {
        super();
    }
   public void createMenu(QHBox menuQBox,QMenuBar menuBar,QButton mainPage, QMenu buttonsAndBoxes, QMenuItem buttonItem, QMenuItem radioButtonItem, QMenuItem checkboxItem, QMenuItem comboBoxItem, QMenuItem toggleGroupItem,QText title) {
       mainPage.setHeadline("Main Page");
       buttonsAndBoxes.QMenu("Buttons and Boxes");
       try {
           FileInputStream input = new FileInputStream("src/main/java/Pictures/logo.png");
           mainPage.setImage(input);
       } catch (
               FileNotFoundException e) {
           throw new RuntimeException(e);
       }

       buttonsAndBoxes.addItems(buttonItem, radioButtonItem, checkboxItem, comboBoxItem,toggleGroupItem);

       menuBar.addMenus(buttonsAndBoxes);
       menuBar.setUseSystem(true);

       title.setSize(3,3);
       menuQBox.addComponents(mainPage, menuBar,title);
       menuQBox.setMarginOfNode(title,20,0,10,170);
       menuQBox.setPositionOfChildNodes("TOP");
       menuQBox.setPositionOfChildNodes("LEFT");

   }
    public void sceneSwitcher(Map<String,QScene> scenes, QStage qstage, QPaginationSceneSwitcher sceneSwitcher, QScene[] sceneIndexes, QBorderPane[] paneIndexes,QMenu menu, QButton mainPage,QHBox menuQBox,QText title){

            mainPage.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent actionEvent) {
                    qstage.setQScene(scenes.get("QMainPage"));
                    qstage.showScene();
                }
            });
        menu.getItems().get(0).setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                title.setContent("QButton");
                sceneSwitcher.getNode().setCurrentPage(0);
                paneIndexes[0].setPosition("BOTTOM", sceneSwitcher.getNode());
                paneIndexes[0].setPosition("TOP",menuQBox);
                qstage.setQScene(sceneIndexes[0]);
                qstage.show();
            }
        });
        menu.getItems().get(1).setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                title.setContent("QRadioButton");
                sceneSwitcher.getNode().setCurrentPage(1);
                paneIndexes[1].setPosition("BOTTOM", sceneSwitcher.getNode());
                paneIndexes[1].setPosition("TOP",menuQBox);
                qstage.setQScene(sceneIndexes[1]);
                qstage.show();
            }
        });
        menu.getItems().get(2).setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                title.setContent("QCheckBox");
                sceneSwitcher.getNode().setCurrentPage(2);
                paneIndexes[2].setPosition("BOTTOM", sceneSwitcher.getNode());
                paneIndexes[2].setPosition("TOP",menuQBox);
                qstage.setQScene(sceneIndexes[2]);
                qstage.show();
            }
        });
        menu.getItems().get(3).setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                title.setContent("QComboBox");
                sceneSwitcher.getNode().setCurrentPage(3);
                paneIndexes[3].setPosition("BOTTOM", sceneSwitcher.getNode());
                paneIndexes[3].setPosition("TOP",menuQBox);
                qstage.setQScene(sceneIndexes[3]);
                qstage.show();
            }
        });
        menu.getItems().get(4).setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                title.setContent("QToggleGroup");
                sceneSwitcher.getNode().setCurrentPage(4);
                paneIndexes[4].setPosition("BOTTOM", sceneSwitcher.getNode());
                paneIndexes[4].setPosition("TOP",menuQBox);
                qstage.setQScene(sceneIndexes[4]);
                qstage.show();
            }
        });

    }

}

