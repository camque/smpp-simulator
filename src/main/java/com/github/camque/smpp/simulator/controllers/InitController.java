package com.github.camque.smpp.simulator.controllers;

import java.io.IOException;

import com.github.camque.smpp.simulator.App;

import javafx.fxml.FXML;

public class InitController {

	@FXML
	private void switchToConfigure() throws IOException {
		App.setRoot("configure");
	}

}
