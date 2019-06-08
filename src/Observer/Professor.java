package Observer;

public class Professor implements Observador{

	@Override
	public void tratarInformação(String texto) {
		
		System.out.println("Encaminhando "+ texto);
	}
	

}
