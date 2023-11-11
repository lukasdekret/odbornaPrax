package com.example.odbornaprax.framework.components;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.text.TextAlignment;

public class QArticle extends QVBox {

    /* QArticle - Struktura:
        1. QBox ktory bude obsahovat jeden nadpis (QLabel s nastavenym stylom), a n-pocet paragrafov typu QLabel.
        2. Nadpis bude mat tieto vlastnosti:
            - velkost pisma: 14px
            - hrubka pisma: hrube (bold)
        3. Paragrafy budu mat taketo vlastnosti:
            - padding: 10px hore-dole, a 5px vlavo-vpravo
        - pouzitie CSS pre JavaFX komponenty: https://docs.oracle.com/javafx/2/css_tutorial/jfxpub-css_tutorial.htm
    */


    public final QLabel header = new QLabel();
    public final String[] paragraphs;

    public QArticle(String header, String[] paragraphs) {
        super.addComponents(this.header);
        this.header.setTitle(header == null ? "Default header" : header);
        this.header.applyStyle("-fx-font-size: 14px; -fx-font-weight: bold"); // notTODO: Zmeniť
        this.header.setPrefWidthHeight(200, 50);
        super.setMarginOfNode(this.header, 10, 20, 10,50);
        super.applyPadding(new Insets(10,20,10,20)); // notTODO: Zmeniť
        this.paragraphs = paragraphs == null ? new String[]{"No paragraphs has been added."} : paragraphs;
        loadParagraphs();
    }

    private void loadParagraphs() {
        for(String paragraph : paragraphs) {
            QLabel label = new QLabel();
            label.setTitle(paragraph);
            label.enableTextWrapping(true); // notTODO: Zmeniť
            label.setAlignment(TextAlignment.JUSTIFY); // notTODO: Zmeniť
            super.addComponents(label);
            super.setMarginOfNode(label, 10, 20, 10, 0);
        }
    }


    public void setPrefWidthHeight(double width, double height) {
        super.setPrefWidth(width);
        super.setPrefHeight(height);
    }

}
