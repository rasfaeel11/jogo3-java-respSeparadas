package src.model;

public abstract class Personagem {
  protected String nome;
  protected int hp;
  protected int mana;
  protected int forca;
  protected int inteligencia;
  protected int defesa;
  protected int danoBase;
  protected int pocoesDeVida;

  public Personagem(String nome, int hp, int mana, int forca, int inteligencia, int defesa, int danoBase,
      int pocoesDeVida) {
    this.nome = nome;
    this.hp = hp;
    this.mana = mana;
    this.forca = forca;
    this.inteligencia = inteligencia;
    this.defesa = defesa;
    this.danoBase = danoBase;
    this.pocoesDeVida = pocoesDeVida;
  }

  public void receberDano(int dano){
    this.hp -= dano;
    if(hp < 0){
      hp = 0;
    }
  }

  public boolean estaVivo(){
    boolean estaVivo = true;
    if(hp == 0){
      estaVivo = false;
    }
    return estaVivo;
  }

  public int curar(int valor){
    if(this.pocoesDeVida <= 0){
      return 0;
    }
    this.hp += valor;
    this.pocoesDeVida -= 1;
    return valor;
  }
  public void gastarMana(int valor){
    this.mana -= valor;
    if(mana < 0 ) mana = 0;
  }

public String getNome() { return nome; }
public int getHp() { return hp; }
public int getMana() { return mana; }
public int getPocoesDeVida() { return pocoesDeVida; }
public int getForca() {return forca;}
public int getDanoBase(){return danoBase; }
public int getInteligencia(){return inteligencia; }
public int getDefesa(){return defesa; }
  
}
