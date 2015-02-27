package com.example.eventbussample;

public class CloseEvent {
	
	
	

	public CloseEvent(String buttonTitle) {
		super();
		this.buttonTitle = buttonTitle;
	}

	private String buttonTitle;

	public String getButtonTitle() {
		return buttonTitle;
	}

	public void setButtonTitle(String buttonTitle) {
		this.buttonTitle = buttonTitle;
	}

}
