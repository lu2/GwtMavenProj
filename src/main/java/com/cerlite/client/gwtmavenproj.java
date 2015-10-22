package com.cerlite.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;
import com.vaadin.polymer.paper.widget.PaperButton;
import com.vaadin.polymer.paper.widget.PaperTextarea;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class gwtmavenproj implements EntryPoint {

	/**
	 * This is the entry point method.
	 */
	public void onModuleLoad() {
		PaperButton button = new PaperButton("Press me!");
		PaperTextarea textarea = new PaperTextarea();
		PaperTextarea textarea2 = new PaperTextarea();
		button.setRaised(true);
		RootPanel.get().add(button);
		RootPanel.get().add(textarea);
		RootPanel.get().add(textarea2);
		textarea.setLabel("testLabel");
		textarea.setValue("test");
		textarea2.setLabel("testLabel2");
		textarea2.setValue("test2");
	}
}
