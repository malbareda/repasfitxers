import java.io.Serializable;

public class LuisSeFuerte extends PP implements Serializable {

	boolean corrupto;
	String caja;
	String oficio;
	int edad;
	Sobres sob;
	int a�osDeCarcel;
	
	public LuisSeFuerte(int edad, Sobres sob, int a�osDeCarcel) {
		this.corrupto=true;
		this.caja="B";
		this.oficio="tesorero";
		this.edad=edad;
		this.sob=sob;
		this.a�osDeCarcel=a�osDeCarcel;
		
	}
	
	
	public String toString() {
		return oficio+" "+edad+" "+a�osDeCarcel;
	}
	
}
