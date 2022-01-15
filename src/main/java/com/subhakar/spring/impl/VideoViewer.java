package com.subhakar.spring.impl;

import com.subhakar.spring.ViewerType;
import com.subhakar.spring.model.Video;
import org.springframework.stereotype.Component;

@Component
public class VideoViewer implements Viewer<Video> {
    @Override
    public ViewerType getType() {
        return ViewerType.VIDEO;
    }

    @Override
    public void view(Video video) {
        video.view();
    }
}
