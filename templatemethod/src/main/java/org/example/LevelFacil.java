package org.example;

public class LevelFacil extends Level {
    @Override
    public String verificarPassagemLevelBonus() {
       if(this.calcularScore() >= 1000){
           return "Level bônus!";
       }
       else {
           return "Sem pontuação suficiente para level bônus.";
       }
    }
}
