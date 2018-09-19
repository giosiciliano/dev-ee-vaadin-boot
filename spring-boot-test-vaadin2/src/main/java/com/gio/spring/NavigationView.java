package com.gio.spring;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.Title;
import com.vaadin.navigator.Navigator;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.Button;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Panel;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

@SpringUI(path = "/Navigation")
@Title("Navigation View")
@Theme("valo")
public class NavigationView extends UI {

	@Override
	protected void init(VaadinRequest request) {

		VerticalLayout root = new VerticalLayout();
		
		Button firstBtn = new Button("First View");
		Button secondBtn = new Button("Second View");
		
		Panel viewContainer = new Panel();
		Navigator navi = new Navigator(this, viewContainer);
		
		navi.addView("firstView", new FirstView());
		navi.addView(SecondView.NAME, new SecondView());
		navi.addView("", new FirstView());
		
		root.addComponent(new HorizontalLayout(firstBtn, secondBtn));
		root.addComponent(viewContainer);
		
		navi.navigateTo(FirstView.NAME);
		
		firstBtn.addClickListener(event -> navi.navigateTo(FirstView.NAME));
		secondBtn.addClickListener(event -> navi.navigateTo(SecondView.NAME));
		
		setContent(root);
		
	}

}
