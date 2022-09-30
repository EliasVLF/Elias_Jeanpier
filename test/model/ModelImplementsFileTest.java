/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package model;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author eliaslogacho
 */
public class ModelImplementsFileTest {

    ModelImplementsFile model = new ModelImplementsFile();

    /**
     * Test of getSaludo method, of class ImplementationFile.
     */
    @Test
    public void getSaludoFileTest() {
        System.out.println("test getSaludoFileTest");

        String result = model.getGreeting();
        assertEquals("hola by Archivo", result);
        System.out.println("test getSaludoFileTest success");

    }

}
