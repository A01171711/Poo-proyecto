

import java.io.*;

public abstract class Habilidades{
	protected int efecto;
	
	public Habilidad (){
	
	}
	

	public void setCantidad(int aumento){
		this.cantidad = cantidad+aumento;
	}
	
	public int getCantidad(){
		return cantidad;
	}

	public abstract int getEfecto();
	
}