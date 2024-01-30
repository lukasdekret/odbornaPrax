package com.example.odbornaprax.application_test;

import com.example.odbornaprax.framework.components.*;

import java.io.FileInputStream;

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
        QTreeView treeView = createTreeMenu(primaryStage);

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

        // Create a border pane as the main layout
        QBorderPane quizPane = new QBorderPane();
        // Create a quiz with a title and six questions
        QQuiz simpleQuiz = createQuiz();
        // Set the quiz as the center component of the main layout
        quizPane.setPosition("CENTER", simpleQuiz);
        // Create the main scene
        QScene quizScene = new QScene(quizPane, 800, 600);

        // Final Scene
        QScene homePageScene = new QScene(homePagePane, 800, 600);
        QScene qButtonScene = createQButtonScene();
        primaryStage.setTitle("QFramework Tutorial App");
        primaryStage.setScene(homePageScene);
        primaryStage.show();
    }

    private QQuiz createQuiz(){
        QQuiz quiz = new QQuiz("Framework Knowledge Quiz", 6);

        // Question 1
        QQuestion question1 = new QQuestion("What is the main class responsible for starting the application in our framework?",
                new String[]{"QApplication", "QMain", "QStart", "QFrameworkStart"}, 0);

        // Question 2
        QQuestion question2 = new QQuestion("Which component is used as a layout for placing child components in a horizontal fashion?",
                new String[]{"QHBox", "QVBox", "QBorderPane", "QGridLayout"}, 0);

        // Question 3
        QQuestion question3 = new QQuestion("In our framework, which component is used for handling scene switching functionality?",
                new String[]{"QPaginationSceneSwitcher", "QSceneSwitch", "QSceneHandler", "QNavigator"}, 0);

        // Question 4
        QQuestion question4 = new QQuestion("What is the purpose of the QBorderPane component in our framework?",
                new String[]{"It is a layout component with five zones for placing child components.", "It represents the application.", "It handles scene switching functionality.", "It is a checkbox component."}, 0);

        // Question 5
        QQuestion question5 = new QQuestion("Which class is a composite component used for switching between scenes and contains menus and a title?",
                new String[]{"QComponentMenu", "QSceneSwitcher", "QMenuButton", "QNavigationMenu"}, 0);

        // Question 6
        QQuestion question6 = new QQuestion("In our framework, which class represents a basic button component?",
                new String[]{"QButton", "QPushButton", "QClicker", "QActionBtn"}, 0);

        // Add questions to the quiz
        quiz.addQuestions(question1, question2, question3, question4, question5, question6);

        // Render the quiz content
        quiz.renderContent();

        return quiz;
    }
    // Method to create the Tree Menu
    private QTreeView createTreeMenu(QStage primaryStage) {
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

        // Set event handler for QButton item
        treeView.setOnMouseClicked(event -> {
            // Get the selected item
            QTreeItem selectedItem = (QTreeItem) treeView.getSelectionModel().getSelectedItem();

            // Check if QButton item is selected
            if (selectedItem == qButton) {
                // Switch to QButton scene
                QScene qButtonScene = createQButtonScene();
                primaryStage.setScene(qButtonScene);
            }
            // ... (add similar checks for other items)
        });



        return treeView;
    }
    private QScene createQButtonScene() {
        // Creating the navigation menu
        QMenu mainMenu = new QMenu("Main Menu");
        QMenu quizesMenu = new QMenu("Quizes");
        quizesMenu.addItems(new QMenuItem("Example Quiz 1"), new QMenuItem("Example Quiz 2"), new QMenuItem("Example Quiz 3"));

        // Adding menus to the menu bar
        QMenuBar menuBar = new QMenuBar();
        menuBar.addMenus(mainMenu, quizesMenu);

        // Text na vrchu a spodku scény
        QText sceneTitle = new QText();
        sceneTitle.setContent("QButton Component Description - Lorem Ipsum Text");
        sceneTitle.setSize(2, 2); // Nastaví škálu na 2 pre šírku a výšku

        QText sceneBottomText = new QText();
        sceneBottomText.setContent("Additional Lorem Ipsum Text at the Bottom");
        sceneBottomText.setSize(2, 2); // Nastaví škálu na 2 pre šírku a výšku

        // Container for menu bar and scene title
        QVBox topContainer = new QVBox();
        topContainer.addComponents(menuBar, sceneTitle);

        // Popis komponentu na ľavej strane
        QText componentDescription = new QText();
        componentDescription.setContent("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Phasellus vel libero non nisi eleifend finibus nec sit amet nisl.");

        // Obrázok komponentu (preddefinovaný priestor)
        QImageView componentImage = new QImageView();
        try {
            // Tu sa načíta obrázok zo súboru "example-button.jpg"
            FileInputStream imageStream = new FileInputStream("src/main/java/Pictures/example-button.png");
            componentImage.setNewImage(imageStream);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Príklad kódu a funkčný komponent na pravej strane
        QText codeExample = new QText();
        codeExample.setContent("Example Code:\n\nQButton myButton = new QButton();\nmyButton.setHeadline(\"Click me!\");\nmyButton.setAction(() -> myButton.setText(\"Button Clicked!\"));");

        QButton functionalComponent = new QButton();
        functionalComponent.setHeadline("Click me!");
        QText buttonText = new QText();
        buttonText.setContent("Button Clicked!");

        functionalComponent.setAction(buttonText);
        // Layout pre pravú stranu s obrázkom, popisom obrázku, príkladom kódu a funkčným komponentom
        QVBox rightLayout = new QVBox();
        rightLayout.addComponents(componentImage, componentDescription, codeExample, functionalComponent);

        // Hlavný BorderPane pre scénu
        QBorderPane scenePane = new QBorderPane();
        scenePane.setPosition("TOP", topContainer); // Adding the container with menu bar and scene title
        scenePane.setPosition("LEFT", componentDescription); // Popis komponentu na ľavej strane
        scenePane.setPosition("RIGHT", rightLayout); // Pravá strana s obrázkom, popisom, kódom a komponentom
        scenePane.setPosition("BOTTOM", sceneBottomText);

        // Vytvorenie scény
        QScene qButtonScene = new QScene(scenePane, 800, 600);

        return qButtonScene;
    }


}
