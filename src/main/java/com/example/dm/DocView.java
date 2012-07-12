package com.example.dm;

import com.vaadin.addon.touchkit.ui.NavigationView;
import com.vaadin.addon.touchkit.ui.VerticalComponentGroup;
import com.vaadin.data.Property;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;
import com.vaadin.ui.Label;

public class DocView extends NavigationView {
	public DocView(final String name, final Property doc) {
		setCaption(name);
		VerticalComponentGroup cg = new VerticalComponentGroup();
		cg.addComponent(new Label(doc, Label.CONTENT_XHTML));
		setContent(cg);
		getNavigationBar().setRightComponent(new Button("Edit", new ClickListener() {			
			public void buttonClick(ClickEvent event) {
				getNavigationManager().navigateTo(new EditorView(name,doc));
			}
		}));
	}
}
