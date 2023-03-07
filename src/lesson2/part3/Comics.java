package lesson2.part3;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Comics extends Book {
    private boolean sentences;

    public Comics(boolean cover, boolean sentences) {
        super(cover);
        this.sentences = sentences;
    }

    public Comics(Pages pages, String title, Shrift shrift, boolean cover, boolean sentences) {
        super(pages, title, shrift, cover);
        this.sentences = sentences;
    }
}
