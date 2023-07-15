import core.Console;
import entities.Employee;

import java.util.Scanner;


/**
 * Classe principal
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee employee = new Employee();
        Console console = new Console();

        while (true) {

            console.options();

            int option = sc.nextInt();
            switch (option) {
                case 1:
                    System.out.print("-Informe o nome: ->");
                    sc.nextLine(); String name = sc.nextLine();
                    System.out.print("-Informe o id: ->");
                    int id = sc.nextInt();

                    console.medicalStaff();
                    sc.nextLine(); int medicalStaff = sc.nextInt();

                    System.out.print("-Informe o salário: ->");
                    double salary = sc.nextDouble();

                    Employee addEmployee = new Employee(name,id,salary,console.resoultMedicalStaff(medicalStaff));
                    employee.registerEmployee(addEmployee);
                    System.out.println("\n");
                    break;

                case 2:

                    employee.employeelist();
                    System.out.println("\n");
                    break;

                case 3:
                    sc.nextLine();
                    System.out.print("Informe o id do funcionário que deseja buscar: ->");
                    int searchEmplooyee = sc.nextInt();
                    System.out.println("\n");
                    employee.searchEmployee(searchEmplooyee);
                    break;

                case 4:
                    sc.nextLine();
                    System.out.print("Informe o id do funcionário que deseja excluir: ->");
                    int deletEmplooyee = sc.nextInt();
                    employee.deliteEmployee(deletEmplooyee);
                    break;

                case 0:
                    System.exit(0);

                default:
                    System.out.println("Opção invalida !\n");

            }
        }
    }
}