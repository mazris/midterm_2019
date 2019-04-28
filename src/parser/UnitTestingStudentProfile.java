package parser;

import org.testng.Assert;

public class UnitTestingStudentProfile {
    public static void main(String[] args) {
        //Apply Unit Test into all the methods in this package.
        Student student = new Student("Ibrahim","Khan","89","123");

        Assert.assertEquals(student.getFirstName(),"Ibrahim");
    }
}
