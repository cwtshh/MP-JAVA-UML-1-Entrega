package mp_uml;

public class Album {
	private String musicList;
	private String generoAlbum;
	
	public Album (String musicList, String generoAlbum) {
		this.musicList = musicList;
		this.generoAlbum = generoAlbum;
		
	}
	
	// GETS E SETS GENERO
	
	public void setAlbumGenero(String generoAlbum) {
		this.generoAlbum = generoAlbum;
	}
	
	public String getAlbumGenero() {
		return generoAlbum;
	}
	
	//GETS E SETS LISTA DE MUSICAS
	
	public void setMusicList (String musicList) {
		this.musicList = musicList;
	}
	public String getMusicList() {
		return musicList;
	}
}
