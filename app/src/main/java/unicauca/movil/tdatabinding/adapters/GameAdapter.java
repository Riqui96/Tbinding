package unicauca.movil.tdatabinding.adapters;

import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.List;

import unicauca.movil.tdatabinding.databinding.TemplateGameBinding;
import unicauca.movil.tdatabinding.models.Game;


public class GameAdapter extends BaseAdapter {

    LayoutInflater inflater;
    List<Game> data;

    public GameAdapter(LayoutInflater inflater, List<Game> data) {
        this.inflater = inflater;
        this.data = data;
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int i) {
        return data.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        TemplateGameBinding binding = TemplateGameBinding.inflate(inflater);
        binding.setGame(data.get(i));
        return binding.getRoot();
    }
}
