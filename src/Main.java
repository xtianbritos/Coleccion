import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Persona persona1 = new Persona("Christian", "Britos", 28);
        Persona persona2 = new Persona("Juan", "Perez", 19);
        Persona persona3 = new Persona("Horacio", "Merello", 32);
        Persona persona4 = new Persona("Laura", "Ferrari", 28);

        Set<Persona> personas = new HashSet<Persona>();

        personas.add(persona1);
        personas.add(persona2);
        personas.add(persona3);
        personas.add(persona4);

        personas.forEach(persona -> System.out.println(persona.toString()));
    }
}
