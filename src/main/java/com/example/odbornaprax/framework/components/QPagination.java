package com.example.odbornaprax.framework.components;

import javafx.scene.Node;
import javafx.scene.control.Pagination;
import javafx.util.Callback;

public class QPagination extends Pagination {

    public QPagination() {
        super();
    }

    public void setPageNumber(int pageCount) {
        super.setPageCount(pageCount);
    }

    public int getPageNumber() {
        return super.getPageCount();
    }

    public void setCurrentPage(int pageIndex) {
        super.setCurrentPageIndex(pageIndex);
    }

    public void setMaxPageIndicatorValue(int number) {
        super.setMaxPageIndicatorCount(number);
    }

    public void setContentFactory(Callback<Integer, Node> value) {
        super.setPageFactory(value);
    }

}
