package mp_uml;
import java.util.Scanner;

public class App {

	
	private static Scanner scan;

	public static void main(String[] args) {
		
		
		System.out.println("#----O que deseja cadastrar?----#");
		System.out.println("#    Opção 1 - Artista          #");
		System.out.println("#    Opção 2 - Musica           #");
		System.out.println("#    Opção 3 - Album            #");
		System.out.println("#-------------------------------#");
		
		System.out.println("Digite a opção que deseja");
		
		scan = new Scanner(System.in);
		int opcao = scan.nextInt();
		
		Musica musica2 = new Musica("Mona Lisa", "I think she got what she wanted\r\n"
				+ "Waited a week before she even responded\r\n"
				+ "We had a couple friends in common when I met her\r\n"
				+ "Wasn't worried, but I should've been", "Finneas");
		
		
		switch (opcao) {
		case 1:
			System.out.println("#------O que deseja cadastrar?------#");
			System.out.println("#    Opção 1 - Cadastrar Compositor #");
			System.out.println("#    Opção 2 - Cadastrar Cantor     #");
			System.out.println("#-----------------------------------#");
			
			System.out.println("Digite a opção que deseja");
			
			int opcao_1 = scan.nextInt();
			
			switch (opcao_1) {
			case 1:
				System.out.println("Digite o nome do compositor");
				String name_composer = scan.next();
				System.out.println("Digite as músicas deste compositor");
				String composer_music = scan.nextLine();
				scan.nextLine();
				
				System.out.println("Ele é créditado na música?");
				String isCom = scan.next();
				boolean isComposer = Boolean.getBoolean(isCom);
				
				Artista comp1 = new Compositor(name_composer, composer_music, isComposer);
				
				System.out.println(comp1.toString());
				
				break;
				
				
			case 2:
				System.out.println("Digite o nome do cantor");
				String name_singer = scan.next();
				System.out.println("Digite as músicas desse cantor");
				String singer_songs = scan.nextLine();
				scan.nextLine();
				
				System.out.println("Este artista é compositor?");
				String isCom_singer = scan.next();
				
				boolean isComp = Boolean.getBoolean(isCom_singer);
				
				Artista cantor1 = new Cantor(name_singer, singer_songs, isComp );
				
				System.out.println(cantor1.toString());
				
				break;
				
				
			}
			break;
		case 2:
			System.out.println("#------O que deseja cadastrar?------#");
			System.out.println("#  Opção 1 - Cadastrar Música       #");
			System.out.println("#  Opção 2 - Editar Música          #");
			System.out.println("#  opção 3 - Deletar Música         #");
			System.out.println("#-----------------------------------#");
			
			int opcao_2 = scan.nextInt();
			
			switch (opcao_2) {
			
			case 1:
				System.out.println("Qual o nome da música que você deseja cadastrar?");
				String musicName = scan.next();
				scan.nextLine();
				System.out.println("Digite a letra da música:");
				String musicLyric = scan.nextLine();
				System.out.println("Digite o nome do Artista da música:");
				String artistSongName = scan.next();
				
				Musica music1 = new Musica(musicName, musicLyric, artistSongName);
				
				System.out.println(music1.toString());
				
				break;
				
			case 2: 
				System.out.println("A única música cadastrada é " + musica2.getMusicName() + "Deseja edita-lá? (1 = sim, 2 = não)");
				int confirm = scan.nextInt();
				
				if (confirm == 1) {
					musica2.setMusicArtist("Finneas O' Connel");
					musica2.setMusicName("Medieval");
					musica2.setMusicLyric("It feels a little medieval, if you ask me\r\n"
							+ "Like I'm watching a sequel I've already seen\r\n"
							+ "I could tell you what happens to the new king\r\n"
							+ "When he goes out of fashion");
					
					System.out.println(musica2.toString());
					
					break;
					
					
				} else {
					System.out.println("Volte para o menu inicial!");
					
				}
				
				break;
				
				
			case 3:
				System.out.println("Ainda n sei fazer isso :(");
				
				break;
				
			}
		case 3:
			System.out.println("Função ainda não implementada");
			break;
			
			
		}
		
	}

}
