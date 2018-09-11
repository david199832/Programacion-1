package Modelo;

public class Mundo {

	
	
	private SeaPlane sea;
	
	private Pajaro paj;
	private Superman sup;


	public Mundo() {
		sea= new SeaPlane("desconocida", "ooo444");
		
		paj= new Pajaro("canto");
		
	}


	public SeaPlane getSea() {
		return sea;
	}


	public void setSea(SeaPlane sea) {
		this.sea = sea;
	}


	public Pajaro getPaj() {
		return paj;
	}


	public void setPaj(Pajaro paj) {
		this.paj = paj;
	}


	public Superman getSup() {
		return sup;
	}


	public void setSup(Superman sup) {
		this.sup = sup;
	}
	
}