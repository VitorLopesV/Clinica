import model.MedicalStaff;
import util.Console;
import model.Employee;
import util.LngConstants;

import java.util.Scanner;


/**
 * Classe principal
 */
public class Main {

    public static void main(String[] args) {

        //INSTÂNCIAS
        Scanner sc = new Scanner(System.in);
        Employee employee = new Employee();

        while (true) {
            //IMPRESSÃO DAS OPÇÕES DISPONÍVEIS NO SISTEMA.
            Console.options();

            int option = sc.nextInt();
            switch (option) {
                //REALIZA O CADASTRO DE UM FUNCIONÁRIO.
                case 1:
                    System.out.print("-Informe o nome -> ");
                    sc.nextLine(); String name = sc.nextLine();
                    System.out.print("-Informe o id -> ");
                    int id = sc.nextInt();

                    Console.medicalStaff();
                    sc.nextLine(); int medicalStaff = sc.nextInt();

                    System.out.print("-Informe o salário -> ");
                    double salary = sc.nextDouble();

                    Employee addEmployee = new Employee(name,id,salary, MedicalStaff.resoultMedicalStaff(medicalStaff));
                    employee.registerEmployee(addEmployee);
                    System.out.println("\n");
                    break;
                //MOSTRA TODOS OS FUNCIONÁRIOS DO SISTEMA.
                case 2:
                    employee.showEmployeelist();
                    System.out.println("\n");
                    break;
                //PESQUISA POR UM FUNCIONÁRIO.
                case 3:
                    sc.nextLine();
                    System.out.print("Informe o id do funcionário que deseja buscar -> ");
                    int searchEmplooyee = sc.nextInt();
                    System.out.println("\n");
                    employee.searchEmployee(searchEmplooyee);
                    break;
                //EXCLUI UM FUNCIONÁRIO DO SISTEMA.
                case 4:
                    sc.nextLine();
                    System.out.print("Informe o id do funcionário que deseja excluir -> ");
                    int deletEmplooyee = sc.nextInt();
                    employee.deleteEmployee(deletEmplooyee);
                    break;
                //SAÍDA.
                case 0:
                    System.exit(0);
                //OPÇÃO INVÁLIDA.
                default:
                    System.out.println(LngConstants.INVALID_OPTION + "\n");
                    break;
            }
        }
    }
}