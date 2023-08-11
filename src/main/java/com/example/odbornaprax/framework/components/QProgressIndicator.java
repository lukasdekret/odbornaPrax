package com.example.odbornaprax.framework.components;

import javafx.scene.control.ProgressIndicator;

public class QProgressIndicator extends ProgressIndicator {

    public QProgressIndicator() {
        super();
    }

    public double getProgressValue() {
        return super.getProgress();
    }

    public void setProgressValue(double progress) {
        super.setProgress(progress);
    }

    public void setDimensions(int h, int w) {
        super.setWidth(w);
        super.setHeight(h);
    }

}
