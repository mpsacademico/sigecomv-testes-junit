package br.com.twtm.sigecomv.modelo;

import junit.framework.TestCase;
import org.junit.Test;

public class LoginTest extends TestCase {   

    @Test
    public void testValEmailV(){
        Login l = new Login();
        assertTrue(l.valEmail("angela.1973@outlook.com"));
        assertTrue(l.valEmail("fabiano_1969@gmail.com"));
        assertTrue(l.valEmail("pedro-_1997@hotmail.com"));
        assertTrue(l.valEmail("galileu.-_2003@uol.com"));
        assertTrue(l.valEmail("1993.juliana@yahoo.com"));
        assertTrue(l.valEmail("emerson.salomao@bol.com.br"));
        assertTrue(l.valEmail("suleika@fatecruzeiro.edu"));
    }
    
    @Test
    public void testValEmailF(){
        Login l = new Login();
        assertFalse(l.valEmail("angela*@hotmail.com"));
        assertFalse(l.valEmail("fabiano123@@yahoo.com"));
        assertFalse(l.valEmail("pedro_@outlook.corinthians"));
        assertFalse(l.valEmail("galileu12@gmail..com"));
        assertFalse(l.valEmail("juliana@uol2016.com"));
        assertFalse(l.valEmail("a@a.com"));
        assertFalse(l.valEmail(""));
    }
    
    @Test
    public void testValSenhaV(){
        Login l = new Login();
        assertTrue(l.valSenha("12345678"));        
        assertTrue(l.valSenha("1234abcd"));
        assertTrue(l.valSenha("DEUSFIEL"));
        assertTrue(l.valSenha("JIDDU200"));
    }
    
    @Test
    public void testValSenhaF(){
        Login l = new Login();
        assertFalse(l.valSenha("1234567891011"));
        assertFalse(l.valSenha("1.2.3.4.5.6.7"));
        assertFalse(l.valSenha("LaCucaracha123"));
        assertFalse(l.valSenha("The_Beatles*"));
        assertFalse(l.valSenha("Jesus"));
    }
    
    
}
