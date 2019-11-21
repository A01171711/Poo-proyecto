 import javafx.scene.image.Image;
 import javafx.scene.image.ImageView;
public abstract class PerrosSuper extends Personajes implements AtaquesInterface{
  private Habilidad[] habilidades;
  private Objeto[] correa;
  private int x,y;
  private String img;

	public PerrosSuper(String nombre,int hp,int energia, int ataque,int defensa,int poderEspecial,String img){
		super(nombre,hp,energia,ataque,defensa);
		correa= new Objeto[10];
		this.img=img;
	}

public void setImg(String img){
			this.img=img;
		}
		public String getImg(){
			return img;
		}


	public Habilidad[] getHabilidades(){
		return habilidades;
	}

	public void setHabilidades(Habilidad[] habilidades){
		this.habilidades=habilidades;
	}

	public Objeto[] getCorrea(){
		return correa;
	}

	public void addObjetoToCorrea(Objeto o, int index){
		correa[index]=o;
	}

	public void removeObjetoFromCorrea(int index){
		correa[index]=null;
	}

	public String imprimeInventario(){
		String resultado="Correa: [";
		for(int i=0;i<correa.length;i++){
			if(correa[i]!=null){
			resultado= resultado+" Objeto: "
				+correa[i].getNombre()
				+" puntos: "+ correa[i].getPuntos()+",";
			}else{
				resultado= resultado+" Vacio ,";
			}
		}
		resultado= resultado+"]";
		return resultado;
	}
	public String imprimeHabilidades(){
		String resultado="Habilidades: [";
		for(int i=0;i<habilidades.length;i++){

			resultado= resultado+" Habilidad: "
				+habilidades[i].getNombre()
				+" puntos: "+ habilidades[i].getPuntosEspeciales()+",";

		}
		resultado= resultado+"]";
		return resultado;
	}
  public void atacar(Personajes enemigo, Habilidad habilidad){
  enemigo.setHp(enemigo.getHp()-(habilidad.getPuntosEspeciales()-enemigo.getDefensa()));
}
public void atacar(Personajes enemigo, Objeto objeto){
  enemigo.setHp(enemigo.getHp()-(objeto.getPuntos()-enemigo.getDefensa()));
}
public void vida(PerrosSuper perrosSuper){
perrosSuper.setHp(perrosSuper.getHp()+200+(int)(Math.random() * 50 + 1));
}
public void setX(int x){
		this.x=x;
	}

	public int getX(){
		return x;
	}
	public void setY(int y){
		this.y=y;
	}

	public int getY(){
		return y;
	}
}
