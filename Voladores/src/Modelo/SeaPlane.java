package Modelo;

public class SeaPlane extends Aeroplano {

	public String avistarAnimal;
	
	
	public SeaPlane(String dueno, String matricula) {
		super(dueno, matricula);
		avistarAnimal="ballenas";
		
	}

	public String darDatos() {
	return	super.darDatos()+" avistar  "+avistarAnimal;
	}

	@Override
	public String tomarVuelo() {
		// TODO Auto-generated method stub
		return null;
	}


	
}