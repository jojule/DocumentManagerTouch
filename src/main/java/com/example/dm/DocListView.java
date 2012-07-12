package com.example.dm;

import java.io.File;

import com.vaadin.addon.touchkit.ui.NavigationView;
import com.vaadin.data.util.FilesystemContainer;
import com.vaadin.data.util.TextFileProperty;
import com.vaadin.event.ItemClickEvent;
import com.vaadin.event.ItemClickEvent.ItemClickListener;
import com.vaadin.ui.Table;

public class DocListView extends NavigationView {

	FilesystemContainer docs = new FilesystemContainer(new File("/tmp/docs"));
	Table docList = new Table(null, docs);

	public DocListView() {
		setContent(docList);
		setCaption("Documents");
		
		docList.setSizeFull();
		docList.setPageLength(0);
		docList.setCacheRate(0);
		
		docList.setColumnHeaderMode(Table.COLUMN_HEADER_MODE_HIDDEN);
		docList.setVisibleColumns(new Object[] {
				FilesystemContainer.PROPERTY_NAME,
				FilesystemContainer.PROPERTY_LASTMODIFIED, });
		
		docList.addListener(new ItemClickListener() {
			public void itemClick(ItemClickEvent event) {
				File f = (File) event.getItemId();
				DocView v = new DocView(f.getName(), new TextFileProperty(f));
				getNavigationManager().navigateTo(v);
			}
		});
	}
}
