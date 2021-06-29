import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EncomendaTestes {
    @Test
    public void deveReceberEncomenda(){
        Encomenda encomenda = new Encomenda("Computador", "5Kg", "Belo Horizonte", "Juiz de Fora");
        encomenda.encaminhar();
        encomenda.receber();
        Assert.assertEquals("Recebido", encomenda.getEstado());
    }

    @Test
        public void deveExtraviarEncomenda(){
            Encomenda encomenda = new Encomenda("Computador", "5Kg", "Belo Horizonte", "Juiz de Fora");
            encomenda.extraviada();
            encomenda.receber();
            Assertions.assertEquals("Extraviado", encomenda.getEstado());
        }
}
