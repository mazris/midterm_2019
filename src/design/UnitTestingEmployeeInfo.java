package design;

import org.testng.Assert;

import static org.testng.AssertJUnit.assertEquals;

public class UnitTestingEmployeeInfo {
    public static  void testBonus(){
        int salary = 10000;
        int performance =10;
        assertEquals(12000,EmployeeInfo.calculateEmployeeBonus(salary,performance));
    }
    public static void testPension(){
        int salary = 10000;
        assertEquals(1000,EmployeeInfo.calculateEmployeePension(salary));
    }
    public static void main(String[] args) {
        //Write Unit Test for all the methods has been implemented in this package.
       testBonus();
       testPension();

    }
}
