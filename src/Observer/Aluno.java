package Observer;

public class Aluno implements Observador{

	@Override
	public void tratarInformação(String texto) {
		
		System.out.println("Tratando texto A "+ texto);
	}
	
}
