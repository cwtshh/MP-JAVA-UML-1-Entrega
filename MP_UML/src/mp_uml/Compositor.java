package mp_uml;

public class Compositor extends Artista{

	private boolean credit;
	
	
	public Compositor(String nomeArtista, String musicaLista, boolean credit) {
		super(nomeArtista, musicaLista);
		this.credit = credit;
		
	}
	
	
	
	// GETS E SETS CREDITOS
	
	public boolean getCreditState() {
		return credit;
		
	}
	public void setCreditState(boolean credit) {
		this.credit = credit;
	}
	

	// TO STRING
	
	public String toString() {
			return "O compositor " + this.getNomeArtista() + " compôs as músicas " + this.getMusicList() + " e seus estado de credito é " + this.credit;

	}
}
