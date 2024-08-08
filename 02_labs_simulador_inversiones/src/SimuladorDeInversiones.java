import java.util.Scanner;

public class SimuladorDeInversiones {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el valor del mercado actual: Recesion, estable, crecimiento. ");
        String valorDeMercado = sc.nextLine().toLowerCase().replaceAll("[^a-z]", " ").trim();

        System.out.println("Ingrese el perfil de riesgo de mercado: Bajo, Medio, Alto.");

        String perfil = sc.nextLine().toLowerCase().replaceAll("[^a-z]", " ").trim();

        String recomendacion = "";

        switch (valorDeMercado) {
            case "recesion":
                switch (perfil){
                    case "bajo": recomendacion = "Invertir en Bienes raices";
                    break;

                    case "medio": recomendacion = "Invertir en Automotoras";
                    break;

                    case "alto": recomendacion = "Invertir en deportes";

                    default: recomendacion = "Perfil de riesgo no valido";
                }break;
                case "estable":
                    switch (perfil){
                        case "bajo": recomendacion = "Invertir en Automotoras";
                        break;

                        case "medio": recomendacion = "Invertir en Bienes raices";
                        break;

                        case "alto": recomendacion = "Invertir en Deportes";

                        default: recomendacion = "Perfil de riesgo no valido";
                    }break;
                    case "crecimiento":
                        switch (perfil){
                            case "bajo": recomendacion = "Deportes";
                            break;

                            case "medio": recomendacion = "Invertir en Politica";
                            break;

                            case "alto": recomendacion = "Bienes raices";

                            default: recomendacion = "Perfil de riesgo no valido";
                        }break;
            default:recomendacion = "Estado de mercado no valido";

        }

        if(!recomendacion.contains("no valido")){
        System.out.println("Recomendacion de inversion: " + recomendacion);
        }else {
            System.out.println(recomendacion);
        }
        sc.close();




    }
}
