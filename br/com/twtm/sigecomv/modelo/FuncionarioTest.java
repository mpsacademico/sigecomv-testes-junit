package br.com.twtm.sigecomv.modelo;

import junit.framework.TestCase;
import org.junit.Test;

public class FuncionarioTest extends TestCase{

    public FuncionarioTest() {
    }
    
    @Test
    public void testValCpfV(){        
        assertTrue(Funcionario.valCpf("43754998854"));
        assertTrue(Funcionario.valCpf("19337264749"));
        assertTrue(Funcionario.valCpf("42159270130"));
        assertTrue(Funcionario.valCpf("77568893120"));
        assertTrue(Funcionario.valCpf("35017776800"));
    }
    
    @Test
    public void testValCpfF(){
        assertFalse(Funcionario.valCpf("11111111111"));
        assertFalse(Funcionario.valCpf("22222222222"));
        assertFalse(Funcionario.valCpf("33333333333"));
        assertFalse(Funcionario.valCpf("44444444444"));
        assertFalse(Funcionario.valCpf("55555555555"));
        assertFalse(Funcionario.valCpf("41542185454"));
        assertFalse(Funcionario.valCpf("2516513215545"));
        assertFalse(Funcionario.valCpf("2516514545"));
        assertFalse(Funcionario.valCpf("2"));        
    }   
    
}
