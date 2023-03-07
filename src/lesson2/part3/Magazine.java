package lesson2.part3;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Magazine extends Book {
 private boolean colorful;

    public Magazine(boolean cover, boolean colorful) {
        super(cover);
        this.colorful = colorful;
    }

    public Magazine(Pages pages, String title, Shrift shrift, boolean cover, boolean colorful) {
        super(pages, title, shrift, cover);
        this.colorful = colorful;
    }
}
