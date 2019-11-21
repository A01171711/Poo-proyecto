public class Pimienta extends Item{

	public Pimienta(){
		super();
	}
	
	public int getEfecto(){
		efecto = (int)(Math.random()*3)*-1;
		return efecto;
	}
}