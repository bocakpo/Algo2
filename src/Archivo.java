public class Archivo {
    String nombre;
    int longreg;

    void init(int r) {
        longreg = r;
    }

    public static void main(String[] args) {
        Archivo f = new Archivo();
        f.init(80);
        System.out.println("El longreg de f es: " + f.longreg);
    }
}


