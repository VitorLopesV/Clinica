package util;

import model.MedicalStaff;

/**
 * Classe utilitária de itens que são impressos no console.
 */
public class Console{

    /**
     * Imprime na tela as opções disponíveis no sistema.
     */
    public static void options(){
        System.out.println("\n");
        System.out.println("----------Oque gostaria de fazer ?----------\n");
        System.out.println("1- CADASTRAR FUNCIONÁRIO\n");
        System.out.println("2- LISTAR FUNCIONÁRIOS\n");
        System.out.println("3- BUSCAR FUNCIONÁRIO\n");
        System.out.println("4- EXCLUIR FUNCIONÁRIO\n");
        System.out.println("0- SAIR\n");
    }

    /**
     * Imprime na tela os cargos disponíveis para ocupação.
     */
    public static void medicalStaff(){
        System.out.println("\n");
        System.out.println("----------Qual cargo ele irá ocupar ?----------\n");
        System.out.println("1- Clínico Geral\n");
        System.out.println("2- Pediatra\n");
        System.out.println("3- Ortopedista\n");
        System.out.println("4- Enfermeiro\n");
        System.out.println("5- Técnico de Enfermagem\n");
        System.out.println("6- Médico Terceirizado\n");
    }

}
