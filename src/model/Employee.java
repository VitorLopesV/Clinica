package model;

import util.LngConstants;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe base para os funcionários
 */
public class Employee {

    /** Nome do funcionario. */
    private String name;

    /** Id do funcionario. */
    private int id;

    /** Salário do funcionario. */
    private double salary;

    /** Cargo do funcionario. */
    private String office;

    /** Lista com funcionários registrados no sistema. */
    private final List<Employee> employee = new ArrayList<>();

    public Employee(){}

    /**
     * Construtor.
     * @param name
     * @param id
     * @param salary
     * @param office
     */
    public Employee(String name,int id,double salary, String office){
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.office = office;
    }

    /**
     * Registra um funcionário no sistema.
     * @param employee
     */
    public void registerEmployee(Employee employee){
        this.employee.add(employee);
        System.out.println("\n" + LngConstants.REGISTERED_EMPLOYEE);
    }

    /**
     * Mostra a lista de funcionários cadastrados no sistema.
     */
    public void showEmployeelist(){
        if(employee.size() == 0){
            System.out.println("\n" + LngConstants.EMPLOYEE_NOT_EXIST);
        } else {
            for(Employee loop : employee){
                System.out.println(loop);
            }
        }
    }

    /**
     * Busca funcionário pelo id funcionário.
     * @param id
     */
    public void searchEmployee(int id){
        for(Employee loop : this.employee) {
            if (id == loop.id){
                System.out.println(loop);
            }else{
                System.out.println("\n" + LngConstants.EMPLOYEE_NOT_EXIST);
            }
        }
    }

    /**
     * Remover funcionário do sistema.
     * @param id
     */
    public void deleteEmployee(int id){
        employee.removeIf(loop -> id == loop.id);
        System.out.println("\n" + LngConstants.REMOVE_EMPLOYEE);
    }

    public String toString(){
        return "Nome: " + name + ", Id: " + id + ", Cargo: " + office + ", Salário: " + salary;
    }


}
