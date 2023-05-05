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
                    agregarComida();
                    break;
                }
                case 2: {
                    agregarBebida();
                    break;
                }
                case 3: {
                    System.out.println("---MODIFICAR---"
                            + "\n1 <- Comida"
                            + "\n2 <- Bebida");
                    int op = sc.nextInt();
                    sc.nextLine();
                    switch (op) {
                        case 1: {
                            modComida();
                            break;
                        }
                        case 2: {
                            modBebida();
                            break;
                        }
                        default:
                            System.out.println("Opcion no valida");
                            break;
                    }
                    break;
                }
                case 4: {
                    System.out.println("---ELIMINAR---"
                            + "\n1 <- Comida"
                            + "\n2 <- Bebida");
                    int op = sc.nextInt();
                    eliminar(op);
                }
                case 5: {
                    System.out.println("---COMIDAS---");
                    listarComidas();
                    System.out.println("---BEBIDAS---");
                    listarBebidas();
                    break;
                }
                case 6: {
                    int total = 0;
                    char resp;
                    Compras compras = new Compras();
                    do {
                        System.out.println("---COMIDAS---");
                        listarComidas();
                        System.out.println("---BEBIDAS---");
                        listarBebidas();

                        System.out.println("Ingrese indice del producto a comprar: ");
                        int index = sc.nextInt();
                        System.out.println("Ingrese cantidad del producto a comprar: ");
                        int cant = sc.nextInt();
                        sc.nextLine();
                        if (cant > 0) {
                            if (lista.get(index) instanceof Comidas) {
                                total += ((Comidas) lista.get(index)).getPrecio() * cant;
                                compras.getCompras().add(lista.get(index));
                                compras.getCompras().add(cant);
                            } else if (lista.get(index) instanceof Bebidas) {
                                total += ((Bebidas) lista.get(index)).getPrecio() * cant;
                                compras.getCompras().add(lista.get(index));
                                compras.getCompras().add(cant);
                            } else {
                                System.out.println("Indice no valido");
                            }
                        } else {
                            System.out.println("La cantidad no puede ser negativa y/o cero");
                        }

                        System.out.println("Desea comprar otro producto [s/n]: ");
                        resp = sc.nextLine().charAt(0);
                    } while (resp != 'n');
                    compras.setTotal(total);
                    lista.add(compras);
                    System.out.println(compras);
                    break;
                }
                case 7: {
                    for (int i = 0; i < lista.size(); i++) {
                        if (lista.get(i) instanceof Compras) {
                            System.out.println((Compras) lista.get(i));
                        }
                    }
                    break;
                }
                case 8: {
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
        if (precio < 0) {
            System.out.println("El precio no puede ser negativo");
        } else {
            System.out.println("Ingrese estado de la comida:"
                    + "\n[0] <- Vencido"
                    + "\n[1] <- Comestible");
            int a = sc.nextInt();
            boolean estado;
            switch (a) {
                case 0: {
                    estado = false;
                    Comidas comida = new Comidas(estado, precio, nombre);
                    lista.add(comida);
                    break;
                }
                case 1: {
                    estado = true;
                    Comidas comida = new Comidas(estado, precio, nombre);
                    lista.add(comida);
                    break;
                }
                default:
                    System.out.println("Opcion no valida");
                    break;
            }

        }
    }

    public static void agregarBebida() {
        System.out.println("Ingrese nombre de la bebida: ");
        String nombre = sc.nextLine();
        System.out.println("Ingrese precio: ");
        double precio = sc.nextDouble();
        if (precio < 0) {
            System.out.println("El precio no puede ser negativo");
        } else {
            System.out.println("Ingrese tam en mL: ");
            int tam = sc.nextInt();
            if (tam > 0) {
                Bebidas bebida = new Bebidas(tam, precio, nombre);
                lista.add(bebida);
            } else {
                System.out.println("El tam ingresado no puede ser 0 o negativo");
            }
        }

    }

    public static void listarComidas() {
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i) instanceof Comidas) {
                System.out.println(i + " <- " + lista.get(i));
            }
        }
    }

    public static void listarBebidas() {
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i) instanceof Bebidas) {
                System.out.println(i + " <- " + lista.get(i));
            }
        }
    }

    public static void modComida() {
        listarComidas();
        System.out.println("Ingrese indice de la comida a modificar: ");
        int index = sc.nextInt();
        sc.nextLine();
        System.out.println("---ASPECTOS A MODIFICAR---"
                + "\n1 <- Nombre"
                + "\n2 <- Precio"
                + "\n3 <- Estado");
        int aspecto = sc.nextInt();
        switch (aspecto) {
            case 1: {
                sc.nextLine();
                System.out.println("Ingrese nombre de la comida: ");
                String nombre = sc.nextLine();
                ((Comidas) lista.get(index)).setNombre(nombre);
                break;
            }
            case 2: {
                System.out.println("Ingrese precio: ");
                double precio = sc.nextDouble();
                if (precio >= 0) {
                    ((Comidas) lista.get(index)).setPrecio(precio);
                } else {
                    System.out.println("El precio no puede ser negativo");
                }
                break;
            }
            case 3: {
                System.out.println("Ingrese estado de la comida:"
                        + "\n[0] <- Vencido"
                        + "\n[1] <- Comestible");
                int a = sc.nextInt();
                boolean estado;
                switch (a) {
                    case 0: {
                        estado = false;
                        ((Comidas) lista.get(index)).setEstado(estado);;
                        break;
                    }
                    case 1: {
                        estado = true;
                        ((Comidas) lista.get(index)).setEstado(estado);
                        break;
                    }
                    default:
                        System.out.println("Opcion no valida");
                        break;
                }
                break;
            }
            default:
                System.out.println("Opcion no valida");
                break;
        }

    }

    public static void modBebida() {
        listarBebidas();
        System.out.println("Ingrese indice de la bebida a modificar: ");
        int index = sc.nextInt();
        sc.nextLine();
        System.out.println("---ASPECTOS A MODIFICAR---"
                + "\n1 <- Nombre"
                + "\n2 <- Precio"
                + "\n3 <- Tamaño");
        int aspecto = sc.nextInt();
        switch (aspecto) {
            case 1: {
                System.out.println("Ingrese nombre de la bebida: ");
                String nombre = sc.nextLine();
                ((Bebidas) lista.get(index)).setNombre(nombre);
                break;
            }
            case 2: {
                System.out.println("Ingrese precio: ");
                double precio = sc.nextDouble();
                if (precio >= 0) {
                    ((Bebidas) lista.get(index)).setPrecio(precio);
                } else {
                    System.out.println("El precio no puede ser negativo");
                }
                break;
            }
            case 3: {
                System.out.println("Ingrese tam en mL: ");
                int tam = sc.nextInt();
                if (tam > 0) {
                    ((Bebidas) lista.get(index)).setTam(tam);
                } else {
                    System.out.println("Numero invalido");
                }
                break;
            }
            default:
                System.out.println("Opcion no valida");
                break;
        }
    }

    public static void eliminar(int i) {
        switch (i) {
            case 1: {
                listarComidas();
                System.out.println("Ingrese indice de la comida a eliminar: ");
                int index = sc.nextInt();
                lista.remove(index);
                System.out.println("Objeto eliminado con exito");
                break;
            }
            case 2: {
                listarBebidas();
                System.out.println("Ingrese indice de la bebida a eliminar: ");
                int index = sc.nextInt();
                lista.remove(index);
                System.out.println("Objeto eliminado con exito");
                break;
            }
            default:
                System.out.println("Opcion invalida");
                break;
        }
    }

}
