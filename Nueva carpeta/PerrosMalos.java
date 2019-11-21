public class PerrosMalos extends Personajes{
	private String img;
	public PerrosMalos(String nombre,int hp,int energia, int ataque,int defensa, String img){
		super(nombre,hp,energia,ataque,defensa);
		this.img=img;

	}
	public void setImg(String img){
				this.img=img;
			}
			public String getImg(){
				return img;
			}
}
