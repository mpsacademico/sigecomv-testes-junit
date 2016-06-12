package br.com.twtm.sigecomv.modelo;

import junit.framework.TestCase;
import org.junit.Test;

public class FornecedorTest extends TestCase{
    
    public FornecedorTest() {
    }
    
    @Test
    public void testValCnpjV(){        
        assertTrue(Fornecedor.valCnpj("00688382000198"));
        assertTrue(Fornecedor.valCnpj("97879558000120"));
        assertTrue(Fornecedor.valCnpj("76446571000116"));
        assertTrue(Fornecedor.valCnpj("36715154000107"));
        assertTrue(Fornecedor.valCnpj("16505373000154"));
    }
    
    @Test
    public void testValCnpjF(){        
        assertFalse(Fornecedor.valCnpj("00688382000197"));
        assertFalse(Fornecedor.valCnpj("11111111111111"));
        assertFalse(Fornecedor.valCnpj("95587155000"));
        assertFalse(Fornecedor.valCnpj("467613340001897"));
        assertFalse(Fornecedor.valCnpj("94453382000155"));
    }
    
}
