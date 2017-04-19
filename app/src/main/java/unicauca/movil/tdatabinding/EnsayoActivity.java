package unicauca.movil.tdatabinding;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import unicauca.movil.tdatabinding.databinding.ActivityEnsayoBinding;
import unicauca.movil.tdatabinding.util.C;

public class EnsayoActivity extends AppCompatActivity {

    ActivityEnsayoBinding binding;
    public static final String EXTRA_POSL ="pos";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityEnsayoBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        int pos = getIntent().getIntExtra(EXTRA_POSL,0); //asumo que llega posicion bajo esa etiqueta


        binding.setEnsayo(C.data.get(pos));

    }
}
