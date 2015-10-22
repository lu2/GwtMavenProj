package com.cerlite.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;
import com.vaadin.polymer.paper.widget.PaperButton;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class gwtmavenproj implements EntryPoint {

	/**
	 * This is the entry point method.
	 */
	public void onModuleLoad() {
		// Use Widget API to Create a <paper-button>
		PaperButton button = new PaperButton("Press me!");
		button.setRaised(true);
		RootPanel.get().add(button);
	}
}
