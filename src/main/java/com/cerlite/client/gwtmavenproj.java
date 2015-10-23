package com.cerlite.client;

import com.cerlite.client.view.Content;
import com.cerlite.client.view.Main;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;

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
