package lesson2.part1;


public class Main {
    public static void main(String[] args) {
    User user = new User(
            1,"Leanne Graham",
            "Bret",
            "gtfgsufu@gmail.com",
            new Address(
                    "Kulas Light",
                    "Apt. 556",
                    "Gwenborough",
                    "987988-1331",
                    new Geo("-37.31313","81.31313")
            ),
            "131313131",
            "hildegard.org",
            new Company(
                    "Romaguera-Crona",
                    "Multi-layered client-server neural-net",
                    "harness real-time e-markets"));
        System.out.println(user);
}}
