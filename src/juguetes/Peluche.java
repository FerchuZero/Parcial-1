package src.juguetes;

public class Peluche implements Juguete {

    private int id;
    private String materialExterior;
    private String relleno;
    private String color;

    @Override
    public int getId() {
        return this.id;
    }
    @Override
    public String getColor() {
        return this.color;
    }

    public Peluche(int id, String materialExterior, String relleno, String color){
        this.id = id;
        this.materialExterior = materialExterior;
        this.relleno = relleno;
        this.color = color;
    }

    public static PelucheBuilder builder(){
        return new PelucheBuilder();
    }

    public static class PelucheBuilder {

        private int id;
        private String materialExterior;
        private String relleno;
        private String color;

        public PelucheBuilder(){}

        public PelucheBuilder id(int id){
            this.id = id;
            return this;
        }

        public PelucheBuilder materialExterior(String materialExterior){
            this.materialExterior = materialExterior;
            return this;
        }

        public PelucheBuilder relleno(String relleno){
            this.relleno = relleno;
            return this;
        }

        public PelucheBuilder color(String color){
            this.color = this.color;
            return this;
        }

        public Peluche build(){
            return new Peluche(id, materialExterior, relleno, color);
        }

    }


}
