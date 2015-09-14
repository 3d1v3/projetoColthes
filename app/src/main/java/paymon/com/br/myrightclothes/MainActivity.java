package paymon.com.br.myrightclothes;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;


public class MainActivity extends ActionBarActivity {

    private Button trocar;
    private Button finalizar;
    private ImageView imagens;
    private boolean vestida=true;
    private GridView gv;

    private Game game;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        setContentView(R.layout.tela_inicial);


       // trocar= (Button) findViewById(R.id.btn_mudar1);
        //finalizar = (Button) findViewById(R.id.btn_pontuacao);
        imagens = (ImageView) findViewById(R.id.img_Modelo);
        gv =(GridView)  findViewById(R.id.gridView);

        game = new Game(gv,this,finalizar, imagens);

        game.startGame();

        //Testando git


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


}
