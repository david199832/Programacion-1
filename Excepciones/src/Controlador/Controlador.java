package Controlador;
import Modelo.Mundo;
import Modelo.OlvidoInstanciarException;
public class Controlador {
	Mundo m;
	public Controlador() throws OlvidoInstanciarException
	{
		hacerDivision();
	}
	public void hacerDivision() throws OlvidoInstanciarException
	{
		try {
			m = new Mundo();
			m.dividir(5);
			throw new OlvidoInstanciarException();
		}

		finally {
			System.out.println("devuelva¨se pa fundamentos" );
		}
	}

}