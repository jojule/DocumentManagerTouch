package com.example.dm;

import com.vaadin.addon.touchkit.ui.NavigationView;
import com.vaadin.data.Property;
import com.vaadin.ui.RichTextArea;

public class EditorView extends NavigationView {
	public EditorView(String name, Property doc) {
		setCaption(name);
		RichTextArea rta = new RichTextArea(null, doc);
		rta.setSizeFull();
		setContent(rta);
	}
}
