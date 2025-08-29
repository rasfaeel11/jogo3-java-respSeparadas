package src.main;

import src.main.service.GameEngine;
import src.main.front.ConsoleUI;

public class Main {
    public static void main(String[] args) {
        GameEngine engine = new GameEngine();
        ConsoleUI ui = new ConsoleUI(engine);
        ui.iniciar();
    }
}

