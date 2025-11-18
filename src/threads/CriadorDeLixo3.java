package threads;

public class CriadorDeLixo3 extends Thread{
	int cont = 0;
	public void run() {
		while(cont < 10) {
			System.out.println("Criando um lixo do tipo 3");
			try {
				Thread.sleep(1000);
			}catch(Exception e) {
				e.getStackTrace();
			}
			cont++;
		}
	}
}
