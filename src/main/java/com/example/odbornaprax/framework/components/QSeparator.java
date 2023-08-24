package com.example.odbornaprax.framework.components;

import javafx.geometry.Orientation;
import javafx.scene.control.Separator;

public class QSeparator extends Separator {
    public QSeparator() {
        super();
    }

    public void setOrientationVertical(){
        super.orientationProperty().setValue(Orientation.VERTICAL);
    }
    public void setOrientationHorizontal(){
        super.orientationProperty().setValue(Orientation.HORIZONTAL);
    }
}
