package com.example.odbornaprax.framework.components;

import java.util.Map;
public class QPaginationSceneSwitcher {
    private QPagination buttonPagination;

    public void sceneSwitcher(QStage qstage,QScene[] sceneIndexes, QBorderPane[] paneIndexes, QHBox menuQBox, int pages, QText title,Map<Integer,String> titles){

        buttonPagination = new QPagination();
        buttonPagination.setPageNumber(pages);
        buttonPagination.setMaxPageIndicatorValue(pages);

        QVBox paginationBox = new QVBox();

        buttonPagination.setContentFactory((index) -> {
            buttonPagination.setCurrentPage(index);
            title.setContent(titles.get(index));
            paneIndexes[index].setPosition("BOTTOM", buttonPagination);
            paneIndexes[index].setPosition("TOP",menuQBox);
            qstage.setQScene(sceneIndexes[index]);
            qstage.show();

            return paginationBox;
        });
    }
    public QPagination getNode(){
        return this.buttonPagination;
    }
}
