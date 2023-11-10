public class MiClase {
    private static void main() {
        String ss;
        int i;
        int c2;
        ss = "Hola";
        i = 11;
        c2 = 65;
        System.out.println(c2);
        parametros(ss, i, c2);
        System.out.println(c2);
    }
    private static void parametros(String ss, int i, int c2){
        i++;
        System.out.println("durante "+ i);
    }

}
