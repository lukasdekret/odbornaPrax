package com.example.odbornaprax.application_test;

import com.example.odbornaprax.framework.components.*;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

public class QFrameworkTutorialApp extends QApplication {
    private QStage primaryStage;
    // QPaginationSceneSwitcher initialization for Buttons and Boxes section
    // Create QPaginationSceneSwitcher component here
    private QPaginationSceneSwitcher paginationSSBB = new QPaginationSceneSwitcher();
    // Initialize your titles, scenes and panes here
    private QScene[] scenesBB;
    private QBorderPane[] panesBB = new QBorderPane[5];

    private Map<Integer, String> titlesBB = Map.of(
            0, "QButton",
            1, "QRadioButton",
            2, "QCheckBox",
            3, "QComboBox",
            4, "QToggleGroup"
    );
    // QPaginationSceneSwitcher initialization for Text and Images section
    private QPaginationSceneSwitcher paginationSSTI = new QPaginationSceneSwitcher();

    // Initialize your titles, scenes and panes here for Text and Images section
    private QScene[] scenesTI;
    private QBorderPane[] panesTI = new QBorderPane[6]; // Increased size for Text and Images

    private Map<Integer, String> titlesTI = Map.of(
            0, "QText",
            1, "QTextArea",
            2, "QLabel",
            3, "QTextField",
            4, "QHyperlink",
            5, "QImageView"
    );

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(QStage primaryStage) {
        // Home Page Title
        this.primaryStage = primaryStage;
        //Fill out scenesBB array
        this.scenesBB = new QScene[]{createQButtonScene(), createQRadioButtonScene("QRadioButton"), createQCheckBoxScene(), createQComboBoxScene(), createQToggleGroupScene()};
        // Fill out scenesTI array
        this.scenesTI = new QScene[]{createQTextScene(), createQTextAreaScene(), createQLabelScene("QLabel"), createQTextFieldScene("QTextField"), createQHyperlinkScene("QHyperlink"), createQImageViewScene("QImageView")};


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



        // Add an event handler to the Test Yourself Button
        testYourselfButton.setOnMouseClicked(event -> {
            // Switch to the quizScene when the button is clicked
            primaryStage.setScene(quizScene);
        });

        // Final Scene
        QScene homePageScene = new QScene(homePagePane, 800, 600);

        //Call sceneSwitcher init function here
        initSSBB();
        // Call sceneSwitcher init function for Text and Images section
        initSSTI();

        handleTreeItemSelection(treeView);
        primaryStage.setTitle("QFramework Tutorial App");
        primaryStage.setScene(homePageScene);
        primaryStage.show();



    }

