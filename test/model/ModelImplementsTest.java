/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package model;


import org.junit.Test;
import static org.junit.Assert.*;
/**
 *
 * @author DarkD
 */
public class ModelImplementsTest {

    private ModelImplements model = new ModelImplements();
    /**
     * Test of getSaludo method, of class ImplementationFile.
     */
    @Test
    public void getGreetingTest() {
        System.out.println("test GetGreetingDATABASE");
        String result = model.getGreeting();
        assertEquals("Hola Mundo by DATABASE", result);
        System.out.println("test getSaludoFileTest success");

    }

}
