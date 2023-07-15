package core;

import entities.Enum.MedicalStaff;

/**
 * Classe que armazena itens impressos no console
 */
public class Console{

    /**Imprime na tela as opções disponíveis no sistema*/
    public void options(){
        System.out.println("----------Oque gostaria de fazer ?----------\n");
        System.out.println("1- CADASTRAR FUNCIONÁRIO\n");
        System.out.println("2- LISTAR FUNCIONÁRIOS\n");
        System.out.println("3- BUSCAR FUNCIONÁRIO\n");
        System.out.println("4- EXCLUIR FUNCIONÁRIO\n");
        System.out.println("0- SAIR\n");
    }

/**Imprime na tela os cargos disponíveis para ocupação*/
    public void medicalStaff(){
        System.out.println("----------Qual cargo ele irá ocupar ?----------\n");
        System.out.println("1- Clínico Geral\n");
        System.out.println("2- Pediatra\n");
        System.out.println("3- Ortopedista\n");
        System.out.println("4- Enfermeiro\n");
        System.out.println("5- Técnico de Enfermagem\n");
        System.out.println("6- Médico Terceirizado\n");
    }

    public String resoultMedicalStaff(int option){
        String office = null;

        switch (option){
            case 1:
                MedicalStaff generalPractitioner = MedicalStaff.GENERAL_PRACTITIONER;
                office = generalPractitioner.getOffice();
                break;

            case 2:
                MedicalStaff pediatrician = MedicalStaff.PEDIATRICIAN;
                office = pediatrician.getOffice();
                break;

            case 3:
                MedicalStaff orthopedist = MedicalStaff.ORTHOPEDIST;
                office = orthopedist.getOffice();
                break;

            case 4:
                MedicalStaff nurse = MedicalStaff.NURSE;
                office = nurse.getOffice();
                break;

            case 5:
                MedicalStaff nursingTechnician = MedicalStaff.NURSING_TECHNICIAN;
                office = nursingTechnician.getOffice();
                break;

            case 6:
                MedicalStaff outsourcedPhysician = MedicalStaff.OUTSOURCED_PHYSICIAN;
                office = outsourcedPhysician.getOffice();
                break;

            default:
                System.out.println("Cargo não existente!\n");

        }
        return office;
    }
}
