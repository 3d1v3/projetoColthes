package paymon.com.br.myrightclothes;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

/**
 * Created by EdivaGt on 22/07/2015.
 */
public class GridAdapter extends BaseAdapter{

    private Context ctx;
    private int[] lista;



    public GridAdapter(Context ctx, int[] list){

        this.ctx = ctx;
        this.lista = list;
    }

    @Override
    public int getCount() {

        return lista.length;
    }

    @Override
    public Object getItem(int position) {

        return lista[position];
    }

    @Override
    public long getItemId(int position) {

        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ImageView iv = new ImageView(ctx);
        iv.setImageResource(lista[position]);
        iv.setAdjustViewBounds(true);


        return iv;
    }
}
