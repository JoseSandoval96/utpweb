package redirect;

import java.io.IOException;

import javax.faces.context.FacesContext;

public class administritaVista {

	public administritaVista() {
		// TODO Auto-generated constructor stub
	}
	public void presentarInterfaz( int interfaceId ) {
		try{
			interfaces listaInterfaces = new interfaces();
			FacesContext.getCurrentInstance().getExternalContext()
			.redirect(listaInterfaces.obtenerNombreInterfaz(interfaceId));
			} catch (IOException ex) {
				System.out.println("Error");
				}
		}
}
