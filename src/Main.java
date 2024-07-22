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

        if (pregunta) {
            System.out.println(nombre + " es Fili");
        } else {
            System.out.println(nombre + " es distinto de Fili");
        }

        String colorFavorito = "Rosa";

        switch (colorFavorito) {
            case "Rojo":
                System.out.println("Esta seccion se ejcuta cuando el color favorito es el Rojo");
                break;
            case "Rosa":
                System.out.println("Esta seccion se ejcuta cuando el color favorito es el Rosa");
                break;
            case "Verde":
                System.out.println("Esta seccion se ejcuta cuando el color favorito es el Verde");
                break;
            default:
                break;
        }

        if (colorFavorito.equals("Rosa")) {
            System.out.println("Si es el color favorito de pepe");
        } else {
            if (colorFavorito.equals("Rojo")) {
                System.out.println("Si es el color segundo favorito de pepe");
            } else {
                if (colorFavorito.equals("Verde")) {
                    System.out.println("Si es el color tercero favorito de pepe");
                } else {
                    System.out.println("No es el el tercero color favorito de pepe");
                }
            }
        }

        if (colorFavorito.equals("Rosa")) {
            System.out.println("Si es el color favorito de pepe");
        } else if (colorFavorito.equals("Rojo")) {
            System.out.println("Si es el color segundo favorito de pepe");
        } else if (colorFavorito.equals("Verde")) {
            System.out.println("Si es el color tercero favorito de pepe");
        } else {
            System.out.println("No es el el tercero color favorito de pepe");
        }

//        switch (true) {
//            case (colorFavorito.equals("Rojo")):
//                break;
//            case (colorFavorito.equals("Rosa")):
//                break;
//            case (colorFavorito.equals("Verde")):
//                break;
//            default:
//                break;
//        }

        // ejercicio chafa y dicifil+
        System.out.println("hola usuario");
        System.out.println("ingresa opcion");
        int opcion =6;

        switch (opcion) {
            case 1:
                System.out.println("consultar saldo");
                break;
            case 2:
                System.out.println("retiro de efectivo");
                break;
            case 3:
                System.out.println("deposito");
                break;

                default:
                System.out.println("recarga telefonica");
                break;
        }


        System.out.println("Hola Usuario");
        System.out.println("ingresa coordenada");
        String coordenada = "5D";
        switch (coordenada){
            case "1D":
            case "1A":
                System.out.println("barritas");
                System.out.println("devolviendo de cambio $" + (2+2) + " MXN");
                break;
            case "2D":
                System.out.println("donitas bimbo");
                break;
            case "3D":
                System.out.println("galletas principe");
                break;

            default:
                System.out.println("pancito");
                System.out.println("coca");
                break;


        }
    }

}