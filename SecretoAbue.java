public class SecretoAbue extends Item{

	public SecretoAbue(){
		super();
	}
	
	public int getEfecto(){
		efecto = (int)(Math.random()*5);
		return efecto;
	}
}