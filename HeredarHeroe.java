import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public abstract class HeredarHeroe extends Personajes implements LosAtaques{
	private Habilidad[] habilidades;
	private Objeto[] bolsaMandado;
	private int x,y;

	public HeredarHeroe(String nombre, int hp, int ataque, int defensa, String imagen){
		super(nombre, hp, ataque, defensa);
		bolsaMandado = new Objeto[10];
		this.imagen=imagen;
	}

	public void setImg(String imagen){
		this.imager=imagen
	}
	public String getImg(){
		return imagen;
	}

	public Habilidad[] gethabilidades(){
		return habilidades;
	}

	public void sethabilidades(Habilidad[] habilidades){
		this.habilidades=habilidades;
	}

	public Objeto[] getbolsaMandado(){
		return bolsaMandado;
	}

	public void agregarObjetoaBolsa(int index){
		bolsaMandado[index]=null;
	}

	public void atacar(Personajes enemigo, Habilidad habilidad){
  	enemigo.setHp(enemigo.getHp()-(habilidad.getPuntosEspeciales()-enemigo.getDefensa()));
	}

	public void atacar(Personajes enemigo, Objeto objeto){
  	enemigo.setHp(enemigo.getHp()-(objeto.getPuntos()-enemigo.getDefensa()));
	}


}