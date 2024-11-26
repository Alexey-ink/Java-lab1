package ru.spbstu.telematics.java;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import static ru.spbstu.telematics.java.App.det;

public class AppTest 
    extends TestCase
{
    public AppTest(String testName) {
        super( testName );
    }

    public static Test suite(){
        return new TestSuite( AppTest.class );
    }

    public void testDet1(){
        
        int matrix[][] = {
            {2, 1},
            {4, 5}
        };

        int resultingDet = det(matrix);
        int expectedDet = 6;
        assertEquals(expectedDet, resultingDet);
    }

    public void testDet2(){

        int matrix[][] = {
            {3, 0, -4},
            {-2, 3, 5}, 
            {1, 4, -3}
        };

        int resultingDet = det(matrix);
        int expectedDet = -43;
        assertEquals(expectedDet, resultingDet);
    }

    public void testDet3(){

        int matrix[][] = {
            {-2, 3, -8, -10},
            {4, -1, 5, 9}, 
            {7, 4, 2, 8},
            {3, 5, 6, -17}
        };

        int resultingDet = det(matrix);
        int expectedDet = 1385;
        assertEquals(expectedDet, resultingDet);
    }

    public void testDet4(){

        int matrix[][] = {
            {1, 2, 3},
            {4, -1, 5}, 
            {1, 2, 3}
        };

        int resultingDet = det(matrix);
        int expectedDet = 0;
        assertEquals(expectedDet, resultingDet);
    }
}
