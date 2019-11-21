public abstract class Item{
	protected int cantidad;
	protected int efecto;
	
	public Item (){
	
	}
	

	public void setCantidad(int aumento){
		this.cantidad = cantidad+aumento;
	}
	
	public int getCantidad(){
		return cantidad;
	}

	public abstract int getEfecto();
	
}