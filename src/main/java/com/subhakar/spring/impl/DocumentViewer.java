package com.subhakar.spring.impl;

import com.subhakar.spring.ViewerType;
import com.subhakar.spring.model.Document;
import org.springframework.stereotype.Component;

@Component
public class DocumentViewer implements Viewer<Document> {
    @Override
    public ViewerType getType() {
        return ViewerType.DOCUMENT;
    }

    @Override
    public void view(Document document) {
        document.view();
    }
}
