package unicauca.movil.tdatabinding;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;

import java.util.ArrayList;
import java.util.List;

import unicauca.movil.tdatabinding.adapters.GameAdapter;
import unicauca.movil.tdatabinding.databinding.ActivityEnsayoBinding;
import unicauca.movil.tdatabinding.databinding.ActivityMainBinding;
import unicauca.movil.tdatabinding.models.Game;
import unicauca.movil.tdatabinding.util.C;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    GameAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        C.data = new ArrayList<>();
        adapter = new GameAdapter(getLayoutInflater(), C.data);

        binding.setAdapter(adapter);

        binding.list.setOnItemClickListener(this);

        loadGames();
    }

    private void loadGames() {

        Game g1 = new Game();
        g1.setNombre("Evil Within");
        g1.setDescripcion("Juego de terror para mayores de edad");
        g1.setImg("http://www.powerpyx.com/wp-content/uploads/the-evil-within.jpg");
        g1.setMayor18(true);

        Game g2 = new Game();
        g2.setNombre("GTA");
        g2.setDescripcion("Juego de mundo abierto");
        g2.setImg("https://i.cnnturk.com/ps/cnnturk/75/1280x720/570ccc39f0dc1e1b28cc75a6");
        g2.setMayor18(true);

        Game g3 = new Game();
        g3.setNombre("Overwatch");
        g3.setGenero("Accion");
        g3.setDescripcion("Juego de accion, estilo rpg");
        g3.setImg("https://i.ytimg.com/vi/ha_kbTfyEUk/maxresdefault.jpg");
        g3.setMayor18(false);

        Game g4 = new Game();
        g4.setNombre("World WarCraft");
        g4.setGenero("MMO");
        g4.setDescripcion("Juego de rol");
        g4.setImg("https://www.gamecensor.nl/wp-content/uploads/2017/01/World-of-Warcraft.jpg");
        g4.setMayor18(false);

        C.data.add(g1);
        C.data.add(g2);
        C.data.add(g3);
        C.data.add(g4);

        adapter.notifyDataSetChanged();
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Intent intent = new Intent(this, DetailActivity.class);
        intent.putExtra(DetailActivity.EXTRA_POS, i);
        startActivity(intent);

    }
}
