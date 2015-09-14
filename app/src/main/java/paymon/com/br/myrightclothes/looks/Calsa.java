package paymon.com.br.myrightclothes.looks;

/**
 * Created by EdivaGt on 23/08/2015.
 */
public class Calsa extends ModeloLook {


    public Calsa(boolean vestidar, boolean parteSuperior, boolean partInferior, boolean calsado) {
        super(vestidar, parteSuperior, partInferior, calsado);
    }

    @Override
    public int roupasModelo() {

        //System.out.println("ID da Roupa");
        //System.out.println(this.getPartInferior());

        if(this.isParteSuperior()) {
            System.out.println("Parte superior");
            return this.getPartSuperior();
        }if(this.isPartInferior()){
            System.out.println("Parte inferior");
            return this.getPartInferior();
        }
        if(this.isCalsado()) {
            System.out.println("Calsado testando calcado");
            return this.getPartcalsado();
        }
               return 0;

    }


}
