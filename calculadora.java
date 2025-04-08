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
                        casoUno(); // Llama al procedimiento
                        break;
                    case 2:
                        casoDos();
                        break;
                    case 3:
                        casoTres();
                        break;
                    case 4:
                        casoCuatro(); // Llama al procedimiento
                        break;
                }
            }
        } catch (NumberFormatException e) { // Captura excepciones de formato inválido
            System.out.println("Error: Por favor ingrese un número válido.");
            opcion = -1; // Asigna un valor fuera del rango válido para que el bucle continue
        }
    } while (opcion != 0);
  }

  public static int sumar(int numero1, int numero2){ //creo funcion sumar
    int resultado;
    resultado = numero1+numero2;
    return resultado;
  }

  public static int restar(int numero1, int numero2){ //creo funcion restar
    int resultado;
    if (numero1>numero2){
      resultado = numero1-numero2;
    }else{
      resultado = numero2 - numero1;
    }
    return resultado; 
  }

  public static int multiplicar(int numero1, int numero2) { 
    //creo funcion multiplicar
    int resultado;
    resultado = numero1*numero2;
    return resultado; 
  }
  
  public static int dividir(int numero1, int numero2){//creo funcion dividir
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

  public static void casoUno() {//creo procedimiento caso suma
    Scanner in =  new Scanner(System.in);
    int respuesta = -1; //defino una variable respuesta que será usada para repetir la suma.
     
    int numero1=0;
    int numero2=0; 
    int resultado;
    
    System.out.println("   ");
    System.out.println(" Usted eligio SUMA ");
    System.out.println("   ");
    System.out.println(" Por favor ingrese los numeros que desea sumar ");
    System.out.println("   ");
    System.out.println(" Primer Numero: ");
    System.out.println("   ");
    numero1=in.nextInt();
    do{
      if (numero1<0){
        System.out.println("Ingrese un valor valido (entero positivo)");
        numero1=in.nextInt();
      }
    }while(numero1<0);
    System.out.println("   ");
    System.out.println(" Segundo Numero: ");
    System.out.println("   ");
    numero2=in.nextInt();
    do{
      if (numero2<0){
        System.out.println("Ingrese un valor valido (entero positivo)");
        numero2=in.nextInt();
      } 
    }while(numero2<0);
    resultado=sumar(numero1,numero2);//llamo funcion suma
    System.out.println("   ");
    System.out.println("La SUMA es de "+resultado);
    in.nextLine(); // LIMPIO EL SCANNER

    do{
      try {
        System.out.print("Desea hacer otra suma? [1 para sí, 0 para no]: ");
        respuesta = Integer.parseInt(in.nextLine()); // Convierte la entrada a entero
        
        if (respuesta < 0 || respuesta > 1) {
            System.out.println("Ingrese un valor válido.");
        } else if (respuesta == 1){
          casoUno();
        }
      } catch (NumberFormatException e) { // Captura excepciones de formato inválido
        System.out.println("Error: Por favor ingrese un número válido.");
        respuesta = -1; // Asigna un valor fuera del rango válido para que el bucle continue
      }
    } while (respuesta != 0);
    menu();
    }
//////////////////////////


//////////////////////

    public static void casoDos() {
        //creo procedimiento caso resta
        Scanner in = new Scanner(System.in);
        int respuesta;

        int numero1 = 0;
        int numero2 = 0;
        int resultado;

        System.out.println("   ");
        System.out.println(" Usted eligio RESTA ");
        System.out.println("   ");
        System.out.println(" Por favor ingrese los numeros que desea restar ");
        System.out.println("   ");
        System.out.println(" Primer Numero: ");
        System.out.println("   ");
        numero1=in.nextInt();
        do{
          if (numero1<0){
            System.out.println("Ingrese un valor valido (entero positivo)");
            numero1=in.nextInt();
          }
        }while(numero1<0);
        System.out.println("   ");
        System.out.println(" Segundo Numero: ");
        System.out.println("   ");
        numero2=in.nextInt();
        do{
          if (numero2<0){
            System.out.println("Ingrese un valor valido (entero positivo)");
            numero2=in.nextInt();
          } 
        }while(numero2<0);
        resultado = restar(numero1, numero2);//llamo funcion resta
        System.out.println("   ");
        System.out.println("La resta es de " + resultado);
        
        in.nextLine(); // LIMPIO EL SCANNER
    
        do{
          try {
            System.out.print("Desea hacer otra resta? [1 para sí, 0 para no]: ");
            respuesta = Integer.parseInt(in.nextLine()); // Convierte la entrada a entero
            
            if (respuesta < 0 || respuesta > 1) {
                System.out.println("Ingrese un valor válido.");
            } else if (respuesta == 1){
              casoDos();
            }
          } catch (NumberFormatException e) { // Captura excepciones de formato inválido
            System.out.println("Error: Por favor ingrese un número válido.");
            respuesta = -1; // Asigna un valor fuera del rango válido para que el bucle continue
          }
        } while (respuesta != 0);
        menu();
    }

  public static void casoTres() { 
   //creo procedimiento caso multiplicacion
    Scanner in =  new Scanner(System.in);
    int respuesta;
     
    int numero1=0;
    int numero2=0; 
    int resultado;
    
    System.out.println("   ");
    System.out.println(" Usted eligio MULTIPLICACION ");
    System.out.println("   ");
    System.out.println(" Por favor ingrese los numeros que desea multiplicar ");
    System.out.println("   ");
    System.out.println(" Primer Numero: ");
    System.out.println("   ");
    numero1=in.nextInt();
    do{
      if (numero1<0){
        System.out.println("Ingrese un valor valido (entero positivo)");
        numero1=in.nextInt();
      }
    }while(numero1<0);
    System.out.println("   ");
    System.out.println(" Segundo Numero: ");
    System.out.println("   ");
    numero2=in.nextInt();
    do{
      if (numero2<0){
        System.out.println("Ingrese un valor valido (entero positivo)");
        numero2=in.nextInt();
      } 
    }while(numero2<0);
    resultado=multiplicar(numero1,numero2);
    //llamo funcion multiplicar
    System.out.println("   ");
    System.out.println("La multiplicacion es de "+resultado);

    in.nextLine(); // LIMPIO EL SCANNER
    
    do{
      try {
        System.out.print("Desea hacer otra multiplicación? [1 para sí, 0 para no]: ");
        respuesta = Integer.parseInt(in.nextLine()); // Convierte la entrada a entero
        
        if (respuesta < 0 || respuesta > 1) {
            System.out.println("Ingrese un valor válido.");
        } else if (respuesta == 1){
          casoTres();
        }
      } catch (NumberFormatException e) { // Captura excepciones de formato inválido
        System.out.println("Error: Por favor ingrese un número válido.");
        respuesta = -1; // Asigna un valor fuera del rango válido para que el bucle continue
      }
    } while (respuesta != 0);
    menu();
  }

  public static void casoCuatro() {//creo procedimiento division
        Scanner in = new Scanner(System.in);
        int respuesta;

        int numero1 = 0;
        int numero2 = 0;
        int resultado;

        System.out.println("   ");
        System.out.println(" Usted eligio DIVISION ");
        System.out.println("   ");
        System.out.println(" Por favor ingrese los numeros que desea dividir ");
        System.out.println("   ");
        System.out.println(" Primer Numero: ");
        System.out.println("   ");
        numero1=in.nextInt();
        do{
          if (numero1<0){
            System.out.println("Ingrese un valor valido (entero positivo)");
            numero1=in.nextInt();
          }
        }while(numero1<0);
        System.out.println("   ");
        System.out.println(" Segundo Numero: ");
        System.out.println("   ");
        numero2=in.nextInt();
        do{
          if (numero2<0){
            System.out.println("Ingrese un valor valido (entero positivo)");
            numero2=in.nextInt();
          } 
        }while(numero2<0);//controlo numer dos que no sea 0
        while (numero2 == 0) {
            System.out.println("No se puede dividir con 0");
            System.out.println("Por favor ingrese un nuevo valor");
            System.out.println(" ");
            numero2 = in.nextInt();
        }
        resultado = dividir(numero1, numero2);//llamo funcion
        System.out.println("   ");
        System.out.println("La división es de " + resultado);
        in.nextLine(); // LIMPIO EL SCANNER
  
        do{
          try {
            System.out.print("Desea hacer otra división? [1 para sí, 0 para no]: ");
            respuesta = Integer.parseInt(in.nextLine()); // Convierte la entrada a entero
            
            if (respuesta < 0 || respuesta > 1) {
                System.out.println("Ingrese un valor válido.");
            } else if (respuesta == 1){
              casoCuatro();
            }
          } catch (NumberFormatException e) { // Captura excepciones de formato inválido
            System.out.println("Error: Por favor ingrese un número válido.");
            respuesta = -1; // Asigna un valor fuera del rango válido para que el bucle continue
          }
        } while (respuesta != 0);
        menu();
    }
  }