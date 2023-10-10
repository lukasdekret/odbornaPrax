package com.example.odbornaprax.application_test;

import com.example.odbornaprax.framework.components.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.layout.VBox;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test {
    /*
     * qstage.setHeadline("HBox Experiment 1");
     * QButton qbutton = new QButton();
     * qbutton.setHeadline("test");
     * qbutton.setDimensions(30, 50);
     * qstage.setParent(qbutton);
     */

    // QTextField qtextfield = new QTextField();
    /*
     * qtextfield.setDimensions(30,50);
     * qtextfield.promptText("Enter Text");
     * qtextfield.getTextFromTextField();
     * //qstage.setParent(qtextfield);
     */

    // QHyperlink qhyperlink = new QHyperlink();
    // qhyperlink.setFontStyle("-fx-underline: true; -fx-font-size:20px;-fx-font-family:'Roboto Regular';");
    // qhyperlink.setHyperlinkText("Click!");
    // qhyperlink.setAction("Clicked!");
    // qstage.setParent(qhyperlink);

    /*
     * QCheckBox qCheckBox = new QCheckBox();
     * qCheckBox.setTitle("Test");
     * System.out.println(qCheckBox.isChecked());
     * qstage.setParent(qCheckBox);
     */
    /*
     * QRadioButton qRadioButton = new QRadioButton();
     * qRadioButton.setTitle("Testing");
     * System.out.println(qRadioButton.isChecked());
     * qstage.setParent(qRadioButton);
     */
    /*
     * QLabel qLabel = new QLabel();
     * qLabel.setTitle("Test Label");
     * qstage.setParent(qLabel);
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

    // Combobox
    // String days[] = { "Pon", "Uto", "Str" };
    // QComboBox qComboBox = new QComboBox();
    // qComboBox.addList(FXCollections.observableArrayList(days));
    // QButton qbuttonCombobox = new QButton();
    // qbuttonCombobox.setHeadline("Combobox Enter");
    // qComboBox.onAction(qbuttonCombobox);
    // Button to next Scene
    // QButton qButtonNextStage2 = new QButton();
    // qButtonNextStage2.setHeadline("Intro2");
    // QVBox
    // QVBox qvBox = new QVBox();
    // qvBox.addComponents(qButtonNextStage2, qComboBox, qtextfield, qhyperlink, qimageView, qProgressBar,
    //         qbuttonCombobox);
    // qvBox.setLayout(50, 50);
    // qtextfield.setDimensions(50, 50);
    // qtextfield.getTextFromTextField();
    // qvBox.setPrefWidthHeight(5,5);
    // qvBox.setMinWidthHeight(100,150);
    // qvBox.setMaxWidthHeight(100,150);
    // qstage.setParent(qvBox);

    // QButton qbutton1 = new QButton();
    // qbutton1.setHeadline("test");
    // QButton qbutton2 = new QButton();
    // qbutton2.setHeadline("test2");
    // QButton qbutton3 = new QButton();
    // qbutton3.setHeadline("test3");
    // QTextField qTextField2 = new QTextField();
    // qTextField2.getTextFromTextField();
    // qTextField2.promptText("Enter Text");
    // Button to next Scene
    // QButton qButtonNextStage = new QButton();
    // qButtonNextStage.setHeadline("Intro");
    // QHBox
    // QHBox qhBox = new QHBox();
    // qhBox.addComponents(qbutton1, qbutton2, qbutton3, qTextField2, qButtonNextStage);
    // qhBox.setPrefWidthHeight(200, 50);
    // qstage.setParent(qhBox);

    // Scene
    // QScene intro = new QScene(qhBox, 800, 800);
    // qstage.setScene(intro);
    // qstage.show();

    // QScene intro2 = new QScene(qvBox, 1000, 1000);

    // Test komponentov
    /*QVBox test = new QVBox();
    QScene intro3 = new QScene(test, 800, 600);

    QMenuBar qMenuBar = new QMenuBar();*/
    /*QMenu menu1 = new QMenu("Test");
        qMenuBar.addMenu(menu1);

    QMenu menuA = new QMenu("Tlacidlo A");
    QMenu menuB = new QMenu("Tlacidlo B");
        qMenuBar.addMenus(menuA, menuB);
        test.addComponents(qMenuBar);
    //qstage.setParent(test);

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
        test.addComponents(qMenuButton);

    QMenuButton qMenuButton2 = new QMenuButton("Test3", null, new QMenuItem("Test3A"), new QMenuItem("Test3B"),
            new QMenuItem("Test3C"));
        test.addComponents(qMenuButton2);

    QPagination qPagination = new QPagination();
        qPagination.setPageNumber(10);
        qPagination.setCurrentPage(0); // -1, ako pole
        qPagination.setMaxPageIndicatorValue(5);
        qPagination.setContentFactory((index) -> {
        QLabel label = new QLabel("Strana " + (index + 1));

        return new VBox(label);
    });
        test.addComponents(qPagination);
        System.out.println(qPagination.getPageNumber());

    QSeparator qSeparator = new QSeparator();

        test.addComponents(qSeparator);

    QImageView imageView = new QImageView();
        try {
        FileInputStream input = new FileInputStream("E:\\Projects\\odbornaPrax\\src\\main\\resources\\images\\tree.jpg");
        imageView.setNewImage(input);
    } catch (
    FileNotFoundException e) {
        throw new RuntimeException(e);
    }

    QScrollPane scrollPane = new QScrollPane();
        scrollPane.setBody(imageView);
        test.addComponents(scrollPane);

    QTreeView treeView = new QTreeView();
    QTreeItem treeItem1 = new QTreeItem("Item 1");
    QTreeItem treeItem2 = new QTreeItem("Item 2");
    QTreeItem rootItem = new QTreeItem("Root item");
        rootItem.addItems(treeItem1,treeItem2);
        treeView.setRootItem(rootItem);
        test.addComponents(treeView);

    QRadioButton button1 = new QRadioButton();
        button1.setTitle("test1");
    QRadioButton button2 = new QRadioButton();
        button2.setTitle("test2");
    QToggleGroup toggleGroup = new QToggleGroup();
        toggleGroup.addToggles(button1,button2);
        test.addComponents(button1,button2);

        qstage.setQScene(intro3);
        qstage.showScene();

    // changeScene(qButtonNextStage, qstage, intro2);
    // changeScene(qButtonNextStage2, qstage, intro);*/



}
