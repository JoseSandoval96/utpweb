package redirect;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class navegador {
	
	private administritaVista administrador;
	public String  metodo1(){
		return "nosotros";
	}
	public void  metodo2(){
		administrador.presentarInterfaz(2);
	}
	
	public navegador() {
		// TODO Auto-generated constructor stub
		this.administrador=new administritaVista();
	}

}
