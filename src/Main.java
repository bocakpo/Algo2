import animal.Animal;
import animal.Leon;
import animal.Oso;

public class Main {
    public static void main(String[] args) {
        System.out.println("124");

        Lamparita miLampara = new Lamparita();
        miLampara.encender();
        System.out.println("¿Está prendida? " + miLampara.prendido);
        miLampara.apagar();
        System.out.println("¿Está prendida? " + miLampara.prendido);

        Animal a = new Animal("pedro", 17);
        System.out.println(a.toString());
        a.caminar();

        Leon l = new Leon("el leon juan",14, "Africa", 19);
        //l.setHabitat("Africa");
        //l.setPotenciaRugido(14);
        //l.setNombre("el leon juan");
        l.caminar();
        System.out.println(l.toString());


        Oso o = new Oso("yogi", 41, false, 19);
        System.out.println(o.toString());
        Animal o2 = new Oso("pedro", 50, false, 4);
        //System.out.println(o2.getleGustaLaMiel()); //no funciona por que o2 es la superclase y el get es de la clase
        

    }
}