package com.subhakar.spring.impl;

import com.subhakar.spring.ViewerType;

public interface Viewer<T> {
    ViewerType getType();

    void view(T object);
}
