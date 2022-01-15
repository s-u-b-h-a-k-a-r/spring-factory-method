package com.subhakar.spring.service;

import com.subhakar.spring.ViewerType;
import com.subhakar.spring.factory.ViewerFactory;
import com.subhakar.spring.model.Document;
import com.subhakar.spring.model.Image;
import com.subhakar.spring.model.Video;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class ViewerService {
    private final ViewerFactory viewerFactory;

    public ViewerService(ViewerFactory viewerFactory) {
        this.viewerFactory = viewerFactory;
    }

    public void view(ViewerType viewerType, Object o) {
        this.viewerFactory.getViewer(viewerType).view(o);
    }

    @PostConstruct
    public void test() {
        view(ViewerType.VIDEO, new Video());
        view(ViewerType.DOCUMENT, new Document());
        view(ViewerType.IMAGE, new Image());
    }
}
