package ru.job4j.profession;

public class Doctor extends Profession {
    public Treatment treat(Patient patient) {
        Treatment test = new Treatment();
        return test.toTreat(patient);
    }
}
