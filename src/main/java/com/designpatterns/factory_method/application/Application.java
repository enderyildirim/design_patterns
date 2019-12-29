package com.designpatterns.factory_method.application;

import java.util.ArrayList;
import java.util.List;

public abstract class Application {
    private List<Document> documents = new ArrayList<>();

    public void openDocument() {
        Document document = createDocument();
        documents.add(document);
        document.open();
    }

    public abstract Document createDocument();
}
