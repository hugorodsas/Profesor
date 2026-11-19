public class TestProfesor {
    static void main() {
        Profesor profesor = new Profesor("Javier", "Programacion", 256.50);

        System.out.println(profesor);

        profesor.setSalario(-200);
        System.out.println(profesor);
    }
}
