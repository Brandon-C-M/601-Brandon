package  {
	
	import flash.display.MovieClip;
	
	//Definicion de la clase
	public class setup1 extends MovieClip {
		
		private var Fondo_new: fondo = new fondo();		
		private var Piso_new: piso = new piso();
		private var Protagonista_new: protagonista = new protagonista();
		private var Anta_new: anta = new anta();
		
		//metodo constructor
		public function setup1() {
			// constructor code
			addChild( Fondo_new ); 
			addChild( Piso_new );
			addChild( Protagonista_new );
			addChild( Anta_new );
			
			Fondo_new.y=200;
			Fondo_new.x=275;
			
			Piso_new.y=385;
			Piso_new.x=275;
			
			Protagonista_new.y=315;
			Protagonista_new.x=275;
			
			Anta_new.y=50;
			Anta_new.x=275;
			
			
		}
	}
	
}
