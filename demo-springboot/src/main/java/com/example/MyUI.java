package com.example;


import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;

@SpringUI
public class MyUI extends UI {

    @Override
    protected void init(VaadinRequest vaadinRequest) {
        Label label = new Label("Hello world!!!!");
        setContent(label);
    }
}
