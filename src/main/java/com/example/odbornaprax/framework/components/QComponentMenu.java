package com.example.odbornaprax.framework.components;

import javafx.beans.Observable;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Map;

public class QComponentMenu {

    public QHBox qhBox;
    private QMenuBar menuBar;
    private QButton mainPageButton;
    public QText title;

    public QComponentMenu() {
        super();
        this.qhBox = new QHBox();
        this.menuBar = new QMenuBar();
        this.mainPageButton = new QButton();
        this.title = new QText();
        this.setupMenu();
    }

   @Deprecated
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
       menuQBox.addComponents(mainPage, menuBar, title);
       menuQBox.setMarginOfNode(title,20,0,10,170);
       menuQBox.setPositionOfChildNodes("TOP");
       menuQBox.setPositionOfChildNodes("LEFT");

   }

   private void setupMenu() {
        mainPageButton.setHeadline("Main Page");
        try {
            FileInputStream input = new FileInputStream("src/main/java/Pictures/logo.png");
            mainPageButton.setImage(input);
        } catch(FileNotFoundException exc) {
            throw new RuntimeException(exc);
        }

       title.setSize(3,3);

       qhBox.addComponents(mainPageButton, menuBar, title);
       qhBox.setMarginOfNode(title,20,0,10,170);
       qhBox.setPositionOfChildNodes("TOP");
       qhBox.setPositionOfChildNodes("LEFT");

   }

   public void addMenus(QMenu... menu) {
        for(QMenu menuItem: menu) {
            menuBar.addMenu(menuItem);
        }
   }

   public void switchSceneForSection(int index, Map<String, QScene> scenes, QStage qstage, QPaginationSceneSwitcher sceneSwitcher, QScene[] sceneIndexes, QBorderPane[] paneIndexes) {

       // Nastavenie pre tlacidlo na hlavnu scenu
       mainPageButton.setOnAction(new EventHandler<ActionEvent>() {
           @Override
           public void handle(ActionEvent actionEvent) {
               qstage.setQScene(scenes.get("QMainPage"));
               qstage.showScene();
           }
       });

       // Nastavenie pre stlacenie na MenuItem v Menu podla indexu
       Menu selectedMenu = menuBar.getMenus().get(index);
       for(int i = 0; i < selectedMenu.getItems().toArray().length; i++) {
           int selectedIndex = i;
           selectedMenu.getItems().get(i).setOnAction(new EventHandler<ActionEvent>() {
               @Override
               public void handle(ActionEvent actionEvent) {
                   title.setContent(selectedMenu.getItems().get(selectedIndex).getText().toString());
                   sceneSwitcher.getNode().setCurrentPage(selectedIndex);

                   paneIndexes[selectedIndex].setPosition("BOTTOM", sceneSwitcher.getNode());
                   paneIndexes[selectedIndex].setPosition("TOP", qhBox);
                   qstage.setQScene(sceneIndexes[selectedIndex]);
                   qstage.show();
               }
           });

       }

   }

    @Deprecated
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

