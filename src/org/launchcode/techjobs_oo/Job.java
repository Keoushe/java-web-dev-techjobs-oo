package org.launchcode.techjobs_oo;

import javax.naming.Name;
import java.lang.reflect.Field;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.
    public Job (){
//        int id = 15;
        this.id=nextId;
        nextId++;
    }
    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency){
//        int id;
        this.id=nextId;
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
        nextId++;


    }

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id;
    }


//    public boolean equals(Object object) {
//        if (this == object) return true;
//        if (object == null || getClass() != object.getClass()) return false;
//        if (!super.equals(object)) return false;
//        Job job = (Job) object;
//        return id == job.id;
//    }

    public int hashCode() {
        return java.util.Objects.hash(super.hashCode(), id);
    }

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }
    //  and id.


    public int getId() {
        return id;
    }

//    public static void main(String[] args) {
//
//
//
//    }

    @Override
    public String toString (){
        String[] fields;
        String[] fails;

        if (name.equals(" ")){
           setName("Data not available");

        }
        if(employer.getValue().equals(" ")){
            employer.setValue("Data not available");
        }
        if(location.getValue().equals(" ")){
            location.setValue("Data not available");
        }
        if(positionType.getValue().equals(" ")){
            positionType.setValue("Data not available");
        }
        if(coreCompetency.getValue().equals(" ")){
            coreCompetency.setValue("Data not available");
        }
        String outPut = "";
        outPut =
                "\n" + "ID: " + id + "\n" + "Name: " + name + "Employer: " + employer + "\n" + "Location: " + location +
                "\n" + "Position Type: " + positionType + "\n" + "Core Competency: " + coreCompetency + "\n";

        return outPut;
    }


}
