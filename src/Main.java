public class Main {
    public static void main(String[] args) {
        LS_Normal A = new LS_Normal();
        A.leer1(3);A.mostrar();

//        Nodo z = A.eliPrincipio();A.mostrar();
//        System.out.println("---- eliminiacion ----");
//        z.mostrar();
        Persona f = A.eliFinal();A.mostrar();
        System.out.println("---- eliminaccion ----");
        f.mostrar();
        System.out.println("---- agregacion ----");
        A.adiPrincipio(f);A.mostrar();



    }
}