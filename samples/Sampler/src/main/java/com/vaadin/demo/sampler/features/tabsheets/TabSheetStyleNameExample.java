package com.vaadin.demo.sampler.features.tabsheets;

import com.vaadin.terminal.ThemeResource;
import com.vaadin.ui.Label;
import com.vaadin.ui.TabSheet;
import com.vaadin.ui.VerticalLayout;

public class TabSheetStyleNameExample extends VerticalLayout {
    // Icons for the table
    private static final ThemeResource icon1 = new ThemeResource(
            "../sampler/icons/action_save.gif");
    private static final ThemeResource icon2 = new ThemeResource(
            "../sampler/icons/comment_yellow.gif");
    private static final ThemeResource icon3 = new ThemeResource(
            "../sampler/icons/icon_info.gif");

    public TabSheetStyleNameExample() {
        TabSheet t = new TabSheet();

        // Tab 1 content
        VerticalLayout l1 = new VerticalLayout();
        l1.setMargin(true);
        l1.addComponent(new Label("There are no previously saved actions."));
        // Tab 2 content
        VerticalLayout l2 = new VerticalLayout();
        l2.setMargin(true);
        l2.addComponent(new Label("There are no saved notes."));
        // Tab 3 content
        VerticalLayout l3 = new VerticalLayout();
        l3.setMargin(true);
        l3.addComponent(new Label("There are currently no issues."));

        t = new TabSheet();
        t.setHeight("200px");
        t.setWidth("400px");

        t.addTab(l1, "Saved actions", icon1).setStyleName("saved");
        t.addTab(l2, "Notes", icon2).setStyleName("notes");
        t.addTab(l3, "Issues", icon3).setStyleName("issues");

        addComponent(t);
    }

}
