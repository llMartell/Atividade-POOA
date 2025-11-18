package threads;

public class CriadorDeLixo1 extends Thread{
	int cont = 0;
	public void run() {
		while(true) {
			//Tentar usar uma thread para gerar valores aleatorios para escolher(aleatoriamente) qual tipo de lixo será gerado.
		}
//		while(cont < 10) {
//			System.out.println("Criando um lixo do tipo 1");
//			try {
//				Thread.sleep(1000);
//			}catch(Exception e) {
//				e.getStackTrace();
//			}
//			cont++;
//		}
	}
	
	public static String tipo1() {
		return "lixo plastico";
	}
	public static String tipo2() {
		return "lixo metal";
	}
	public static String tipo3() {
		return "lixo organico";
	}
	public static String tipo4() {
		return "lixo vidro";
	}
	public static String tipo5() {
		return "lixo papel";
	}
}