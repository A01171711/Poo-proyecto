public class Personajes{
	private String nombre;

	private int ataque;
	private int defensa;
	private int hp;

	public Personajes(String nombre, int hp, int ataque, int defensa){
		this.nombre=nombre;
		this.hp=hp;
		this.ataque=ataque;
		this.defensa=defensa;
	}

	public void setNombre(String nombre){
		this.nombre=nombre;
	}

	public String getNombre(){
		return nombre;
	}

	public void setAtaque(int ataque){
		this.ataque=ataque;
	}

	public int getAtaque(){
		return ataque; 
	}

	public void setDefensa(int defensa){
		this.defensa = defensa;
	}
	public int getDefensa(){
		return defensa;
	}

	public void setHP(int hp){
		this.hp=hp;
	}

	public int getHP(){
		return hp;
	}
}