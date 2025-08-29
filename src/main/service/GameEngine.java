package src.main.service;

import src.model.*;
import java.util.Random;

public class GameEngine {
  private Random random = new Random();
  private CombatService combatService = new CombatService();
  private Personagem Jogador;
  private Personagem inimigoAtual;

  Personagem [] inimigosPossiveis = {
    new Guerreiro("Artorias"),
    new Mago("Saruman"),
    new Barbaro("Conan"),
    new Feiticeiro("Gandalf"),
    new Monge("Li Shang"),
    new Paladino("Uther"),
    new Patrulheiro("Legolas")

  };

  public void iniciarJogo(String nomeJogador, int escolhaClasse){
        if(escolhaClasse == 1) Jogador = new Guerreiro(nomeJogador);
        if(escolhaClasse == 2) Jogador = new Mago(nomeJogador);
        if(escolhaClasse == 3) Jogador = new Barbaro(nomeJogador);
        if(escolhaClasse == 4) Jogador = new Feiticeiro(nomeJogador);
        if(escolhaClasse == 5) Jogador = new Monge(nomeJogador);
        if(escolhaClasse == 6) Jogador = new Paladino(nomeJogador);
        if(escolhaClasse == 7) Jogador = new Patrulheiro(nomeJogador);   

        int indice = random.nextInt(inimigosPossiveis.length);
        inimigoAtual = inimigosPossiveis[indice];

  }


   public int turnoJogador(int escolha){
    switch (escolha) {
        case 1:
            return combatService.atacarFisico(Jogador, inimigoAtual);
        case 2:
            return combatService.ataqueMagico(Jogador, inimigoAtual);
        case 3:
            return combatService.curar(Jogador, 15);
        default:
        return 0;
    }
   }
      

  public int turnoInimigo(){
    double chance = Math.random();
    if(inimigoAtual.getHp() < 15 && inimigoAtual.getPocoesDeVida() > 0 && chance < 0.3){
        return combatService.curar(inimigoAtual, 15);
    } else if(inimigoAtual.getMana() > 5 && chance < 0.7){
        return combatService.ataqueMagico(inimigoAtual, Jogador);
    } else{
        return combatService.atacarFisico(inimigoAtual, Jogador);
    }
  }

  public Personagem getJogador() { return Jogador; }
  public Personagem getInimigoAtual() { return inimigoAtual; }
}
