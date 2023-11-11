package com.example.odbornaprax.framework.components;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.control.Toggle;
import javafx.scene.text.TextAlignment;

import java.util.ArrayList;
//TODO: Add more questions in main
public class QQuiz extends QBorderPane {

    private QText textTitle = new QText();
    private QVBox content = new QVBox();
    //private HashMap<String, String[]> questions;
    private ArrayList<QQuestion> questions;
    private int [] correctIndexes;

    public QQuiz(String title,int questionAmount) {
        this.textTitle.setContent(title);
        this.questions = new ArrayList<>();
        this.correctIndexes = new int[questionAmount];
    }
    public void addQuestions(QQuestion... queries){
        for (int i=0;i<queries.length;i++){
            this.questions.add(queries[i]);
            this.correctIndexes[i] = queries[i].getIndex();
        }
    }

    public void renderContent() {

        // Content reset
        this.content.reset();

        // Header
        QArticle quizHeader = new QArticle(this.textTitle.getText(), new String[]{"Pri každej otázke možete vybrať jednu z možností."});
        quizHeader.header.setSize(1.5, 1.5);
        this.content.addComponents(quizHeader);
        this.content.setMarginOfNode(quizHeader, 50, 0, 50, 0);
        this.content.setPrefWidthHeight(1000,600);
        //Scroll Pane
        QScrollPane scroll = new QScrollPane();
        scroll.displayVbarAlways();
        scroll.displayHbarNever();
        // Content
        for(int i=0;i<this.questions.size();i++) {
            QLabel textQuestion = new QLabel("Otázka " + (i+1) + ": " + questions.get(i).getQuestion());
            textQuestion.setPrefWidthHeight(600, 50);
            textQuestion.enableTextWrapping(true); // notTODO: Zmeniť
            textQuestion.setSize(1.5,1.5);
            textQuestion.applyStyle("-fx-font-weight: bold"); // notTODO: Zmeniť

            this.content.addComponents(textQuestion);
            this.content.setMarginOfNode(textQuestion,10,100,0,180);

            QToggleGroup toggleGroup = new QToggleGroup();
            Toggle[] toggles = new Toggle[questions.get(i).getAnswers().length];
            for(int x=0;x<questions.get(i).getAnswers().length;x++) {
                QRadioButton buttonOption = new QRadioButton();
                buttonOption.setIndex(x);
                buttonOption.setTitle(questions.get(i).getAnswers()[x]);
                this.content.addComponents(buttonOption);
                this.content.setMarginOfNode(buttonOption, 10, 100, 10, 30);
                toggles[x] = buttonOption;
            }
            questions.get(i).setAnswerButtons(toggleGroup);
            toggleGroup.addToggles(toggles);
        }
        scroll.setBody(this.content);
        super.setPosition("TOP", quizHeader);
        super.setPosition("CENTER", scroll);

        // Footer
        QVBox submitBox = new QVBox();
        QButton submitButton = new QButton();
        submitButton.setHeadline("Odoslať");

        submitButton.setOnAction(new EventHandler<ActionEvent>() { // TODO: Zmeniť
            int correct = 0;
            @Override
            public void handle(ActionEvent actionEvent) {


                for (int y=0;y<questions.size();y++){
                    if(questions.get(y).getAnswerButtons().getSelectedToggle() != null) { // FIXME: Nedá sa (?)
                        if (correctIndexes[y] == questions.get(y).getAnswerButtons().getIndexes().get(questions.get(y).getAnswerButtons().getSelectedToggle())){
                            correct++;
                        }
                        questions.get(y).getAnswerButtons().disable();
                    }
                }
                QText resultMessage = new QText();
                resultMessage.setContent("You answered "+correct+" out of "+questions.size()+" correctly");
                resultMessage.applyStyle("-fx-font-size: 16px;"); // notTODO: Zmeniť

                QButton resetButton = new QButton();
                resetButton.setHeadline("Reset");

                submitBox.addComponents(resultMessage, resetButton);
                submitBox.setMarginOfNode(resultMessage,0,0,40,0);
                submitBox.setMarginOfNode(resetButton,0,0,40,0);
                submitButton.disabled(true); // notTODO: Zmeniť
                correct = 0;

                resetButton.setOnAction(new EventHandler<ActionEvent>() {

                    @Override
                    public void handle(ActionEvent actionEvent) {
                        renderContent();
                    }
                });
            }
        });

        submitBox.addComponents(submitButton);
        submitBox.setPosition(Pos.CENTER); // notTODO: Zmeniť
        submitBox.setMarginOfNode(submitButton,20,0,50,0);
        super.setPosition("BOTTOM", submitBox);
    }


}
