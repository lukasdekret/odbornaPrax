package com.example.odbornaprax.framework.components;
import javafx.scene.control.Hyperlink;

public class QHyperlink extends Hyperlink {
    public QHyperlink()
    {
        super();
    }
    public void setFontStyle(String s) {
        super.setStyle(s);
    }
    public void setHyperlinkText(String s){
        super.setText(s);
    }
    public void setAction(String s){
        super.setOnAction(e ->{
            System.out.println(s);
        });
    }
}
