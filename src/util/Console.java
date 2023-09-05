package util;

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
        System.out.println("Cargo de ocupação.\n");
        System.out.println("1- CLÍNICO GERAL\n");
        System.out.println("2- PEDIATRA\n");
        System.out.println("3- ORTOPEDISTA\n");
        System.out.println("4- ENFERMEIRO\n");
        System.out.println("5- TÉCNICO DE ENFERMAGEM\n");
        System.out.println("6- MÉDICO TERCEIRIZADO\n");
    }

    /**
     * Boas vindas ao sistema.
     */
    public static void welcome(){
        System.out.println("\nSEJA BEM VINDO A CLÍNICA BEM VIVER!");
    }

}
