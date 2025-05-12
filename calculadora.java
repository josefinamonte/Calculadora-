package calculadora;

import java.util.Scanner;

/**
 * Clase principal que ejecuta una calculadora básica por consola.
 * Permite sumar, restar, multiplicar y dividir números enteros positivos.
 */
class Main {

  /**
   * Método principal. Controla el menú principal y la lógica de selección.
   * @param args Argumentos de línea de comandos (no se utilizan).
   */
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int opcion;

    do {
      try {
        menu();
        System.out.print("Ingrese una opción: ");
        opcion = Integer.parseInt(in.nextLine());

        if (opcion < 0 || opcion > 4) {
          System.out.println("Ingrese un valor válido.");
        } else {
          switch (opcion) {
            case 1:
              casoUno(in);
              break;
            case 2:
              casoDos(in);
              break;
            case 3:
              casoTres(in);
              break;
            case 4:
              casoCuatro(in);
              break;
          }
        }
      } catch (NumberFormatException e) {
        System.out.println("Error: Por favor ingrese un número válido.");
        opcion = -1;
      }
    } while (opcion != 0);
  }

  /**
   * Suma dos números enteros.
   * @param numero1 Primer número.
   * @param numero2 Segundo número.
   * @return Resultado de la suma.
   */
  public static int sumar(int numero1, int numero2) {
    return numero1 + numero2;
  }

  /**
   * Resta dos números enteros (resultado siempre positivo).
   * @param numero1 Primer número.
   * @param numero2 Segundo número.
   * @return Resultado de la resta.
   */
  public static int restar(int numero1, int numero2) {
    return (numero1 > numero2) ? (numero1 - numero2) : (numero2 - numero1);
  }

  /**
   * Multiplica dos números enteros.
   * @param numero1 Primer número.
   * @param numero2 Segundo número.
   * @return Resultado de la multiplicación.
   */
  public static int multiplicar(int numero1, int numero2) {
    return numero1 * numero2;
  }

  /**
   * Divide dos números enteros (mayor / menor).
   * @param numero1 Primer número.
   * @param numero2 Segundo número.
   * @return Resultado de la división.
   */
  public static int dividir(int numero1, int numero2) {
    return (numero1 < numero2) ? (numero2 / numero1) : (numero1 / numero2);
  }

  /**
   * Muestra el menú de opciones en consola.
   */
  public static void menu() {
    System.out.println("************************************************************");
    System.out.println("  *** CALCULADORA BÁSICA ***");
    System.out.println(" [1] - SUMAR");
    System.out.println(" [2] - RESTAR");
    System.out.println(" [3] - MULTIPLICAR");
    System.out.println(" [4] - DIVIDIR");
    System.out.println(" [0] - SALIR DEL PROGRAMA");
    System.out.println("************************************************************");
  }

  /**
   * Ejecuta el flujo de la operación de suma.
   * @param in Objeto Scanner para entrada del usuario.
   */
  public static void casoUno(Scanner in) {
    int respuesta = 1;
    do {
      int numero1 = leerNumero(in, "Primer Número: ");
      int numero2 = leerNumero(in, "Segundo Número: ");
      int resultado = sumar(numero1, numero2);
      System.out.println("La SUMA es de " + resultado);
      respuesta = leerNumero(in, "¿Desea hacer otra suma? [1 para sí, 0 para no]: ");
      while (respuesta < 0 || respuesta > 1) {
        System.out.println("Ingrese un valor válido.");
        respuesta = leerNumero(in, "¿Desea hacer otra suma? [1 para sí, 0 para no]: ");
      }
    } while (respuesta == 1);
  }

  /**
   * Ejecuta el flujo de la operación de resta.
   * @param in Objeto Scanner para entrada del usuario.
   */
  public static void casoDos(Scanner in) {
    int respuesta = 1;
    do {
      int numero1 = leerNumero(in, "Primer Número: ");
      int numero2 = leerNumero(in, "Segundo Número: ");
      int resultado = restar(numero1, numero2);
      System.out.println("La resta es de " + resultado);
      respuesta = leerNumero(in, "¿Desea hacer otra resta? [1 para sí, 0 para no]: ");
      while (respuesta < 0 || respuesta > 1) {
        System.out.println("Ingrese un valor válido.");
        respuesta = leerNumero(in, "¿Desea hacer otra resta? [1 para sí, 0 para no]: ");
      }
    } while (respuesta == 1);
  }

  /**
   * Ejecuta el flujo de la operación de multiplicación.
   * @param in Objeto Scanner para entrada del usuario.
   */
  public static void casoTres(Scanner in) {
    int respuesta = 1;
    do {
      int numero1 = leerNumero(in, "Primer Número: ");
      int numero2 = leerNumero(in, "Segundo Número: ");
      int resultado = multiplicar(numero1, numero2);
      System.out.println("La multiplicación es de " + resultado);
      respuesta = leerNumero(in, "¿Desea hacer otra multiplicación? [1 para sí, 0 para no]: ");
      while (respuesta < 0 || respuesta > 1) {
        System.out.println("Ingrese un valor válido.");
        respuesta = leerNumero(in, "¿Desea hacer otra multiplicación? [1 para sí, 0 para no]: ");
      }
    } while (respuesta == 1);
  }

  /**
   * Ejecuta el flujo de la operación de división, con validación de división por cero.
   * @param in Objeto Scanner para entrada del usuario.
   */
  public static void casoCuatro(Scanner in) {
    int respuesta = 1;
    do {
      int numero1 = leerNumero(in, "Primer Número: ");
      while (numero1 == 0) {
        System.out.println("No se puede dividir por cero. Ingrese un nuevo valor.");
        numero1 = leerNumero(in, "Primer Número: ");
      }
      int numero2 = leerNumero(in, "Segundo Número: ");
      while (numero2 == 0) {
        System.out.println("No se puede dividir por cero. Ingrese un nuevo valor.");
        numero2 = leerNumero(in, "Segundo Número: ");
      }
      int resultado = dividir(numero1, numero2);
      System.out.println("La división es de " + resultado);
      respuesta = leerNumero(in, "¿Desea hacer otra división? [1 para sí, 0 para no]: ");
      while (respuesta < 0 || respuesta > 1) {
        System.out.println("Ingrese un valor válido.");
        respuesta = leerNumero(in, "¿Desea hacer otra división? [1 para sí, 0 para no]: ");
      }
    } while (respuesta == 1);
  }

  /**
   * Lee un número entero positivo desde la entrada del usuario.
   * @param in Objeto Scanner para entrada del usuario.
   * @param mensaje Mensaje mostrado al usuario.
   * @return Número ingresado por el usuario.
   */
  public static int leerNumero(Scanner in, String mensaje) {
    int numero;
    while (true) {
      try {
        System.out.println(mensaje);
        numero = Integer.parseInt(in.nextLine());
        if (numero >= 0) {
          return numero;
        } else {
          System.out.println("Error: Por favor ingrese un número entero positivo.");
        }
      } catch (NumberFormatException e) {
        System.out.println("Error: Por favor ingrese un número válido (entero positivo).");
      }
    }
  }
}
