public class RoboVida extends Habilidades{

	public Robovia(){
		super();
	}
	
	public int getEfecto(){
		efecto = (int)(Math.random()*3)*-1;
		return efecto;
	}
}