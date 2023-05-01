
public class LS_Normal extends  ListaSimpleP{
    public boolean esVacia(){
        if(P==null)
            return true;
        return false;
    }
    public int nroNodos(){
        int c = 0;
        if(esVacia())
            return 0;
        else {
            Nodo R = P;
            while (R!=null){
                c++;R=R.getSig();
            }
        }
        return c;
    }
    public void mostrar(){
        System.out.println("=== listas de Personas ===");
        Nodo R = P;
        while (R!=null){
            R.getQ().mostrar();R=R.getSig();
        }
    }
    public void adiPrincipio(Persona z){
        Nodo nuevo = new Nodo();nuevo.setQ(z);nuevo.setSig(P);P=nuevo;
    }
    public void adiFinal(Persona z){
        Nodo nuevo = new Nodo();nuevo.setQ(z);
        if(esVacia())
            P = nuevo;
        else {
            Nodo R = P;
            while (R.getSig()!=null)
                R=R.getSig();
            R.setSig(nuevo);
        }
    }
    public Persona eliPrincipio(){
        Nodo x = new Nodo();
        if(!esVacia()){
            x=P;P=P.getSig();
        }
        return x.getQ();
    }
    public Persona eliFinal(){
        Nodo x = new Nodo();
        if(!esVacia()){
            if(nroNodos()==1){
                x=P;P=null;
            }else {
                Nodo R = P,S=P;
                while (R.getSig()!=null){
                    S=R;R=R.getSig();
                }
                S.setSig(null);
                x=R;
            }
        }
        return x.getQ();
    }
    public void leer1(int n){
        for (int i=1;i<=n;i++){
            Persona z = new Persona();z.leer();adiFinal(z);
        }
    }
    public void leer2(int n){
        for (int i=1;i<=n;i++){
            Persona z = new Persona();z.leer();adiPrincipio(z);
        }
    }

}
