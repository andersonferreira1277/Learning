package thread;

public class MinhaThead extends Thread{
	
	private String nome;
	private int tempo;
	
	public MinhaThead(String nome, int tempo) {
		this.nome = nome;
		this.tempo = tempo;
		this.start();
	}

	@Override
	public void run() {
		
		for (int i= 0; i < 30; i++) {
			System.out.println(nome+": "+i);
			try {
				Thread.sleep(tempo);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(nome+" Terminou");
	}
}
