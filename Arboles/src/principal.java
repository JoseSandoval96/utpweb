
public class principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		arbol doc=new arbol();
		doc.crecer();
		doc.crearHojas();
		doc.fotosintesis();
		
		
		doc.canthojas="4";
		System.out.println(doc.canthojas);
		
		doc.setTipo("hoja Ovalada");
		System.out.println(doc.getTipo());
		doc.setAntiguedad("1 año");
		System.out.println(doc.getAntiguedad());
		doc.setAltura("28cm");
		System.out.println(doc.getAltura());
	}

}
