public class Main {
    public static void main(String[] args) {

        // Creacion del puesto de loteria
        PuestoLoteria puesto = new PuestoLoteria();

        // Creacion de personas
        Persona persona1 = new Persona("Ana", 50);
        Persona persona2 = new Persona("Luis", 11);
        Persona persona3 = new Persona("Carlos", 100);

        // Ventas de boletos
        puesto.venderBoleto(persona1);
        puesto.venderBoleto(persona2);
        puesto.venderBoleto(persona3);

        // Determinacion del ganador
        puesto.determinarGanador(persona1, persona2, persona3);
    }
}