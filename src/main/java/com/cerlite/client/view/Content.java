package com.cerlite.client.view;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Widget;
import com.vaadin.polymer.paper.widget.PaperButton;
import com.vaadin.polymer.paper.widget.PaperTextarea;

public class Content {

	private static MainUiBinder uiBinder = GWT.create(MainUiBinder.class);

	interface MainUiBinder extends UiBinder<Widget, Content> {
	}
	
	private final Widget widget;
	
	@UiField 
	PaperTextarea textarea1;
	@UiField 
	PaperTextarea textarea2;
	@UiField
	PaperButton button1;

	public Content() {
		widget = uiBinder.createAndBindUi(this);
		textarea1.setValue("testvalue");
		textarea1.setLabel("testlabel");
		textarea2.setValue("testvalue2");
		textarea2.setLabel("testlabel2");
		
		button1.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				setLabel1("clickedLabel");
				setValue1("clickedValue");
			}
		});
	}
	
	public Widget getWidget() {
		return widget;
	}
	
	public void setLabel1(String label) {
		textarea1.setLabel(label);
	}
	
	public void setValue1(String value) {
		textarea1.setValue(value);
	}
	
	public void setLabel2(String label) {
		textarea2.setLabel(label);
	}
	
	public void setValue2(String value) {
		textarea2.setValue(value);
	}

}
