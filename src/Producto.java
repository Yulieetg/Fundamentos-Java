public class Producto {

    int id;
    String nombre;
    String marca;
    String color;
    String sabor;
    int cantidad;
    double volumen;
    String caducidad;
    double precio;

    Producto() {
        this.sabor = "fresa";
        this.precio = 8.0;
    }

    Producto(String sabor) {
        this.sabor = sabor;
        this.precio = 8.0;

    }

    public Producto(String nombre, double volumen, String color, double precio, String caducidad, int cantidad, String sabor, String marca, int id) {
        this.nombre = nombre;
        this.volumen = volumen;
        this.color = color;
        this.precio = precio;
        this.caducidad = caducidad;
        this.cantidad = cantidad;
        this.sabor = sabor;
        this.marca = marca;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", marca='" + marca + '\'' +
                ", color='" + color + '\'' +
                ", sabor='" + sabor + '\'' +
                ", cantidad=" + cantidad +
                ", volumen=" + volumen +
                ", caducidad='" + caducidad + '\'' +
                ", precio=" + precio +
                '}';
    }
}


