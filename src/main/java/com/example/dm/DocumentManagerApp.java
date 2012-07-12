package com.example.dm;

import com.vaadin.addon.touchkit.ui.NavigationManager;
import com.vaadin.addon.touchkit.ui.TouchKitApplication;
import com.vaadin.addon.touchkit.ui.TouchKitWindow;

public class DocumentManagerApp extends TouchKitApplication
{
    public void onBrowserDetailsReady() {
    		TouchKitWindow mainWindow = new TouchKitWindow();
    		mainWindow.setCaption("Document Manager");
    		setMainWindow(mainWindow);
    		NavigationManager nm = new NavigationManager();
    		nm.setCurrentComponent(new DocListView());
    		mainWindow.setContent(nm);
    } 
}
