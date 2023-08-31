package se.kth.filkle.patient;

import java.time.*;

public class patient {

    public enum Priority{
        LOW,MEDIUM,HIGH;
    }
    private final String name;
    private final String number;
    private String journal;

    private final Priority priority;

    public patient(String name, String number) {
        this.name = name;
        this.number = number;
        this.journal = "";
    }
    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }

    public String getJournal() {
        return journal;
    }

    @Override
    public String toString() {
        return "patient{" +
                "name='" + name + '\'' +
                ", number='" + number + '\'' +
                ", journal='" + journal + '\'' +
                '}';
    }
    public void writeJournal(String text){
        this.journal+=text + "("+LocalDate.now()+")";
    }
}
