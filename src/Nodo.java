public class Nodo {
    private Persona q = new Persona();
    private Nodo sig;
    public Nodo(){
        sig = null;
    }
    public void mostrar(){
        q.mostrar();
    }

    public Persona getQ() {
        return q;
    }

    public void setQ(Persona q) {
        this.q = q;
    }

    public Nodo getSig() {
        return sig;
    }

    public void setSig(Nodo sig) {
        this.sig = sig;
    }
}
