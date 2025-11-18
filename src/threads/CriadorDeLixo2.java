package threads;

public class CriadorDeLixo2 extends Thread{
	int cont = 0;
	public void run() {
		while(cont < 10) {
			System.out.println("Criando um lixo do tipo 2");
			try {
				Thread.sleep(1000);
			}catch(Exception e) {
				e.getStackTrace();
			}
			cont++;
		}
	}
}
