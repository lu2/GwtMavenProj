package com.cerlite.client.view;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;
import com.vaadin.polymer.paper.widget.PaperTextarea;

public class Main extends Composite {

	private static MainUiBinder uiBinder = GWT.create(MainUiBinder.class);

	interface MainUiBinder extends UiBinder<Widget, Main> {
	}
	
	@UiField 
	PaperTextarea textarea1;
	@UiField 
	PaperTextarea textarea2;

	public Main() {
		initWidget(uiBinder.createAndBindUi(this));
		textarea1.setValue("testvalue");
		textarea1.setLabel("testlabel");
		textarea2.setValue("testvalue2");
		textarea2.setLabel("testlabel2");
	}

}
