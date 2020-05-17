package Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.ayoubsmatti.recyclerview.InfoActivity;
import com.ayoubsmatti.recyclerview.R;

import java.util.List;

import Model.Listitem;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    private Context context;
    private List<Listitem> listitems;
    public MyAdapter(Context context, List listitem) {
        this.context = context;
        this.listitems = listitem;
    }

    @NonNull
    @Override
    public MyAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_row,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyAdapter.ViewHolder holder, int position) {
        Listitem item = listitems.get(position);
        holder.name.setText(item.getName());
        holder.description.setText(item.getDescription());
    }

    @Override
    public int getItemCount() {
        return listitems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        private TextView name;
        private TextView  description;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);
            name = itemView.findViewById(R.id.title);
            description = itemView.findViewById(R.id.myinfo);
        }

        @Override
        public void onClick(View v) {
            int position = getAdapterPosition();
            Listitem item = listitems.get(position);
            Intent intent = new Intent(context, InfoActivity.class);
            intent.putExtra("name",item.getName());
            intent.putExtra("description",item.getDescription());
            context.startActivity(intent);
        }
    }
}
