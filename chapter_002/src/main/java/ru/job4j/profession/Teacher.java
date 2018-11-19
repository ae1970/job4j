package ru.job4j.profession;

public class Teacher extends Profession {
    public Education toTeach(Student student) {
        Education teach = new Education();
        return teach.toTeach(student);
    }
}
