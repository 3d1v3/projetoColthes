package paymon.com.br.myrightclothes;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;

import paymon.com.br.myrightclothes.looks.Calsa;
import paymon.com.br.myrightclothes.looks.ModeloLook;

/**
 * Created by EdivaGt on 16/07/2015.
 */
public class Game {

    private boolean inicioJogo=false;
    GridView gv;//gridviw para mostra os dados na tela
    Context context;


    private Button trocar;
    private Button finalizar;
    private ImageView imagem;
    private boolean vestida=true;
    protected ModeloLook modeloLook;
    //iniciando o git


    public Game( GridView gridView, Context cont, Button finlizarJogo, ImageView imgem){

        this.inicioJogo=true;

        this.finalizar= finlizarJogo;
        this.imagem = imgem;
        this.gv =gridView;
        this.context=cont;

         modeloLook = new Calsa(false, false, false, false);

    }


    public void startGame(){


       // while(inicioJogo){

        int[] list = new int[]{
                R.drawable.blusa_vl, R.drawable.blusa_az,
                R.drawable.img_v_ac,R.drawable.img_v_v,
                R.drawable.img_blm_v,R.drawable.img_bl_p_reg,
                R.drawable.img_blz_v,R.drawable.img_v_ae,
                };



        gv.setAdapter(new GridAdapter(context,list));


        imagem.setImageResource(R.drawable.img_modelo_sem_roupas);

        gv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView parent, View view, int position, long id) {



                trocaImagen((int) id);
            }
        });


    }


    private void trocaImagen(int id){




          switch (id){

              case 0:
                 //imagem.setImageResource(R.drawable.img_modelo_bvl);
                   modeloLook.setPartSuperior(R.drawable.img_modelo_bvl);
                   modeloLook.setParteSuperior(true);
                   break;

              case 1:

                  //imagem.setImageResource(R.drawable.img_modelo_baz);
                  modeloLook.setPartSuperior(R.drawable.img_modelo_baz);
                  modeloLook.setParteSuperior(true);
                  break;

              case 2:
                  //imagem.setImageResource(R.drawable.img_modelo_v_ac);
                   modeloLook.setPartSuperior(R.drawable.img_modelo_v_ac);
                   modeloLook.setParteSuperior(true);
                   break;

              case 3:
                  // imagem.setImageResource(R.drawable.img_modelo_v_v);
                  modeloLook.setPartSuperior(R.drawable.img_modelo_v_v);
                  modeloLook.setParteSuperior(true);
                  break;

              case 4:
                  // imagem.setImageResource(R.drawable.img_modelo_blm_v);
                  modeloLook.setPartSuperior(R.drawable.img_modelo_blm_v);
                  modeloLook.setParteSuperior(true);
                  break;

              case 5:
                  //imagem.setImageResource(R.drawable.img_modelo_bl_preg);
                  modeloLook.setPartSuperior(R.drawable.img_modelo_bl_preg);
                  modeloLook.setParteSuperior(true);
                  break;


              case 6:
                  //  imagem.setImageResource(R.drawable.img_modelo_blz_v);
                  modeloLook.setPartSuperior(R.drawable.img_modelo_blz_v);
                  modeloLook.setParteSuperior(true);
                  break;

              case 7:
                  //  imagem.setImageResource(R.drawable.img_modelo_v_ae);
                  modeloLook.setPartSuperior(R.drawable.img_modelo_v_ae);
                  modeloLook.setParteSuperior(true);
                  break;



          }

            imagem.setImageResource(modeloLook.roupasModelo());

    }


    private void endGame(){

         this.inicioJogo=false;

    }
}
