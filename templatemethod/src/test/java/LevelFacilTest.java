import org.example.LevelFacil;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LevelFacilTest {
    @Test
    public void deveRetornarLevelBonus(){
        LevelFacil level = new LevelFacil();
        level.setTempoJogador(500);
        level.setItens(3);
        assertEquals("Level bônus!", level.verificarPassagemLevelBonus());
    }

    @Test
    public void deveRetornarSemPontuacaoSuficiente(){
        LevelFacil level = new LevelFacil();
        level.setTempoJogador(500);
        level.setItens(1);
        assertEquals("Sem pontuação suficiente para level bônus.", level.verificarPassagemLevelBonus());
    }

    @Test
    public void deveRetornarInformacoes(){
        LevelFacil level = new LevelFacil();
        level.setNumero(1);
        level.setNome("Primeiro");
        level.setDuracao(5000);
        level.setTempoJogador(500);
        level.setItens(5);
        assertEquals("Level{numero=1, nome='Primeiro', duracao=5000, tempoJogador=500, itens=5}", level.getInfo());

    }


}


