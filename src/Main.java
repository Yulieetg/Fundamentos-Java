//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        /////////////////////////////////
        // TIPOS DE DATOS EN JAVA
        /////////////////////////////////

        char caracter = 'c';
        String cadena = "false";
        cadena = "Hola :)";

        int numero = 10;
        double decimal = 15.0;
        boolean banderas = true;

        Producto yogur = new Producto(); // fresa y 8 pejecoins
        Producto yogur2 = new Producto("mango"); // mango y 8 pejecoins
        Producto yogur3 = new Producto(
                "yogurt",
                12.5,
                "rosa",
                8.0,
                "15/10/2024 ",
                100,
                "fresa",
                "alpura",
                12); // atributos completos de producto

        System.out.println(yogur.toString());
        System.out.println(yogur2.toString());
        System.out.println(yogur3.toString());

        cadena = "9";


        Persona karina = new Persona();
        System.out.println(karina.curp);

        Libro libro = new Libro();
        System.out.println(libro.titulo);

        /////////////////////////////////
        // CONDICIONALES Y CICLOS
        /////////////////////////////////
        // 10 >= 8
        // 8 <= 10
        // 10 > 8
        // 8 < 10
        // 8 == 8
        // 8 != 10

        // 2 + 2 = 4
        // 4 - 2 = 2
        // 4 * 2 = 8
        // 4 / 2 = 2
        // 4 ^ 2 = 16

        // "a" + "b" = "ab"

        String nombre = "Fili";
        boolean pregunta = nombre.equals("Fili");
        // boolean pregunta = edad > 18;
        // boolean pregunta = (2 + 2) == 4;

        if (pregunta){
            System.out.println(nombre + " es Fili");
        } else {
            System.out.println(nombre + " es distinto de Fili");
        }













    }
}