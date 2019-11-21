public class Sal extends Item{

	public Sal(){
		super();
	}
	
	public int getEfecto(){
		efecto = (int)(Math.random()*5)*-1;
		return efecto;
	}
}