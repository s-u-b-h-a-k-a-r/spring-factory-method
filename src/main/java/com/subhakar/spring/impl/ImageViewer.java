package com.subhakar.spring.impl;

import com.subhakar.spring.ViewerType;
import com.subhakar.spring.model.Image;
import org.springframework.stereotype.Component;

@Component
public class ImageViewer implements Viewer<Image> {
    @Override
    public ViewerType getType() {
        return ViewerType.IMAGE;
    }

    @Override
    public void view(Image image) {
        image.view();
    }
}
