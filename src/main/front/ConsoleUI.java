package src.main.front;

import src.main.service.GameEngine;
import java.util.Scanner;

public class ConsoleUI {
    private GameEngine engine;
    private Scanner input = new Scanner(System.in);

    public ConsoleUI(GameEngine engine) {
        this.engine = engine;
    }

    public void iniciar() {
        System.out.println("=== Bem-vindo ao Mini RPG ===");
        System.out.print("Digite seu nome: ");
        String nome = input.nextLine();

        System.out.println("Escolha sua classe: 1-Guerreiro 2-Mago 3-Barbaro 4-Feiticeiro 5-Monge 6-Paladino 7-Patrulheiro");
        int classe = input.nextInt();

        engine.iniciarJogo(nome, classe);
        System.out.println("Inimigo encontrado: " + engine.getInimigoAtual().getNome());

        while (engine.getJogador().estaVivo() && engine.getInimigoAtual().estaVivo()) {
            mostrarStatus();

            System.out.println("Escolha sua ação: 1-Ataque Físico 2-Ataque Mágico 3-Poção");
            int escolha = input.nextInt();

            int danoCausado = engine.turnoJogador(escolha);
            System.out.println("Você causou " + danoCausado + " de dano!");

            if (!engine.getInimigoAtual().estaVivo()) {
                System.out.println("Você venceu o inimigo!");
                break;
            }

            int danoRecebido = engine.turnoInimigo();
            System.out.println("Inimigo causou " + danoRecebido + " de dano!");

            if (!engine.getJogador().estaVivo()) {
                System.out.println("Você foi derrotado!");
                break;
            }
        }

        input.close();
    }

    private void mostrarStatus() {
        System.out.println("=== STATUS ===");
        System.out.println("Seu HP: " + engine.getJogador().getHp() + " | Mana: " + engine.getJogador().getMana() + " | Poções: " + engine.getJogador().getPocoesDeVida());
        System.out.println("Inimigo HP: " + engine.getInimigoAtual().getHp() + " | Mana: " + engine.getInimigoAtual().getMana() + " | Poções: " + engine.getInimigoAtual().getPocoesDeVida());
        System.out.println("==============");
    }
}
