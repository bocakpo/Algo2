package animal;

public class Oso extends Animal{
    private boolean leGustaLaMiel;
    private int potenciaDeAbrazo;

    public Oso(String nombre, int edad, boolean leGustaLaMiel, int potenciaDeAbrazo){
        super(nombre, edad);
        this.setLeGustaLaMiel(leGustaLaMiel);
        this.setPotenciaDeAbrazo(potenciaDeAbrazo);
    }
    public int getPotenciaDeAbrazo() {
        return this.potenciaDeAbrazo;
    }
    public Boolean getleGustaLaMiel(){
        return this.leGustaLaMiel;
    }

    public void setLeGustaLaMiel(boolean leGustaLaMiel) {
        this.leGustaLaMiel = leGustaLaMiel;
    }

    public void setPotenciaDeAbrazo(int potenciaDeAbrazo) {
        this.potenciaDeAbrazo = potenciaDeAbrazo;
    }

    public String toString() {
        return "le gusta la miel: "+ getleGustaLaMiel() + " potencia de abrazo: "+ getPotenciaDeAbrazo();
    }
}
