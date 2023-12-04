package com.example.odbornaprax.application_test;

import com.example.odbornaprax.framework.components.*;

import java.io.FileInputStream;
import java.util.Map;

public class QFrameworkTutorialApp extends QApplication {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(QStage primaryStage) {
        // Home Page Title
        QText homeTitle = new QText();
        homeTitle.setContent("Welcome to QFramework Tutorial App!");
        homeTitle.setSize(3, 3); // Set scale to 3 for both width and height

        // Logo Image
        QImageView logoImageView = new QImageView();
        try {
            logoImageView.setNewImage(new FileInputStream("src/main/java/Pictures/logo.png"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        logoImageView.setDimensions(200, 200);

        // Tree Menu
        QTreeView treeView = createTreeMenu();

        // Lorem Ipsum Text
        QText loremIpsumText = new QText();
        loremIpsumText.setContent("Lorem ipsum dolor sit amet, consectetur adipiscing elit...");

        // Test Yourself Button
        QButton testYourselfButton = new QButton();
        testYourselfButton.setHeadline("Test Yourself");

        // Scroll Pane for Tree Menu
        QScrollPane treeScrollPane = new QScrollPane();
        treeScrollPane.setBody(treeView);

        // Layout for Left Side (Tree Menu)
        QVBox leftLayout = new QVBox();
        leftLayout.addComponents(treeScrollPane);

        // Layout for Right Side (Lorem Ipsum and Button)
        QVBox rightLayout = new QVBox();
        rightLayout.addComponents(loremIpsumText, testYourselfButton);
        rightLayout.setPositionOfChildNodes("CENTER"); // Center the content in the box

        // Top Box
        QHBox topBox = new QHBox();
        topBox.addComponents(homeTitle);
        topBox.setPrefWidthHeight(800, 70); // Set preferred width and height
        topBox.setPositionOfChildNodes("CENTER"); // Center the content in the box

        // Bottom Box
        QHBox bottomBox = new QHBox();
        QText bottomText = new QText();
        bottomBox.addComponents(bottomText);
        bottomText.setContent("Short Lorem Ipsum Text");
        bottomText.setSize(3, 3); // Set scale to 3 for both width and height
        bottomBox.setPrefWidthHeight(800, 70); // Set preferred width and height
        bottomBox.setPositionOfChildNodes("CENTER"); // Center the content in the box

        // Main BorderPane for Home Page
        QBorderPane homePagePane = new QBorderPane();
        homePagePane.setPosition("TOP", topBox);
        homePagePane.setPosition("CENTER", logoImageView);
        homePagePane.setPosition("LEFT", leftLayout);
        homePagePane.setPosition("RIGHT", rightLayout);
        homePagePane.setPosition("BOTTOM", bottomBox);

        // Final Scene
        QScene homePageScene = new QScene(homePagePane, 800, 600);

        primaryStage.setTitle("QFramework Tutorial App");
        primaryStage.setScene(createQButtonScene(primaryStage));
        primaryStage.show();
    }

    // Method to create the Tree Menu
    private QTreeView createTreeMenu() {
        QTreeView treeView = new QTreeView();

        // Add categories and items to the tree
        QTreeItem rootItem = new QTreeItem("Framework Components");

        QTreeItem buttonsAndBoxes = new QTreeItem("Buttons and Boxes");
        QTreeItem qButton = new QTreeItem("QButton");
        QTreeItem qRadioButton = new QTreeItem("QRadioButton");
        QTreeItem qCheckBox = new QTreeItem("QCheckBox");
        QTreeItem qComboBox = new QTreeItem("QComboBox");
        QTreeItem qToggleGroup = new QTreeItem("QToggleGroup");

        // ... add other items ...

        QTreeItem textAndImages = new QTreeItem("Text and Images");
        QTreeItem qText = new QTreeItem("QText");
        QTreeItem qTextArea = new QTreeItem("QTextArea");
        QTreeItem qLabel = new QTreeItem("QLabel");
        QTreeItem qTextField = new QTreeItem("QTextField");
        QTreeItem qHyperlink = new QTreeItem("QHyperlink");
        QTreeItem qImageView = new QTreeItem("QImageView");

        QTreeItem menus = new QTreeItem("Menus");
        QTreeItem qMenu = new QTreeItem("QMenu");
        QTreeItem qMenuBar = new QTreeItem("QMenuBar");
        QTreeItem qMenuButton = new QTreeItem("QMenuButton");
        QTreeItem qMenuItem = new QTreeItem("QMenuItem");

        QTreeItem others = new QTreeItem("Others");
        QTreeItem qProgressBar = new QTreeItem("QProgressBar");
        QTreeItem qProgressIndicator = new QTreeItem("QProgressIndicator");
        QTreeItem qPagination = new QTreeItem("QPagination");

        QTreeItem layout = new QTreeItem("Layout");
        QTreeItem qVBox = new QTreeItem("QVBox");
        QTreeItem qHBox = new QTreeItem("QHBox");
        QTreeItem qScrollPane = new QTreeItem("QScrollPane");
        QTreeItem qBorderPane = new QTreeItem("QBorderPane");
        QTreeItem qSeparator = new QTreeItem("QSeparator");
        QTreeItem qGroup = new QTreeItem("QGroup");

        QTreeItem essential = new QTreeItem("Essential");
        QTreeItem qApplication = new QTreeItem("QApplication");
        QTreeItem qStage = new QTreeItem("QStage");
        QTreeItem qScene = new QTreeItem("QScene");

        QTreeItem specialComponents = new QTreeItem("Special Components");
        QTreeItem qPaginationSceneSwitcher = new QTreeItem("QPaginationSceneSwitcher");
        QTreeItem qComponentMenu = new QTreeItem("QComponentMenu");
        QTreeItem qArticle = new QTreeItem("QArticle");
        QTreeItem qImageTextCaption = new QTreeItem("QImageTextCaption");

        // ... add other items ...

        // ... add other categories and items ...

        // Set root item for the TreeView
        treeView.setRootItem(rootItem);

        // Add items to categories
        buttonsAndBoxes.addItems(qButton, qRadioButton, qCheckBox, qComboBox, qToggleGroup);
        textAndImages.addItems(qText, qTextArea, qLabel, qTextField, qHyperlink, qImageView);
        menus.addItems(qMenu, qMenuBar, qMenuButton, qMenuItem);
        others.addItems(qProgressBar, qProgressIndicator, qPagination);
        layout.addItems(qVBox, qHBox, qScrollPane, qBorderPane, qSeparator, qGroup);
        essential.addItems(qApplication, qStage, qScene);
        specialComponents.addItems(qPaginationSceneSwitcher, qComponentMenu, qArticle, qImageTextCaption);


        // Add categories to root
        rootItem.addItems(buttonsAndBoxes, textAndImages,menus,others,layout,essential,specialComponents);

        return treeView;
    }
    // Úprava createQButtonScene() na pridanie QStage ako parameter a obalenie komponentov v QHBox/QVBox
    // Úprava createQButtonScene() na pridanie QStage ako parameter a obalenie komponentov v QHBox/QVBox
    private QScene createQButtonScene(QStage primaryStage) {
        // ... predchádzajúci kód ...

        // QPaginationSceneSwitcher pre navigáciu medzi scénami v danej kategórii
        QPaginationSceneSwitcher paginationSceneSwitcher = new QPaginationSceneSwitcher();
        paginationSceneSwitcher.sceneSwitcher(
                primaryStage,
                new QScene[]{createQButtonScene(primaryStage)}, // Zatiaľ iba jedna scéna
                new QBorderPane[]{}, // Tu pridaj všetky QBorderPane pre jednotlivé scény
                createTopMenu(),
                1, // Počet strán
                createSceneTitle(),
                Map.of(1, "QButton Scene") // Mapa strán a ich názvov
        );

        // Zostavenie layoutu scény
        QVBox rightLayout = new QVBox();
        rightLayout.addComponents(componentImage, imageDescription, codeExample, functionalComponent);

        QHBox leftLayout = new QHBox();
        leftLayout.addComponents(componentDescription);

        QVBox topBox = new QVBox();
        QText topText = new QText();
        topBox.addComponents(topText);
        topText.setContent("Top of Scene (Lorem Ipsum Text)");
        topText.setSize(3, 3); // Set scale to 3 for both width and height

        QVBox bottomBox = new QVBox();
        QText bottomText = new QText();
        bottomBox.addComponents(bottomText);
        bottomText.setContent("Bottom of Scene (Lorem Ipsum Text)");
        bottomText.setSize(3, 3); // Set scale to 3 for both width and height

        QBorderPane scenePane = new QBorderPane();
        scenePane.setPosition("TOP", topBox);
        scenePane.setPosition("LEFT", leftLayout);
        scenePane.setPosition("RIGHT", rightLayout);
        scenePane.setPosition("BOTTOM", bottomBox);

        return new QScene(scenePane, 800, 600);
    }




    // Úprava createTopMenu() na vrátenie QText v QHBox namiesto QMenu
    private QHBox createTopMenu() {
        QText topText = new QText();
        topText.setContent("QButton Scene Menu (Lorem Ipsum Text)");
        topText.setSize(3, 3); // Set scale to 3 for both width and height

        QHBox topMenu = new QHBox();
        topMenu.addComponents(topText);

        return topMenu;
    }

    private QText createSceneTitle() {
        QText title = new QText();
        title.setContent("QButton Scene");
        title.setSize(3, 3); // Set scale to 3 for both width and height
        return title;
    }


}

