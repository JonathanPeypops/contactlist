package be.vdab;

import com.vaadin.annotations.DesignRoot;

import com.vaadin.ui.Button;
import com.vaadin.ui.Panel;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.declarative.Design;

@DesignRoot
public class IndexTemp extends VerticalLayout {
    Panel menu;
    Panel content;
    Button contacts;
    Button register;
    Button login;

    public IndexTemp() {
        Design.read("index.html", this);

    }
}
