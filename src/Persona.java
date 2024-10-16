public class Persona {

    private String nombre;
    private int dinero;
    private int boleto;

    public Persona(String nombre, int dinero){
        this.nombre = nombre;
        this.dinero = dinero;
        this.boleto = -100000;
    }

    public boolean comprarBoleto(int boleto) {
        if(this.dinero >= 20){
            this.boleto = boleto;
            System.out.println(this.nombre+" tiene boleto "+this.boleto);
            return true;
        } else {
            this.boleto = -100000;
            return false;
        }
    }

    public boolean restarDinero(int cantidad) {
        this.dinero = this.dinero - cantidad;
        if(this.dinero < 0){
            this.dinero = 0;
        }
        return true;
    }

    public int consultarDinero(){
        return this.dinero;
    }

    public void informacionPersona(){
        String mensajeSalida = "INFORMACION DE LA PERSONA:";
        mensajeSalida = mensajeSalida + "\n\tNombre: " + this.nombre;
        mensajeSalida = mensajeSalida + "\n\tdinero: " + this.dinero;
        mensajeSalida = mensajeSalida + "\n\tboleto: " + this.boleto;

        System.out.println(mensajeSalida);

    }

    public String getNombre() {
        return this.nombre;
    }

    public int getBoleto() {
        return this.boleto;
    }

    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero){
        this.dinero = dinero;
        if(this.dinero < 0){
            this.dinero = 0;
        }
    }
}
