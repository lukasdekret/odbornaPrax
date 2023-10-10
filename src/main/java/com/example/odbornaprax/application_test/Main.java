package com.example.odbornaprax.application_test;

import com.example.odbornaprax.framework.components.*;
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

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

        /** MAIN MENU */
        QTreeView qMainMenu = new QTreeView();
        QTreeItem rootItem = new QTreeItem("Root (hidden)");
        qMainMenu.showRoot(false);
        qMainMenu.setRootItem(rootItem);
        /** Section: Buttons and Boxes */
        QTreeItem qButton = new QTreeItem("QButton");
        QTreeItem qRadioButton = new QTreeItem("QRadioButton");
        QTreeItem qCheckBox = new QTreeItem("QCheckBox");
        QTreeItem qComboBox = new QTreeItem("QComboBox");
        QTreeItem qToggleGroup = new QTreeItem("QToggleGroup");
        QTreeItem buttonsRootItem = new QTreeItem("Buttons and Boxes");
        buttonsRootItem.addItems(qButton,qRadioButton,qCheckBox,qComboBox,qToggleGroup);
        rootItem.addItems(buttonsRootItem);
        /** Section: Menus */
        QTreeItem qMenu = new QTreeItem("QMenu");
        QTreeItem qMenuBar = new QTreeItem("QMenuBar");
        QTreeItem qMenuButton = new QTreeItem("QMenuButton");
        QTreeItem qMenuItem = new QTreeItem("QMenuItem");
        QTreeItem menuRootItem = new QTreeItem("Menus");
        menuRootItem.addItems(qMenu, qMenuBar, qMenuButton, qMenuItem);
        rootItem.addItems(menuRootItem);

        /** MENUBOX */
        QHBox buttonMenuBox = new QHBox();
        buttonMenuBox.addComponents(qMainMenu);
        buttonMenuBox.setPositionOfChildNodes("LEFT");
        buttonMenuBox.setMarginOfNode(qMainMenu,20,20,0,20);

        /** LOGO */
        QImageView logo = new QImageView();
        try {
            FileInputStream input = new FileInputStream("src/main/java/Pictures/logo.png");
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
        mainBackground.setPosition("LEFT",buttonMenuBox);
        mainBackground.setPosition("CENTER",logoBox);
        mainBackground.setPosition("RIGHT",sideBox);
        mainBackground.setPosition("BOTTOM",bottomBox);


        /**---------------------------------------BUTTONS AND BOXES SECTION-------------------------------------------------------**/

        /**----------------------BUTTON SCENE--------------------**/

        /**BUTTON TEXT**/
        QText buttonText = new QText();
        buttonText.setContent("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. " +
                "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. " );
        buttonText.setWrapperWidth(225);
        buttonText.setSize(1.5,1.5);

        QVBox buttonTextBox = new QVBox();
        buttonTextBox.addComponents(buttonText);
        buttonTextBox.setMarginOfNode(buttonText,150,0,80,140);
        buttonTextBox.setPrefWidthHeight(500,150);

        /**BUTTON**/
        QButton buttonShow = new QButton();
        buttonShow.setHeadline("QButton");
        buttonShow.setDimensions(50,50);
        buttonShow.setPrefSize(100,50);

        /**BUTTON ALERT**/
        QText buttonAlert = new QText();
        QLabel pressButton = new QLabel();
        buttonAlert.font("Verdana");
        pressButton.setTitle("Press QButton!");

        /**BUTTON CODE TITLE**/
        QText buttonCodeTitle = new QText();
        buttonCodeTitle.setContent("Usage of QButton in Q");
        buttonCodeTitle.setSize(1.5,1.5);
        buttonCodeTitle.font("Verdana");

        /**BUTTON CODE**/
        QText buttonCode = new QText();
        buttonCode.setContent("QButton buttonShow = new QButton();\nbuttonShow.setHeadline(\"Button\");\nbuttonShow.setDimensions(50,50);\nbuttonShow.setPrefSize(100,50);");
        buttonCode.setSize(1.3,1.3);
        buttonCode.setWrapperWidth(200);

        /**BUTTON ALERT**/
        buttonShow.setAction(buttonAlert);

        /**BUTTON IMAGE**/
        QImageView buttonImage = new QImageView();
        try {
            FileInputStream input = new FileInputStream("src/main/java/Pictures/example-button.png");
            buttonImage.setNewImage(input);
        } catch (
                FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        buttonImage.setDimensions(100,300);

        /**BUTTON IMAGE DEF**/
        QText buttonImageDef = new QText();
        buttonImageDef.setContent("Definition of QButton");
        buttonImageDef.setSize(1.2,1.2);

        /**BUTTON IMAGE BOX**/
        QVBox buttonImageBox = new QVBox();
        buttonImageBox.addComponents(buttonImage,buttonImageDef,buttonCodeTitle,buttonCode,pressButton,buttonShow,buttonAlert);
        buttonImageBox.setPositionOfChildNodes("CENTER");
        buttonImageBox.setMarginOfNode(buttonImage,0,0,20,25);
        buttonImageBox.setMarginOfNode(buttonCodeTitle,100,0,30,0);
        buttonImageBox.setMarginOfNode(buttonShow,20,0,0,0);
        buttonImageBox.setMarginOfNode(pressButton,40,0,0,0);
        buttonImageBox.setMarginOfNode(buttonAlert,10,0,0,0);
        buttonImageBox.setPrefWidthHeight(500,20);


        /** MAIN BACKGROUND WITH COMPONENTS */
        QBorderPane buttonBackground = new QBorderPane();
        buttonBackground.setPosition("LEFT",buttonTextBox);
        buttonBackground.setPosition("RIGHT",buttonImageBox);

        /**----------------------RADIOBUTTON SCENE--------------------**/

        /**RADIOBUTTON TEXT**/
        QText radioButtonText = new QText();
        radioButtonText.setContent("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. " +
                "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. " );
        radioButtonText.setWrapperWidth(225);
        radioButtonText.setSize(1.5,1.5);

        QVBox radioButtonTextBox = new QVBox();
        radioButtonTextBox.addComponents(radioButtonText);
        radioButtonTextBox.setMarginOfNode(radioButtonText,150,0,80,140);
        radioButtonTextBox.setPrefWidthHeight(500,150);

        /**RADIOBUTTON**/
        QRadioButton radioButtonShow = new QRadioButton();
        radioButtonShow.setTitle("QRadioButton");
        radioButtonShow.setPrefSize(100,100);

        /**RADIOBUTTON ALERT**/
        QLabel pressRadioButton = new QLabel();
        pressRadioButton.setTitle("Press QRadioButton!");

        /**RADIOBUTTON CODE TITLE**/
        QText radioButtonCodeTitle = new QText();
        radioButtonCodeTitle.setContent("Usage of QRadioButton in Q");
        radioButtonCodeTitle.setSize(1.5,1.5);
        radioButtonCodeTitle.font("Verdana");

        /**RADIOBUTTON CODE**/
        QText radioButtonCode = new QText();
        radioButtonCode.setContent("QRadioButton radioButtonShow = new QRadioButton();\n" +
                "radioButtonShow.setTitle(\"RadioButton\");\n" +
                "radioButtonShow.setPrefSize(100,100);\n");
        radioButtonCode.setSize(1.3,1.3);
        radioButtonCode.setWrapperWidth(250);


        /**RADIOBUTTON IMAGE**/
        QImageView radioButtonImage = new QImageView();
        try {
            FileInputStream input = new FileInputStream("src/main/java/Pictures/example-radioButton.png");
            radioButtonImage.setNewImage(input);
        } catch (
                FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        radioButtonImage.setDimensions(150,250);

        /**RADIOBUTTON IMAGE DEF**/
        QText radioButtonImageDef = new QText();
        radioButtonImageDef.setContent("Definition of QRadioButton");
        radioButtonImageDef.setSize(1.2,1.2);

        /**RADIOBUTTON IMAGE BOX**/
        QVBox radioButtonImageBox = new QVBox();
        radioButtonImageBox.addComponents(radioButtonImage,radioButtonImageDef,radioButtonCodeTitle,radioButtonCode,pressRadioButton,radioButtonShow);
        radioButtonImageBox.setPositionOfChildNodes("CENTER");
        radioButtonImageBox.setMarginOfNode(radioButtonImage,0,0,20,25);
        radioButtonImageBox.setMarginOfNode(radioButtonCodeTitle,100,0,30,0);
        radioButtonImageBox.setMarginOfNode(pressRadioButton,40,0,0,0);
        radioButtonImageBox.setMarginOfNode(radioButtonShow,0,0,0,0);
        radioButtonImageBox.setPrefWidthHeight(500,20);


        /** MAIN BACKGROUND WITH COMPONENTS */
        QBorderPane radioButtonBackground = new QBorderPane();
        radioButtonBackground.setPosition("LEFT",radioButtonTextBox);
        radioButtonBackground.setPosition("RIGHT",radioButtonImageBox);

        /**----------------------CHECKBOX SCENE--------------------**/

        /**CHECKBOX TEXT**/
        QText checkBoxText = new QText();
        checkBoxText.setContent("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. " +
                "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. " );
        checkBoxText.setWrapperWidth(225);
        checkBoxText.setSize(1.5,1.5);

        QVBox checkBoxTextBox = new QVBox();
        checkBoxTextBox.addComponents(checkBoxText);
        checkBoxTextBox.setMarginOfNode(checkBoxText,150,0,80,140);
        checkBoxTextBox.setPrefWidthHeight(500,150);

        /**CHECKBOX**/
        QCheckBox checkBoxShow = new QCheckBox();
        checkBoxShow.setTitle("QCheckBox");

        /**CHECKBOX ALERT**/
        QLabel pressCheckBox = new QLabel();
        pressCheckBox.setTitle("Press QCheckBox!");

        /**CHECKBOX CODE TITLE**/
        QText checkBoxCodeTitle = new QText();
        checkBoxCodeTitle.setContent("Usage of QCheckBox in Q");
        checkBoxCodeTitle.setSize(1.5,1.5);
        checkBoxCodeTitle.font("Verdana");

        /**CHECKBOX CODE**/
        QText checkBoxCode = new QText();
        checkBoxCode.setContent("QCheckBox checkBoxShow = new QCheckBox();\n" +
                "checkBoxShow.setTitle(\"QCheckBox\");\n" +
                "checkBoxShow.setPrefSize(100,100);\n");
        checkBoxCode.setSize(1.3,1.3);
        checkBoxCode.setWrapperWidth(250);


        /**CHECKBOX IMAGE**/
        QImageView checkBoxImage = new QImageView();
        try {
            FileInputStream input = new FileInputStream("src/main/java/Pictures/example-checkBox.png");
            checkBoxImage.setNewImage(input);
        } catch (
                FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        checkBoxImage.setDimensions(150,250);

        /**CHECKBOX IMAGE DEF**/
        QText checkBoxImageDef = new QText();
        checkBoxImageDef.setContent("Definition of QCheckBox");
        checkBoxImageDef.setSize(1.2,1.2);

        /**CHECKBOX IMAGE BOX**/
        QVBox checkBoxImageBox = new QVBox();
        checkBoxImageBox.addComponents(checkBoxImage,checkBoxImageDef,checkBoxCodeTitle,checkBoxCode,pressCheckBox,checkBoxShow);
        checkBoxImageBox.setPositionOfChildNodes("CENTER");
        checkBoxImageBox.setMarginOfNode(checkBoxImage,0,0,20,25);
        checkBoxImageBox.setMarginOfNode(checkBoxCodeTitle,100,0,30,0);
        checkBoxImageBox.setMarginOfNode(pressCheckBox,40,0,20,0);
        checkBoxImageBox.setMarginOfNode(checkBoxShow,0,0,0,0);
        checkBoxImageBox.setPrefWidthHeight(500,20);


        /** MAIN BACKGROUND WITH COMPONENTS */
        QBorderPane checkBoxBackground = new QBorderPane();
        checkBoxBackground.setPosition("LEFT",checkBoxTextBox);
        checkBoxBackground.setPosition("RIGHT",checkBoxImageBox);


        /**----------------------COMBOBOX SCENE--------------------**/

        /**COMBOBOX TEXT**/
        QText comboBoxText = new QText();
        comboBoxText.setContent("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. " +
                "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. " );
        comboBoxText.setWrapperWidth(225);
        comboBoxText.setSize(1.5,1.5);

        QVBox comboBoxTextBox = new QVBox();
        comboBoxTextBox.addComponents(comboBoxText);
        comboBoxTextBox.setMarginOfNode(comboBoxText,150,0,80,140);
        comboBoxTextBox.setPrefWidthHeight(500,150);

        /**COMBOBOX**/
        QComboBox comboBoxShow = new QComboBox();
        ArrayList<String> list = new ArrayList<>();
        list.add("Example 1");
        list.add("Example 2");
        list.add("Example 3");
        comboBoxShow.addList(list);

        /**COMBOBOX ALERT**/
        QLabel pressComboBox = new QLabel();
        pressComboBox.setTitle("Press QComboBox!");

        /**COMBOBOX CODE TITLE**/
        QText comboBoxCodeTitle = new QText();
        comboBoxCodeTitle.setContent("Usage of QComboBox in Q");
        comboBoxCodeTitle.setSize(1.5,1.5);
        comboBoxCodeTitle.font("Verdana");

        /**COMBOBOX CODE**/
        QText comboBoxCode = new QText();
        comboBoxCode.setContent("QComboBox comboBoxShow = new QComboBox();\n" +
                "ArrayList<String> list = new ArrayList<>();\n" +
                "list.add(\"Example 1\");\n" +
                "list.add(\"Example 2\");\n" +
                "list.add(\"Example 3\");\n" +
                "comboBoxShow.addList(list);\n");
        comboBoxCode.setSize(1.3,1.3);
        comboBoxCode.setWrapperWidth(250);


        /**COMBOBOX IMAGE**/
        QImageView comboBoxImage = new QImageView();
        try {
            FileInputStream input = new FileInputStream("src/main/java/Pictures/example-comboBox.png");
            comboBoxImage.setNewImage(input);
        } catch (
                FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        comboBoxImage.setDimensions(150,250);

        /**COMBOBOX IMAGE DEF**/
        QText comboBoxImageDef = new QText();
        comboBoxImageDef.setContent("Definition of QComboBox");
        comboBoxImageDef.setSize(1.2,1.2);

        /**COMBOBOX IMAGE BOX**/
        QVBox comboBoxImageBox = new QVBox();
        comboBoxImageBox.addComponents(comboBoxImage,comboBoxImageDef,comboBoxCodeTitle,comboBoxCode,pressComboBox,comboBoxShow);
        comboBoxImageBox.setPositionOfChildNodes("CENTER");
        comboBoxImageBox.setMarginOfNode(comboBoxImage,0,0,20,25);
        comboBoxImageBox.setMarginOfNode(comboBoxCodeTitle,100,0,30,0);
        comboBoxImageBox.setMarginOfNode(pressComboBox,40,0,20,0);
        comboBoxImageBox.setMarginOfNode(comboBoxShow,0,0,0,0);
        comboBoxImageBox.setPrefWidthHeight(500,20);


        /** MAIN BACKGROUND WITH COMPONENTS */
        QBorderPane comboBoxBackground = new QBorderPane();
        comboBoxBackground.setPosition("LEFT",comboBoxTextBox);
        comboBoxBackground.setPosition("RIGHT",comboBoxImageBox);



        /**----------------------TOGGLEGROUP SCENE--------------------**/

        /**TOGGLEGROUP TEXT**/
        QText toggleGroupText = new QText();
        toggleGroupText.setContent("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. " +
                "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. " );
        toggleGroupText.setWrapperWidth(225);
        toggleGroupText.setSize(1.5,1.5);

        QVBox toggleGroupTextBox = new QVBox();
        toggleGroupTextBox.addComponents(toggleGroupText);
        toggleGroupTextBox.setMarginOfNode(toggleGroupText,150,0,80,140);
        toggleGroupTextBox.setPrefWidthHeight(500,150);

        /**TOGGLEGROUP**/
        QToggleGroup toggleGroupShow = new QToggleGroup();
        QRadioButton example1 = new QRadioButton();
        QRadioButton example2 = new QRadioButton();
        QRadioButton example3 = new QRadioButton();
        example1.setTitle("Example 1");
        example2.setTitle("Example 2");
        example3.setTitle("Example 3");
        toggleGroupShow.addToggles(example1,example2,example3);

        /**TOGGLEGROUP ALERT**/
        QLabel pressToggleGroup = new QLabel();
        pressToggleGroup.setTitle("Press QToggleGroup!");

        /**TOGGLEGROUP CODE TITLE**/
        QText toggleGroupCodeTitle = new QText();
        toggleGroupCodeTitle.setContent("Usage of QToggleGroup in Q");
        toggleGroupCodeTitle.setSize(1.5,1.5);
        toggleGroupCodeTitle.font("Verdana");

        /**TOGGLEGROUP CODE**/
        QText toggleGroupCode = new QText();
        toggleGroupCode.setContent("QToggleGroup toggleGroupShow = new QToggleGroup();\n" +
                "QRadioButton example1 = new QRadioButton();\n" +
                "QRadioButton example2 = new QRadioButton();\n" +
                "QRadioButton example3 = new QRadioButton();\n" +
                "example1.setTitle(\"Example 1\");\n" +
                "example2.setTitle(\"Example 2\");\n" +
                "example3.setTitle(\"Example 3\");\n" +
                "toggleGroupShow.addToggles(example1,example2,example3);\n");
        toggleGroupCode.setSize(1.3,1.3);
        toggleGroupCode.setWrapperWidth(250);


        /**TOGGLEGROUP IMAGE**/
        QImageView toggleGroupImage = new QImageView();
        try {
            FileInputStream input = new FileInputStream("src/main/java/Pictures/example-toggleGroup.png");
            toggleGroupImage.setNewImage(input);
        } catch (
                FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        toggleGroupImage.setDimensions(150,250);

        /**TOGGLEGROUP IMAGE DEF**/
        QText toggleGroupImageDef = new QText();
        toggleGroupImageDef.setContent("Definition of QToggleGroup");
        toggleGroupImageDef.setSize(1.2,1.2);

        /**TOGGLEGROUP IMAGE BOX**/
        QVBox toggleGroupImageBox = new QVBox();
        toggleGroupImageBox.addComponents(toggleGroupImage,toggleGroupImageDef,toggleGroupCodeTitle,toggleGroupCode,pressToggleGroup,example1,example2,example3);
        toggleGroupImageBox.setPositionOfChildNodes("CENTER");
        toggleGroupImageBox.setMarginOfNode(toggleGroupImage,0,0,10,25);
        toggleGroupImageBox.setMarginOfNode(toggleGroupCodeTitle,50,0,50,0);
        toggleGroupImageBox.setMarginOfNode(pressToggleGroup,40,0,10,0);
        toggleGroupImageBox.setMarginOfNode(example1,20,0,0,0);
        toggleGroupImageBox.setPrefWidthHeight(500,20);


        /** MAIN BACKGROUND WITH COMPONENTS */
        QBorderPane toggleGroupBackground = new QBorderPane();
        toggleGroupBackground.setPosition("LEFT",toggleGroupTextBox);
        toggleGroupBackground.setPosition("RIGHT",toggleGroupImageBox);



        /**---------------------------------------MENUS SECTION-------------------------------------------------------**/

        /**----------------------MENU SCENE--------------------**/

        /** MENU TEXT **/
        QText menuText = new QText();
        menuText.setContent("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. " +
                "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. " );
        menuText.setWrapperWidth(225);
        menuText.setSize(1.5,1.5);

        QVBox menuTextBox = new QVBox();
        menuTextBox.addComponents(menuText);
        menuTextBox.setMarginOfNode(menuText,150,0,80,140);
        menuTextBox.setPrefWidthHeight(500,150);

        /** MENU **/
        QMenu menuShow = new QMenu();
        menuShow.setText("Menu");
        QMenuBar menuBarShow = new QMenuBar();
        menuBarShow.addMenu(menuShow);
        menuBarShow.setMaxSize(200,50);


        /** MENU CODE TITLE **/
        QText menuCodeTitle = new QText();
        menuCodeTitle.setContent("Usage of Menu in JavaFX");
        menuCodeTitle.setSize(1.5,1.5);
        menuCodeTitle.font("Verdana");

        /** MENU CODE **/
        QText menuCode = new QText();
        menuCode.setContent(
                "QMenu menuShow = new QMenu();\n" +
                "menuShow.setText(\"Menu\");\n" +
                "QMenuBar menuBarShow = new QMenuBar();\n" +
                "menuBarShow.addMenu(menuShow);"
        );
        menuCode.setSize(1.4,1.4);
        menuCode.setWrapperWidth(300);

        /** MENU ALERT **/
        QText menuAlert = new QText();
        QLabel pressMenu = new QLabel();
        menuAlert.font("Verdana");
        pressMenu.setTitle("Pressed QMenu!");

        /** MENU IMAGE **/
        QImageView menuImage = new QImageView();
        try {
            FileInputStream input = new FileInputStream("src/main/java/Pictures/example_menu.png");
            menuImage.setNewImage(input);
        } catch (
                FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        menuImage.setDimensions(132,340);

        /** MENU IMAGE DEF**/
        QText menuImageDef = new QText();
        menuImageDef.setContent("Definition of Menu");
        menuImageDef.setSize(1.2,1.2);

        /** MENU IMAGE BOX**/
        QVBox menuImageBox = new QVBox();
        menuImageBox.addComponents(menuImage,menuImageDef,menuCodeTitle,menuCode,menuBarShow/*,pressMenu,menuAlert*/);
        menuImageBox.setPositionOfChildNodes("CENTER");
        menuImageBox.setMarginOfNode(menuImage,0,0,20,25);
        menuImageBox.setMarginOfNode(menuCodeTitle,100,0,30,0);
        menuImageBox.setMarginOfNode(menuCode, 0,0,20,0);
        menuImageBox.setMarginOfNode(menuBarShow,20,0,0,0);
//        menuImageBox.setMarginOfNode(pressMenu,40,0,0,0);
//        menuImageBox.setMarginOfNode(menuAlert,10,0,0,0);
        menuImageBox.setPrefWidthHeight(500,20);

        /** MAIN BACKGROUND WITH COMPONENTS */
        QBorderPane menuBackground = new QBorderPane();
        menuBackground.setPosition("LEFT",menuTextBox);
        menuBackground.setPosition("RIGHT",menuImageBox);

        /**----------------------MENUBAR SCENE--------------------**/

        /** MENUBAR TEXT **/
        QText menuBarText = new QText();
        menuBarText.setContent("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. " +
                "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. " );
        menuBarText.setWrapperWidth(225);
        menuBarText.setSize(1.5,1.5);

        QVBox menuBarTextBox = new QVBox();
        menuBarTextBox.addComponents(menuBarText);
        menuBarTextBox.setMarginOfNode(menuBarText,150,0,80,140);
        menuBarTextBox.setPrefWidthHeight(500,150);

        /** MENUBAR **/
        QMenuBar menuBarShow2 = new QMenuBar();
        QMenu menu1 = new QMenu("Menu 1");
        QMenu menu2 = new QMenu("Menu 2");
        QMenu menu3 = new QMenu("Menu 3");
        menuBarShow2.addMenus(menu1, menu2, menu3);
        menuBarShow2.setMaxSize(200,50);


        /** MENUBAR CODE TITLE **/
        QText menuBarCodeTitle = new QText();
        menuBarCodeTitle.setContent("Usage of MenuBar in JavaFX");
        menuBarCodeTitle.setSize(1.5,1.5);
        menuBarCodeTitle.font("Verdana");

        /** MENUBAR CODE **/
        QText menuBarCode = new QText();
        menuBarCode.setContent(
                "QMenuBar menuBarShow2 = new QMenuBar();\n" +
                "QMenu menu1 = new QMenu(\"Menu 1\");\n" +
                "QMenu menu2 = new QMenu(\"Menu 2\");\n" +
                "QMenu menu3 = new QMenu(\"Menu 3\");\n" +
                "\n" +
                "menuBarShow2.addMenus(menu1, menu2, menu3);"
        );
        menuBarCode.setSize(1.2,1.2);
        menuBarCode.setWrapperWidth(350);

        /** MENUBAR ALERT -- Zbytocne pre tento komponent, to iste ako u QMenu **/
//        QText menuBarAlert = new QText();
//        QLabel pressMenuBar = new QLabel();
//        menuAlert.font("Verdana");
//        pressMenu.setTitle("Pressed QMenuBar!");

        /** MENUBAR IMAGE **/
        QImageView menuBarImage = new QImageView();
        try {
            FileInputStream input = new FileInputStream("src/main/java/Pictures/example_menu-bar.png");
            menuBarImage.setNewImage(input);
        } catch (
                FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        menuBarImage.setDimensions(171,334);

        /** MENUBAR IMAGE DEF**/
        QText menuBarImageDef = new QText();
        menuBarImageDef.setContent("Definition of MenuBar");
        menuBarImageDef.setSize(1.2,1.2);

        /** MENUBAR IMAGE BOX**/
        QVBox menuBarImageBox = new QVBox();
        menuBarImageBox.addComponents(menuBarImage,menuBarImageDef,menuBarCodeTitle,menuBarCode,menuBarShow2/*,pressMenu,menuAlert*/);
        menuBarImageBox.setPositionOfChildNodes("CENTER");
        menuBarImageBox.setMarginOfNode(menuBarImage,0,0,20,25);
        menuBarImageBox.setMarginOfNode(menuBarCodeTitle,100,0,30,0);
        menuBarImageBox.setMarginOfNode(menuBarCode, 20,0,20,0);
        menuBarImageBox.setMarginOfNode(menuBarShow2,40,0,0,0);
//        menuImageBox.setMarginOfNode(pressMenuBar,40,0,0,0);
//        menuImageBox.setMarginOfNode(menuBarAlert,10,0,0,0);
        menuBarImageBox.setPrefWidthHeight(500,20);

        /** MAIN BACKGROUND WITH COMPONENTS */
        QBorderPane menuBarBackground = new QBorderPane();
        menuBarBackground.setPosition("LEFT",menuBarTextBox);
        menuBarBackground.setPosition("RIGHT",menuBarImageBox);

        /**----------------------MENUBUTTON SCENE--------------------**/

        /** MENUBUTTON TEXT **/
        QText menuButtonText = new QText();
        menuButtonText.setContent("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. " +
                "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. " );
        menuButtonText.setWrapperWidth(225);
        menuButtonText.setSize(1.5,1.5);

        QVBox menuButtonTextBox = new QVBox();
        menuButtonTextBox.addComponents(menuButtonText);
        menuButtonTextBox.setMarginOfNode(menuButtonText,150,0,80,140);
        menuButtonTextBox.setPrefWidthHeight(500,150);

        /** MENUBUTTON **/
        QMenuButton menuButtonShow = new QMenuButton("Items");
        QMenuItem mb_item1 = new QMenuItem("Item 1");
        QMenuItem mb_item2 = new QMenuItem("Item 2");
        QMenuItem mb_item3 = new QMenuItem("Item 3");
        menuButtonShow.addItems(mb_item1, mb_item2, mb_item3);
        menuButtonShow.setMaxSize(100,50);


        /** MENUBUTTON CODE TITLE **/
        QText menuButtonCodeTitle = new QText();
        menuButtonCodeTitle.setContent("Usage of MenuButton in JavaFX");
        menuButtonCodeTitle.setSize(1.5,1.5);
        menuButtonCodeTitle.font("Verdana");

        /** MENUBUTTON CODE **/
        QText menuButtonCode = new QText();
        menuButtonCode.setContent(
                "QMenuButton menuButtonShow = new QMenuButton(\"Items\");\n" +
                "QMenuItem mb_item1 = new QMenuItem(\"Item 1\");\n" +
                "QMenuItem mb_item2 = new QMenuItem(\"Item 2\");\n" +
                "QMenuItem mb_item3 = new QMenuItem(\"Item 3\");\n" +
                "\n" +
                "menuButtonShow.addItems(mb_item1, mb_item2, mb_item3);"
        );
        menuButtonCode.setSize(1.2,1.2);
        menuButtonCode.setWrapperWidth(350);

        /** MENUBUTTON ALERT -- Zbytocne pre tento komponent, to iste ako u QMenu **/

        /** MENUBUTTON IMAGE **/
        QImageView menuButtonImage = new QImageView();
        try {
            FileInputStream input = new FileInputStream("src/main/java/Pictures/example_menu-button.png");
            menuButtonImage.setNewImage(input);
        } catch (
                FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        menuButtonImage.setDimensions(138,216);

        /** MENUBUTTON IMAGE DEF**/
        QText menuButtonImageDef = new QText();
        menuButtonImageDef.setContent("Definition of MenuButton");
        menuButtonImageDef.setSize(1.2,1.2);

        /** MENUBUTTON IMAGE BOX**/
        QVBox menuButtonImageBox = new QVBox();
        menuButtonImageBox.addComponents(menuButtonImage,menuButtonImageDef,menuButtonCodeTitle,menuButtonCode,menuButtonShow/*,pressMenu,menuAlert*/);
        menuButtonImageBox.setPositionOfChildNodes("CENTER");
        menuButtonImageBox.setMarginOfNode(menuButtonImage,0,0,20,25);
        menuButtonImageBox.setMarginOfNode(menuButtonCodeTitle,100,0,30,0);
        menuButtonImageBox.setMarginOfNode(menuButtonCode, 20,0,20,0);
        menuButtonImageBox.setMarginOfNode(menuButtonShow,40,0,0,0);
//        menuImageBox.setMarginOfNode(pressMenuBar,40,0,0,0);
//        menuImageBox.setMarginOfNode(menuBarAlert,10,0,0,0);
        menuButtonImageBox.setPrefWidthHeight(500,20);

        /** MAIN BACKGROUND WITH COMPONENTS */
        QBorderPane menuButtonBackground = new QBorderPane();
        menuButtonBackground.setPosition("LEFT",menuButtonTextBox);
        menuButtonBackground.setPosition("RIGHT",menuButtonImageBox);

        /**----------------------MENUITEM SCENE--------------------**/

        /** MENUITEM TEXT **/
        QText menuItemText = new QText();
        menuItemText.setContent("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. " +
                "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. " );
        menuItemText.setWrapperWidth(225);
        menuItemText.setSize(1.5,1.5);

        QVBox menuItemTextBox = new QVBox();
        menuItemTextBox.addComponents(menuItemText);
        menuItemTextBox.setMarginOfNode(menuItemText,150,0,80,140);
        menuItemTextBox.setPrefWidthHeight(500,150);

        /** MENUITEM **/
        QMenuBar menuBarShow3 = new QMenuBar();
        QMenu menuShow2 = new QMenu("Items");
        QMenuItem mi_item1 = new QMenuItem("Item 1");
        QMenuItem mi_item2 = new QMenuItem("Item 2");
        QMenuItem mi_item3 = new QMenuItem("Item 3");
        menuShow2.addItems(mi_item1, mi_item2, mi_item3);
        menuBarShow3.addMenu(menuShow2);
        menuBarShow3.setMaxSize(100,50);


        /** MENUITEM CODE TITLE **/
        QText menuItemCodeTitle = new QText();
        menuItemCodeTitle.setContent("Usage of MenuItem in JavaFX");
        menuItemCodeTitle.setSize(1.5,1.5);
        menuItemCodeTitle.font("Verdana");

        /** MENUITEM CODE **/
        QText menuItemCode = new QText();
        menuItemCode.setContent(
                "QMenuBar menuBarShow3 = new QMenuBar();\n" +
                "QMenu menuShow2 = new QMenu(\"Items\");\n" +
                "\n" +
                "QMenuItem mi_item1 = new QMenuItem(\"Item 1\");\n" +
                "QMenuItem mi_item2 = new QMenuItem(\"Item 2\");\n" +
                "QMenuItem mi_item3 = new QMenuItem(\"Item 3\");\n" +
                "\n" +
                "menuShow2.addItems(mi_item1, mi_item2, mi_item3);\n" +
                "menuBarShow3.addMenu(menuShow2);"
        );
        menuItemCode.setSize(1.2,1.2);
        menuItemCode.setWrapperWidth(350);

        /** MENUITEM ALERT -- Zbytocne pre tento komponent, to iste ako u QMenu **/

        /** MENUITEM IMAGE **/
        QImageView menuItemImage = new QImageView();
        try {
            FileInputStream input = new FileInputStream("src/main/java/Pictures/example_menu-item.png");
            menuItemImage.setNewImage(input);
        } catch (
                FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        menuItemImage.setDimensions(166,260);

        /** MENUITEM IMAGE DEF**/
        QText menuItemImageDef = new QText();
        menuItemImageDef.setContent("Definition of menuItem");
        menuItemImageDef.setSize(1.2,1.2);

        /** MENUITEM IMAGE BOX**/
        QVBox menuItemImageBox = new QVBox();
        menuItemImageBox.addComponents(menuItemImage,menuItemImageDef,menuItemCodeTitle,menuItemCode,menuBarShow3/*,pressMenu,menuAlert*/);
        menuItemImageBox.setPositionOfChildNodes("CENTER");
        menuItemImageBox.setMarginOfNode(menuItemImage,0,0,20,25);
        menuItemImageBox.setMarginOfNode(menuItemCodeTitle,100,0,30,0);
        menuItemImageBox.setMarginOfNode(menuItemCode, 20,0,20,0);
        menuItemImageBox.setMarginOfNode(menuBarShow3,20,0,0,0);
//        menuImageBox.setMarginOfNode(pressMenuBar,40,0,0,0);
//        menuImageBox.setMarginOfNode(menuBarAlert,10,0,0,0);
        menuItemImageBox.setPrefWidthHeight(500,20);

        /** MAIN BACKGROUND WITH COMPONENTS */
        QBorderPane menuItemBackground = new QBorderPane();
        menuItemBackground.setPosition("LEFT",menuItemTextBox);
        menuItemBackground.setPosition("RIGHT",menuItemImageBox);

        /**------------------------------------SCENE MANAGEMENT AND DYNAMIC COMPONENT HANDLING--------------------------------------**/

        /**TOP MENU**/
        QComponentMenu topMenu = new QComponentMenu();
        
        QMenu buttonsAndBoxes = new QMenu("Buttons and Boxes");
        QMenuItem buttonItem = new QMenuItem("QButton");
        QMenuItem radioButtonItem = new QMenuItem("QRadioButton");
        QMenuItem checkBoxItem = new QMenuItem("QCheckBox");
        QMenuItem comboBoxItem = new QMenuItem("QComboBox");
        QMenuItem toggleGroupItem = new QMenuItem("QToggleGroup");
        buttonsAndBoxes.addItems(buttonItem, radioButtonItem, checkBoxItem, comboBoxItem, toggleGroupItem);

        QMenu menus = new QMenu("Menus");
        QMenuItem menuItem = new QMenuItem("QMenu");
        QMenuItem menuBarItem = new QMenuItem("QMenuBar");
        QMenuItem menuButtonItem = new QMenuItem("QMenuButton");
        QMenuItem menuItemItem = new QMenuItem("QMenuItem");
        menus.addItems(menuItem, menuBarItem, menuButtonItem, menuItemItem);

        /**---SCENE TITLES---**/

        topMenu.addMenus(buttonsAndBoxes, menus);

        /** MAIN SCENE */
        QScene mainScene = new QScene(mainBackground,1000,800);
        qstage.setQScene(mainScene);
        qstage.showScene();

        /** BUTTON SCENE */
        QScene buttonScene = new QScene(buttonBackground,1000,800);

        /** RADIOBUTTON SCENE */
        QScene radioButtonScene = new QScene(radioButtonBackground, 1000,800);

        /** CHECKBOX SCENE */
        QScene checkboxScene = new QScene(checkBoxBackground,1000,800);

        /** COMBOBOX SCENE */
        QScene comboboxScene = new QScene(comboBoxBackground,1000,800);

        /** TOGGLEGROUP SCENE */
        QScene toggleGroupScene = new QScene(toggleGroupBackground,1000,800);

        /** MENU SCENE **/
        QScene menuScene = new QScene(menuBackground,1000,800);

        /** MENUBAR SCENE **/
        QScene menuBarScene = new QScene(menuBarBackground,1000,800);

        /** MENUBUTTON SCENE **/
        QScene menuButtonScene = new QScene(menuButtonBackground,1000,800);

        /** MENUITEM SCENE **/
        QScene menuItemScene = new QScene(menuItemBackground,1000,800);

        /** HASH MAPS AND ARRAYS FOR INDIVIDUAL SCENES AND PANES */
            /** SCENE MAP */
        Map<String, QScene> scenes = new HashMap<>();
        scenes.put("QMainPage", mainScene);
        scenes.put("QButton", buttonScene);
        scenes.put("QRadioButton", radioButtonScene);
        scenes.put("QCheckBox", checkboxScene);
        scenes.put("QComboBox", comboboxScene);
        scenes.put("QToggleGroup", toggleGroupScene);
        scenes.put("QMenu", menuScene);
        scenes.put("QMenuBar", menuBarScene);
        scenes.put("QMenuButton", menuButtonScene);
        scenes.put("QMenuItem", menuItemScene);

            /** SCENE ARRAY */
        QScene[] sceneIndexes = {buttonScene, radioButtonScene, checkboxScene, comboboxScene, toggleGroupScene};
        QScene[] menuSceneIndexes = { menuScene, menuBarScene, menuButtonScene, menuItemScene };

            /** PANE MAP */
        Map<String, QBorderPane> panes = new HashMap<>();
        panes.put("QButton", buttonBackground);
        panes.put("QRadioButton", radioButtonBackground);
        panes.put("QCheckBox", checkBoxBackground);
        panes.put("QComboBox", comboBoxBackground);
        panes.put("QToggleGroup", toggleGroupBackground);
        panes.put("QMenu", menuBackground);
        panes.put("QMenuBar", menuBarBackground);
        panes.put("QMenuButton", menuButtonBackground);
        panes.put("QMenuItem", menuItemBackground);

            /** PANE ARRAY */
        QBorderPane[] paneIndexes = {buttonBackground, radioButtonBackground, checkBoxBackground, comboBoxBackground, toggleGroupBackground, menuBackground};
        QBorderPane[] menusPaneIndexes = { menuBackground, menuBarBackground, menuButtonBackground, menuItemBackground };

            /** TITLE MAP */
        Map<Integer, String> titles = new HashMap<>();
        titles.put(0, "QButton");
        titles.put(1, "QRadioButton");
        titles.put(2, "QCheckBox");
        titles.put(3, "QComboBox");
        titles.put(4, "QToggleGroup");

        Map<Integer, String> menuTitles = new HashMap<>();
        menuTitles.put(0, "QMenu");
        menuTitles.put(1, "QMenuBar");
        menuTitles.put(2, "QMenuButton");
        menuTitles.put(3, "QMenuItem");


        /**IN COMPONENT PAGINATION NAVIGATION**/
        QPaginationSceneSwitcher buttonsAndBoxesSceneSwitcher = new QPaginationSceneSwitcher();
        buttonsAndBoxesSceneSwitcher.sceneSwitcher(qstage,sceneIndexes, paneIndexes,topMenu.qhBox, 5,topMenu.title, titles);

        QPaginationSceneSwitcher menusSceneSwitcher = new QPaginationSceneSwitcher();
        menusSceneSwitcher.sceneSwitcher(qstage,menuSceneIndexes, menusPaneIndexes,topMenu.qhBox, 4, topMenu.title, menuTitles);

        /**SWITCH MENU SCENES**/
        topMenu.switchSceneForSection(0, scenes, qstage, buttonsAndBoxesSceneSwitcher, sceneIndexes, paneIndexes);
        topMenu.switchSceneForSection(1, scenes, qstage, menusSceneSwitcher, menuSceneIndexes, menusPaneIndexes);

        /**TREE MENU**/

        qMainMenu.setOnMouseClicked(event -> {
            QTreeItem selected = (QTreeItem) qMainMenu.getSelectionModel().getSelectedItem();

            /**CODE FOR ADDING PAGINATION WHEN LAUNCHING COMPONENTS FROM TREE MENU**/
            if(selected != null) {

                String value = selected.getValue().toString();
                System.out.println(value);
                if(scenes.get(value) != null) {
                    switch (value){
                        /**ADD MORE MAIN TREE MENU OPTIONS HERE**/
                        case "QButton":
                            buttonsAndBoxesSceneSwitcher.getNode().setCurrentPage(0);
                            panes.get(value).setPosition("BOTTOM", buttonsAndBoxesSceneSwitcher.getNode());
                            topMenu.title.setContent(value);
                            panes.get(value).setPosition("TOP",topMenu.qhBox);
                            break;
                        case "QRadioButton":
                            buttonsAndBoxesSceneSwitcher.getNode().setCurrentPage(1);
                            panes.get(value).setPosition("BOTTOM", buttonsAndBoxesSceneSwitcher.getNode());
                            topMenu.title.setContent(value);
                            panes.get(value).setPosition("TOP",topMenu.qhBox);
                            break;
                        case "QCheckBox":
                            buttonsAndBoxesSceneSwitcher.getNode().setCurrentPage(2);
                            panes.get(value).setPosition("BOTTOM", buttonsAndBoxesSceneSwitcher.getNode());
                            topMenu.title.setContent(value);
                            panes.get(value).setPosition("TOP",topMenu.qhBox);
                            break;
                        case "QComboBox":
                            buttonsAndBoxesSceneSwitcher.getNode().setCurrentPage(3);
                            panes.get(value).setPosition("BOTTOM", buttonsAndBoxesSceneSwitcher.getNode());
                            topMenu.title.setContent(value);
                            panes.get(value).setPosition("TOP",topMenu.qhBox);
                            break;
                        case "QToggleGroup":
                            buttonsAndBoxesSceneSwitcher.getNode().setCurrentPage(4);
                            panes.get(value).setPosition("BOTTOM", buttonsAndBoxesSceneSwitcher.getNode());
                            topMenu.title.setContent(value);
                            panes.get(value).setPosition("TOP",topMenu.qhBox);
                            break;
                        case "QMenu":
                            menusSceneSwitcher.getNode().setCurrentPage(0);
                            panes.get(value).setPosition("BOTTOM", menusSceneSwitcher.getNode());
                            topMenu.title.setContent(value);
                            panes.get(value).setPosition("TOP", topMenu.qhBox);
                            break;
                        case "QMenuBar":
                            menusSceneSwitcher.getNode().setCurrentPage(1);
                            panes.get(value).setPosition("BOTTOM", menusSceneSwitcher.getNode());
                            topMenu.title.setContent(value);
                            panes.get(value).setPosition("TOP", topMenu.qhBox);
                            break;
                        case "QMenuButton":
                            menusSceneSwitcher.getNode().setCurrentPage(2);
                            panes.get(value).setPosition("BOTTOM", menusSceneSwitcher.getNode());
                            topMenu.title.setContent(value);
                            panes.get(value).setPosition("TOP", topMenu.qhBox);
                            break;
                        case "QMenuItem":
                            menusSceneSwitcher.getNode().setCurrentPage(3);
                            panes.get(value).setPosition("BOTTOM", menusSceneSwitcher.getNode());
                            topMenu.title.setContent(value);
                            panes.get(value).setPosition("TOP", topMenu.qhBox);
                            break;
                    }
                    qstage.setQScene(scenes.get(value));
                    qstage.showScene();
                }

            }
        });



    }

}
