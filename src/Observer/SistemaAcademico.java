package Observer;

import java.util.ArrayList;
import java.util.List;

public class SistemaAcademico implements Sujeito {

	private String mensagem;
	private List<Observador> lista = new ArrayList<>();

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
		notificarObservadores();
	}

	@Override
	public void registraObservador(Observador o) {
		// TODO Auto-generated method stub
		lista.add(o);
	}

	@Override
	public void removeObservador(Observador o) {
		// TODO Auto-generated method stub
		lista.remove(o);
	}

	@Override
	public void notificarObservadores() {
		for (Observador o : lista) {
			o.tratarInformação(getMensagem());
		}
	}

}
