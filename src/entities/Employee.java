package entities;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe base para os funcionários
 */
public class Employee {
    /** Armazena o nome do funcionario*/
    private String name;
    /** Armazena o id do funcionario*/
    private int id;
    /** Armazena o salário do funcionario*/
    private double salary;
    /** Armazena o cargo do funcionario*/
    private String office;
    /**Armazena a lista dos funcionários*/
    private final List<Employee> employee = new ArrayList<>();

    public Employee(){}

    public Employee(String name,int id,double salary, String office){
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.office = office;
    }

    /**Método que registra o funcionário no sistema*/
    public void registerEmployee(Employee emp){
        employee.add(emp);
        System.out.println("\n        Funcionário registrado com sucesso !\n");
    }

    /**Método que mostra a lista de funcionários cadastrados no sistema*/
    public void employeelist(){
        if(employee.size() == 0){

            System.out.println("\n        Não existem funcionários cadastrados !\n");

        } else {

            for(Employee loop : employee){
                System.out.println(loop);
            }
        }
    }

    /**Método para buscar funcionário pelo id funcionário*/
    public void searchEmployee(int id){
        for(Employee loop : employee) {
            if (id == loop.id){
                System.out.println(loop);
            }else{
                System.out.println("\n        Funcionário não existe !\n");
            }
        }
    }

    /**Método para remover funcionário*/
    public void deliteEmployee(int id){
        employee.removeIf(loop -> id == loop.id);
        System.out.println("\n        Funcionário excluído com sucesso !\n");
    }


    public String toString(){
        return "Nome: " + name + ", Id: " + id + ", Cargo: " + office + ", Salário: " + salary;
    }


}
