package com.cerlite.client.view;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Widget;
import com.vaadin.polymer.paper.element.PaperTextareaElement;
import com.vaadin.polymer.paper.widget.PaperTextarea;

public class Main {

	private static MainUiBinder uiBinder = GWT.create(MainUiBinder.class);

	interface MainUiBinder extends UiBinder<Widget, Main> {
	}
	
	private final Widget widget;
	
	@UiField 
	PaperTextarea textareaWidget;
	@UiField 
	PaperTextareaElement textareaElement;

	public Main() {
		widget = uiBinder.createAndBindUi(this);
		
		textareaWidget.setValue("testvalue");
		textareaWidget.setLabel("testlabel");
		textareaElement.setValue("testvalue2");
		textareaElement.setLabel("testlabel2");
	
	}
	
	public Widget getWidget() {
		return widget;
	}


}
