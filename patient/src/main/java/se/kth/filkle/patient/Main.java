package se.kth.filkle.patient;


public class Main {

    public static void main(String[] args) {
        patient patient = new patient("Filip","0308243518");
        System.out.println(patient.toString());
        patient.writeJournal("Fille har blivit sjuk");
        patient.writeJournal("Fille är nu frisk");
        System.out.println(patient.toString());

    }
}