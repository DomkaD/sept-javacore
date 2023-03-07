package lesson2.part4;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Developer developer = new Developer(1, "vasya", "pupkin", "dadada@gmail.com", 31, Gender.MALE, Arrays.asList(
                new Skill("java", 10),
                new Skill("js", 10),
                new Skill("c++", 10)));
        System.out.println(developer);
    }
}
