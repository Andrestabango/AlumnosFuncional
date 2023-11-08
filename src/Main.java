import java.util.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        List<Alumno> listaAlumno = new ArrayList<>();
        listaAlumno.add(new Alumno ("Luis", "Perez", 20));
        listaAlumno.add(new Alumno ("Ana", "Garcia", 28));
        listaAlumno.add(new Alumno ("Pablo", "Almeida", 19));
        listaAlumno.add(new Alumno ("Vinicio", "Zambrano", 22));
        listaAlumno.add(new Alumno ("Cecilia", "Ayala", 15));

        //crear un comparador

        Comparator<Alumno> comparatorNombre = Comparator.comparing(Alumno::getNombre);
        //ordena
        Collections.sort(listaAlumno,comparatorNombre);

        /*for(Alumno alumno : listaAlumno){
            System.out.println(alumno.getNombre());
        }*/


        for(Alumno alumno : listaAlumno){
            System.out.println("El nombre del alumno es: "   +alumno.getNombre());
            System.out.println("El apellido del alumno es: " +alumno.getApellido());
            System.out.println("La edad del alumno es :" +alumno.getEdad());
            System.out.println("-------------------------------------------------");
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el apellido del alumno que desea encontrar");
        String apellido1 =scanner.next();


         //casting que un objeto se convierta en otro de maner forsoza.
        Alumno alumno1= (Alumno) listaAlumno.stream()
                .filter(x ->x.getApellido()
                .equals(apellido1))
                .findAny().orElseThrow();

        System.out.println("El nombre del alumno es: "   +alumno1.getNombre());
        System.out.println("El apellido del alumno es: " +alumno1.getApellido());
        System.out.println("La edad del alumno es :" +alumno1.getEdad());
        System.out.println("-------------------------------------------");
    }
}