public class ejercicio2 {
    
    public static void main(String[] args) {
        
        coche micoche = new coche();
        micoche.agregarpuerta();
       
        System.out.println(micoche.puerta);

    }
    
}

class coche {
    public int puerta = 0;

    public void agregarpuerta() {
        this.puerta++;

    }
}