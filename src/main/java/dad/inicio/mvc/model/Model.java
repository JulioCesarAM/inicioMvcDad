package dad.inicio.mvc.model;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Model {

	StringProperty usuario = new SimpleStringProperty();
	StringProperty contraseña = new SimpleStringProperty();

	public final StringProperty UsuarioProperty() {
		return this.usuario;
	}

	public final String getUsuario() {
		return this.UsuarioProperty().get();
	}

	public final void setUsuario(final String Usuario) {
		this.UsuarioProperty().set(Usuario);
	}

	public final StringProperty ContraseñaProperty() {
		return this.contraseña;
	}

	public final String getContraseña() {
		return this.ContraseñaProperty().get();
	}

	public final void setContraseña(final String Contraseña) {
		this.ContraseñaProperty().set(Contraseña);
	}

}
