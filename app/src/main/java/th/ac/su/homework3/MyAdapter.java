package th.ac.su.homework3;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import th.ac.su.homework3.model.WordItem;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder>{
    WordItem[] items = {
            new WordItem(R.drawable.great_jagras, "Great Jagras" ,"เกรท จากราท"),
            new WordItem(R.drawable.great_girros, "Great Girros","เกรท จีรอส"),
            new WordItem(R.drawable.kulu_ya_ku, "Kulu Ya Ku","คูลู ยา คู"),
            new WordItem(R.drawable.tzitzi_ya_ku, "Tzitzi Ya Ku","ทิซิสิส ยา คู"),
            new WordItem(R.drawable.anjanath, "Anjanath","อาจานัท"),
            new WordItem(R.drawable.odogaron, "Odogaron","โอโดการอน"),
            new WordItem(R.drawable.bazelgeuse, "Bezelgeuse","เบลเซกีส"),
            new WordItem(R.drawable.nargacuga, "Nargacuga","นากาคูกา"),
            new WordItem(R.drawable.nergigante, "Nergigante","เนกิกันเต้"),
            new WordItem(R.drawable.alatreon, "Alatreon","อลาทีออน"),


    };

    MyAdapter(){

    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_word, parent, false);
        MyViewHolder vh = new MyViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull MyAdapter.MyViewHolder holder, int position) {
        holder.imageView.setImageResource(items[position].imageResId);
        holder.wordTextView.setText(items[position].wordEng);
        holder.wordTextViewTh.setText(items[position].wordTh);

    }

    @Override
    public int getItemCount() {
        return items.length;
    }
    static class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView wordTextView;
        TextView wordTextViewTh;

        MyViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.image_view);
            wordTextView = itemView.findViewById(R.id.word_text_view);
            wordTextViewTh = itemView.findViewById(R.id.word_text_view_th);
        }
    }
}
