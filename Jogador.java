
public abstract class Jogador {
	
	private String nome;
	private int xp;
	private int mp;
	private int hp = 100;
	private boolean envenenado;
	private int x;
	private int y;
	
	
	
	
	public Jogador() {
		super();
	
	}



	public Jogador(String nome, int xp, int hp, int x, int y) {
		super();
		this.nome = nome;
		this.xp = xp;
		this.hp = hp;

		this.x = x;
		this.y = y;
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public int getXp() {
		return xp;
	}



	public void setXp(int xp) {
		this.xp = xp;
	}



	public int getHp() {
		return hp;
	}



	public void setHp(int hp) {
		this.hp = hp;
	}



	public int getX() {
		return x;
	}



	public void setX(int x) {
		this.x = x;
	}



	public int getY() {
		return y;
	}



	public void setY(int y) {
		this.y = y;
	}



	@Override
	public String toString() {
	
		return "Jogador [nome=" + nome + ", xp=" + xp + ", mp=" + mp + ", hp=" + hp + ", eixo X=" + x + ", eixo Y=" + y + "]";
	}
	



	
	
}

