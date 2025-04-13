package calculadora;
import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int opcion;
    
    do {
        try {
            menu(); // Procedimiento
            System.out.print("Ingrese una opción: ");
            opcion = Integer.parseInt(in.nextLine()); // Convierte la entrada a entero
            
            if (opcion < 0 || opcion > 4) {
                System.out.println("Ingrese un valor válido.");
            } else {
                switch (opcion) {
                    case 1:
                        casoUno(in); // Llama al procedimiento
                        break;
                    case 2:
                        casoDos(in);
                        break;
                    case 3:
                        casoTres(in);
                        break;
                    case 4:
                        casoCuatro(in); // Llama al procedimiento
                        break;
                }
            }
        } catch (NumberFormatException e) { // Captura excepciones de formato inválido
            System.out.println("Error: Por favor ingrese un número válido.");
            opcion = -1; // Asigna un valor fuera del rango válido para que el bucle continue
        }
    } while (opcion != 0);
  }

  public static int sumar(int numero1, int numero2){ // Funcion SUMAR
    int resultado;
    resultado = numero1+numero2;
    return resultado;
  }

  public static int restar(int numero1, int numero2){ // Funcion RESTAR
    int resultado;
    if (numero1>numero2){
      resultado = numero1-numero2;
    }else{
      resultado = numero2 - numero1;
    }
    return resultado; 
  }

  public static int multiplicar(int numero1, int numero2) { // Funcion MULTIPLICAR
    //creo funcion multiplicar
    int resultado;
    resultado = numero1*numero2;
    return resultado; 
  }
  
  public static int dividir(int numero1, int numero2){// Funcion DIVIDIR
    int resultado;
    if (numero1<numero2){
      resultado = numero2/numero1;
    }else{
      resultado = numero1/numero2;
    }
    return resultado; 
  }
  
  public static void menu() {//creo procedimiento menu
        System.out.println("************************************************************");
        System.out.println("  ");
        System.out.println("  *** CALCULADORA BÀSICA ***");
        System.out.println("  ");
        System.out.println(" [1] - SUMAR");
        System.out.println(" [2] - RESTAR");
        System.out.println(" [3] - MULTIPLICAR");
        System.out.println(" [4] - DIVIDIR");
        System.out.println(" [0] - SALIR DEL PROGRAMA");
        System.out.println("  ");
        System.out.println("SELECCIONAR UNA OPCIÓN [0 a 4] Y PRESIONAR ENTER: __ ");
        System.out.println("       ");
        System.out.println("************************************************************");
        System.out.println("       ");
        System.out.print("");
    }

  public static void casoUno(Scanner in) { // Procedimiento caso SUMA
    int respuesta = 1; //defino una variable respuesta que será usada para repetir la suma.

    do{
      int numero1=0;
      int numero2=0; 
      int resultado;
      
      System.out.println("   ");
      System.out.println(" Usted eligio SUMA ");
      System.out.println("   ");
      System.out.println(" Por favor ingrese los numeros que desea sumar ");
      System.out.println("   ");
      numero1= leerNumero(in, "Primer Numero: ");
      numero2= leerNumero(in, "Segundo Numero: ");

      resultado=sumar(numero1,numero2);//llamo funcion suma
      System.out.println("   ");
      System.out.println("La SUMA es de "+resultado);
      respuesta = leerNumero(in, "Desea hacer otra suma? [1 para sí, 0 para no]: ");
      while (respuesta < 0 || respuesta > 1) {
        System.out.println("Ingrese un valor válido.");
        respuesta = leerNumero(in, "Desea hacer otra suma? [1 para sí, 0 para no]: ");
      }
    } while (respuesta == 1);
    }

    public static void casoDos(Scanner in) { // Procedimiento caso RESTA
        int respuesta = 1;

        do{
          int numero1=0;
          int numero2=0; 
          int resultado;
          
          System.out.println("   ");
          System.out.println(" Usted eligio RESTA ");
          System.out.println("   ");
          System.out.println(" Por favor ingrese los numeros que desea restar ");
          System.out.println("   ");
          numero1= leerNumero(in, "Primer Numero: ");
          numero2= leerNumero(in, "Segundo Numero: ");
    
          resultado=restar(numero1,numero2);//llamo funcion
          System.out.println("   ");
          System.out.println("La resta es de "+resultado);
          respuesta = leerNumero(in, "Desea hacer otra resta? [1 para sí, 0 para no]: ");
          while (respuesta < 0 || respuesta > 1) {
            System.out.println("Ingrese un valor válido.");
            respuesta = leerNumero(in, "Desea hacer otra resta? [1 para sí, 0 para no]: ");
          }
        } while (respuesta == 1);
        }

  public static void casoTres(Scanner in) {  // Procedimiento caso MULTIPLICACION
    int respuesta = 1;
    
    do{
      int numero1=0;
      int numero2=0; 
      int resultado;
      
      System.out.println("   ");
      System.out.println(" Usted eligio MULTIPLICACIÓN ");
      System.out.println("   ");
      System.out.println(" Por favor ingrese los numeros que desea multiplicar ");
      System.out.println("   ");
      numero1= leerNumero(in, "Primer Numero: ");
      numero2= leerNumero(in, "Segundo Numero: ");

      resultado=multiplicar(numero1,numero2);//llamo funcion
      System.out.println("   ");
      System.out.println("La multiplicación es de "+resultado);
      respuesta = leerNumero(in, "Desea hacer otra multiplicación? [1 para sí, 0 para no]: ");
      while (respuesta < 0 || respuesta > 1) {
        System.out.println("Ingrese un valor válido.");
        respuesta = leerNumero(in, "Desea hacer otra multiplicación? [1 para sí, 0 para no]: ");
      }
    } while (respuesta == 1);
    }

  public static void casoCuatro(Scanner in) {// Procedimiento DIVISION
        int respuesta = 1;
    
        do{
          int numero1=0;
          int numero2=0; 
          int resultado;
          
          System.out.println(" Usted eligio DIVISIÓN ");
          System.out.println("   ");
          System.out.println(" Por favor ingrese los numeros que desea dividir ");
          System.out.println("   ");
          numero1= leerNumero(in, "Primer Numero: ");
          while (numero1 == 0) {
            System.out.println("Dividir el 0 por cualquier número da 0.");
            System.out.println("Por favor ingrese un nuevo valor");
            System.out.println(" ");
            numero1= leerNumero(in, "Primer Numero: ");
          }
          numero2= leerNumero(in, "Segundo Numero: ");
          while (numero2 == 0) {
              System.out.println("No se puede dividir con 0");
              System.out.println("Por favor ingrese un nuevo valor");
              System.out.println(" ");
              numero2 = leerNumero(in, "Segundo Numero: ");
          }
          resultado = dividir(numero1, numero2);//llamo funcion
          System.out.println("   ");
          System.out.println("La división es de "+resultado);
          
          respuesta = leerNumero(in, "Desea hacer otra división? [1 para sí, 0 para no]: ");
          while (respuesta < 0 || respuesta > 1) {
            System.out.println("Ingrese un valor válido.");
            respuesta = leerNumero(in, "Desea hacer otra división? [1 para sí, 0 para no]: ");
          }
        } while (respuesta == 1);
        }

    public static int leerNumero(Scanner in, String mensaje) { // verifica que sea entero y positivo
      int numero;
      while (true) { 
          try {
              System.out.println(mensaje);
              numero = Integer.parseInt(in.nextLine()); // Intenta convertir la entrada a entero
  
              if (numero >= 0) { // Verifica que el número sea positivo
                  return numero; // Devuelve el número si es válido y positivo
              } else {
                  System.out.println("Error: Por favor ingrese un número entero positivo.");
              }
          } catch (NumberFormatException e) {
              System.out.println("Error: Por favor ingrese un número válido (entero positivo).");
          }
      }
  }
  }