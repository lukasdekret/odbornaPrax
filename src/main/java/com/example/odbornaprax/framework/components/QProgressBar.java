package com.example.odbornaprax.framework.components;

import javafx.scene.control.ProgressBar;

public class QProgressBar extends ProgressBar {

    public QProgressBar() {
        super();
    }

    public void setDimensions(int h, int w) {
        super.setWidth(w);
        super.setHeight(h);
    }

    public void setProgressValue(double value) {
        super.setProgress(value);
    }

    public double getProgressValue() {
        return super.getProgress();
    }

}
