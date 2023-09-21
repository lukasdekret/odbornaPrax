package com.example.odbornaprax.application_test;

import com.example.odbornaprax.framework.components.*;
import javafx.application.Application;


import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.paint.Color;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Main extends QApplication {

    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(QStage qstage) {
        /**----------------------MAIN SCENE--------------------**/

        /**MAIN TITLE*/
        QText mainTitle = new QText();
        mainTitle.setContent("Welcome to QFrameWork Tutorial App!");
        mainTitle.setSize(3,3);

        /** MAIN TITLE COMPONENT */
        QHBox mainHeader = new QHBox();
        mainHeader.addComponents(mainTitle);
        mainHeader.setPrefWidthHeight(800,65);
        mainHeader.setPositionOfChildNodes("CENTER");
        //TODO Zaobalit funkciu na background
        mainHeader.setBackground(new Background(new BackgroundFill(Color.BLUE,null,null)));


        /** MAIN MENU */
        QTreeView qMainMenu = new QTreeView();
        QTreeItem qButton = new QTreeItem("QButton");
        QTreeItem qRadioButton = new QTreeItem("QRadioButton");
        QTreeItem qCheckBox = new QTreeItem("QCheckBox");
        QTreeItem qComboBox = new QTreeItem("QComboBox");
        QTreeItem qToggleGroup = new QTreeItem("QToggleGroup");
        QTreeItem rootItem = new QTreeItem("Buttons and Boxes");
        rootItem.addItems(qButton,qRadioButton,qCheckBox,qComboBox,qToggleGroup);
        qMainMenu.setRootItem(rootItem);



        /** MENUBOX */
        QHBox menuBox = new QHBox();
        menuBox.addComponents(qMainMenu);
        menuBox.setPositionOfChildNodes("LEFT");
        menuBox.setMarginOfNode(qMainMenu,20,20,0,20);

        /** LOGO */
        QImageView logo = new QImageView();
        try {
            FileInputStream input = new FileInputStream("C:\\Users\\Erik\\Desktop\\Projects-Prax\\odbornaPrax\\src\\main\\java\\Pictures\\logo.png");
            logo.setNewImage(input);
            logo.setDimensions(250,250);
        } catch (
                FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        /** LOGOBOX */
        QHBox logoBox = new QHBox();
        logoBox.addComponents(logo);
        logoBox.setPrefWidthHeight(300,300);
        logoBox.setPositionOfChildNodes("CENTER");

        /** SIDE TEXT */
        QText sideText = new QText();
        sideText.setContent("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. ");
        sideText.setWrapperWidth(130);
        sideText.setSize(1.5,1.5);

        /** SIDETEXT BOX */
        QHBox sideBox = new QHBox();
        sideBox.addComponents(sideText);
        sideBox.setMarginOfNode(sideText,100,0,80,0);
        sideBox.setPrefWidthHeight(200,500);

        /** BOTTOM TEXT */
        QText bottomText = new QText();
        bottomText.setContent("Lorem Ipsum is simply dummy text of the printing and typesetting industry. ");
        bottomText.setSize(2,2);

        /** BOTTOMTEXT BOX */
        QHBox bottomBox = new QHBox();
        bottomBox.addComponents(bottomText);
        bottomBox.setPrefWidthHeight(800,100);
        bottomBox.setPositionOfChildNodes("CENTER");
        bottomBox.setMarginOfNode(bottomText,20,50,20,50);


        /** MAIN BACKGROUND WITH COMPONENTS */
        QBorderPane mainBackground = new QBorderPane();
        mainBackground.setPosition("TOP",mainHeader);
        mainBackground.setPosition("LEFT",menuBox);
        mainBackground.setPosition("CENTER",logoBox);
        mainBackground.setPosition("RIGHT",sideBox);
        mainBackground.setPosition("BOTTOM",bottomBox);


        /**----------------------BUTTON SCENE--------------------**/

        /**BUTTON TITLE*/
        QText buttonTitle = new QText();
        buttonTitle.setContent("Button");
        buttonTitle.setSize(3,3);

        /** BUTTON TITLE COMPONENT */
        QHBox buttonHeader = new QHBox();
        buttonHeader.addComponents(buttonTitle);
        buttonHeader.setMinWidthHeight(800,50);
        buttonHeader.setMaxWidthHeight(800,100);
        buttonHeader.setPositionOfChildNodes("CENTER");;

        /** MAIN BACKGROUND WITH COMPONENTS */
        QBorderPane buttonBackground = new QBorderPane();
        buttonBackground.setPosition("TOP",buttonHeader);

        /**----------------------RADIOBUTTON SCENE--------------------**/

        /**RADIOBUTTON TITLE*/
        QText radioButtonTitle = new QText();
        radioButtonTitle.setContent("Radio Button");
        radioButtonTitle.setSize(3,3);

        /** RADIOBUTTON TITLE COMPONENT */
        QHBox radioButtonHeader = new QHBox();
        radioButtonHeader.addComponents(radioButtonTitle);
        radioButtonHeader.setMinWidthHeight(800,50);
        radioButtonHeader.setMaxWidthHeight(800,100);
        radioButtonHeader.setPositionOfChildNodes("CENTER");

        /** RADIOBUTTON BACKGROUND WITH COMPONENTS */
        QBorderPane radioButtonBackground = new QBorderPane();
        radioButtonBackground.setPosition("TOP",buttonHeader);

        /**----------------------CHECKBOX SCENE--------------------**/

        /**CHECKBOX TITLE*/
        QText checkboxTitle = new QText();
        checkboxTitle.setContent("Checkbox");
        checkboxTitle.setSize(3,3);

        /** CHECKBOX TITLE COMPONENT */
        QHBox checkboxHeader = new QHBox();
        checkboxHeader.addComponents(checkboxTitle);
        checkboxHeader.setMinWidthHeight(800,50);
        checkboxHeader.setMaxWidthHeight(800,100);
        checkboxHeader.setPositionOfChildNodes("CENTER");

        /** CHECKBOX BACKGROUND WITH COMPONENTS */
        QBorderPane checkboxBackground = new QBorderPane();
        checkboxBackground.setPosition("TOP",buttonHeader);

        /**----------------------COMBOBOX SCENE--------------------**/

        /**COMBOBOX TITLE*/
        QText comboboxTitle = new QText();
        comboboxTitle.setContent("Combobox");
        comboboxTitle.setSize(3,3);

        /** COMBOBOX TITLE COMPONENT */
        QHBox comboboxHeader = new QHBox();
        comboboxHeader.addComponents(comboboxTitle);
        comboboxHeader.setMinWidthHeight(800,50);
        comboboxHeader.setMaxWidthHeight(800,100);
        comboboxHeader.setPositionOfChildNodes("CENTER");


        /** COMBOBOX BACKGROUND WITH COMPONENTS */
        QBorderPane comboboxBackground = new QBorderPane();
        comboboxBackground.setPosition("TOP",buttonHeader);

        /**----------------------TOGGLEGROUP SCENE--------------------**/

        /**TOGGLEGROUP TITLE*/
        QText toggleGroupTitle = new QText();
        toggleGroupTitle.setContent("Togglegroup");
        toggleGroupTitle.setSize(3,3);

        /** TOGGLEGROUP TITLE COMPONENT */
        QHBox toggleGroupHeader = new QHBox();
        toggleGroupHeader.addComponents(toggleGroupTitle);
        toggleGroupHeader.setMinWidthHeight(800,50);
        toggleGroupHeader.setMaxWidthHeight(800,100);
        toggleGroupHeader.setPositionOfChildNodes("CENTER");

        /** TOGGLEGROUP BACKGROUND WITH COMPONENTS */
        QBorderPane toggleGroupBackground = new QBorderPane();
        toggleGroupBackground.setPosition("TOP",buttonHeader);

        /**----------------------SCENE MANAGEMENT--------------------**/

        /** MAIN SCENE */
        QScene mainScene = new QScene(mainBackground,1000,800);
        qstage.setQScene(mainScene);
        qstage.showScene();


        /** BUTTON SCENE */
        QScene buttonScene = new QScene(buttonBackground,800,600);

        /** RADIOBUTTON SCENE */
        QScene radioButtonScene = new QScene(radioButtonBackground,800,600);


        /** CHECKBOX SCENE */
        QScene checkboxScene = new QScene(checkboxBackground,800,600);


        /** COMBOBOX SCENE */
        QScene comboboxScene = new QScene(comboboxBackground,800,600);

        /** TOGGLEGROUP SCENE */
        QScene toggleGroupScene = new QScene(toggleGroupBackground,800,600);

    }

}
