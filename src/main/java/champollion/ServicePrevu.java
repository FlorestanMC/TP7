package champollion;


public class ServicePrevu {
	// TODO : implémenter cette classe

    private UE UE;

    private int CM;
    private int TD;
    private int TP;

    private Enseignant Enseignant;

    public ServicePrevu(UE UE, int CM, int TD, int TP, Enseignant Enseignant) {

        this.UE = UE;
        this.CM = CM;
        this.TD = TD;
        this.TP = TP;
        this.Enseignant = Enseignant;


    }


    public float getTotal() {
        return Math.round(CM*1.5+TD+TP*0.75);
    }
    public champollion.UE getUE() {
        return UE;
    }

    public void setUE(champollion.UE UE) {
        this.UE = UE;
    }

    public int getCM() {
        return CM;
    }

    public void setCM(int CM) {
        this.CM = CM;
    }

    public int getTD() {
        return TD;
    }

    public void setTD(int TD) {
        this.TD = TD;
    }

    public int getTP() {
        return TP;
    }

    public void setTP(int TP) {
        this.TP = TP;
    }

    public champollion.Enseignant getEnseignant() {
        return Enseignant;
    }

    public void setEnseignant(champollion.Enseignant enseignant) {
        Enseignant = enseignant;
    }

}

