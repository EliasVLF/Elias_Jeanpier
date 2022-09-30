/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package model;

import org.junit.Assert;
import org.junit.Test;
import vista.ViewImplementation;

/**
 *
 * @author DarkD
 */
public class ModelFactoryTest {

    @Test
    public void modelFactoryImplementsTest() {
        System.out.println("modelFactoryImplements");
        ModelImplements modelImp = new ModelImplements();

        Assert.assertNotNull(modelImp);
        System.out.println("modelFactoryImplementsTest SUCCESS");
    }

    @Test
    public void modelFactoryImplementsFileTest() {
        System.out.println("modelFactoryImplementsFile");
        ModelImplementsFile modelImpFile = new ModelImplementsFile();

        Assert.assertNotNull(modelImpFile);
        System.out.println("modelFactoryImplementsFile SUCCESS");
    }

}
