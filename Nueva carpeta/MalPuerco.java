public class MalPuerco extends Habilidades{

	public MalPuerco(){
		super();
	}
	
	public int getEfecto(){
		efecto = (int)(Math.random()*3)*-1;
		return efecto;
	}
}