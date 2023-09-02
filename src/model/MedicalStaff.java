package model;

import util.LngConstants;

/**
 * Armazena os cargos do corpo médico.
 */
public enum MedicalStaff {

    /** Valores de clinico geral. */
    GENERAL_PRACTITIONER(1,"Clínico Geral"),

    /** Valores de pediatra. */
    PEDIATRICIAN(2, "Pediatra"),

    /** Valores de ortopedista. */
    ORTHOPEDIST(3, "Ortopedista"),

    /** Valores de enfermeiro. */
    NURSE(4, "Enfermeiro"),

    /** Valores de técnico de enfermagem. */
    NURSING_TECHNICIAN(5, "Técnico de Enfermagem"),

    /** Valores de Médico Terceirizado. */
    OUTSOURCED_PHYSICIAN(6, "Médico Terceirizado");

    /** Id do cargo. */
    public int option;

    /** Cargo. */
    public String office;

    /**
     * Construtor.
     * @param option
     * @param office
     */
    MedicalStaff(int option, String office){
        this.option = option;
        this.office = office;
    }

    /**
     * Recebe o cargo do enum.
     * @return
     */
    public String getOffice(){
       return this.office;
    }

    /**
     * Opções de cargos disponívies no sistema.
     * @param option
     * @return
     */
    public static String resoultMedicalStaff(int option){
        String office = null;

        switch (option){
            case 1:
                office = GENERAL_PRACTITIONER.getOffice();
                break;
            case 2:
                office = PEDIATRICIAN.getOffice();
                break;
            case 3:
                office = ORTHOPEDIST.getOffice();
                break;
            case 4:
                office = NURSE.getOffice();
                break;
            case 5:
                office = NURSING_TECHNICIAN.getOffice();
                break;
            case 6:
                office = OUTSOURCED_PHYSICIAN.getOffice();
                break;
            default:
                System.out.println(LngConstants.INVALID_OPTION + "\n");
                break;
        }
        return office;
    }
}
