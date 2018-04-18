package thread.runnable;

public class MinhaThreadRunnable implements Runnable{
	
	private String nome;
	private int tempo;
	private Thread thread;
	
	public MinhaThreadRunnable(String nome, int tempo) {
		this.nome = nome;
		this.tempo = tempo;
		thread = new Thread(this);
		thread.start();
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
