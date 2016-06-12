package br.com.twtm.sigecomv.modelo;

import junit.framework.TestCase;
import org.junit.Test;

public class FuncionarioTest extends TestCase{

    public FuncionarioTest() {
    }
    
    @Test
    public void testValCpfV01(){        
        assertTrue(Funcionario.valCpf("43754998854"));        
    }
    
    @Test
    public void testValCpfV02(){                
        assertTrue(Funcionario.valCpf("19337264749"));        
    }
    
    @Test
    public void testValCpfV03(){       
        assertTrue(Funcionario.valCpf("42159270130"));        
    }
    
    @Test
    public void testValCpfV04(){               
        assertTrue(Funcionario.valCpf("77568893120"));        
    }
    
    @Test
    public void testValCpfV05(){       
        assertTrue(Funcionario.valCpf("35017776800"));
    }
    
    @Test
    public void testValCpfF01(){
        assertFalse(Funcionario.valCpf("11111111111"));            
    }
    
    @Test
    public void testValCpfF02(){        
        assertFalse(Funcionario.valCpf("22222222222"));             
    }   
    
    @Test
    public void testValCpfF03(){        
        assertFalse(Funcionario.valCpf("33333333333"));            
    }   
    
    @Test
    public void testValCpfF04(){        
        assertFalse(Funcionario.valCpf("44444444444"));         
    }   
    
    @Test
    public void testValCpfF05(){        
        assertFalse(Funcionario.valCpf("55555555555"));         
    }   
    
    @Test
    public void testValCpfF06(){        
        assertFalse(Funcionario.valCpf("41542185454"));           
    }   
    
    @Test
    public void testValCpfF07(){        
        assertFalse(Funcionario.valCpf("2516513215545"));         
    }   
    
    @Test
    public void testValCpfF08(){        
        assertFalse(Funcionario.valCpf("2516514545"));
    }   
    
    @Test
    public void testValCpfF09(){            
        assertFalse(Funcionario.valCpf("2"));        
    }  
    
}
