/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guevara_ernesto_exameni;

import java.util.Scanner;

/**
 *
 * @author Ernesto
 */
public class Guevara_Ernesto_ExamenI {

    public static void main(String[] args) {

        Scanner lea = new Scanner(System.in).useDelimiter("\n");

        while (true) {
            int op = 0;
            try {
                System.out.println("*** Menu ***");
                System.out.println("1. Piramide");
                System.out.println("2. El Mayor");
                System.out.println("3. Cliente TV");
                System.out.println("4. Caracter Vocales");
                System.out.println("5. Salir");
                op = lea.nextInt();
            } catch (Exception e) {
                System.out.println("Ingrese un tipo de dato que no correspondia");
                lea.nextLine();
            }

            if (op == 1) {
                while (true) {
                    try {
                        System.out.println("Ingrese la cantidad de filas de la piramide: ");
                        int filas = lea.nextInt(), inicio = 1;
                        for (int i = 1; i <= filas; i++) {
                            int suma = 0;
                            for (int j = 1; j <= i; j++) {
                                System.out.print(inicio + " ");
                                suma += inicio;
                                inicio += 2;
                            }
                            System.out.println("= " + suma);
                        }
                        break;
                    } catch (Exception e) {
                        System.out.println("Ingreso un tipo de dato que no correspondia a lo que se le solicitaba");
                        lea.nextLine();
                    }
                }
            }

            if (op == 2) {
                try {
                    int numeromayor = 0, contador = 0, suma = 0;
                    while (true) {
                        System.out.println("Cuando quiera salir ingrese: No");
                        System.out.println("Ingrese un numero:");
                        String num = lea.next();

                        if (num.equalsIgnoreCase("no")) {
                            break;
                        } else {
                            int numero = Integer.parseInt(num);
                            if (numeromayor < numero) {
                                numeromayor = numero;
                            }
                            contador++;
                            suma += numero;
                        }
                    }

                    double promedio = suma / contador;
                    System.out.println("El promedio de los numeros ingresados fue: " + promedio);
                    System.out.println("El numero mayor ingresado fue: " + numeromayor);
                } catch (Exception e) {
                    System.out.println("Ingreso un tipo de dato que no corresponde lo pedido");
                    lea.nextLine();
                }

            }

            if (op == 3) {
                while (true) {
                    try {
                        System.out.println("Ingrese su nombre: ");
                        String cliente = lea.next();
                        int llave = 0, hd = 0, normal = 0, canalesnormales = 20, canaleshd = 30;

                        do {
                            System.out.println("Ingrese que tipo de Canal quiere: (HD o NORMAL)");
                            String tipocanal = lea.next();
                            String confirmacion = "";
                            if (tipocanal.equalsIgnoreCase("HD")) {
                                hd++;
                                confirmacion = "confirmacion";
                            } else if (tipocanal.equalsIgnoreCase("NORMAL")) {
                                normal++;
                                confirmacion = "confirmacion";
                            } else {
                                System.out.println("Esta no es una opcion escriba HD o NORMAL");
                            }

                            while (confirmacion.equalsIgnoreCase("confirmacion")) {
                                System.out.println("Quieres añadir otro canal? (si/no)");
                                String otro = lea.next();

                                if (otro.equalsIgnoreCase("SI")) {
                                    break;
                                } else if (otro.equalsIgnoreCase("NO")) {
                                    llave = 1;
                                    break;
                                } else {
                                    System.out.println("Esta no es una opcion, escriba si o no");
                                }
                            }
                        } while (llave == 0);

                        String caja = "";
                        int preciocaja = 0;

                        while (true) {
                            System.out.println("Cual de nuestras cajas quiere:");
                            System.out.println("LIGHTBOX");
                            System.out.println("HDBOX");
                            System.out.println("DVRBOX");
                            caja = lea.next();

                            if (caja.equalsIgnoreCase("lightbox") || caja.equalsIgnoreCase("hdbox") || caja.equalsIgnoreCase("dvrbox")) {
                                preciocaja = (caja.equalsIgnoreCase("lightbox")) ? 50
                                        : (caja.equalsIgnoreCase("hdbox")) ? 100
                                        : (caja.equalsIgnoreCase("dvrbox")) ? 150 : 0;
                                break;
                            } else {
                                System.out.println("Esa no es una de nuestras caja");
                            }
                        }

                        double subtotal = (normal * canalesnormales) + (hd * canaleshd) + preciocaja;
                        double impuesto = subtotal * 0.15;
                        double total = subtotal + impuesto;

                        System.out.println("*** Factura ***");
                        System.out.println("Nombre del Cliente: " + cliente);
                        System.out.println("Canales Normales: " + normal);
                        System.out.println("Canales HD: " + hd);
                        System.out.println("Pago por Canales Normales: " + normal * canalesnormales);
                        System.out.println("Pago por Canales HD: " + hd * canaleshd);
                        System.out.println("Pago por Caja " + caja + " : " + preciocaja);
                        System.out.println("Impuestos: " + impuesto);
                        System.out.println("Total: " + total);
                        break;
                    } catch (Exception e) {
                        System.out.println("Ingreso un tipo de dato que no correspondia con lo pedido");
                        lea.nextLine();
                    }
                }
            }

            if (op == 4) {
                try {
                    System.out.println("Escriba una palabra: ");
                    String palabra = lea.next().toLowerCase(), vocalmasrepetida = "";
                    int vocal = 0;

                    for (int i = 0; i <= palabra.length() - 1; i++) {
                        char letra = palabra.charAt(i);

                        switch (letra) {
                            case 'a':
                                vocal++;
                                break;
                            case 'e':
                                vocal++;
                                break;
                            case 'i':
                                vocal++;
                                break;
                            case 'o':
                                vocal++;
                                break;
                            case 'u':
                                vocal++;
                                break;
                        }
                    }

                    System.out.println("Hay " + vocal + " vocales en esta palabra");
                } catch (Exception e) {
                    System.out.println("Ingrese un tipo de dato que no correspondia a lo pedido");
                }
            }

            if (op == 5) {
                System.out.println("HASTA LUEGO");
                break;
            }

            if (op != 1 && op != 2 && op != 3 && op != 4 && op != 5) {
                System.out.println("Esta no es una opcion");
            }
        }
    }

}
