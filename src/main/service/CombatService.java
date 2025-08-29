package src.main.service;
import src.model.*;

import java.util.Random;

public class CombatService {
  private Random random = new Random();

  public int atacarFisico(Personagem Jogador, Personagem Alvo){
    int d20 = random.nextInt(20) + 1;
    if(d20 == 1) return 0;
    int dano = (Jogador.getDanoBase() + Jogador.getForca()) + d20 - Alvo.getDefesa();
    if(d20 == 20){
      dano *= 2;
    }
    Alvo.receberDano(dano);
    return dano;
  }
  public int ataqueMagico(Personagem Jogador, Personagem Alvo){
    if(Jogador.getMana() < 5) return 0;
    
    int d20 = random.nextInt(20) + 1;
    if(d20 == 1) return 0;
    Jogador.gastarMana(5);
    int danoMagico = (Jogador.getDanoBase() + Jogador.getInteligencia() + d20 - Alvo.getDefesa());
    if(d20 == 20) danoMagico *= 2;
    if(danoMagico < 0 ) danoMagico = 0;
    Alvo.receberDano(danoMagico);
    return danoMagico;
  }
  public int curar(Personagem personagem, int valor){
    return personagem.curar(valor);
    } 
}

