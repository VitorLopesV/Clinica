import db.DB;
import model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import util.Console;
import util.LngConstants;

import java.util.Scanner;

/**
 * Classe principal
 */
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Employee employee = new Employee();

        //INICIANDO APLICAÇÃO
        Console.welcome();

        while (true) {
            Console.options();

            int Options = scanner.nextInt();

            switch (Options) {

                //ADICIONA UM FUNCIONÁRIO NO SISTEMA
                case 1:
                    System.out.println("\n" + LngConstants.REGISTERED + "\n");

                    System.out.print("Informe o nome do Funcionário -> ");
                    scanner.nextLine();
                    String name = scanner.nextLine();

                    //OPÇÕES DE CARGO DISPONÍVEIS
                    Console.medicalStaff();

                    int id = scanner.nextInt();
                    String office = employee.getOffice(id);

                    System.out.print("Informe o valor do salário -> ");
                    double salary = scanner.nextDouble();

                    //CRIANDO UM FUNCIONÁRIO
                    employee = new Employee(name, salary,office);
                    employee.registerEmployee(employee);
                    break;
                //LISTAR FUNCIONÁRIOS
                case 2:
                    System.out.println(LngConstants.REGISTERED_EMPLOYEE + "\n");
                    employee.showEmployeelist();
                    break;
                //BUSCAR FUNCIONÁRIO
                case 3:
                    System.out.print("Digite o ID do funcionário que deseja buscar -> ");
                    int userid = scanner.nextInt();
                    employee.searchEmployee(userid);
                    break;
                //REMOVER FUNCIONÁRIO
                case 4:
                    System.out.print("Digite o ID do funcionário que deseja remover do sistema -> ");
                    int Userid = scanner.nextInt();
                    employee.deleteEmployee(Userid);
                    break;
                //SAIR DO LOOP
                case 0:
                    System.exit(1);
                    DB.closeConnection();
                //OPÇÃO INVÁLIDA
                default:
                    System.out.println(LngConstants.INVALID_OPTION);
                    break;
            }
        }
    }
}