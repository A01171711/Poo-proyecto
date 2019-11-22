public class IngExtra extends Habilidades{

	public IngExtra(){
		super();
	}
	
	public int getEfecto(){
		efecto = (int)(Math.random()*3)*-1;
		return efecto;
	}
}