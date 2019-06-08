package Observer;

public interface Sujeito {
	
	public void registraObservador(Observador o);
	
	public void removeObservador(Observador o);
	
	public void notificarObservadores();

}