    //Implementation of QPaginationSceneSwitcher based on example given by ChatGPT for Buttons and Boxes section
    private void initSSBB(){
        // Initialize pagination scene switcher
        paginationSSBB.sceneSwitcher(
                primaryStage,
                scenesBB,
                panesBB,
                new QHBox(), // Example: You need to provide your menuQHBox
                5, // Example: Assuming 3 pages
                new QText(), // Example: You need to provide your title object
                titlesBB
        );

        // Set visibility of pagination scene switcher
        paginationSSBB.setVisibility(true); // Or false based on your requirements
    }
    //Implementation of QPaginationSceneSwitcher based on example given by ChatGPT for Text and Images section
    private void initSSTI(){
        paginationSSTI.sceneSwitcher(
                primaryStage,
                scenesTI,
                panesTI,
                new QHBox(), // Example: You need to provide your menuQHBox
                6, // Example: Assuming 6 pages for Text and Images
                new QText(), // Example: You need to provide your title object
                titlesTI
        );

        paginationSSTI.setVisibility(true); // Or false based on your requirements
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
    private void switchScene(QScene newScene) {
        // Set the new scene for QStage
        primaryStage.setScene(newScene);
    }

    // Method to handle tree item selection
    // Metóda na spracovanie výberu položky stromu
    private void handleTreeItemSelection(QTreeView treeView) {
        treeView.setOnMouseClicked(event -> {
            // Získať vybranú položku stromu
            QTreeItem selectedItem = (QTreeItem) treeView.getSelectionModel().getSelectedItem();

            // Kontrola, či vybraná položka nie je null
            if (selectedItem != null) {
                // Získať hodnotu (text) vybranej položky
                String selectedText = String.valueOf(selectedItem.getValue());

                // Prepínač scén na základe vybranej položky
                switch (selectedText) {
                    case "QButton":
                        paginationSSBB.getNode().setCurrentPage(0); // set current page of pagination
                        panesBB[0].setPosition("BOTTOM", paginationSSBB.getNode()); // place pagination component
                        switchScene(scenesBB[0]); // switch scene
                        break;
                    case "QRadioButton":
                        paginationSSBB.getNode().setCurrentPage(1);
                        panesBB[1].setPosition("BOTTOM", paginationSSBB.getNode());
                        switchScene(scenesBB[1]);
                        break;
                    case "QCheckBox":
                        paginationSSBB.getNode().setCurrentPage(2);
                        panesBB[2].setPosition("BOTTOM", paginationSSBB.getNode());
                        switchScene(scenesBB[2]);
                        break;
                    case "QComboBox":
                        paginationSSBB.getNode().setCurrentPage(3);
                        panesBB[3].setPosition("BOTTOM", paginationSSBB.getNode());
                        switchScene(scenesBB[3]);
                        break;
                    case "QToggleGroup": // Pridané pre QToggleGroup
                        paginationSSBB.getNode().setCurrentPage(4);
                        panesBB[4].setPosition("BOTTOM", paginationSSBB.getNode());
                        switchScene(scenesBB[4]);
                        break;
                    case "QText":
                        paginationSSTI.getNode().setCurrentPage(0);
                        panesTI[0].setPosition("BOTTOM", paginationSSTI.getNode());
                        switchScene(scenesTI[0]);
                        break;
                    case "QTextArea":
                        paginationSSTI.getNode().setCurrentPage(1);
                        panesTI[1].setPosition("BOTTOM", paginationSSTI.getNode());
                        switchScene(scenesTI[1]);
                        break;
                    case "QLabel":
                        paginationSSTI.getNode().setCurrentPage(2);
                        panesTI[2].setPosition("BOTTOM", paginationSSTI.getNode());
                        switchScene(scenesTI[2]);
                        break;
                    case "QTextField":
                        paginationSSTI.getNode().setCurrentPage(3);
                        panesTI[3].setPosition("BOTTOM", paginationSSTI.getNode());
                        switchScene(scenesTI[3]);
                        break;
                    case "QHyperlink":
                        paginationSSTI.getNode().setCurrentPage(4);
                        panesTI[4].setPosition("BOTTOM", paginationSSTI.getNode());
                        switchScene(scenesTI[4]);
                        break;
                    case "QImageView":
                        paginationSSTI.getNode().setCurrentPage(5);
                        panesTI[5].setPosition("BOTTOM", paginationSSTI.getNode());
                        switchScene(scenesTI[5]);
                        break;
                    default:
                        // Riešenie neznámeho výberu
                        System.out.println("Unknown selection: " + selectedText);
                }
            }
        });
    }



// ... (existing code)


    private QScene createQButtonScene() {
        // Text na vrchu a spodku scény
        QText sceneTitle = new QText();
        sceneTitle.setContent("QButton Component Description - Lorem Ipsum Text");
        sceneTitle.setSize(2, 2); // Nastaví škálu na 2 pre šírku a výšku

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
        QText sceneDefinition = new QText();
        sceneDefinition.setContent("Definition of QButton: A clickable button GUI component.");

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
        rightLayout.addComponents(componentImage,sceneDefinition, componentDescription, codeExample, functionalComponent);

        // Hlavný BorderPane pre scénu
        QBorderPane scenePane = new QBorderPane();
        scenePane.setPosition("TOP", sceneTitle);
        scenePane.setPosition("LEFT", componentDescription); // Popis komponentu na ľavej strane
        scenePane.setPosition("RIGHT", rightLayout); // Pravá strana s obrázkom, popisom, kódom a komponentom

        // Vytvorenie scény
        QScene qButtonScene = new QScene(scenePane, 800, 600);
        //Add scenePane to global array
        panesBB[0] = scenePane;
        return qButtonScene;
    }
    // Method to create a scene for QButton and QRadioButton
    private QScene createQRadioButtonScene(String componentName) {
        // Text at the top and bottom of the scene
        QText sceneTitle = new QText();
        sceneTitle.setContent(componentName + " Component Description - Lorem Ipsum Text");
        sceneTitle.setSize(2, 2); // Set scale to 2 for both width and height

        // Description of the component on the left side
        QText componentDescription = new QText();
        componentDescription.setContent("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Phasellus vel libero non nisi eleifend finibus nec sit amet nisl.");

        // Image of the component (predefined space)
        QImageView componentImage = new QImageView();
        try {
            // Load the image from the file "example-button.jpg"
            FileInputStream imageStream = new FileInputStream("src/main/java/Pictures/example-radioButton.png");
            componentImage.setNewImage(imageStream);
        } catch (Exception e) {
            e.printStackTrace();
        }
        QText sceneDefinition = new QText();
        sceneDefinition.setContent("Definition of QRadioButton");

        // Example code and functional component on the right side
        QText codeExample = new QText();
        codeExample.setContent("Example Code:\n\n" + componentName + " myComponent = new " + componentName + "();\nmyComponent.setHeadline(\"Click me!\");\nmyComponent.setAction(() -> myComponent.setText(\"Component Clicked!\"));");

        QToggleGroup functionalComponent = new QToggleGroup();
        QRadioButton option1 = new QRadioButton();
        QRadioButton option2 = new QRadioButton();
        functionalComponent.addToggles(option1, option2);


        // Layout for the right side with the image, description, code example, and functional component
        QVBox rightLayout = new QVBox();
        rightLayout.addComponents(componentImage,sceneDefinition, componentDescription, codeExample, option1, option2);

        // Main BorderPane for the scene
        QBorderPane scenePane = new QBorderPane();
        scenePane.setPosition("TOP", sceneTitle);
        scenePane.setPosition("LEFT", componentDescription); // Description of the component on the left side
        scenePane.setPosition("RIGHT", rightLayout); // Right side with image, description, code, and component

        //Add scenePane to global array
        panesBB[1] = scenePane;
        // Create the scene
        return new QScene(scenePane, 800, 600);
    }
    private QScene createQCheckBoxScene() {
        // Text at the top and bottom of the scene
        QText sceneTitle = new QText();
        sceneTitle.setContent("QCheckBox Component Description - Lorem Ipsum Text");
        sceneTitle.setSize(2, 2); // Set scale to 2 for both width and height

        // Description of the component on the left side
        QText componentDescription = new QText();
        componentDescription.setContent("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Phasellus vel libero non nisi eleifend finibus nec sit amet nisl.");

        // Image of the component (predefined space)
        QImageView componentImage = new QImageView();
        try {
            // Load the image from the file "example-checkbox.jpg"
            FileInputStream imageStream = new FileInputStream("src/main/java/Pictures/example-checkbox.png");
            componentImage.setNewImage(imageStream);
        } catch (Exception e) {
            e.printStackTrace();
        }
        QText sceneDefinition = new QText();
        sceneDefinition.setContent("Definition of QCheckBox");

        // Example code and functional component on the right side
        QText codeExample = new QText();
        codeExample.setContent("Example Code:\n\nQCheckBox myCheckBox = new QCheckBox();\nmyCheckBox.setTitle(\"Check me!\");\nmyCheckBox.setAction(() -> myCheckBox.setTitle(\"CheckBox Checked!\"));");

        QCheckBox functionalComponent = new QCheckBox();
        functionalComponent.setTitle("Check me"); // Nastaví názov QCheckBox

        functionalComponent.setSelected(true);

        // Layout for the right side with the image, description, code example, and functional component
        QVBox rightLayout = new QVBox();
        rightLayout.addComponents(componentImage,sceneDefinition, componentDescription, codeExample, functionalComponent);

        // Main BorderPane for the scene
        QBorderPane scenePane = new QBorderPane();
        scenePane.setPosition("TOP", sceneTitle);
        scenePane.setPosition("LEFT", componentDescription); // Description of the component on the left side
        scenePane.setPosition("RIGHT", rightLayout); // Right side with image, description, code, and component

        //Add scenePane to global array
        panesBB[2] = scenePane;
        // Create the scene
        return new QScene(scenePane, 800, 600);
    }
    private QScene createQComboBoxScene() {
        // Text at the top and bottom of the scene
        QText sceneTitle = new QText();
        sceneTitle.setContent("QComboBox Component Description - Lorem Ipsum Text");
        sceneTitle.setSize(2, 2); // Set scale to 2 for both width and height

        // Component description on the left side
        QText componentDescription = new QText();
        componentDescription.setContent("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Phasellus vel libero non nisi eleifend finibus nec sit amet nisl.");

        // Image of the component (predefined space)
        QImageView componentImage = new QImageView();
        try {
            // Load the image from the file "example-combobox.png"
            FileInputStream imageStream = new FileInputStream("src/main/java/Pictures/example-combobox.png");
            componentImage.setNewImage(imageStream);
        } catch (Exception e) {
            e.printStackTrace();
        }
        QText sceneDefinition = new QText();
        sceneDefinition.setContent("Definition of QComboBox");

        // Example code and functional component on the right side
        QText codeExample = new QText();
        codeExample.setContent("Example Code:\n\nQComboBox myComboBox = new QComboBox();\nmyComboBox.addList(Arrays.asList(\"Option 1\", \"Option 2\", \"Option 3\"));");

        QComboBox functionalComponent = new QComboBox();
        functionalComponent.addList(new ArrayList<>(Arrays.asList("Option 1", "Option 2", "Option 3")));
        QText selectedOptionText = new QText();
        selectedOptionText.setContent("Selected Option: None");

        // Layout for the right side with the image, description, code, and functional component
        QVBox rightLayout = new QVBox();
        rightLayout.addComponents(componentImage,sceneDefinition, componentDescription, codeExample, functionalComponent, selectedOptionText);

        // Main BorderPane for the scene
        QBorderPane scenePane = new QBorderPane();
        scenePane.setPosition("TOP", sceneTitle);
        scenePane.setPosition("LEFT", componentDescription); // Component description on the left side
        scenePane.setPosition("RIGHT", rightLayout); // Right side with image, description, code, and functional component

        //Add scenePane to global array
        panesBB[3] = scenePane;
        // Create the scene
        return new QScene(scenePane, 800, 600);
    }
    // Method to create the scene for QToggleGroup
    // Method to create the scene for QToggleGroup
// Method to create the scene for QToggleGroup
    private QScene createQToggleGroupScene() {
        // Text at the top and bottom of the scene
        QText sceneTitle = new QText();
        sceneTitle.setContent("QToggleGroup Component Description - Lorem Ipsum Text");
        sceneTitle.setSize(2, 2); // Set scale to 2 for both width and height

        // Component description on the left side
        QText componentDescription = new QText();
        componentDescription.setContent("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Phasellus vel libero non nisi eleifend finibus nec sit amet nisl.");

        // Image of the component (predefined space)
        QImageView componentImage = new QImageView();
        try {
            // Load the image from the file "example-togglegroup.png"
            FileInputStream imageStream = new FileInputStream("src/main/java/Pictures/example-togglegroup.png");
            componentImage.setNewImage(imageStream);
        } catch (Exception e) {
            e.printStackTrace();
        }
        QText sceneDefinition = new QText();
        sceneDefinition.setContent("Definition of QToggleGroup");

        // Example code on the right side
        QText codeExample = new QText();
        codeExample.setContent("Example Code:\n\nQToggleGroup myToggleGroup = new QToggleGroup();\n" +
                "QRadioButton option1 = new QRadioButton();\n" +
                "QRadioButton option2 = new QRadioButton();\n" +
                "myToggleGroup.addToggles(option1, option2);");

        // QRadioButton options on the right side
        QVBox rightLayout = new QVBox();
        rightLayout.addComponents(componentImage,sceneDefinition, componentDescription, codeExample);

        // Add QRadioButton options to the layout
        QRadioButton option1 = new QRadioButton();
        QRadioButton option2 = new QRadioButton();
        rightLayout.addComponents(option1, option2);

        // Main BorderPane for the scene
        QBorderPane scenePane = new QBorderPane();
        scenePane.setPosition("TOP", sceneTitle);
        scenePane.setPosition("LEFT", componentDescription); // Component description on the left side
        scenePane.setPosition("RIGHT", rightLayout); // Right side with image, description, code, and QRadioButton options
        scenePane.setPosition("BOTTOM", paginationSSBB.getNode()); // add global pagination component for section

        //Add scenePane to global array
        panesBB[4] = scenePane;
        // Create the scene
        return new QScene(scenePane, 800, 600);
    }
    private QScene createQTextScene() {
        // Text at the top and bottom of the scene
        QText sceneTitle = new QText();
        sceneTitle.setContent("QText Component Description - Lorem Ipsum Text");
        sceneTitle.setSize(2, 2); // Set scale to 2 for both width and height

        // Component description on the left side
        QText componentDescription = new QText();
        componentDescription.setContent("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Phasellus vel libero non nisi eleifend finibus nec sit amet nisl.");

        // Image of the component (predefined space)
        QImageView componentImage = new QImageView();
        try {
            // Load the image from the file "example-text.png"
            FileInputStream imageStream = new FileInputStream("src/main/java/Pictures/example_text.jpg");
            componentImage.setNewImage(imageStream);
        } catch (Exception e) {
            e.printStackTrace();
        }
        QText sceneDefinition = new QText();
        sceneDefinition.setContent("Definition of QText");
        // Example code and functional component on the right side
        QText codeExample = new QText();
        codeExample.setContent("Example Code:\n\nQText myText = new QText();\nmyText.setContent(\"This is a QText component.\");");

        QText exampleText = new QText();
        exampleText.setContent("Example Text");

        // Layout for the right side with the image, description, code example, and functional component
        QVBox rightLayout = new QVBox();
        rightLayout.addComponents(componentImage,sceneDefinition, componentDescription, codeExample,exampleText);

        // Main BorderPane for the scene
        QBorderPane scenePane = new QBorderPane();
        scenePane.setPosition("TOP", sceneTitle);
        scenePane.setPosition("LEFT", componentDescription); // Component description on the left side
        scenePane.setPosition("RIGHT", rightLayout); // Right side with image, description, code, and component

        panesTI[0] = scenePane;
        // Create the scene
        return new QScene(scenePane, 800, 600);
    }
    private QScene createQTextAreaScene() {
        // Text at the top and bottom of the scene
        QText sceneTitle = new QText();
        sceneTitle.setContent("QTextArea Component Description - Lorem Ipsum Text");
        sceneTitle.setSize(2, 2); // Set scale to 2 for both width and height


        // Component description on the left side
        QText componentDescription = new QText();
        componentDescription.setContent("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Phasellus vel libero non nisi eleifend finibus nec sit amet nisl.");

        // Image of the component (predefined space)
        QImageView componentImage = new QImageView();
        try {
            // Load the image from the file "example-text.png"
            FileInputStream imageStream = new FileInputStream("src/main/java/Pictures/example_textarea.png");
            componentImage.setNewImage(imageStream);
        } catch (Exception e) {
            e.printStackTrace();
        }
        QText sceneDefinition = new QText();
        sceneDefinition.setContent("Definition of QTextArea");

        QText exampleCodeText = new QText();
        exampleCodeText.setContent("Example Code\n\n"
                + "QTextArea textAreaExample = new QTextArea(); "
                + "textAreaExample.setText(\"This is a QTextArea component.\");");

        // Example code and functional component on the right side
        QTextArea textAreaExample = new QTextArea();
        textAreaExample.setText("This is a QTextArea component.");

        // Layout for the right side with the image, description, code example, and functional component
        QVBox rightLayout = new QVBox();
        rightLayout.addComponents(componentImage,sceneDefinition, componentDescription,exampleCodeText, textAreaExample);

        // Main BorderPane for the scene
        QBorderPane scenePane = new QBorderPane();
        scenePane.setPosition("TOP", sceneTitle);
        scenePane.setPosition("LEFT", componentDescription); // Component description on the left side
        scenePane.setPosition("RIGHT", rightLayout); // Right side with image, description, code, and component

        panesTI[1] = scenePane;
        // Create the scene
        return new QScene(scenePane, 800, 600);
    }


    private QScene createQLabelScene(String componentName) {
        // Text at the top and bottom of the scene
        QText sceneTitle = new QText();
        sceneTitle.setContent(componentName + " Component Description - Lorem Ipsum Text");
        sceneTitle.setSize(2, 2); // Set scale to 2 for both width and height

        // Description of the component on the left side
        QText componentDescription = new QText();
        componentDescription.setContent("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Phasellus vel libero non nisi eleifend finibus nec sit amet nisl.");

        // Image of the component (predefined space)
        QImageView componentImage = new QImageView();
        try {
            // Load the image from the file "example-label.jpg"
            FileInputStream imageStream = new FileInputStream("src/main/java/Pictures/example_label.png");
            componentImage.setNewImage(imageStream);
        } catch (Exception e) {
            e.printStackTrace();
        }

        QText sceneDefinition = new QText();
        sceneDefinition.setContent("Definition of QLabel");
        // Example code and functional component on the right side
        QText codeExample = new QText();
        codeExample.setContent("Example Code:\n\n" + componentName + " myComponent = new " + componentName + "();\nmyComponent.setText(\"Hello, World!\");");

        QLabel functionalComponent = new QLabel();
        functionalComponent.setText("Hello, World!");

        // Layout for the right side with the image, description, code example, and functional component
        QVBox rightLayout = new QVBox();
        rightLayout.addComponents(componentImage, sceneDefinition, componentDescription, codeExample, functionalComponent);

        // Main BorderPane for the scene
        QBorderPane scenePane = new QBorderPane();
        scenePane.setPosition("TOP", sceneTitle);
        scenePane.setPosition("LEFT", componentDescription); // Description of the component on the left side
        scenePane.setPosition("RIGHT", rightLayout); // Right side with image, description, code, and component

        panesTI[2] = scenePane;
        // Create the scene
        return new QScene(scenePane, 800, 600);
    }
    private QScene createQTextFieldScene(String componentName) {
        // Text at the top and bottom of the scene
        QText sceneTitle = new QText();
        sceneTitle.setContent(componentName + " Component Description - Lorem Ipsum Text");
        sceneTitle.setSize(2, 2); // Set scale to 2 for both width and height



        // Description of the component on the left side
        QText componentDescription = new QText();
        componentDescription.setContent("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Phasellus vel libero non nisi eleifend finibus nec sit amet nisl.");

        // Image of the component (predefined space)
        QImageView componentImage = new QImageView();
        try {
            // Load the image from the file "example-textfield.jpg"
            FileInputStream imageStream = new FileInputStream("src/main/java/Pictures/example_textfield.png");
            componentImage.setNewImage(imageStream);
        } catch (Exception e) {
            e.printStackTrace();
        }

        QText sceneDefinition = new QText();
        sceneDefinition.setContent("Definition of QTextField");
        // Example code and functional component on the right side
        QText codeExample = new QText();
        codeExample.setContent("Example Code:\n\n" + componentName + " myComponent = new " + componentName + "();\nmyComponent.setPlaceholder(\"Enter text here\");");

        QTextField functionalComponent = new QTextField();
        functionalComponent.promptText("Enter text here");

        // Layout for the right side with the image, description, code example, and functional component
        QVBox rightLayout = new QVBox();
        rightLayout.addComponents(componentImage, sceneDefinition, componentDescription, codeExample, functionalComponent);

        // Main BorderPane for the scene
        QBorderPane scenePane = new QBorderPane();
        scenePane.setPosition("TOP", sceneTitle);
        scenePane.setPosition("LEFT", componentDescription); // Description of the component on the left side
        scenePane.setPosition("RIGHT", rightLayout); // Right side with image, description, code, and component

        panesTI[3] = scenePane;
        // Create the scene
        return new QScene(scenePane, 800, 600);
    }

    private QScene createQHyperlinkScene(String componentName) {
        // Text at the top and bottom of the scene
        QText sceneTitle = new QText();
        sceneTitle.setContent(componentName + " Component Description - Lorem Ipsum Text");
        sceneTitle.setSize(2, 2); // Set scale to 2 for both width and height

        // Description of the component on the left side
        QText componentDescription = new QText();
        componentDescription.setContent("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Phasellus vel libero non nisi eleifend finibus nec sit amet nisl.");

        // Image of the component (predefined space)
        QImageView componentImage = new QImageView();
        try {
            // Load the image from the file "example-hyperlink.jpg"
            FileInputStream imageStream = new FileInputStream("src/main/java/Pictures/example_hyperlink.png");
            componentImage.setNewImage(imageStream);
        } catch (Exception e) {
            e.printStackTrace();
        }

        QText sceneDefinition = new QText();
        sceneDefinition.setContent("Definition of QHyperlink");

        // Example code and functional component on the right side
        QText codeExample = new QText();
        codeExample.setContent("Example Code:\n\n" + componentName + " myComponent = new " + componentName + "();\nmyComponent.setURL(\"https://example.com\");\nmyComponent.setText(\"Visit Example\");");

        QHyperlink functionalComponent = new QHyperlink();
        functionalComponent.setHyperlinkText("https://example.com");


        // Layout for the right side with the image, description, code example, and functional component
        QVBox rightLayout = new QVBox();
        rightLayout.addComponents(componentImage, sceneDefinition, componentDescription, codeExample, functionalComponent);

        // Main BorderPane for the scene
        QBorderPane scenePane = new QBorderPane();
        scenePane.setPosition("TOP", sceneTitle);
        scenePane.setPosition("LEFT", componentDescription); // Description of the component on the left side
        scenePane.setPosition("RIGHT", rightLayout); // Right side with image, description, code, and component

        // Add the scene pane to the panesTI array
        panesTI[4] = scenePane;

        // Create the scene
        return new QScene(scenePane, 800, 600);
    }
    private QScene createQImageViewScene(String componentName) {
        // Text at the top and bottom of the scene
        QText sceneTitle = new QText();
        sceneTitle.setContent(componentName + " Component Description - Lorem Ipsum Text");
        sceneTitle.setSize(2, 2); // Set scale to 2 for both width and height

        // Description of the component on the left side
        QText componentDescription = new QText();
        componentDescription.setContent("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Phasellus vel libero non nisi eleifend finibus nec sit amet nisl.");

        // Image of the component (predefined space)
        QImageView componentImage = new QImageView();
        try {
            // Load the image from the file "example-image.jpg"
            FileInputStream imageStream = new FileInputStream("src/main/java/Pictures/example_imageview.png");
            componentImage.setNewImage(imageStream);
        } catch (Exception e) {
            e.printStackTrace();
        }

        QText sceneDefinition = new QText();
        sceneDefinition.setContent("Definition of QImageView");

        // Example code and functional component on the right side
        QText codeExample = new QText();
        codeExample.setContent("Example Code:\n\n" + componentName + " myComponent = new " + componentName + "();\nmyComponent.setImage(\"src/main/java/Pictures/example_image.jpg\");");

        QImageView functionalComponent = new QImageView();
        try {
            // Load the image from the file "example-image.jpg"
            FileInputStream imageStream = new FileInputStream("src/main/java/Pictures/logo.png");
            functionalComponent.setNewImage(imageStream);
        } catch (Exception e) {
            e.printStackTrace();
        }
        functionalComponent.setDimensions(100,100);

        // Layout for the right side with the image, description, code example, and functional component
        QVBox rightLayout = new QVBox();
        rightLayout.addComponents(componentImage, sceneDefinition, componentDescription, codeExample, functionalComponent);

        // Main BorderPane for the scene
        QBorderPane scenePane = new QBorderPane();
        scenePane.setPosition("TOP", sceneTitle);
        scenePane.setPosition("LEFT", componentDescription); // Description of the component on the left side
        scenePane.setPosition("RIGHT", rightLayout); // Right side with image, description, code, and component

        // Add the scene pane to the panesTI array
        panesTI[5] = scenePane;

        // Create the scene
        return new QScene(scenePane, 800, 600);
    }

}
