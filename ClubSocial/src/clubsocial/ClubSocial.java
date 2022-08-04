package clubsocial;
import java.util.ArrayList;
import java.util.Scanner;
public class ClubSocial {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int opc=0,i;Registro a=new Registro();String b;
    ArrayList<String> Miembros=new ArrayList<String>();
    ArrayList<String> Empleados=new ArrayList<String>();
    System.out.println("Escoja la opcion deseada");
    while(opc!=3){
        System.out.println("-------------------------------------------------------------");
        System.out.println("1.Empleados\n2.Miembros\n3.Salir");
        System.out.print("Opcion: ");opc=sc.nextInt();
        switch(opc){
            case 1:
                while(opc!=3){
                    System.out.println("-------------------------------------------------------------");
                System.out.println("1.Agregar empleado\n2.Mostrar lista de empleados\n3.Volver");
                System.out.print("Opcion: ");opc=sc.nextInt();i=0;
                switch(opc){
                    case 1:
                        a.Persona();a.Empleado();b=a.RegistroEmpleado();
                        Empleados.add(b);
                        break;
                    case 2:
                        for(String e: Empleados){
                            System.out.println("#."+(i+1));
                            System.out.println(Empleados.get(i));
                            i++;
                        }
                        break;
                    case 3:
                        System.out.println("Usted esta regresando al menu principal");
                        break;
                    default:
                        System.out.println("Por favor, escoja una de las opciones");
                        break;
                }
                }opc=0;
                break;
            case 2:
                while(opc!=3){
                    System.out.println("-------------------------------------------------------------");
                System.out.println("1.Agregar miembro\n2.Mostrar lista de miembros\n3.Volver");
                System.out.print("Opcion: ");opc=sc.nextInt();i=0;
                switch(opc){
                    case 1:
                        a.Persona();a.Miembro();b=a.RegistroMiembro();
                        Miembros.add(b);
                        break;
                    case 2:
                        for(String e: Miembros){
                            System.out.println("#."+(i+1));
                            System.out.println(Miembros.get(i));
                            i++;
                        }
                        break;
                    case 3:
                        System.out.println("Usted esta regresando al menu principal");
                        break;
                    default:
                        System.out.println("Por favor, escoja una de las opciones");
                        break;
                }
                }opc=0;
                break;
            case 3:
                System.out.println("Uted ha salido");
                break;
            default:
                System.out.println("Por favor, escoja una de las opciones");
                break;
        }
    }System.out.println("Adios, tenga un buen día");
}
}