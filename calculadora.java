package calculadora;
import java.util.Scanner;
class Main { 
  public static void main(String[] args) {
  Scanner in =  new Scanner(System.in);   
    int opcion=-1;//declaro variable
    do{
      menu();//procedimiento
      opcion= in.nextInt();

      do{
        if(opcion<0 || opcion>4){
            System.out.println("Ingrese un valor valido");
            menu();//procedimiento
            opcion= in.nextInt();
        }
      }while(opcion<0 || opcion>4);
        switch (opcion) {
            case 1: 
            casoUno(); //llamo a procedimiento
            break;
        case 2:
            casoDos();
        break; 
        case 3:
            casoTres();       
        break;
        case 4:
            casoCuatro();//lammo procedimiento
        break;
        }
    }while(opcion!=0);
  }


  public static double sumar(double numero1, double numero2){ //creo funcion sumar
    double resultado;
    resultado = numero1+numero2;
    return resultado;
  }

  public static double restar(double numero1, double numero2){ //creo funcion restar
    double resultado;
    resultado = numero1-numero2;
    return resultado; 
  }

  public static double multiplicar(double numero1, double numero2) { 
    //creo funcion multiplicar
    double resultado;
    resultado = numero1*numero2;
    return resultado; 
  }
  
  public static double dividir(double numero1, double numero2){//creo funcion dividir
    double resultado;
    resultado = numero1/numero2;
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
     
    double numero1=0;
    double numero2=0; 
    double resultado;
    
    System.out.println("   ");
    System.out.println(" Usted eligio SUMA ");
    System.out.println("   ");
    System.out.println(" Por favor ingrese los numeros que desea sumar ");
    System.out.println("   ");
    System.out.println(" Primer Numero: ");
    System.out.println("   ");
    numero1=in.nextDouble();
    System.out.println("   ");
    System.out.println(" Segundo Numero: ");
    System.out.println("   ");
    numero2=in.nextDouble();
    resultado=sumar(numero1,numero2);//llamo funcion suma
    System.out.println("   ");
    System.out.println("La SUMA es de "+resultado);
    }

    public static void casoDos() {
        //creo procedimiento caso resta
        Scanner in = new Scanner(System.in);

        double numero1 = 0;
        double numero2 = 0;
        double resultado;

        System.out.println("   ");
        System.out.println(" Usted eligio RESTA ");
        System.out.println("   ");
        System.out.println(" Por favor ingrese los numeros que desea restar ");
        System.out.println("   ");
        System.out.println(" Primer Numero: ");
        System.out.println("   ");
        numero1 = in.nextDouble();
        System.out.println("   ");
        System.out.println(" Segundo Numero: ");
        System.out.println("   ");
        numero2 = in.nextDouble();
        resultado = restar(numero1, numero2);//llamo funcion resta
        System.out.println("   ");
        System.out.println("La resta es de " + resultado);
    }

  public static void casoTres() { 
   //creo procedimiento caso multiplicacion
    Scanner in =  new Scanner(System.in);
     
    double numero1=0;
    double numero2=0; 
    double resultado;
    
    System.out.println("   ");
    System.out.println(" Usted eligio MULTIPLICACION ");
    System.out.println("   ");
    System.out.println(" Por favor ingrese los numeros que desea multiplicar ");
    System.out.println("   ");
    System.out.println(" Primer Numero: ");
    System.out.println("   ");
    numero1=in.nextDouble();
    System.out.println("   ");
    System.out.println(" Segundo Numero: ");
    System.out.println("   ");
    numero2=in.nextDouble();
    resultado=multiplicar(numero1,numero2);
    //llamo funcion multiplicar
    System.out.println("   ");
    System.out.println("La multiplicacion es de "+resultado);
    }

    public static void casoCuatro() {//creo procedimiento division
        Scanner in = new Scanner(System.in);

        double numero1 = 0;
        double numero2 = 0;
        double resultado;

        System.out.println("   ");
        System.out.println(" Usted eligio DIVISION ");
        System.out.println("   ");
        System.out.println(" Por favor ingrese los numeros que desea dividir ");
        System.out.println("   ");
        System.out.println(" Primer Numero: ");
        System.out.println("   ");
        numero1 = in.nextDouble();
        System.out.println("   ");
        System.out.println(" Segundo Numero: ");
        System.out.println("   ");
        numero2 = in.nextDouble();//controlo numer dos que no sea 0
        while (numero2 == 0) {
            System.out.println("No se puede dividir con 0");
            System.out.println("Por favor ingrese un nuevo valor");
            System.out.println(" ");
            numero2 = in.nextDouble();
        }
        resultado = dividir(numero1, numero2);//llamo funcion
        System.out.println("   ");
        System.out.println("La divison es de " + resultado);
    }
}