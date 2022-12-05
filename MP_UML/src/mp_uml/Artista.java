package mp_uml;

public abstract class Artista {
	private String nomeArtista;
	private String musicaLista;
	
	public Artista (String nomeArtista, String musicaLista) {
		this.nomeArtista = nomeArtista;
		this.musicaLista = musicaLista;
	
	}
	
	//GETS E SETS NOME ARTISTA
	
	public String getNomeArtista(){
		return nomeArtista;
	}
	public void setNomeArtista(String nomeArtista) {
		this.nomeArtista = nomeArtista;
	}
	
	// GETS E SETS LISTA DE MUSICAS
	
	public String getMusicList() {
		return musicaLista;
	}
	
	public void setMusicList(String musicaLista) {
		this.musicaLista = musicaLista;
	}

}
