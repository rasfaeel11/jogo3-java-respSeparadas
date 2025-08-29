# 🎮 Mini RPG em Java  
Este é um projeto simples de RPG em turnos desenvolvido em Java, com foco em aprendizado de Programação Orientada a Objetos (POO).
O jogador pode escolher uma classe (Guerreiro ou Mago) e batalhar contra um inimigo controlado pela máquina. 
Todas as mecânicas de ataque, magia e poções são simuladas no backend, enquanto a interface de console exibe as informações e mensagens para o jogador.

## ⚔️ Funcionalidades 
Escolha de classe do jogador: Guerreiro, Mago, Bárbaro, Feiticeiro, Monge, Paladino, Patrulheiro
Sistema de batalhas em turnos (jogador x inimigo)
Ações do jogador:
Ataque físico
Ataque mágico (consome mana)
Usar item (poção de cura)
Inimigo com IA simples, que escolhe ações com base em vida, mana e chance aleatória
Sistema de crítico e falha crítica (d20 rolado em cada ataque)

📝 Mecânicas de Combate

Ataque físico: dano baseado na força do personagem + dano base.

Ataque mágico: dano baseado na inteligência + dano base e consome 5 de mana.

Poção de cura: recupera 15 de HP (limite de poções por personagem).

Crítico e falha: rolagem de D20 para calcular dano crítico ou falha no ataque.

Inimigo inteligente: escolhe atacar fisicamente, usar magia ou se curar baseado no HP, mana e chance aleatória.

| Classe      | HP | Mana | Força | Inteligência | Defesa | Dano Base | Poções de Vida | Estilo                                       |
| ----------- | -- | ---- | ----- | ------------ | ------ | --------- | -------------- | -------------------------------------------- |
| Guerreiro   | 50 | 10   | 7     | 2            | 4      | 5         | 3              | Corpo a corpo resistente, dano físico        |
| Mago        | 35 | 30   | 2     | 7            | 2      | 4         | 3              | Ataques mágicos poderosos, frágil            |
| Bárbaro     | 60 | 10   | 8     | 2            | 4      | 6         | 1              | Dano bruto, pouca magia, resistente          |
| Feiticeiro  | 35 | 40   | 2     | 8            | 2      | 4         | 2              | Magias poderosas, frágil fisicamente         |
| Monge       | 40 | 20   | 7     | 4            | 3      | 5         | 1              | Corpo a corpo ágil, ataques especiais        |
| Paladino    | 55 | 25   | 6     | 4            | 5      | 5         | 2              | Defesa sólida, suporte com cura              |
| Patrulheiro | 45 | 15   | 5     | 3            | 3      | 6         | 3              | Ataques rápidos e consistentes, baixa defesa |

## 🏗️ Estrutura do Projeto 

MiniRPG/ <br>
│ <br>
├─ 📂src/ <br>
│  ├─ 📂main/ <br>
│  │  ├─ 📜Main.java              -> Classe principal para iniciar o jogo <br>
│  │  ├─ 📂front/ <br>
│  │  │   └─ 📜ConsoleUI.java     -> Interface de console para interação <br>
│  │  └─ 📂service/ <br>
│  │      ├─ 📜GameEngine.java    -> Lógica principal do jogo (turnos, inimigos) <br>
│  │      └─ 📜CombatService.java -> Mecânicas de ataque, magia e cura <br>
│  └─ 📂model/ <br>
│      ├─ 📜Personagem.java       -> Classe abstrata com atributos e métodos básicos <br>
│      ├─ 📜Guerreiro.java <br>
│      ├─ 📜Mago.java <br>
│      ├─ 📜Barbaro.java <br>
│      ├─ 📜Feiticeiro.java <br>
│      ├─ 📜Monge.java <br>
│      ├─ 📜Paladino.java <br>
│      └─ 📜Patrulheiro.java <br>
