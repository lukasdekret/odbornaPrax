package com.example.odbornaprax.framework.components;

import javafx.scene.Parent;
import javafx.stage.Stage;

public class QStage extends Stage {
    String headline = "";
    Parent parent = null;

    public void setHeadline(String s) {
        this.headline = s;
    }

    public String getHeadline() {
        return headline;
    }

    public Parent getParent() {
        return parent;
    }

    public void setQScene(QScene scene) {
        super.setScene(scene);
    }

    public void closeScene() {
        super.close();
    }

    public void showScene() {
        super.show();
    }

    public void setParent(Object parent) {
        this.parent = (Parent) parent;
    }
}
