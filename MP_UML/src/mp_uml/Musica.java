package mp_uml;
public class Musica {
	private String nomeMusica;
	private String letraMusica;
	private String artista;
	
	public Musica (String nomeMusica, String letraMusica, String artista) {
		this.nomeMusica = nomeMusica;
		this.letraMusica = letraMusica;
		this.artista = artista;
	}
	
	// GETS E SETS NOME MUSICA
	
	public void setMusicName(String nomeMusica) {
		this.nomeMusica = nomeMusica;
	}
	public String getMusicName() {
		return nomeMusica;
	}
	
	// GETS E SETS LETRA MUSICA
	
	public void setMusicLyric(String letraMusica) {
		this.letraMusica = letraMusica;
	}
	public String getMusicLyric() {
		return letraMusica;
	}
	
	// GETS E SETS ARTISTA
	
	public String getMusicArtist() {
		return artista;
	}
	public void setMusicArtist(String artista) {
		this.artista = artista;
	}
	
	// TO STRING
	
	public String toString() {
		return "O nome da música é " + this.nomeMusica + " do artista " + this.artista + " e a letra e: \r\n" + this.letraMusica;
	}

}
