package lesson2.part2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PC {
    private String monitor;
    private String cpu;
    private String ram;
    private String videoCard;

}
