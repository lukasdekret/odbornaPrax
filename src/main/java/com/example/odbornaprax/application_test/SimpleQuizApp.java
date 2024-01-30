package com.example.odbornaprax.application_test;

import com.example.odbornaprax.framework.components.*;

public class SimpleQuizApp extends QApplication {

    public static void main(String[] args) {
        // Launch the application
        launch(SimpleQuizApp.class, args);
    }

    @Override
    public void start(QStage qstage) {
        // Create a border pane as the main layout
        QBorderPane mainPane = new QBorderPane();

        // Create a quiz with a title and six questions
        QQuiz simpleQuiz = new QQuiz("Framework Knowledge Quiz", 6);

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
        simpleQuiz.addQuestions(question1, question2, question3, question4, question5, question6);

        // Render the quiz content
        simpleQuiz.renderContent();

        // Set the quiz as the center component of the main layout
        mainPane.setPosition("CENTER", simpleQuiz);

        // Create the main scene
        QScene mainScene = new QScene(mainPane, 800, 600);

        // Set the main scene to the stage and show it
        qstage.setScene(mainScene);
        qstage.show();
    }
}
