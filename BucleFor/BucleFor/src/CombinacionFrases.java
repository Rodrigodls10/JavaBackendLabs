public class CombinacionFrases {
    public static void main(String[] args) {
        String [] sujetos = {"El gato", "La tortuga", "El caballo", "Mi suegra", "El profesor"};
        String [] verbos = {"hace" , "come" , "salta", "galopa" , "hechiza" , "dan clase"};

        for (int i= 0; i<sujetos.length; i++){
            for (int j=0; j<verbos.length; j++){
                System.out.println(sujetos[i] + " " + verbos[j]);
            }
        }
    }
}
