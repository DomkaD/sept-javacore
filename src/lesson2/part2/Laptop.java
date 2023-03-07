package lesson2.part2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Laptop extends PC{

    private String touchPad;

    public Laptop(String monitor, String cpu, String ram, String videoCard, String touchPad) {
        super(monitor, cpu, ram, videoCard);
        this.touchPad = touchPad;
    }
}
