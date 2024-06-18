import java.io.Serializable;

public class PersonBean implements Serializable {
    /**
     * estructura de un java bean
     * 1) Propiedades privadas
     * 2) Metodos publicos getter y setter
     * 3) Constructor sin parametros
     * 4) Implementa la interfaz 'serializable'
     */

    // El PersonBeanes un javaBean que representa a una persona
    private static final long serialVersionUID = 1L; // evita problemas de compatibilidad

    // Propiedades privadas
    private String FirstName;
    private String LastName;
    private int Age;

    // constructor sin parametros
    public PersonBean() {}

    public PersonBean(String firstName, String lastName, int age) {
        FirstName = firstName;
        LastName = lastName;
        Age = age;
    }

    // getter y setters


    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    // metodo para mostrar la informacion de la persona
    @Override
    public String toString() {
        return "PersonBean [FirstName:" + FirstName + ", LastName:" + LastName + ", Age:" + Age + "]";
    }

}
