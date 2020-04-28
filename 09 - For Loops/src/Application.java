import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {

        //for Loop
        for (int i = 0; i < 5; i++) {
            System.out.printf("The value of i is: %d\n", i);
        }

        //Exkurs Capter 34
        //List
        List<String> azubis = new ArrayList<>();
        azubis.add("One");
        azubis.add("Two");
        azubis.add("Three");
        azubis.add("Four");
        azubis.add("Five");

        //foreach with Strg + Space
        for (String string : azubis) {
            System.out.println(string);
        }

        //forEach && if conditions
        azubis.forEach(i -> {
            if (i.contains("o")) {
                System.out.println(i);
            }  
        });
        
        //Stream & filter
        azubis.stream()
        .filter(s->s.contains("e"))
        .forEach(System.out::println);

    }
}