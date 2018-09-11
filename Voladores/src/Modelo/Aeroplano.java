package Modelo;


public abstract class Aeroplano  extends Vehiculo implements Volador{

	protected String matricula;
	
	public Aeroplano(String dueno, String matricula) {
		super.propietario=propietario;
		this.matricula= matricula;
	}
	
	public String darMatricula() {
		return matricula;
	}
	@Override
	public String poderVuelo() {
		
		return "puede tomar vuelo"+"\n";
	}

	@Override
	public String aterrizar() {
	
		return " puede aterrizar"+"\n";
	}

	@Override
	public String volar() {
		// TODO Auto-generated method stub
		return " volar a grandes alturas"+"\n";
	}

	@Override
	public String darpropietario() {
		return  "el dueño es "+ propietario+ "y la placa es "+matricula;
		
	}

	public String darDatos() {
		return darpropietario()+"\n"+tomarVuelo()+volar()+aterrizar();
	}
}