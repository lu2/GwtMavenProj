package com.cerlite.client.view;

import com.cerlite.client.gwtmavenproj;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.Widget;
import com.vaadin.polymer.elemental.Event;
import com.vaadin.polymer.elemental.EventListener;
import com.vaadin.polymer.paper.element.PaperButtonElement;
import com.vaadin.polymer.paper.element.PaperTextareaElement;
import com.vaadin.polymer.paper.widget.PaperButton;
import com.vaadin.polymer.paper.widget.PaperTextarea;

public class Main {

	private static MainUiBinder uiBinder = GWT.create(MainUiBinder.class);

	interface MainUiBinder extends UiBinder<Widget, Main> {
	}
	
	private final Widget widget;
	private final gwtmavenproj parent;
	
	@UiField
	HasWidgets content;
	
	@UiField 
	PaperTextareaElement textarea1;
	@UiField 
	PaperTextareaElement textarea2;
	
	@UiField
	PaperButtonElement button1;

	public Main(gwtmavenproj gwtmavenproj) {
		widget = uiBinder.createAndBindUi(this);
		parent = gwtmavenproj;
		textarea1.setValue("testvalue");
		textarea1.setLabel("testlabel");
		textarea2.setValue("testvalue2");
		textarea2.setLabel("testlabel2");
		
		button1.addEventListener("click", new EventListener() {
			
			@Override
			public void handleEvent(Event event) {
				parent.clicked();
			}
		});
	}
	
	public Widget getWidget() {
		return widget;
	}
	
	public HasWidgets getChildContent() {
		return content;
	}

}
