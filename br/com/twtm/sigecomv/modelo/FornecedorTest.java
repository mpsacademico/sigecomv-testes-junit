package br.com.twtm.sigecomv.modelo;

import junit.framework.TestCase;
import org.junit.Test;

public class FornecedorTest extends TestCase{
    
    public FornecedorTest() {
    }
    
    @Test
    public void testValCnpjV(){
        Fornecedor f = new Fornecedor();
        assertTrue(f.valCnpj("00688382000198"));
        assertTrue(f.valCnpj("97879558000120"));
        assertTrue(f.valCnpj("76446571000116"));
        assertTrue(f.valCnpj("36715154000107"));
        assertTrue(f.valCnpj("16505373000154"));
    }
    
    @Test
    public void testValCnpjF(){
        Fornecedor f = new Fornecedor();
        assertFalse(f.valCnpj("00688382000197"));
        assertFalse(f.valCnpj("11111111111111"));
        assertFalse(f.valCnpj("95587155000"));
        assertFalse(f.valCnpj("467613340001897"));
        assertFalse(f.valCnpj("94453382000155"));
    }
    
}
