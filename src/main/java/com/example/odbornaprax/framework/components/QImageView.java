package com.example.odbornaprax.framework.components;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.FileInputStream;


public class QImageView extends ImageView {
    public QImageView()
    {
        super();
    }
    public void setNewImage(FileInputStream inputStream) {
        Image image = new Image(inputStream);
        super.setImage(image);
    }
    public void setDimensions(int h, int w) {
        super.setFitHeight(h);
        super.setFitWidth(w);
    }
}
