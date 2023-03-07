package lesson2.part2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Workstation extends Laptop{
    private boolean camera;

    public Workstation(String touchPad, boolean camera) {
        super(touchPad);
        this.camera = camera;
    }

    public Workstation(String monitor, String cpu, String ram, String videoCard, String touchPad, boolean camera) {
        super(monitor, cpu, ram, videoCard, touchPad);
        this.camera = camera;
    }
}
