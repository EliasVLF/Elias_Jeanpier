/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package vista;

import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author DarkD
 */
public class ViewFactoryTest {

    /**
     * Test of getView method, of class ViewFactory.
     */
    @Test
    public void testGetViewFx() {
        System.out.println("testGetViewFx");
        ViewImplementation vFx = new ViewImplementation();
        

        Assert.assertNotNull(vFx);
                System.out.println("testGetViewFx SUCCESS");


    }
     /**
     * Test of getView method, of class ViewFactory.
     */
    @Test
    public void testGetViewConsole() {
        System.out.println("testGetViewFx");
        ViewImplementationText vConsole = new ViewImplementationText();
        

        Assert.assertNotNull(vConsole);
                System.out.println("testGetViewConsole SUCCESS");


    }

}
