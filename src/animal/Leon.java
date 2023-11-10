package animal;

public class Leon extends Animal{
    private String habitat;
    private int potenciaRugido;

    public Leon(String nombre, int edad, String habitat, int potenciaRugido){
        super(nombre, edad);
        this.setHabitat(habitat);
        this.setPotenciaRugido(potenciaRugido);
    }
    public String getHabitat() {
        return habitat;
    }

    public int getPotenciaRugido() {
        return potenciaRugido;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public void setPotenciaRugido(int potenciaRugido) {
        this.potenciaRugido = potenciaRugido;
    }

    public String toString(){
        return "Habitat: "+this.getHabitat()+" Potencia de rugido: "+this.getPotenciaRugido();
    }
}
