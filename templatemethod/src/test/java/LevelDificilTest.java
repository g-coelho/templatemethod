import org.example.LevelDificil;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LevelDificilTest {
    @Test
    public void deveRetornarLevelBonus(){
        LevelDificil level = new LevelDificil();
        level.setTempoJogador(500);
        level.setItens(6);
        assertEquals("Level bônus!", level.verificarPassagemLevelBonus());
    }

    @Test
    public void deveRetornarSemPontuacaoSuficiente(){
        LevelDificil level = new LevelDificil();
        level.setTempoJogador(500);
        level.setItens(4);
        assertEquals("Sem pontuação suficiente para level bônus.", level.verificarPassagemLevelBonus());
    }

    @Test
    public void deveRetornarInformacoes(){
        LevelDificil level = new LevelDificil();
        level.setNumero(1);
        level.setNome("Primeiro");
        level.setDuracao(5000);
        level.setTempoJogador(500);
        level.setItens(5);
        assertEquals("Level{numero=1, nome='Primeiro', duracao=5000, tempoJogador=500, itens=5}", level.getInfo());

    }    
}
