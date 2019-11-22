public class Veneno extends Habilidades{

	public Veneno(){
		super();
	}
	
	public int getEfecto(){
		efecto = (int)(Math.random()*3)*-1;
		return efecto;
	}
}