package associacao;

public class Cambio {

	private int marcha;
	
	public void aumentarMarcha() {
		if (marcha < 5) {
			marcha++;
		}
	}
	
	public void reduzirMarcha() {
		if (marcha > -1) {
			marcha--;
		}
	}
	
	public int getMarcha() {
		return this.marcha;
	}
}
