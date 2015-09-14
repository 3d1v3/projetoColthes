package paymon.com.br.myrightclothes.looks;

/**
 * Created by EdivaGt on 23/08/2015.
 *
 */
public abstract class ModeloLook {

    private boolean vestidar=false;
    private boolean parteSuperior=false;
    private boolean parteInferior =false;
    private boolean calsado =false;
    private int partSuperior;
    private int partInferior;
    private int partcalsado;
    private double versar=1.0;//novo commite push agora

    public int getPartSuperior() {
        return partSuperior;
    }

    public void setPartSuperior(int partSuperior) {
        this.partSuperior = partSuperior;
    }

    public int getPartInferior() {
        return partInferior;
    }

    public void setPartInferior(int partInferior) {
        this.partInferior = partInferior;
    }

    public int getPartcalsado() {
        return partcalsado;
    }

    public void setPartcalsado(int partcalsado) {
        this.partcalsado = partcalsado;
    }

    protected ModeloLook(boolean vestidar, boolean parteSuperior, boolean partInferior, boolean calsado) {
        this.vestidar = vestidar;
        this.parteSuperior = parteSuperior;
        this.parteInferior = parteInferior;
        this.calsado = calsado;
    }

    public boolean isVestidar() {
        return vestidar;
    }

    public void setVestidar(boolean vestidar) {
        this.vestidar = vestidar;
    }

    public boolean isParteSuperior() {
        return parteSuperior;
    }

    public void setParteSuperior(boolean parteSuperior) {
        this.parteSuperior = parteSuperior;
    }

    public boolean isPartInferior() {
        return parteInferior;
    }

    public void setPartInferior(boolean partInferior) {
        this.parteInferior = partInferior;
    }

    public boolean isCalsado() {
        return calsado;
    }

    public void setCalsado(boolean calsado) {
        this.calsado = calsado;
    }


    public abstract  int roupasModelo();
}
