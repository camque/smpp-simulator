package com.github.camque.smpp.simulator.controllers;

import java.io.IOException;

import com.github.camque.smpp.simulator.App;

import javafx.fxml.FXML;

public class ConfigureController {

	@FXML
	private void switchToInit() throws IOException {
		App.setRoot("init");
	}

}
