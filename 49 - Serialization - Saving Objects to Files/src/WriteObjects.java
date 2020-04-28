import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
 
 
 
public class WriteObjects {
 
    public static void main(String[] args) {
        System.out.println("Writing objects...");
 
        Person alexa = new Person(543, "Alexa");
        Person siri = new Person(123, "Siri");
         
        System.out.println(alexa);
        System.out.println(siri);
         
        try(FileOutputStream fs = new FileOutputStream("people.bin")) {
             
            ObjectOutputStream os = new ObjectOutputStream(fs);
             
            os.writeObject(alexa);
            os.writeObject(siri);
             
            os.close();
             
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
     
    }
 
}