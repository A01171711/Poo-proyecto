public class SuperFuego extends Item{

	public SuperFuego(){
		super();
	}
	
	public int getEfecto(){
		efecto = (int)(Math.random()*3);
		return efecto;
	}
}