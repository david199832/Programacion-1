package Controlador;
public class PicasYFijas {
	
public String unidades[] = {"0","4","8","9"};
	
	
	public String nombreApp = "Picas y Fijas";


	private int n1;
	private int n2;
	private int n3;
	private int n4;
	

	public PicasYFijas (int n1, int n2, int n3, int n4){

		this.n1 = n1;
		this.n2 = n2;
		this.n3 = n3;
		this.n4 = n4;
		
	}

	public String getPicasYFijas(int nd1, int nd2, int nd3, int nd4){

		int p = 0;
		int f = 0;
		
		if ((n1 == nd1) && (n2 == nd2) && (n3 == nd3)&& (n4 == nd4)){

			return ("4 FIJAS");

		}

		else {

			if (n1 == nd1){

				f = f + 1;

			}

			if (n2 == nd2){

				f = f + 1;

			}

			if (n3 == nd3){

				f = f + 1;
				

			if (n4 == nd4){

				f = f + 1;

			}

			if ((n1 == nd2) || (n1 == nd3)){

				p = p + 1;

			}

			if ((n2 == nd1) || (n2 == nd3)){

				p = p + 1;

			}

			if ((n3 == nd1) || (n3 == nd2)){

				p = p + 1;

			}
			

			if ((n4 == nd1) || (n4 == nd2)){

				p = p + 1;

			}
			if ((n4 == nd3) || (n4 == nd4)){

				p = p + 1;

			}
			if ((n4 == nd3) || (n4 == nd1)){

				p = p + 1;

			}
			
		}

		return ("Picas " + p + " Fijas " + f);
	
	}
}
	
}