package lesson2.part3;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Book extends Papyrus {
    private boolean cover;

    public Book(Pages pages, String title, Shrift shrift, boolean cover) {
        super(pages, title, shrift);
        this.cover = cover;
    }
}
