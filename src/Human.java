import java.sql.SQLOutput;
import java.util.SortedMap;

public class Human {
    private int age;
    private int yearOfBirth;
    private String name;
    private String town;
    private String job;

    public Human(int age, String name, String town, String job) {
        int currentYear = 2022;
        this.age = age;
        this.yearOfBirth = currentYear - age;
        this.name = name;
        this.town = town;
        this.job = job;
        if (this.yearOfBirth > 0 && name == "") {
            System.out.println("Привет! Меня зовут (информация не указана)" + ". Я из города " + this.town + ". " +
                    "Мой год рождения - " + this.yearOfBirth + ". Я работаю на должности " + this.job + ". Будем знакомы!");
        }
        if (this.yearOfBirth > 0 && town == "") {
            System.out.println("Привет! Меня зовут " + this.name + ". Я из города (информация не указана)" + ". " +
                    "Мой год рождения - " + this.yearOfBirth + ". Я работаю на должности " + this.job + ". Будем знакомы!");
        }
        if (this.yearOfBirth > 0 && job == "") {
            System.out.println("Привет! Меня зовут " + this.name + ". Я из города " + this.town + ". " +
                    "Мой год рождения - " + this.yearOfBirth + ". Я работаю на должности (информация не указана)" + ". Будем знакомы!");
        }
        if (this.yearOfBirth > 0 && name != "" && town != "" && job != "") {
            System.out.println("Привет! Меня зовут " + this.name + ". Я из города " + this.town + ". " +
                    "Мой год рождения - " + this.yearOfBirth + ". Я работаю на должности " + this.job + ". Будем знакомы!");
        }
        if (this.yearOfBirth <= 0 && name == "") {
            System.out.println("Привет! Меня зовут (информация не указана)" + ". Я из города " + this.town + ". " +
                    "Мой год рождения - 0" + ". Я работаю на должности " + this.job + ". Будем знакомы!");
        }
        if (this.yearOfBirth <= 0 && town == "") {
            System.out.println("Привет! Меня зовут " + this.name + ". Я из города (информация не указана)" + ". " +
                    "Мой год рождения - 0 " + ". Я работаю на должности " + this.job + ". Будем знакомы!");
        }
        if (this.yearOfBirth <= 0 && job == "") {
            System.out.println("Привет! Меня зовут " + this.name + ". Я из города " + this.town + ". " +
                    "Мой год рождения - 0 " + ". Я работаю на должности (информация не указана)" + ". Будем знакомы!");
        }
        if (this.yearOfBirth <= 0 && name != "" && town != "" && job != "") {
            System.out.println("Привет! Меня зовут " + this.name + ". Я из города " + this.town + ". " +
                    "Мой год рождения - 0" + ". Я работаю на должности " + this.job + ". Будем знакомы!");
        }
    }

    public String toString() {
        return "Привет! Меня зовут " + this.name + ". Я из города " + this.town + ". " +
                "Мой год рождения - " + this.yearOfBirth + ". Я работаю на должности " + this.job + ". Будем знакомы!";
    }
}




