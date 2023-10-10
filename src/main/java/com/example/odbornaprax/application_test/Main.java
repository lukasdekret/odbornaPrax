package com.example.odbornaprax.application_test;

import com.example.odbornaprax.framework.components.*;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
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
        /** Section: Layout */
        QTreeItem qvBox = new QTreeItem("QVBox");
        QTreeItem qhBox = new QTreeItem("QHBox");
        QTreeItem qScrollPane = new QTreeItem("QScrollPane");
        QTreeItem qBorderPane = new QTreeItem("QBorderPane");
        QTreeItem qSeparator = new QTreeItem("QSeparator");
        QTreeItem qGroup = new QTreeItem("QGroup");
        QTreeItem layoutRootItem = new QTreeItem("Layout");
        layoutRootItem.addItems(qvBox, qhBox, qScrollPane, qBorderPane, qSeparator, qGroup);
        rootItem.addItems(layoutRootItem);

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
        buttonShow.setHeadline("Button");
        buttonShow.setDimensions(50,50);
        buttonShow.setPrefSize(100,50);

        /**BUTTON ALERT**/
        QText buttonAlert = new QText();
        QLabel pressButton = new QLabel();
        buttonAlert.font("Verdana");
        pressButton.setTitle("Press Button!");

        /**BUTTON CODE TITLE**/
        QText buttonCodeTitle = new QText();
        buttonCodeTitle.setContent("Usage of Button in JavaFX");
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
            FileInputStream input = new FileInputStream("src/main/java/Pictures/buttonLogo.png");
            buttonImage.setNewImage(input);
        } catch (
                FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        buttonImage.setDimensions(100,300);

        /**BUTTON IMAGE DEF**/
        QText buttonImageDef = new QText();
        buttonImageDef.setContent("Definition of Image");
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

        QBorderPane radioButtonBackground = new QBorderPane();

        /**----------------------CHECKBOX SCENE--------------------**/

        QBorderPane checkboxBackground = new QBorderPane();

        /**----------------------COMBOBOX SCENE--------------------**/

        QBorderPane comboboxBackground = new QBorderPane();

        /**----------------------TOGGLEGROUP SCENE--------------------**/

        /** TOGGLEGROUP BACKGROUND WITH COMPONENTS */
        QBorderPane toggleGroupBackground = new QBorderPane();

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

        /**---------------------------------------LAYOUT SECTION-------------------------------------------------------**/

        /**----------------------QVBOX SCENE--------------------**/

        /** QVBOX TEXT **/
        QText qvBoxText = new QText();
        qvBoxText.setContent("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. " +
                "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. " );
        qvBoxText.setWrapperWidth(225);
        qvBoxText.setSize(1.5,1.5);

        QVBox qvBoxTextBox = new QVBox();
        qvBoxTextBox.addComponents(qvBoxText);
        qvBoxTextBox.setMarginOfNode(qvBoxText,150,0,80,140);
        qvBoxTextBox.setPrefWidthHeight(500,150);

        /** QVBOX CODE TITLE **/
        QText qvBoxCodeTitle = new QText();
        qvBoxCodeTitle.setContent("Usage of QVBox in Q");
        qvBoxCodeTitle.setSize(1.5,1.5);
        qvBoxCodeTitle.font("Verdana");

        /** QVBOX CODE **/
        QText qvBoxCode = new QText();
        qvBoxCode.setContent(
                "QText qvBoxText = new QText();\n" +
                        "        qvBoxText.setContent(\" Sample Text \" \n)" +
                        "        qvBoxText.setWrapperWidth(225);\n" +
                        "        qvBoxText.setSize(1.5,1.5);\n" +
                        "\n" +
                        "        QVBox qvBoxTextBox = new QVBox();\n" +
                        "        qvBoxTextBox.addComponents(qvBoxText);\n" +
                        "        qvBoxTextBox.setMarginOfNode(qvBoxText,150,0,80,140);\n" +
                        "        qvBoxTextBox.setPrefWidthHeight(500,150);"
        );
        qvBoxCode.setSize(1,1);
        qvBoxCode.setWrapperWidth(300);

        /** QVBOX IMAGE **/
        QImageView qvBoxImage = new QImageView();
        try {
            FileInputStream input = new FileInputStream("src/main/java/Pictures/example-Vbox.PNG");
            qvBoxImage.setNewImage(input);
        } catch (
                FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        qvBoxImage.setDimensions(200,300);

        /** QVBOX IMAGE DEF**/
        QText qvBoxImageDef = new QText();
        qvBoxImageDef.setContent("Definition of QVBox");
        qvBoxImageDef.setSize(1.2,1.2);

        /** QVBOX IMAGE BOX**/
        QVBox qvBoxImageBox = new QVBox();
        qvBoxImageBox.addComponents(qvBoxImage,qvBoxImageDef,qvBoxCodeTitle,qvBoxCode);
        qvBoxImageBox.setPositionOfChildNodes("CENTER");
        qvBoxImageBox.setMarginOfNode(qvBoxImage,0,0,20,25);
        qvBoxImageBox.setMarginOfNode(qvBoxCodeTitle,100,0,30,0);
        qvBoxImageBox.setMarginOfNode(qvBoxCode, 0,0,20,0);
        qvBoxImageBox.setPrefWidthHeight(500,20);

        /** MAIN BACKGROUND WITH COMPONENTS */
        QBorderPane qvBoxBackground = new QBorderPane();
        qvBoxBackground.setPosition("LEFT",qvBoxTextBox);
        qvBoxBackground.setPosition("RIGHT",qvBoxImageBox);

        /**----------------------QHBOX SCENE--------------------**/

        /** QHBOX TEXT **/
        QText qhBoxText = new QText();
        qhBoxText.setContent("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. " +
                "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. " );
        qhBoxText.setWrapperWidth(225);
        qhBoxText.setSize(1.5,1.5);

        QVBox qhBoxTextBox = new QVBox();
        qhBoxTextBox.addComponents(qhBoxText);
        qhBoxTextBox.setMarginOfNode(qhBoxText,150,0,80,140);
        qhBoxTextBox.setPrefWidthHeight(500,150);

        /** QHBOX CODE TITLE **/
        QText qhBoxCodeTitle = new QText();
        qhBoxCodeTitle.setContent("Usage of QVBox in Q");
        qhBoxCodeTitle.setSize(1.5,1.5);
        qhBoxCodeTitle.font("Verdana");

        /** QHBOX CODE **/
        QText qhBoxCode = new QText();
        qhBoxCode.setContent(
                "QText qhBoxText = new QText();\n" +
                        "        qhBoxText.setContent(\" Sample Text \" \n)" +
                        "        qhBoxText.setWrapperWidth(225);\n" +
                        "        qhBoxText.setSize(1.5,1.5);\n" +
                        "\n" +
                        "        QHBox qhBoxTextBox = new QHBox();\n" +
                        "        qhBoxTextBox.addComponents(qhBoxText);\n" +
                        "        qhBoxTextBox.setMarginOfNode(qhBoxText,150,0,80,140);\n" +
                        "        qhBoxTextBox.setPrefWidthHeight(500,150);"
        );
        qhBoxCode.setSize(1,1);
        qhBoxCode.setWrapperWidth(300);

        /** QHBOX IMAGE **/
        QImageView qhBoxImage = new QImageView();
        try {
            FileInputStream input = new FileInputStream("src/main/java/Pictures/example-Hbox.PNG");
            qhBoxImage.setNewImage(input);
        } catch (
                FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        qhBoxImage.setDimensions(200,300);

        /** QHBOX IMAGE DEF**/
        QText qhBoxImageDef = new QText();
        qhBoxImageDef.setContent("Definition of QHBox");
        qhBoxImageDef.setSize(1.2,1.2);

        /** QHBOX IMAGE BOX**/
        QVBox qhBoxImageBox = new QVBox();
        qhBoxImageBox.addComponents(qhBoxImage,qhBoxImageDef,qhBoxCodeTitle,qhBoxCode);
        qhBoxImageBox.setPositionOfChildNodes("CENTER");
        qhBoxImageBox.setMarginOfNode(qhBoxImage,0,0,20,25);
        qhBoxImageBox.setMarginOfNode(qhBoxCodeTitle,100,0,30,0);
        qhBoxImageBox.setMarginOfNode(qhBoxCode, 0,0,20,0);
        qhBoxImageBox.setPrefWidthHeight(500,20);

        /** MAIN BACKGROUND WITH COMPONENTS */
        QBorderPane qhBoxBackground = new QBorderPane();
        qhBoxBackground.setPosition("LEFT",qhBoxTextBox);
        qhBoxBackground.setPosition("RIGHT",qhBoxImageBox);

        /**----------------------QSCROLLPANE SCENE--------------------**/

        /** QSCROLLPANE TEXT **/
        QText qScrollPaneText = new QText();
        qScrollPaneText.setContent("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. " +
                "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. " );
        qScrollPaneText.setWrapperWidth(225);
        qScrollPaneText.setSize(1.5,1.5);

        QVBox qScrollPaneTextBox = new QVBox();
        qScrollPaneTextBox.addComponents(qScrollPaneText);
        qScrollPaneTextBox.setMarginOfNode(qScrollPaneText,150,0,80,140);
        qScrollPaneTextBox.setPrefWidthHeight(500,150);

        /** QSCROLLPANE **/
        QScrollPane qScrollPaneShow = new QScrollPane();
        QImageView testImage = new QImageView();
        try {
            FileInputStream input = new FileInputStream("src/main/java/Pictures/scrollpane-image.jpg");
            testImage.setNewImage(input);
        } catch (
                FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        qScrollPaneShow.setBody(testImage);

        /** QSCROLLPANE CODE TITLE **/
        QText qScrollPaneCodeTitle = new QText();
        qScrollPaneCodeTitle.setContent("Usage of QScrollPane in Q");
        qScrollPaneCodeTitle.setSize(1.5,1.5);
        qScrollPaneCodeTitle.font("Verdana");

        /** QSCROLLPANE CODE **/
        QText qScrollPaneCode = new QText();
        qScrollPaneCode.setContent(
                "QScrollPane qScrollPaneShow = new QScrollPane();\n" +
                        "        QImageView testImage = new QImageView();\n" +
                        "        try {\n" +
                        "            FileInputStream input = new FileInputStream(\"src/main/java/Pictures/scrollpane-image.jpg\");\n" +
                        "            testImage.setNewImage(input);\n" +
                        "        } catch (\n" +
                        "                FileNotFoundException e) {\n" +
                        "            throw new RuntimeException(e);\n" +
                        "        }\n" +
                        "        qScrollPaneShow.setBody(testImage);"
        );
        qScrollPaneCode.setSize(1,1);
        qScrollPaneCode.setWrapperWidth(300);

        /** QSCROLLPANE IMAGE **/
        QImageView qScrollPaneImage = new QImageView();
        try {
            FileInputStream input = new FileInputStream("src/main/java/Pictures/example-scrollpane.PNG");
            qScrollPaneImage.setNewImage(input);
        } catch (
                FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        qScrollPaneImage.setDimensions(200,300);

        /** QSCROLLPANE IMAGE DEF**/
        QText qScrollPaneImageDef = new QText();
        qScrollPaneImageDef.setContent("Definition of QScrollPane");
        qScrollPaneImageDef.setSize(1.2,1.2);

        /** QSCROLLPANE IMAGE BOX**/
        QVBox qScrollPaneImageBox = new QVBox();
        qScrollPaneImageBox.addComponents(qScrollPaneImage,qScrollPaneImageDef,qScrollPaneCodeTitle,qScrollPaneCode,qScrollPaneShow);
        qScrollPaneImageBox.setPositionOfChildNodes("CENTER");
        qScrollPaneImageBox.setMarginOfNode(qScrollPaneImage,0,0,20,25);
        qScrollPaneImageBox.setMarginOfNode(qScrollPaneCodeTitle,20,0,30,0);
        qScrollPaneImageBox.setMarginOfNode(qScrollPaneCode, 0,0,20,0);
        qScrollPaneImageBox.setPrefWidthHeight(500,20);

        /** MAIN BACKGROUND WITH COMPONENTS */
        QBorderPane qScrollPaneBackground = new QBorderPane();
        qScrollPaneBackground.setPosition("LEFT",qScrollPaneTextBox);
        qScrollPaneBackground.setPosition("RIGHT",qScrollPaneImageBox);

        /**----------------------QBORDERPANE SCENE--------------------**/

        /** QBORDERPANE TEXT **/
        QText qBorderPaneText = new QText();
        qBorderPaneText.setContent("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. " +
                "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. " );
        qBorderPaneText.setWrapperWidth(225);
        qBorderPaneText.setSize(1.5,1.5);

        QVBox qBorderPaneTextBox = new QVBox();
        qBorderPaneTextBox.addComponents(qBorderPaneText);
        qBorderPaneTextBox.setMarginOfNode(qBorderPaneText,150,0,80,140);
        qBorderPaneTextBox.setPrefWidthHeight(500,150);


        /** QBORDERPANE CODE TITLE **/
        QText qBorderPaneCodeTitle = new QText();
        qBorderPaneCodeTitle.setContent("Usage of QScrollPane in Q");
        qBorderPaneCodeTitle.setSize(1.5,1.5);
        qBorderPaneCodeTitle.font("Verdana");

        /** QBORDERPANE CODE **/
        QText qBorderPaneCode = new QText();
        qBorderPaneCode.setContent(
                "QBorderPane qScrollPaneBackground = new QBorderPane();\n" +
                        "qScrollPaneBackground.setPosition(\"LEFT\",qScrollPaneTextBox);\n" +
                        "qScrollPaneBackground.setPosition(\"RIGHT\",qScrollPaneImageBox);\n" +
                        "qScrollPaneBackground.setPosition(\"TOP\",qScrollPaneTopBox);\n" +
                        "qScrollPaneBackground.setPosition(\"BOTTOM\",qScrollPaneBottomBox);"

        );
        qBorderPaneCode.setSize(1,1);
        qBorderPaneCode.setWrapperWidth(400);

        /** QBORDERPANE IMAGE **/
        QImageView qBorderPaneImage = new QImageView();
        try {
            FileInputStream input = new FileInputStream("src/main/java/Pictures/example-borderpane.PNG");
            qBorderPaneImage.setNewImage(input);
        } catch (
                FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        qBorderPaneImage.setDimensions(200,300);

        /** QBORDERPANE IMAGE DEF**/
        QText qBorderPaneImageDef = new QText();
        qBorderPaneImageDef.setContent("Definition of QBorderPane");
        qBorderPaneImageDef.setSize(1.2,1.2);

        /** QBORDERPANEw IMAGE BOX**/
        QVBox qBorderPaneImageBox = new QVBox();
        qBorderPaneImageBox.addComponents(qBorderPaneImage,qBorderPaneImageDef,qBorderPaneCodeTitle,qBorderPaneCode);
        qBorderPaneImageBox.setPositionOfChildNodes("CENTER");
        qBorderPaneImageBox.setMarginOfNode(qBorderPaneImage,0,0,20,25);
        qBorderPaneImageBox.setMarginOfNode(qBorderPaneCodeTitle,20,0,30,0);
        qBorderPaneImageBox.setMarginOfNode(qBorderPaneCode, 0,0,20,0);
        qBorderPaneImageBox.setPrefWidthHeight(500,20);

        /** MAIN BACKGROUND WITH COMPONENTS */
        QBorderPane qBorderPaneBackground = new QBorderPane();
        qBorderPaneBackground.setPosition("LEFT",qBorderPaneTextBox);
        qBorderPaneBackground.setPosition("RIGHT",qBorderPaneImageBox);

        /**----------------------QSEPARATOR SCENE--------------------**/

        /** QSEPARATOR TEXT **/
        QText qSeparatorText = new QText();
        qSeparatorText.setContent("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. " +
                "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. " );
        qSeparatorText.setWrapperWidth(225);
        qSeparatorText.setSize(1.5,1.5);

        QVBox qSeparatorTextBox = new QVBox();
        qSeparatorTextBox.addComponents(qSeparatorText);
        qSeparatorTextBox.setMarginOfNode(qSeparatorText,150,0,80,140);
        qSeparatorTextBox.setPrefWidthHeight(500,150);

        /** QSEPARATOR **/
        QSeparator qSeparatorShow = new QSeparator();

        /** QSEPARATOR CODE TITLE **/
        QText qSeparatorCodeTitle = new QText();
        qSeparatorCodeTitle.setContent("Usage of QSeparator in Q");
        qSeparatorCodeTitle.setSize(1.5,1.5);
        qSeparatorCodeTitle.font("Verdana");

        /** QSEPARATOR CODE **/
        QText qSeparatorCode = new QText();
        qSeparatorCode.setContent(
                "QSeparator qSeparator = new QSeparator();"

        );
        qSeparatorCode.setSize(1,1);
        qSeparatorCode.setWrapperWidth(400);

        /** QSEPARATOR IMAGE **/
        QImageView qSeparatorImage = new QImageView();
        try {
            FileInputStream input = new FileInputStream("src/main/java/Pictures/example-separator.PNG");
            qSeparatorImage.setNewImage(input);
        } catch (
                FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        qSeparatorImage.setDimensions(100,200);

        /** QSEPARATOR IMAGE DEF**/
        QText qSeparatorImageDef = new QText();
        qSeparatorImageDef.setContent("Definition of QSeparator");
        qSeparatorImageDef.setSize(1.2,1.2);

        /** QSEPARATOR IMAGE BOX**/
        QVBox qSeparatorImageBox = new QVBox();
        qSeparatorImageBox.addComponents(qSeparatorImage,qSeparatorImageDef,qSeparatorCodeTitle,qSeparatorCode, qSeparatorShow);
        qSeparatorImageBox.setPositionOfChildNodes("CENTER");
        qSeparatorImageBox.setMarginOfNode(qSeparatorImage,0,0,20,25);
        qSeparatorImageBox.setMarginOfNode(qSeparatorCodeTitle,20,0,30,0);
        qSeparatorImageBox.setMarginOfNode(qSeparatorCode, 0,0,20,0);
        qSeparatorImageBox.setPrefWidthHeight(500,20);

        /** MAIN BACKGROUND WITH COMPONENTS */
        QBorderPane qSeparatorBackground = new QBorderPane();
        qSeparatorBackground.setPosition("LEFT",qSeparatorTextBox);
        qSeparatorBackground.setPosition("RIGHT",qSeparatorImageBox);

        /**----------------------QGROUP SCENE--------------------**/

        /** QGROUP TEXT **/
        QText qGroupText = new QText();
        qGroupText.setContent("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. " +
                "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. " );
        qGroupText.setWrapperWidth(225);
        qGroupText.setSize(1.5,1.5);

        QVBox qGroupTextBox = new QVBox();
        qGroupTextBox.addComponents(qGroupText);
        qGroupTextBox.setMarginOfNode(qGroupText,150,0,80,140);
        qGroupTextBox.setPrefWidthHeight(500,150);

        /** QGROUP CODE TITLE **/
        QText qGroupCodeTitle = new QText();
        qGroupCodeTitle.setContent("Usage of QGroup in Q");
        qGroupCodeTitle.setSize(1.5,1.5);
        qGroupCodeTitle.font("Verdana");

        /** QGROUP CODE **/
        QText qGroupCode = new QText();
        qGroupCode.setContent(
                "QButton button = new QButton();\n" +
                        "button.setHeadline(\"TEST\");\n" +
                        "QButton button2 = new QButton();\n" +
                        "button2.setHeadline(\"TEST2\");\n" +
                        "\n" +
                        "QVBox box1 = new QVBox();\n" +
                        "box1.addComponents(button);\n" +
                        "QHBox box2 = new QHBox();\n" +
                        "box2.addComponents(button2);\n" +
                        "\n" +
                        "QGroup qGroup = new QGroup();\n" +
                        "qGroup.addComponents(box1,box2);"

        );
        qGroupCode.setSize(1.3,1.3);
        qGroupCode.setWrapperWidth(300);

        /** QGROUP IMAGE BOX**/
        QVBox qGroupImageBox = new QVBox();
        qGroupImageBox.addComponents(qGroupCodeTitle,qGroupCode);
        qGroupImageBox.setPositionOfChildNodes("CENTER");
        qGroupImageBox.setMarginOfNode(qGroupCodeTitle,20,0,80,0);
        qGroupImageBox.setMarginOfNode(qGroupCode, 0,0,20,0);
        qGroupImageBox.setPrefWidthHeight(500,20);

        /** MAIN BACKGROUND WITH COMPONENTS */
        QBorderPane qGroupBackground = new QBorderPane();
        qGroupBackground.setPosition("LEFT",qGroupTextBox);
        qGroupBackground.setPosition("RIGHT",qGroupImageBox);


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

        QMenu textAndImages = new QMenu("Text and Images");
        QMenuItem qTextItem = new QMenuItem("QText");
        QMenuItem qTextAreaItem = new QMenuItem("QTextArea");
        QMenuItem qLabelItem = new QMenuItem("QLabel");
        QMenuItem qTextFieldItem = new QMenuItem("QTextField");
        QMenuItem qHyperLinkItem = new QMenuItem("QHyperLink");
        QMenuItem qImageViewItem = new QMenuItem("QImageView");
        textAndImages.addItems(qTextItem, qTextAreaItem, qLabelItem, qTextFieldItem, qHyperLinkItem, qImageViewItem);


        QMenu layout = new QMenu("Layout");
        QMenuItem qvBoxItem = new QMenuItem("QVBox");
        QMenuItem qhBoxItem = new QMenuItem("QHBox");
        QMenuItem qScrollPaneItem = new QMenuItem("QScrollPane");
        QMenuItem qBorderPaneItem = new QMenuItem("QBorderPane");
        QMenuItem qSeparatorItem = new QMenuItem("QSeparator");
        QMenuItem qGroupItem = new QMenuItem("QGroup");
        layout.addItems(qvBoxItem, qhBoxItem, qScrollPaneItem, qBorderPaneItem, qSeparatorItem, qGroupItem);

        QMenu essential = new QMenu("Essential");
        QMenuItem qApplicationItem = new QMenuItem("QApplication");
        QMenuItem qStageItem = new QMenuItem("QStage");
        QMenuItem qScene = new QMenuItem("QScene");
        essential.addItems(qApplicationItem, qStageItem, qScene);

        QMenu others = new QMenu("Others");
        QMenuItem progressBarItem = new QMenuItem("QProgressBar");
        QMenuItem progressIndicatorItem = new QMenuItem("QProgressIndicator");
        QMenuItem paginationItem = new QMenuItem("QPagination");
        others.addItems(progressBarItem,progressIndicatorItem,paginationItem);

        QMenu specialComponents = new QMenu("Special Components");
        QMenuItem qPaginationSceneSwitcherItem = new QMenuItem("QPaginationSceneSwitcher");
        QMenuItem qComponentMenuItem = new QMenuItem("QComponentMenu");
        QMenuItem qArticle = new QMenuItem("QArticle");
        QMenuItem qImageTextCaption = new QMenuItem("QImageTextCaption");
        specialComponents.addItems(qPaginationSceneSwitcherItem,qComponentMenuItem,qArticle,qImageTextCaption);



        /**---SCENE TITLES---**/

        topMenu.addMenus(buttonsAndBoxes, menus, textAndImages, layout, essential, others, specialComponents);

        /** MAIN SCENE */
        QScene mainScene = new QScene(mainBackground,1000,800);
        qstage.setQScene(mainScene);
        qstage.showScene();

        /** BUTTON SCENE */
        QScene buttonScene = new QScene(buttonBackground,1000,800);

        /** RADIOBUTTON SCENE */
        QScene radioButtonScene = new QScene(radioButtonBackground, 1000,800);

        /** CHECKBOX SCENE */
        QScene checkboxScene = new QScene(checkboxBackground,1000,800);

        /** COMBOBOX SCENE */
        QScene comboboxScene = new QScene(comboboxBackground,1000,800);

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

        /** QVBOX SCENE **/
        QScene qvBoxScene = new QScene(qvBoxBackground,1000,800);

        /** QHBOX SCENE **/
        QScene qhBoxScene = new QScene(qhBoxBackground,1000,800);

        /** QSCROLLPANE SCENE **/
        QScene qScrollPaneScene = new QScene(qScrollPaneBackground,1000,800);

        /** QBORDERPANE SCENE **/
        QScene qBorderPaneScene = new QScene(qBorderPaneBackground,1000,800);

        /** QSEPARATOR SCENE **/
        QScene qSeparatorScene = new QScene(qSeparatorBackground,1000,800);

        /** QGROUP SCENE **/
        QScene qGroupScene = new QScene(qGroupBackground,1000,800);


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
        scenes.put("QVBox", qvBoxScene);
        scenes.put("QHBox", qhBoxScene);
        scenes.put("QScrollPane", qScrollPaneScene);
        scenes.put("QBorderPane", qBorderPaneScene);
        scenes.put("QSeparator", qSeparatorScene);
        scenes.put("QGroup", qGroupScene);

            /** SCENE ARRAY */
        QScene[] sceneIndexes = {buttonScene, radioButtonScene, checkboxScene, comboboxScene, toggleGroupScene};
        QScene[] menuSceneIndexes = { menuScene, menuBarScene, menuButtonScene, menuItemScene };
        QScene[] layoutSceneIndexes = { qvBoxScene, qhBoxScene, qScrollPaneScene, qBorderPaneScene, qSeparatorScene, qGroupScene};

            /** PANE MAP */
        Map<String, QBorderPane> panes = new HashMap<>();
        panes.put("QButton", buttonBackground);
        panes.put("QRadioButton", radioButtonBackground);
        panes.put("QCheckBox", checkboxBackground);
        panes.put("QComboBox", comboboxBackground);
        panes.put("QToggleGroup", toggleGroupBackground);
        panes.put("QMenu", menuBackground);
        panes.put("QMenuBar", menuBarBackground);
        panes.put("QMenuButton", menuButtonBackground);
        panes.put("QMenuItem", menuItemBackground);
        panes.put("QVBox", qvBoxBackground);
        panes.put("QHBox", qhBoxBackground);
        panes.put("QScrollPane", qScrollPaneBackground);
        panes.put("QBorderPane", qBorderPaneBackground);
        panes.put("QSeparator", qSeparatorBackground);
        panes.put("QGroup", qGroupBackground);

            /** PANE ARRAY */
        QBorderPane[] paneIndexes = {buttonBackground, radioButtonBackground, checkboxBackground, comboboxBackground, toggleGroupBackground, menuBackground};
        QBorderPane[] menusPaneIndexes = { menuBackground, menuBarBackground, menuButtonBackground, menuItemBackground };
        QBorderPane[] layoutPaneIndexes = { qvBoxBackground, qhBoxBackground, qScrollPaneBackground, qBorderPaneBackground, qSeparatorBackground, qGroupBackground };

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

        Map<Integer, String> layoutTitles = new HashMap<>();
        layoutTitles.put(0, "QVBox");
        layoutTitles.put(1, "QHBox");
        layoutTitles.put(2, "QScrollPane");
        layoutTitles.put(3, "QBorderPane");
        layoutTitles.put(4, "QSeparator");
        layoutTitles.put(5, "QGroup");


        /**IN COMPONENT PAGINATION NAVIGATION**/
        QPaginationSceneSwitcher buttonsAndBoxesSceneSwitcher = new QPaginationSceneSwitcher();
        buttonsAndBoxesSceneSwitcher.sceneSwitcher(qstage,sceneIndexes, paneIndexes,topMenu.qhBox, 5,topMenu.title, titles);

        QPaginationSceneSwitcher menusSceneSwitcher = new QPaginationSceneSwitcher();
        menusSceneSwitcher.sceneSwitcher(qstage,menuSceneIndexes, menusPaneIndexes,topMenu.qhBox, 4, topMenu.title, menuTitles);

        QPaginationSceneSwitcher layoutSceneSwitcher = new QPaginationSceneSwitcher();
        layoutSceneSwitcher.sceneSwitcher(qstage,layoutSceneIndexes, layoutPaneIndexes,topMenu.qhBox, 6, topMenu.title, layoutTitles);

        /**SWITCH MENU SCENES**/
        topMenu.switchSceneForSection(0, scenes, qstage, buttonsAndBoxesSceneSwitcher, sceneIndexes, paneIndexes);
        topMenu.switchSceneForSection(1, scenes, qstage, menusSceneSwitcher, menuSceneIndexes, menusPaneIndexes);
        topMenu.switchSceneForSection(3, scenes, qstage, layoutSceneSwitcher, layoutSceneIndexes, layoutPaneIndexes);

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
                        case "QVBox":
                            layoutSceneSwitcher.getNode().setCurrentPage(0);
                            panes.get(value).setPosition("BOTTOM", layoutSceneSwitcher.getNode());
                            topMenu.title.setContent(value);
                            panes.get(value).setPosition("TOP", topMenu.qhBox);
                            break;
                        case "QHBox":
                            layoutSceneSwitcher.getNode().setCurrentPage(1);
                            panes.get(value).setPosition("BOTTOM", layoutSceneSwitcher.getNode());
                            topMenu.title.setContent(value);
                            panes.get(value).setPosition("TOP", topMenu.qhBox);
                            break;
                        case "QScrollPane":
                            layoutSceneSwitcher.getNode().setCurrentPage(2);
                            panes.get(value).setPosition("BOTTOM", layoutSceneSwitcher.getNode());
                            topMenu.title.setContent(value);
                            panes.get(value).setPosition("TOP", topMenu.qhBox);
                            break;
                        case "QBorderPane":
                            layoutSceneSwitcher.getNode().setCurrentPage(3);
                            panes.get(value).setPosition("BOTTOM", layoutSceneSwitcher.getNode());
                            topMenu.title.setContent(value);
                            panes.get(value).setPosition("TOP", topMenu.qhBox);
                            break;
                        case "QSeparator":
                            layoutSceneSwitcher.getNode().setCurrentPage(4);
                            panes.get(value).setPosition("BOTTOM", layoutSceneSwitcher.getNode());
                            topMenu.title.setContent(value);
                            panes.get(value).setPosition("TOP", topMenu.qhBox);
                            break;
                        case "QGroup":
                            layoutSceneSwitcher.getNode().setCurrentPage(5);
                            panes.get(value).setPosition("BOTTOM", layoutSceneSwitcher.getNode());
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
