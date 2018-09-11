package Modelo;



public abstract class Superman extends Kryptoniano implements Volador {

	private String nombre;
	
	
	public Superman(String nombre) {
		this.nombre=nombre;
	}
	@Override
	public String tomarVuelo() {
		String respuesta= "hola soy "+nombre+ "  vuelo"+"\n";
		return respuesta;
	}

	@Override
	public String aterrizar() {
		String respuesta= "hola soy super man "+"\n";
		return respuesta;
	}

	@Override
	public String volar() {
		String respuesta= " puedo volar"+"\n";
		return respuesta;
	}

	public String saltarEdificio() {
		return "hola soy "+ nombre+" puedo saltar "+"\n";
	}
	public String pararBalas() {
		return  "soy "+ nombre+" parar balas"+"\n";
	}
	@Override
	public String vulnerable() {
		return " criptonita"+"\n";
	}
	@Override
	public String comer() {
		return " ir a comer"+"\n";
		
	}
	public String darDatos() {
		return "mi nombre es "+ nombre +"."+"\n"+tomarVuelo()+aterrizar()+ volar()+saltarEdificio()+pararBalas()
		+vulnerable()+comer();
	}
}