package com.globant.bootcamp.enums;

public enum EggColor {
	RED("(D)"), WHITE("(O)");
	
	private String consoleChar;

	EggColor(String consoleChar){
		this.consoleChar = consoleChar;
	}
	
	public String getConsoleChar() {
		return consoleChar;
	}
}
