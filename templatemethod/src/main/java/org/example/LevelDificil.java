package org.example;

public class LevelDificil extends Level{
    @Override
    public String verificarPassagemLevelBonus() {
        if(this.calcularScore() >= 3000){
            return "Level bônus!";
        }
        else {
            return "Sem pontuação suficiente para level bônus.";
        }
    }

    @Override
    public String getTipo() {
        return "Level Difícil";
    }



}
