package com.example.odbornaprax.framework.components;

import javafx.geometry.Pos;
import javafx.scene.Parent;

import java.util.HashMap;

public class QQuiz extends QBorderPane {

    /* Rozlozenie: header, content, footer
        - header: Obsahuje hlavnu navigaciu (topMenu)
        - content: 2 casti
            1. cast: nadpis, podnadpis pre ktoru cast je kviz urceny
            2. cast: zoznam QQuizComponent komponentov (pre zaciatok staci aj pole dvojic otazka-moznosti
     */
    private QText textTitle = new QText();
    private QVBox content = new QVBox();
    private HashMap<String, String[]> questions;


    //TODO: Pridať pole QQuizComponent na vstupe konstruktora
    public QQuiz(String title, HashMap<String ,String[]> questions) {
        this.textTitle.setContent(title);
        this.questions = questions;
    }

    //TODO: Prisposobit pre QQuizComponent
    public void renderContent() {

        // Header
        QArticle quizHeader = new QArticle(this.textTitle.getText(), new String[]{"Pri každej otázke možete vybrať jednu z možností."});
        quizHeader.header.setSize(1.5, 1.5);
        this.content.addComponents(quizHeader);
        this.content.setMarginOfNode(quizHeader, 50, 0, 50, 0);
        this.content.setPrefWidthHeight(1000,600);

        // Content
        int index = 0;
        for(String question: questions.keySet()) {

            index++;
            QLabel textQuestion = new QLabel("Otázka " + index + ": " + question);
            textQuestion.setPrefWidthHeight(300, 50);
            textQuestion.setSize(1.5,1.5);
            textQuestion.setStyle("-fx-font-weight: bold");

            QVBox questionBox = new QVBox();
            this.content.addComponents(textQuestion);
            this.content.setMarginOfNode(textQuestion,10,100,0,90);

            QToggleGroup toggleGroup = new QToggleGroup();
            for(String option: questions.get(question)) {
                QRadioButton buttonOption = new QRadioButton();
                buttonOption.setTitle(option);
                this.content.addComponents(buttonOption);
                this.content.setMarginOfNode(buttonOption, 10, 100, 10, 30);
                toggleGroup.addToggles(buttonOption);
            }

        }
        super.setPosition("TOP", quizHeader);
        super.setPosition("CENTER", this.content);

        // Footer
        QVBox submitBox = new QVBox();
        QButton submitButton = new QButton();
        submitButton.setHeadline("Odoslať");

        submitBox.addComponents(submitButton);
        submitBox.setAlignment(Pos.CENTER);
        submitBox.setMarginOfNode(submitButton,20,0,50,0);
        super.setPosition("BOTTOM", submitBox);

    }

}
