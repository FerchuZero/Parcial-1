package src.juguetes;

public class Carrito implements Juguete{
    private int id;
    private String marca;
    private int numeroPuertas;
    private String color;

    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public int getId() {
        return this.id;
    }

    public Carrito(int id, String marca, int numeroPuertas, String color) {
        this.id = id;
        this.marca = marca;
        this.numeroPuertas = numeroPuertas;
        this.color = color;
    }

    public Carrito(Carrito carrito, int id){
        this.id = id;
        this.marca = carrito.marca;
        this.numeroPuertas = carrito.numeroPuertas;
        this.color = carrito.color;
    }

    public static CarritoBuilder builder(){
        return new CarritoBuilder();
    }

    public static class CarritoBuilder {
        private int id;
        private String marca;
        private int numeroPuertas;
        private String color;

        public CarritoBuilder(){
        }

        public CarritoBuilder id(int id){
            this.id = id;
            return this;
        }

        public CarritoBuilder marca(String marca){
            this.marca = marca;
            return this;
        }

        public CarritoBuilder numeroPuertas(int numeroPuertas){
            this.numeroPuertas = numeroPuertas;
            return this;
        }

        public CarritoBuilder color(String color){
            this.color = color;
            return this;
        }

        public Carrito build(){
            return new Carrito(id, marca, numeroPuertas, color);
        }

    }

    public Carrito clone(int id){
        return new Carrito(this, id);
    }
    
    @Override
    public String toString() {
        return String.format("Carrito: Id: %3d | Marca: %15s | Número de Puertas: %3d | Color: %10s",
                             this.id, this.marca, this.numeroPuertas, this.color);
    }

    public void setId(int id) {
        this.id = id;
    }
    
}
