import org.example.Anao;
import org.example.Elfo;
import org.example.Barbaro;
import org.example.Humano;
import org.example.Raca;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class BarbaroTest {

    @Test
    public void deveRetornarValorBarbaroComAnao() {
        Raca raca = new Anao();
        Barbaro barbaro = new Barbaro(1000.0f);
        barbaro.setRaca(raca);
        assertEquals(2000.0f, barbaro.calcularValor(), 0.1f);
    }

    @Test
    public void deveRetornarValorBarbaroComElfo() {
        Raca raca = new Elfo();
        Barbaro barbaro = new Barbaro(1000.0f);
        barbaro.setRaca(raca);
        assertEquals(3000.0f, barbaro.calcularValor(), 0.1f);
    }

    @Test
    public void deveRetornarValorBarbaroComHumano() {
        Raca raca = new Humano();
        Barbaro barbaro = new Barbaro(1000.0f);
        barbaro.setRaca(raca);
        assertEquals(6000.0f, barbaro.calcularValor(), 0.1f);
    }
}
