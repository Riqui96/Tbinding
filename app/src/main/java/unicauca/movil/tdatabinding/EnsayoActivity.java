package unicauca.movil.tdatabinding;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import unicauca.movil.tdatabinding.databinding.ActivityEnsayoBinding;
import unicauca.movil.tdatabinding.util.C;

public class EnsayoActivity extends AppCompatActivity {

    ActivityEnsayoBinding binding;
    int m=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityEnsayoBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Bundle b2 = getIntent().getExtras();
        m = b2.getInt("posi");

        binding.setEnsayo(C.data.get(m));

    }
}
