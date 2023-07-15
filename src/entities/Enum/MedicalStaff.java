package entities.Enum;

/**
 * Armazena os cargos do corpo médico
 */
public enum MedicalStaff {
    /**Recebe o valor de clinico geral*/
    GENERAL_PRACTITIONER(1,"Clínico Geral"),

    /**Recebe o valor de pediatra*/
    PEDIATRICIAN(2, "Pediatra"),

    /**Recebe o valor de ortopedista*/
    ORTHOPEDIST(3, "Ortopedista"),

    /**Recebe o valor de enfermeiro*/
    NURSE(4, "Enfermeiro"),

    /**Recebe o valor de técnico de enfermagem*/
    NURSING_TECHNICIAN(5, "Técnico de Enfermagem"),

    /**Recebe o valor de Médico Terceirizado*/
    OUTSOURCED_PHYSICIAN(6, "Médico Terceirizado");

    public int option;
    public String office;

    MedicalStaff(int option, String office){
        this.option = option;
        this.office = office;
    }

    public String getOffice(){
       return this.office;
    }

}
