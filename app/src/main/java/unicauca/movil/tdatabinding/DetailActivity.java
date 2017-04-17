package unicauca.movil.tdatabinding;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import unicauca.movil.tdatabinding.databinding.ActivityDetailBinding;
import unicauca.movil.tdatabinding.models.Game;

public class DetailActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityDetailBinding binding = ActivityDetailBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Game game = new Game();
        game.setNombre("Evil Within");
        game.setGenero("Terror");
        game.setDescripcion("Juego de terror para mayores de edad");
        game.setImg("http://www.powerpyx.com/wp-content/uploads/the-evil-within.jpg");

        binding.setGame(game);

        binding.btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

    }
}
