package lab3p2_hectorsabillon;

import java.util.Scanner;
import java.util.ArrayList;

public class Lab3P2_HectorSabillon {

    static Scanner sc = new Scanner(System.in);
    static ArrayList<Object> lista = new ArrayList();

    public static void main(String[] args) {
        int opcion;
        do {
            System.out.println("---MENU---"
                    + "\n1 <- Agregar Comida"
                    + "\n2 <- Agregar Bebida"
                    + "\n3 <- Modificar Productos"
                    + "\n4 <- Eliminar Producto"
                    + "\n5 <- Mostrar Productos"
                    + "\n6 <- Generar Compra"
                    + "\n7 <- Registro Compras"
                    + "\n8 <- Salida");
            opcion = sc.nextInt();
            sc.nextLine();
            switch (opcion) {
                case 1: {

                    break;
                }
                case 2: {
                    break;
                }
                case 3: {
                    break;
                }
                case 4: {
                    break;
                }
                case 5: {
                    break;
                }
                case 6: {
                    break;
                }
                case 7: {
                    break;
                }
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        } while (opcion != 8);
    }

    public static void agregarComida() {
        System.out.println("Ingrese nombre de la comida: ");
        String nombre = sc.nextLine();
        System.out.println("Ingrese precio: ");
        double precio = sc.nextDouble();
        System.out.println("Ingrese estado de la comida:"
                + "\n[0] <- Vencido"
                + "\n[1] <- Comestible");
        int a = sc.nextInt();
        boolean estado = false;
        switch (a) {
            case 0: {
                estado = false;
                Comidas comida = new Comidas(estado, precio, nombre);
                break;
            }
            case 1: {
                estado = true;
                Comidas comida = new Comidas(estado, precio, nombre);
                break;
            }
            default:
                System.out.println("Opcion no valida");
                break;
        }

    }

}
