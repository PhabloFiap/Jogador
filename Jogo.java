
public class Jogo {

	public static void main(String[] args) {
		
		var	guerreiro = new Guerreiro ("Phablo ", 5,100,6,0);
		var	mago = new Mago ("Joao", 5,100,6,0,15);
		var	dragao = new Dragao (10,10);
		var	poder = new BolaDeFogo(50,10,19);
		var	fase = new Fase ();
		fase.carregar(guerreiro);
		System.out.println(guerreiro);
		fase.carregar(mago);
		
		System.out.println(mago);
		
		
		
	}

}
