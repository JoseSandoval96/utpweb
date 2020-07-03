
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean (name="dinamica")
@RequestScoped
public class navegacion {

	public String papa () {
		return "papa";
	}
	public String mama () {
		return "mama";
	}
	public String hermana () {
		return "hermanos";
	}
	
	
	
	public navegacion() {
		// TODO Auto-generated constructor stub
	}

}
