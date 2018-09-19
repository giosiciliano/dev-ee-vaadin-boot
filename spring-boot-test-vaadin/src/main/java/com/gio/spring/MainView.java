package com.gio.spring;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.Title;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

@SpringUI(path="/ui")
@Title("This is the title")
@Theme("valo")
public class MainView extends UI {

	@Override
	protected void init(VaadinRequest request) {
		
		VerticalLayout vLayout = new VerticalLayout();
		
		vLayout.addComponent(new Label("Welcome to spring boot with Vaadin"));
		
		Button button = new Button("Click me!");
		
		vLayout.addComponent(button);
		
		button.addClickListener(new Button.ClickListener() {

			@Override
			public void buttonClick(ClickEvent event) {
				vLayout.addComponent(new Label("Button has been clicked"));
			}	
			
		});
		
		setContent(vLayout);
		
	}
	
	
}
