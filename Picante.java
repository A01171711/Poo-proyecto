public class Picante extends Item{

	public Picante(){
		super();
	}
	
	public int getEfecto(){
		efecto = (int)(Math.random()*3);
		return efecto;
	}
}