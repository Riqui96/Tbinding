package unicauca.movil.tdatabinding;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import unicauca.movil.tdatabinding.databinding.ActivityDetailBinding;
import unicauca.movil.tdatabinding.models.Game;
import unicauca.movil.tdatabinding.util.C;

public class DetailActivity extends AppCompatActivity implements View.OnClickListener {

    public static final String EXTRA_POS ="pos";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityDetailBinding binding = ActivityDetailBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        int pos = getIntent().getIntExtra(EXTRA_POS,0); //asumo que llega posicion bajo esa etiqueta


        binding.setGame(C.data.get(pos));
        binding.btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent(this, EnsayoActivity.class);
        startActivity(intent);
    }
}
