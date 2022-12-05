package mp_uml;

public class Cantor extends Artista{
	private boolean comp;
	
	public Cantor (String nomeArtista, String musicaLista, boolean comp) {
		super(nomeArtista, musicaLista);
		this.comp = comp;
		
	}
	
	//GET E SETS COMP
	
	public void setCompState(boolean comp) {
		this.comp = comp;
	}
	public boolean getCompState() {
		return comp;
	}
	
	
	// TO STRING
	
	public String toString() {
		return "O cantor " + this.getNomeArtista() + " canta nas músicas " + this.getMusicList() + " e seu estado quanto a composição é " + this.comp;
	}
	
	
}
