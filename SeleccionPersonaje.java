import javafx.stage.Stage;
import javafx.scene.layout;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.event.*;
import javafx.scene.input;

public class SeleccionPersonaje extends Scene{
	private Main main;
	public CharacacterSelection(Main main){
		super(new GridPane(), 400, 200);
		this.main = main;
		GridPane gridpane = (GridPane)super.getRoot();
		gridpane.setGridLinesVisible(true);
		Button alemania = new Button("");
		alemania.setStyle("-fx-background-image:url('Imagenes/alemania.jpg');");
		alemania.setMinHeight(95);
		alemania.setMinWidth(126);
		alemania.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>(){
		public void handle(MouseEvent e){
				HeredarHeroe hh = new Hamburguesa();
				main.setHeredarHeroe(hh);
				main.abrirJuego();

				}

			});

		Button argentina = new Button("");
		argentina.setStyle("-fx-background-image:url('Imagenes/argentina.jpg');");
		argentina.setMinHeight(95);
		argentina.setMinWidth(126);
		argentina.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>(){
		public void handle(MouseEvent e){
				HeredarHeroe hh = new Alfajor();
				main.setHeredarHeroe(hh);
				main.abrirJuego();

				}
			});

		Button espana = new Button("");
		espana.setStyle("-fx-background-image:url('Imagenes/espana.jpg');");
		espana.setMinHeight(95);
		espana.setMinWidth(126);
		espana.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>(){
		public void handle(MouseEvent e){
				HeredarHeroe hh = new Paella();
				main.setHeredarHeroe(hh);
				main.abrirJuego();

				}

			});

		Button italia = new Button("");
		italia.setStyle("-fx-background-image:url('Imagenes/italia.jpg');");
		italia.setMinHeight(95);
		italia.setMinWidth(126);
		italia.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>(){
		public void handle(MouseEvent e){
				HeredarHeroe hh = new Pizza();
				main.setHeredarHeroe(hh);
				main.abrirJuego();

				}

			});

		Button japon = new Button("");
		japon.setStyle("-fx-background-image:url('Imagenes/japon.jpg');");
		japon.setMinHeight(95);
		japon.setMinWidth(126);
		japon.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>(){
		public void handle(MouseEvent e){
				HeredarHeroe hh = new Sushi();
				main.setHeredarHeroe(hh);
				main.abrirJuego();

				}

			});

		Button mexico = new Button("");
		mexico.setStyle("-fx-background-image:url('Imagenes/mexico.jpg');");
		mexico.setMinHeight(95);
		mexico.setMinWidth(126);
		mexico.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>(){
		public void handle(MouseEvent e){
				HeredarHeroe hh = new Taco();
				main.setHeredarHeroe(hh);
				main.abrirJuego();

				}

			});

		gridpane.add(alemania, 0, 0);
		gridpane.add(argentina, 1, 0);
		gridpane.add(espana, 2, 0);
		gridpane.add(italia, 0, 1);
		gridpane.add(japon, 1, 1);
		gridpane.add(mexico, 2, 1);


	}
}