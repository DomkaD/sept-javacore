package lesson2.part3;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Papyrus {
   private Pages pages;
   private String title;
   private Shrift shrift;
}
