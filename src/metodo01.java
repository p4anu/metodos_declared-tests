import java.util.Scanner;

public class metodo01 {
    int modeloA;
    int pesoMotor;
    String combustible;
    String categNav;
    static int ID; //ID se declara static
    //se programa su AUTOINCRMENTACIÓN, si no fuese static fallaría en la invocación
    metodo01(){
        ID++;
    }

    //a continucaión se crea el metodo invocable de input por teclado: userInput
    public void userInput() {
        System.out.println("██████████████*Enter data and press enter (numeric data only integers)*██████████████");
        System.out.println("██████████*Ingrese los datos y presione enter (datos númericos solo enteros)*████████");

        Scanner datosINT = new Scanner (System.in);
        System.out.println("█Model year/Año modelo: ");
        modeloA = datosINT.nextInt();
        System.out.println("█Engine weight in kg/Peso del motor en kg: ");
        pesoMotor = datosINT.nextInt();

        Scanner datosSTRING = new Scanner(System.in);
        //!!!Se declara un nuevo Scanner porque cambia el tipo de datos de las variables
        System.out.println("█Fuel type/Tipo de combustible: ");
        combustible = datosSTRING.nextLine();//si no funciona probar con ".findInLine()"
        System.out.println("█Category/Categoría: ");
        categNav = datosSTRING.nextLine();//si no funciona probar con ".findInLine()"
    }

    //a continuación metodo invocable de print por pantalla: monitorMetod01
    public void monitorMetod01() {
        System.out.println("This car is a model /modelo: " + modeloA + " its engine weighs/peso motor: " + pesoMotor +
                " kg. And it uses as fuel/combustible: " + combustible + " Category/categoria: " + categNav);
    }
    //"public" es un atributo del metodo, he indica que este es visible en cualquier clase del proyecto
    //el atributo (public en este caso) forma parate del ENCAPSULAMIENTO del metodo en la clase metodo01
    //"void" es un tipo de retorno de metodo o funcion. Void indica que lo que retorna es NADA, o bien que no hay retorno

}
