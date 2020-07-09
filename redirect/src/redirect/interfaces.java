package redirect;

public class interfaces {
	private String interfaces[];
		
		
	public interfaces() {
		// TODO Auto-generated constructor stub
		this.interfaces=new String[5];
		this.interfaces[0]="educadores.xhtml";
		this.interfaces[1]="empleadores.xhtml";
		this.interfaces[2]="partners.xhtml";
	}
	public String obtenerNombreInterfaz(int numeroInterfaz) {
		return this.interfaces[numeroInterfaz];
	}

}
