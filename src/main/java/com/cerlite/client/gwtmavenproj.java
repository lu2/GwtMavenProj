package com.cerlite.client;

import java.util.Arrays;

import com.cerlite.client.view.Content;
import com.cerlite.client.view.Main;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;
import com.vaadin.polymer.Polymer;
import com.vaadin.polymer.elemental.Function;
import com.vaadin.polymer.iron.element.IronIconElement;
import com.vaadin.polymer.paper.element.PaperButtonElement;
import com.vaadin.polymer.paper.element.PaperDialogElement;
import com.vaadin.polymer.paper.element.PaperDrawerPanelElement;
import com.vaadin.polymer.paper.element.PaperHeaderPanelElement;
import com.vaadin.polymer.paper.element.PaperIconButtonElement;
import com.vaadin.polymer.paper.element.PaperIconItemElement;
import com.vaadin.polymer.paper.element.PaperMaterialElement;
import com.vaadin.polymer.paper.element.PaperRippleElement;
import com.vaadin.polymer.paper.element.PaperTextareaElement;
import com.vaadin.polymer.paper.element.PaperToolbarElement;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class gwtmavenproj implements EntryPoint {
	
	private Main mainView;
	private Content contentView;
	private Content contentView2;

	/**
	 * This is the entry point method.
	 */
	public void onModuleLoad() {
		// We have to load icon sets before run application
				Polymer.importHref(
						Arrays.asList(
								PaperTextareaElement.SRC,
								PaperButtonElement.SRC), 
						new Function() {
							public Object call(Object arg) {
								// The app is executed when all imports succeed.
								startApplication();
								return null;
							}
						});
		
	}

	protected void startApplication() {
		mainView = new Main(this);
		RootPanel.get().add(mainView.getWidget());
		
		contentView = new Content();
		contentView2 = new Content();
		
		mainView.getChildContent().add(contentView.getWidget());
		mainView.getChildContent().add(contentView2.getWidget());
		
	}

	public void clicked() {
		contentView.setLabel2("parentClickLbl");
		contentView.setValue2("parentClickVal");
		contentView2.setLabel2("parentClickLbl");
		contentView2.setValue2("parentClickVal");
	}
}
