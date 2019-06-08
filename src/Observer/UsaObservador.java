package Observer;

public class UsaObservador {
	
	public static void main(String[] args) {
		
		SistemaAcademico unipe = new SistemaAcademico();
		Professor fujioca = new Professor();
		Professor RicRobert = new Professor();
		Aluno Arthur = new Aluno();
		Aluno Jonas = new Aluno();
		
		unipe.registraObservador(fujioca);
		unipe.setMensagem("Primeira Mensagem");
		
		unipe.registraObservador(Jonas);
		unipe.setMensagem("segunda Mensagem");
		
	}

}
