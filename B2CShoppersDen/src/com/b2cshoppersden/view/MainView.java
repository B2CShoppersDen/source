package com.b2cshoppersden.view;



import org.apache.log4j.Logger;

import com.b2cshoppersden.ui.ConsoleUI;

public class MainView {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Logger logger=Logger.getLogger(MainView.class.getName());
		logger.info("Main View started");
		ConsoleUI ui=new ConsoleUI();
		ui.mainMenu();
		
	}

}
