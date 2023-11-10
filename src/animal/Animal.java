package animal;

public class Animal {
    String nombre;
    int edad;

    public String toString(){
        return "nombre: "+ this.getNombre() + "/ edad: " +this.getEdad();
    }

    public void caminar(){
        System.out.println("soy " + this.getNombre() + " y estoy caminando");
    }

    public Animal(String nombre, int edad){
        this.setEdad(edad);
        this.setNombre(nombre);
    }
    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
