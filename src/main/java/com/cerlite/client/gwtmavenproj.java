package com.cerlite.client;

import java.util.Arrays;

import com.cerlite.client.view.Main;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;
import com.vaadin.polymer.Polymer;
import com.vaadin.polymer.elemental.Function;
import com.vaadin.polymer.paper.element.PaperTextareaElement;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class gwtmavenproj implements EntryPoint {
	
	private Main mainView;

	/**
	 * This is the entry point method.
	 */
	public void onModuleLoad() {
		// We have to load icon sets before run application
				Polymer.importHref(
						Arrays.asList(PaperTextareaElement.SRC), 
						new Function() {
							public Object call(Object arg) {
								// The app is executed when all imports succeed.
								startApplication();
								return null;
							}
						});
		
	}

	protected void startApplication() {
		mainView = new Main();
		RootPanel.get().add(mainView.getWidget());
	}

}
