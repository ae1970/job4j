package ru.job4j.profession;

public class Engineer extends Profession {
    public Build toBuild(House house) {
        Build build = new Build();
        return build.building(house);
    }
}
