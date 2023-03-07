package lesson2.part3;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void Xmain(String[] args) {
        Papyrus papyrus = new Papyrus(
                new Pages(20, "12.5 px"),
                "dadadad",
                new Shrift("dadada", "13 px"));
        Book book = new Book(
                new Pages(20, "12.5 px"),
                "dadadad",
                new Shrift("dadada", "13 px"),
                true);
        Magazine magazine = new Magazine(
                new Pages(20, "12.5 px"),
                "dadadad",
                new Shrift("dadada", "13 px"),
                true, false
        );
        Comics comics = new Comics(
                new Pages(20, "12.5 px"),
                "dadadad",
                new Shrift("dadada", "13 px"),
                true,false);

        List<Papyrus> list = Arrays.asList(papyrus,book,magazine,comics);
        System.out.println(list);

    }
}
