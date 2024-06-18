import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;


public class serializePersonBean {
    // metodo para serializar un objeto PersonBean a un archivo

    public static void serializePersonBean(PersonBean person, String fileName) {
        try (FileOutputStream fileOut = new FileOutputStream(fileName);
             ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
            out.writeObject(person);
            System.out.println("Datos serializados exitosamente, guardados en " + fileName);

        } catch (IOException i) {
            i.printStackTrace();
        }

    }

    // metodo para deserializar un objeto PersonBean desde un archivo
    public static PersonBean deserializePersonBean(String fileName) {
        PersonBean person = null;


        try (FileInputStream fileIn = new FileInputStream(fileName);
             ObjectInputStream in = new ObjectInputStream(fileIn)) {
            person = (PersonBean) in.readObject();


        } catch (IOException | ClassNotFoundException i) {
            i.printStackTrace();
        }
        return person;


    }
    public static void main(String[] args) {
        //
        PersonBean person = new PersonBean("John" , "Pereira", 30);
        PersonBean person2 = new PersonBean("Rodrigo" , "De los santos", 27);

        // nombre para el archivo donde se va a guardar el objeto serializado
        String filename001 = "PersonBean001";
        String filename002 = "PersonBean002.pb";

        //serializePersonBean(person, filename001);
        serializePersonBean(person2, filename002);

        PersonBean deserializedPerson = deserializePersonBean(filename001);
        PersonBean deserializedPerson2 = deserializePersonBean(filename002);


        // mostrar objeto deserializado
        System.out.println("Datos deserializados: " + deserializedPerson);
        System.out.println("Datos deserializados: " + deserializedPerson2);

    }
}
