package com.example.odbornaprax.framework.components;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.concurrent.ExecutionException;

public class QImageTextCaption extends QVBox {

    /* QImageTextCaption - Struktura:
        1. QBox ktory bude obsahovat jeden obrazok (QImageView) a jedno textove pole (QTextArea).
        2. Obrazok (QImageView) bude centrovany na stred kontajnera, s vlastnostami:
            - sirka: 100% sirky kontajnera - 2 * 15px
            - padding: 10px a 15px (10px hore-dole, 15px vlavo-vpravo)
        3. Textove pole (QTextArea), bude vycentrovane na stred kontajnera s vlastnostami:
            - sirka: 95% sirky kontajnera
    */

    private final QImageView image = new QImageView();
    private final QText text = new QText();

    private int image_width = 115;
    private int image_height = 115;
    private int box_width = 400;
    private int box_height = 400;

    public QImageTextCaption() {
        super.addComponents(image, text);
        super.setAlignment(Pos.CENTER);
        super.setPrefWidthHeight(800, 600);
        super.setPadding(new Insets(20));
    }

    public void setImage(FileInputStream fileInputStream) {
        this.image.setNewImage(fileInputStream);
        this.image.setDimensions(image_height - 15, image_width - 15);
    }

    public void setContainerSize(int h, int w) {
        if(w > image_width && h > image_height) {
            this.setPrefWidthHeight(w, h);
            box_width = w;
            box_height = h;
            return;
        }
        box_width = image_width + 15;
        box_height = image_height + 15;
        this.setPrefWidthHeight(box_width, box_height);
    }

    public void setImageDimensions(int h, int w) {
        if(w < box_width && h < box_height) {
            this.image.setDimensions(h, w);
            image_width = w;
            image_height = h;
            return;
        }
        image_width = (box_width / 2) - 15;
        image_height = (box_height / 2) - 15;
        this.image.setDimensions(image_height, image_width);
    }

    public void setCaption(String text) {
        this.text.setContent(text);
    }

}
