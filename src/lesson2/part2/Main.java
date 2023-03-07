package lesson2.part2;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        PC pc = new PC(
                "acer","Intel","ddr4","Nvidia"
        );

        Laptop laptop = new Laptop( "acer","Intel","ddr4","Nvidia", "adada"
        );

        Ultrabook ultrabook = new Ultrabook(
                "acer","Intel","ddr4","Nvidia", "adada", 1.3
        );

        Workstation workstation = new Workstation(
                "acer","Intel","ddr4","Nvidia", "adada", false
        );

        List<PC> list = Arrays.asList(pc,laptop,ultrabook,workstation);
        System.out.println(list);
    }
}
