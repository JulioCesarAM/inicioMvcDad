package dad.inicio.mvc.controller;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;

import org.apache.commons.codec.digest.DigestUtils;

import dad.inicio.mvc.model.Model;
import dad.inicio.mvc.view.View;
import javafx.event.ActionEvent;
import javafx.application.Platform;
import javafx.beans.binding.Bindings;

public class Controller {

	Model model = new Model();
	View view = new View();
	ArrayList<String> linesList = new ArrayList<>();
	BufferedReader csvReader;

	public Controller() {

		Bindings.bindBidirectional(view.getUsuarioTf().textProperty(), model.UsuarioProperty());
		view.getAccederB().setOnAction(e -> onAccederButtonAction(e));
		view.getCancelarB().setOnAction(e -> onCancelarButtonAction(e));


		try {
			String line;
			csvReader = new BufferedReader(new FileReader("users.csv", Charset.forName("UTF-8")));

			while ((line = csvReader.readLine()) != null)
				linesList.add(line);

			csvReader.close();
		} catch (IOException e) {
		}
	}

	private void onAccederButtonAction(ActionEvent a) {
		try {
			if (checkUsers())
				view.getAlertSuccess().showAndWait();
			else
				view.getAlertFailure().showAndWait();
		} catch (Exception e) {
		}
	}

	private boolean checkUsers() throws IOException {

		Boolean retorno = false;
		String md5ContraseñaIntroducida = DigestUtils.md5Hex(view.getContraseñaPF().textProperty().get()).toUpperCase();

		for (int i = 0; i < linesList.size(); i++) {
			String[] data = linesList.get(i).split(",");
			String usuario = data[0];
			String contraseña = data[1];

			if (usuario.equals(model.getUsuario()) && contraseña.equals(md5ContraseñaIntroducida)) {
				retorno = true;
				break;
			}
		}
		return retorno;
	}

	private void onCancelarButtonAction(ActionEvent e) {
		Platform.exit();
	}

	public View getView() {
		return this.view;
	}
}
