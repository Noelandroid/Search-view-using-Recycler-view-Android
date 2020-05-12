package noel.example.com.searchviewwithtextandimage;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;
import androidx.recyclerview.widget.RecyclerView;


public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.ViewHolder> {



   private  List<Movies> movielist;

    public MovieAdapter(List<Movies> movielist) {

        this.movielist = movielist;

    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout, parent, false);

        ViewHolder viewHolder = new ViewHolder(view);

        return viewHolder;
    }



    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        Movies movieDetails = movielist.get(position);

        holder.Image.setImageResource(movieDetails.getImageResource());

        holder.Name.setText(movieDetails.getName());

        holder.Year.setText(movieDetails.getYear());




    }





    @Override
    public int getItemCount() {

        return movielist.size();
    }





    class ViewHolder extends RecyclerView.ViewHolder {

        public TextView Name;
        public TextView Year;
        public ImageView Image;





        public ViewHolder(View itemView) {

            super(itemView);

            Image=(ImageView) itemView.findViewById(R.id.imageView);

            Name = (TextView) itemView.findViewById(R.id.textViewName);

            Year = (TextView) itemView.findViewById(R.id.textViewYear);


        }


    }
        public void  retrieveList(ArrayList<Movies> filternames){

        this.movielist=filternames;
        notifyDataSetChanged();
        }



}
