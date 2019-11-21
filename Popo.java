
public class Popo extends Item{

	public Popo(){
		super();
	}
	
	public int getEfecto(){
		efecto = (int)(Math.random()*3)*-1;
		return efecto;
	}
}