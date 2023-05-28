package org.example;

public class LevelMedio extends Level{
    @Override
    public String verificarPassagemLevelBonus() {
        if(this.calcularScore() >= 2000){
            return "Level bônus!";
        }
        else {
            return "Sem pontuação suficiente para level bônus.";
        }
    }
}
