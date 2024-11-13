public class Boletin5Ejercicio14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Creamos las dos tablas con los números de la primitiva
        int[] apuesta = new int [6];
        int [] combinacion = new int [6];
        
        //Introducimos los números de la apuesta
        System.out.println("Introduce los números de tu apuesta:");
        apuesta= rellenaTabla(apuesta);
        
        //Introducimos los números de la combinación ganadora
        System.out.println("Introduce los números de la combinación ganadora:");
        combinacion=rellenaTabla(combinacion);
        
        //Ordenamos y mostramos ambas
        Arrays.sort(apuesta);
        Arrays.sort(combinacion);
        
        System.out.println("Apuesta: " + Arrays.toString(apuesta));
        System.out.println("Combinación ganadora: " + Arrays.toString(combinacion));
        
        //Contabilizamos  y mostramos el número de aciertos:
        int aciertos=cuentaAciertos(apuesta, combinacion);
        System.out.println("Número de aciertos: " + aciertos); 
    }
    
    public static int [] rellenaTabla (int tabla[]){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < tabla.length; i++) {
        tabla[i]=sc.nextInt();
        }
        return tabla;
    }

    public static int cuentaAciertos (int apuesta[], int combinacion[]){
        int aciertos=0;
        for (int i = 0; i < apuesta.length; i++) {
            for (int j = 0; j < combinacion.length; j++) {
                if(apuesta[i]==combinacion[j]){
                    aciertos++;
                }
            }
        }
        return aciertos;
    }

}
