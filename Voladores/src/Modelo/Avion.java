package Modelo;



public abstract class Avion  extends Vehiculo implements Volador{

	protected String matricula;
	
	public Avion(String propietario, String matricula) {
		super.propietario=propietario;
		this.matricula= matricula;
	}
	
	public String darMatricula() {
		return matricula;
	}

	public String tomarVuelo() {
		
		return " vuelo"+"\n";
	}

	@Override
	public String aterrizar() {
	
		return " aterrizar"+"\n";
	}

	@Override
	public String volar() {
		// TODO Auto-generated method stub
		return "volar a grandes alturas"+"\n";
	}

	@Override
	public String darpropietario() {
		return  "el dueño es "+ propietario+ "y la placa es "+matricula;
		
	}

	public String darDatos() {
		return darpropietario()+"\n"+tomarVuelo()+volar()+aterrizar();
	}
}