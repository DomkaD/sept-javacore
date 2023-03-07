package lesson2.part2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Ultrabook extends Laptop{
    private double weight;

    public Ultrabook(String touchPad, double weight) {
        super(touchPad);
        this.weight = weight;
    }

    public Ultrabook(String monitor, String cpu, String ram, String videoCard, String touchPad, double weight) {
        super(monitor, cpu, ram, videoCard, touchPad);
        this.weight = weight;
    }
}
