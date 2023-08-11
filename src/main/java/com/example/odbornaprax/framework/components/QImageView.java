package com.example.odbornaprax.framework.components;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;


public class QImageView extends ImageView {
    public QImageView()
    {
        super();
    }
    public void setNewImage(String s) {
        Image image = new Image(s);
        super.setImage(image);
    }
    public void setDimensions(int h, int w) {
        super.setFitHeight(h);
        super.setFitWidth(w);
    }
}
