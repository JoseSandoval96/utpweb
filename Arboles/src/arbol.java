
public class arbol {
	String canthojas;
	private String tipo;
	private String antiguedad;
	private String altura;
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getAntiguedad() {
		return antiguedad;
	}
	public void setAntiguedad(String antiguedad) {
		this.antiguedad = antiguedad;
	}
	public String getAltura() {
		return altura;
	}
	public void setAltura(String altura) {
		this.altura = altura;
	}
	void crecer() {
		System.out.println("el arbol crece");
	}
	void crearHojas() {
		System.out.println("Tipos de Hojas");
	}
	void fotosintesis() {
		System.out.println("......");
	}
}
