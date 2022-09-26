package Human;

import java.util.Objects;

public class Human {
    private final String name;
    private final String town;
    private final int yearOfBirth;
    private final String job;

    public Human(String name, String town, int yearOfBirth, String job) {
        this.name = Objects.requireNonNullElse(name, "Информация не указана");
        this.town = Objects.requireNonNullElse(town, "Информация не указана");
        if (yearOfBirth >= 0) {
            this.yearOfBirth = yearOfBirth;
        } else {
            this.yearOfBirth = Math.abs(yearOfBirth);
        }
        this.job = Objects.requireNonNullElse(job, "Информация не указана");
    }

    public Human(String name, String town, String job) {
        this(name, town, 0, job);
    }

    @Override
    public String toString() {
        return "Привет! Меня зовут " + name + ". Я из города " + town + ". Я родился в " + yearOfBirth +
                ". Я работаю на должности " + job + ". Будем знакомы!";
    }
}


