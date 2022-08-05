/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.List;
import modelo.Cliente;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mario
 */
public class ClienteControlTest {
    
    public ClienteControlTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of adicionar method, of class ClienteControl.
     */
    @Test
    public void testAdicionar() {
        System.out.println("adicionar");
        String nome = "Mario";
        String idade = "32";
        ClienteControl instance = new ClienteControl();
        instance.adicionar(nome, idade);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
        //assertEquals(idade, instance.adicionar(nome, idade));
    }

    /**
     * Test of alterar method, of class ClienteControl.
     */
//    @Test
//    public void testAlterar() {
//        System.out.println("alterar");
//        String nome = "";
//        String idade = "";
//        String id = "";
//        ClienteControl instance = new ClienteControl();
//        instance.alterar(nome, idade, id);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of deletar method, of class ClienteControl.
     */
//    @Test
//    public void testDeletar() {
//        System.out.println("deletar");
//        String query = "";
//        ClienteControl instance = new ClienteControl();
//        instance.deletar(query);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of listar method, of class ClienteControl.
     */
//    @Test
//    public void testListar() {
//        System.out.println("listar");
//        String query = "";
//        ClienteControl instance = new ClienteControl();
//        List<Cliente> expResult = null;
//        List<Cliente> result = instance.listar(query);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    
}
