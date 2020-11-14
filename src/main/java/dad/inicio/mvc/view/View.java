package dad.inicio.mvc.view;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;

public class View extends GridPane{

	TextField usuario;
	PasswordField contraseña;
	Button acceder, cancelar;
	HBox hboxB;
	Alert alertSuccess, alertFailure;
	
	public View() {
	
		usuario=new TextField();
		usuario.setPromptText("Usuario");
		contraseña=new PasswordField();
		contraseña.setPromptText("Contraseña");
		acceder=new Button("Acceder");
		acceder.setDefaultButton(true);
		cancelar=new Button("Cancelar");
		

		hboxB=new HBox();
		hboxB.setSpacing(10);
		hboxB.setAlignment(Pos.CENTER);
		hboxB.setPadding(new Insets(5));
		hboxB.getChildren().addAll(acceder,cancelar);
		

		this.setPadding(new Insets(15));
		this.setHgap(35);
		this.setVgap(15);
		this.setAlignment(Pos.CENTER);
		this.addRow(0, new Label("Usuario:"),usuario);
		this.addRow(1,new Label("Contraseña:"),contraseña);
		this.addRow(2, hboxB);
		
		GridPane.setColumnSpan(hboxB, 3);
		
		

		alertSuccess = new Alert(AlertType.INFORMATION);
		alertSuccess.setTitle("Iniciar Sesión");
		alertSuccess.setHeaderText("Acceso permitido");
		alertSuccess.setContentText("Las credenciales de acceso son válidas." );		
		

		alertFailure = new Alert(AlertType.ERROR);
		alertFailure.setTitle("Iniciar Sesión");
		alertFailure.setHeaderText("Acceso denegado");
		alertFailure.setContentText("El usuario y/o la contraseña no son válidos." );	

	}

	public TextField getUsuarioTf() {
		return usuario;
	}

	public void setUsuarioTf(TextField usuarioTf) {
		this.usuario = usuarioTf;
	}

	public PasswordField getContraseñaPF() {
		return contraseña;
	}

	public void setContraseñaPF(PasswordField contraseña) {
		this.contraseña = contraseña;
	}

	public Button getAccederB() {
		return acceder;
	}

	public void setAccederB(Button accederB) {
		this.acceder = accederB;
	}

	public Button getCancelarB() {
		return cancelar;
	}

	public void setCancelarB(Button cancelarB) {
		this.cancelar = cancelarB;
	}

	public HBox getBottomHB() {
		return hboxB;
	}

	public void setBottomHB(HBox bottomHB) {
		this.hboxB = bottomHB;
	}

	public Alert getAlertSuccess() {
		return alertSuccess;
	}

	public void setAlertSuccess(Alert alertSuccess) {
		this.alertSuccess = alertSuccess;
	}

	public Alert getAlertFailure() {
		return alertFailure;
	}

	public void setAlertFailure(Alert alertFailure) {
		this.alertFailure = alertFailure;
	}

	
	
}
