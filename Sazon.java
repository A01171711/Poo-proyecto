public class Sazon extends Item{

	public Sazon(){
		super();
	}
	
	public int getEfecto(){
		efecto = (int)(Math.random()*3);
		return efecto;
	}
}