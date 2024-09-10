package desafio4;

public enum Lista_de_Musicas {
	LISTA_MUSICA("Rebolation", "Rock", "Samba", "Pagode", "Gospel", "Xhico Moedaix");
	
	//Lembrar de dividir os Objetos do ENUM com "," e nao com ";"!!!!!!!
	
	private String musica1;
	private String musica2;
	private String musica3;
	private String musica4;
	private String musica5;
	private String musica6;
	private Lista_de_Musicas(String musica1,String musica2,String musica3,String musica4,String musica5,String musica6) {
		this.musica1 = musica1;
		this.musica2 = musica2;
		this.musica3 = musica3;
		this.musica4 = musica4;
		this.musica5 = musica5;
		this.musica6 = musica6;
	
	}
	public String getMusica1() {
		return musica1;
	}
	public void setMusica1(String musica1) {
		this.musica1 = musica1;
	}
	public String getMusica2() {
		return musica2;
	}
	public void setMusica2(String musica2) {
		this.musica2 = musica2;
	}
	public String getMusica3() {
		return musica3;
	}
	public void setMusica3(String musica3) {
		this.musica3 = musica3;
	}
	public String getMusica4() {
		return musica4;
	}
	public void setMusica4(String musica4) {
		this.musica4 = musica4;
	}
	public String getMusica5() {
		return musica5;
	}
	public void setMusica5(String musica5) {
		this.musica5 = musica5;
	}
	public String getMusica6() {
		return musica6;
	}
	public void setMusica6(String musica6) {
		this.musica6 = musica6;
	}

	
}
