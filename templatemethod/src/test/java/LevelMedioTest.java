import org.example.LevelMedio;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LevelMedioTest {
    @Test
    public void deveRetornarLevelBonus(){
        LevelMedio level = new LevelMedio();
        level.setTempoJogador(500);
        level.setItens(4);
        assertEquals("Level bônus!", level.verificarPassagemLevelBonus());
    }

    @Test
    public void deveRetornarSemPontuacaoSuficiente(){
        LevelMedio level = new LevelMedio();
        level.setTempoJogador(500);
        level.setItens(3);
        assertEquals("Sem pontuação suficiente para level bônus.", level.verificarPassagemLevelBonus());
    }

    @Test
    public void deveRetornarInformacoes(){
        LevelMedio level = new LevelMedio();
        level.setNumero(1);
        level.setNome("Primeiro");
        level.setDuracao(5000);
        level.setTempoJogador(500);
        level.setItens(5);
        assertEquals("Level{numero=1, nome='Primeiro', duracao=5000, tempoJogador=500, itens=5}", level.getInfo());

    }    
}
