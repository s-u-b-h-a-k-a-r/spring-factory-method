package com.subhakar.spring.factory;

import com.subhakar.spring.ViewerType;
import com.subhakar.spring.impl.Viewer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

@Slf4j
@Component
public class ViewerFactory {
    private Map<ViewerType, Viewer> viewerMap;

    @Autowired
    private void ViewerFactory(List<Viewer> viewers) {
        log.info(viewers.toString());
        viewerMap = viewers.stream().collect(Collectors.toUnmodifiableMap(Viewer::getType, Function.identity()));
    }

    public Viewer getViewer(ViewerType viewerType) {
        return Optional.ofNullable(viewerMap.get(viewerType)).orElseThrow(IllegalArgumentException::new);
    }
}
