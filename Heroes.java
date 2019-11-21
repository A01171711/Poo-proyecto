public abstract class Heroes extends Personajes{

	public int xp;
	public Heroes(String nombre,int ataque, int defensa,int vida,int xp){
		super(nombre,ataque,defensa,vida);
		this.xp=xp;
	}
}