
public class Singleton{
	
	private static Singleton instance;
	
	
	
	public static synchronized Singleton getInstance() { //inserir syncronized o tempo de processamento aumenta
		
		if (instance==null) {
			instance=new Singleton();	
		}
		
		return instance;
		
	}
}
