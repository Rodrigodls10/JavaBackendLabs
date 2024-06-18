import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class ProductBeanManager {

    public static ProductBean createProductBean() {
        //metodo para crear un objeto ProductBean usando Scanner
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el Id del producto: ");
        int productId = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Ingrese el nombre del producto: ");
        String productName = scanner.nextLine();
        scanner.nextLine();

        System.out.println("Ingrese el precio del producto: ");
        double productPrice = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Ingrese la cantidad de productos: ");
        int quantity = scanner.nextInt();
        scanner.nextLine();


        return new ProductBean(productId, productName, productPrice, quantity);
    }
    //metodos para serializar

    public static void serializeProductBean(List<ProductBean> productList, String fileName) {
        try (FileOutputStream fileOut = new FileOutputStream(fileName);
             ObjectOutputStream out = new ObjectOutputStream(fileOut)){
             out.writeObject(productList);
            System.out.println("Datos serializados exitosamente en: " + fileName);

        }catch (IOException i){
        i.printStackTrace();
        }
    }



    //metodos para deserializar
    public static List<ProductBean> deserializeProductBean(String fileName) {
        List<ProductBean> productList = null;

        try (FileInputStream filein = new FileInputStream(fileName);
             ObjectInputStream in = new ObjectInputStream(filein)) {
            productList = (List<ProductBean>) in.readObject();
            System.out.println("Datos serializados exitosamente en: " + fileName);

        } catch (IOException | ClassNotFoundException i) {
            i.printStackTrace();
        }

    return productList;
    }






    //main con el menu
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String filename = "productBean.ser";
        List<ProductBean> productList = new ArrayList<>();

        while (true) {
            System.out.println("\nMenu");
            System.out.println("1. Crear y guardar producto en la lista");
            System.out.println("2. Guardar la lista de productos");
            System.out.println("3. Abrir y mostrar la lista de productos existentes");
            System.out.println("4. Salir");
            System.out.println("ingrese el numero de la seleccion");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // crear un nuevo producto
                    ProductBean newProduct = createProductBean();
                    //serializar
                    productList.add(newProduct); //agrega al final del arreglo la nueva instancia de ProductBean
                    break;
                case 2:
                    serializeProductBean(productList, filename);
                    break;

                case 3:
                    List<ProductBean> existingProductList = deserializeProductBean(filename);
                    if (existingProductList != null) {
                        for (ProductBean product : existingProductList) { //for each
                            System.out.println("Datos deserializados:\n" + product);
                        }
                    }else {
                        System.out.println("No se pudo deserializar el producto. Verifique que el archivo existe");
                    }
                    break;
                case 4:
                    System.out.println("Saliendo del programa");
                    return;
                default:
                    System.out.println("Opcion no valida, vuelve a intentarlo");
            }
        }

    }





}

//metodos para serializar



//metodos para deserializar

//main con el menu

