package org.example;
import javax.print.attribute.IntegerSyntax;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        String nombreUsuario=null;
        String nombreUsuarioBD="usuario";
        String contrasena=null;
        String contrasenaBD="123";
        Integer opcion=0;
        Integer opciones=0;
        int intentos=0;
        Integer cantidadCangrejo = 0;
        Integer cantidadEscalopes = 0;
        Integer cantidadFilete = 0;
        Integer cantidadCorvina = 0;
        Integer cantidadCoctel = 0;
        Integer cantidadJugos = 0;
        Double totalConPropina = 0.0;
        int totalSinPropina=0;


        Scanner leer = new Scanner(System.in);


        while (intentos < 3) {

            System.out.println("************ BIENVENIDO A RIGOBERTO GROSERIA ************");
            System.out.println("Ingresa tu nombre de Usuario:");
            nombreUsuario = leer.nextLine();

            System.out.println("Ingresa tu contraseña:");
            contrasena = leer.nextLine();
            intentos++;

            System.out.println("Numero de intentos " + intentos);



            if (nombreUsuario.equals(nombreUsuarioBD) && contrasena.equals(contrasenaBD)) {

                System.out.println("******* Bienvenido " + nombreUsuario + " **************");


                System.out.println("Elije una opcion: ");

                System.out.println("1. Ingresa Orden. \n" +
                        "2. Modificar Orden.\n" +
                        "3. Terminar Orden y calcular total.\n" +
                        "4. Salir y Facturar");

                do {

                    System.out.println("Elije una opcion: ");

                    System.out.println("1. Ingresa Orden. \n" +
                            "2. Modificar Orden.\n" +
                            "3. Terminar Orden y calcular total.\n" +
                            "4. Salir");

                    opcion = leer.nextInt();

                switch (opcion) {


                    case 1:

                        System.out.println("******** Ingresa la Orden ************");


                        do {

                            System.out.println("***** Elije una opcion ************* ");
                            System.out.println("1. Cangrejo de urrao $28000");
                            System.out.println("2. Escalopes a la rigo $35000");
                            System.out.println("3. Filete tour de francia $150000");
                            System.out.println("4. Corvina de rigo $80000");
                            System.out.println("5. Coctel michelle $20000");
                            System.out.println("6. Jugos de urrao $18500");
                            System.out.println("7. Salir al menu principal");


                            opciones = leer.nextInt();

                            switch (opciones) {

                                case 1:
                                    System.out.println("Ingrese la cantidad que desea: ");
                                    cantidadCangrejo = leer.nextInt();
                                    break;
                                case 2:
                                    System.out.println("Ingrese la cantidad que desea: ");
                                    cantidadEscalopes = leer.nextInt();
                                    break;
                                case 3:
                                    System.out.println("Ingrese la cantidad que desea: ");
                                    cantidadFilete = leer.nextInt();
                                    break;
                                case 4:
                                    System.out.println("Ingrese la cantidad que desea: ");
                                    cantidadCorvina = leer.nextInt();
                                    break;
                                case 5:
                                    System.out.println("Ingrese la cantidad que desea: ");
                                    cantidadCoctel = leer.nextInt();
                                    break;

                                case 6:
                                    System.out.println("Ingrese la cantidad que desea: ");
                                    cantidadJugos = leer.nextInt();
                                    break;
                                case 7:
                                    System.out.println("Volver al menu");

                                    break;


                                default:

                                    System.out.println("Opcion Invalida");

                                    break;

                            }

                        } while (opciones != 7);

                        break;

                    case 2:

                        System.out.println("******** Modificar la Orden ************");


                        System.out.println("1. Cangrejo de urrao $28000");
                        System.out.println("2. Escalopes a la rigo $35000");
                        System.out.println("3. Filete tour de francia $150000");
                        System.out.println("4. Corvina de rigo $80000");
                        System.out.println("5. Coctel michelle $20000");
                        System.out.println("6. Jugos de urrao $18500");
                        System.out.println("7. Salir al menu principal");

                        do {
                            opciones = leer.nextInt();

                            switch (opciones) {

                                case 1:
                                    System.out.println("Ingrese la cantidad que desea: ");
                                    cantidadCangrejo = leer.nextInt();
                                    break;
                                case 2:
                                    System.out.println("Ingrese la cantidad que desea: ");
                                    cantidadEscalopes = leer.nextInt();
                                    break;
                                case 3:
                                    System.out.println("Ingrese la cantidad que desea: ");
                                    cantidadFilete = leer.nextInt();
                                    break;
                                case 4:
                                    System.out.println("Ingrese la cantidad que desea: ");
                                    cantidadCorvina = leer.nextInt();
                                    break;
                                case 5:
                                    System.out.println("Ingrese la cantidad que desea: ");
                                    cantidadCoctel = leer.nextInt();
                                    break;

                                case 6:
                                    System.out.println("Ingrese la cantidad que desea: ");
                                    cantidadJugos = leer.nextInt();
                                    break;
                                case 7:
                                    System.out.println("Volver al menu");

                                    break;


                                default:

                                    System.out.println("Opcion Invalida");

                                    break;

                            }

                        } while (opciones != 7);

                        break;


                    case 3:


                            System.out.println("******** Terminar Orden ************");
                        Integer propina=0;

                         totalSinPropina = ((cantidadCangrejo * 28000) + (cantidadCoctel * 20000) + (cantidadCorvina * 80000)
                                + (cantidadJugos * 18500) + (cantidadEscalopes * 35000) + (cantidadFilete * 150000));

                            System.out.println("Desea agregar propina: ");
                            System.out.println("1. SI");
                            System.out.println("2. NO");
                            System.out.println("3. Volver al menu");

                        do {

                            propina = leer.nextInt();


                            switch (propina) {

                                case 1:
                                    System.out.println("********* Factura *********");

                                    totalConPropina = ((totalSinPropina) + (totalSinPropina * 0.1));
                                    System.out.println("Total compra con propina: $" + totalConPropina);
                                    break;

                                case 2:

                                    System.out.println("********* Factura *********");
                                    System.out.println("Total compra sin propina: $" + totalSinPropina);

                                    break;

                                case 3:
                                    break;

                                default:
                                    System.out.println("Opcion invalida");
                                    break;


                            }
                        }while(propina != 3);

                        break;

                    case 4:
                        break;

                    default:
                        System.out.println("Opcion invalida");

                        break;


                }

            }while(opcion != 4);

                System.out.println("++++++++++ RESUMEN DE ORDEN +++++++++++");

                System.out.println("* Cangrejo de urrao cantidad "+ cantidadCangrejo);
                System.out.println("* Escalopes a la rigo cantidad "+ cantidadEscalopes);
                System.out.println("* Filete tour de francia cantidad "+ cantidadFilete);
                System.out.println("* Corvina de rigo cantidad " + cantidadCorvina);
                System.out.println("* Coctel michelle cantidad " + cantidadCoctel);
                System.out.println("* Jugos de urrao cantidad " + cantidadJugos);
                System.out.println("Total compra: $"+totalSinPropina );
                System.out.println("Total compra con propina $"+(totalSinPropina*0.1));



            } else {

                System.out.println("Usuario o contraseña incorrectos");


            }}
        System.out.println("Cuenta bloqueada");

}}







