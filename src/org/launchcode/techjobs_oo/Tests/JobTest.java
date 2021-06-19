package org.launchcode.techjobs_oo.Tests;

import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;

public class JobTest {

    @Test
    public void testSettingJobId() {
         Job job = new Job();
         Job secJob = new Job();
        assertNotEquals(secJob.getId(),job.getId(),.001);

    }

    @Test
    public void testJobConstructorSetsAllFields() {
        Job fullJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals( fullJob instanceof Job,true);
    }

    @Test
    public void testJobsForEquality(){
        Job identicalOne = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType(
                "Quality control"), new CoreCompetency("Persistence"));
        Job identicalTwo = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType(
                "Quality control"), new CoreCompetency("Persistence"));
        assertNotEquals(identicalOne.getId(),identicalTwo.getId());
    }

    @Test
    public void toStringTests(){
        Job testStringObject = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType(
                "Quality control"), new CoreCompetency("Persistence"));
        testStringObject.toString();
        char firstCharTest = testStringObject.toString().charAt(0);
        char lastCharTest = testStringObject.toString().charAt(testStringObject.toString().length()-1);



        assertTrue(firstCharTest==lastCharTest);
    }

    @Test
    public void labelTest(){
        Job testStringObject = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType(
                "Quality control"), new CoreCompetency("Persistence"));

        String outputTest =
                "\n" + "ID: " + testStringObject.getId() + "\n" + "Name: " + testStringObject.getName() + "Employer: " + testStringObject.getEmployer() +
                "\n" +
                "Location:" +
                " " + testStringObject.getLocation() +
                "\n" + "Position Type: " + testStringObject.getPositionType() + "\n" + "Core Competency: " + testStringObject.getCoreCompetency() +
                        "\n";
        assertEquals(testStringObject.toString(),outputTest);
    }

    @Test
    public void dataNotAvailable(){
        Job testStringObject = new Job(" ", new Employer(" "), new Location(" "), new PositionType(
                " "), new CoreCompetency(" "));
        String outputTest =
                "\n" + "ID: " + testStringObject.getId() + "\n" + "Name: " + "Data not available" + "Employer: " + "Data not available" +
                        "\n" +
                        "Location:" +
                        " " + "Data not available" +
                        "\n" + "Position Type: Data not available"  + "\n" +
                        "Core Competency: " + "Data not available" +
                        "\n";
        assertEquals(testStringObject.toString(),outputTest);

    }

//    @Test
//    public void toStringTesting(){
//
//    }


}
