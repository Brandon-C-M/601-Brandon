package  {
	
	import flash.display.MovieClip;
	import flash.events.Event;
	
	//Definicion de la clase
	public class setup1 extends MovieClip {
		//iNSTANCIAR OBJETOS
		private var Fondo_new: fondo = new fondo();		
		private var Piso_new: piso = new piso();
		static var Protagonista_new: protagonista = new protagonista();
		private var Anta_new: anta = new anta();
		static var puntos: Number=0;
		static var puntos_box_new: puntos_box = new puntos_box();
		
		//metodo constructor
		public function setup1() {
			// constructor code
			addChild( Fondo_new ); 
			addChild( Piso_new );
			addChild( Protagonista_new );
			addChild( Anta_new );
			addChild ( puntos_box_new);
			
			puntos_box_new.x=50;
			puntos_box_new.y=50;
			puntos_box_new.puntostxt.text= String(puntos); 
			
			Fondo_new.y=200;
			Fondo_new.x=275;
			
			Piso_new.y=385;
			Piso_new.x=275;
			
			Protagonista_new.y=315;
			Protagonista_new.x=275;
			
			Anta_new.y=50;
			Anta_new.x=275;
			
			this.addEventListener(Event.ENTER_FRAME, actualiza_puntos);
				
			
		}
		public function actualiza_puntos (e:Event){
			 puntos_box_new.puntostxt.text = String(puntos);
			}
	}
	
}
