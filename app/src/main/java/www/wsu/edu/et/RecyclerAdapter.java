package www.wsu.edu.et;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.BlockViewHolder> {
    private ArrayList<String>blockName;
    private ArrayList<String>blockDescribe;
    private ArrayList<Integer>imageList;
    private Context context;

    public RecyclerAdapter(ArrayList<String> blockName, ArrayList<String> blockDescribe, ArrayList<Integer> imageList, Context context) {
        this.blockName = blockName;
        this.blockDescribe = blockDescribe;
        this.imageList = imageList;
        this.context = context;
    }

    @NonNull
    @Override
    public BlockViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.blocks_list,parent,false);
        return new BlockViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BlockViewHolder holder, int position) {
        holder.textViewblockName.setText(blockName.get(position));
        holder.textViewblockDescribe.setText(blockDescribe.get(position));
        holder.imageView.setImageResource(imageList.get(position ));
        holder.cardView.setOnClickListener(view -> {
            if(position ==0) {
                Uri intentUri = Uri.parse("google.navigation:q=RQM3+2HM, Sodo&mode=w");
                Intent intent = new Intent(Intent.ACTION_VIEW,intentUri);
                intent.setPackage("com.google.android.apps.maps");
                context.startActivity(intent);
            } else if(position ==1) {
                Uri intentUri = Uri.parse("google.navigation:q=RQM3+2HM, Sodo&mode=w");
                Intent intent = new Intent(Intent.ACTION_VIEW,intentUri);
                intent.setPackage("com.google.android.apps.maps");
                context.startActivity(intent);
            } else if(position ==2) {
                Uri intentUri = Uri.parse("google.navigation:q=RQM3+2HM, Sodo&mode=w");
                Intent intent = new Intent(Intent.ACTION_VIEW,intentUri);
                intent.setPackage("com.google.android.apps.maps");
                context.startActivity(intent);
            } else if(position ==3) {
                Uri intentUri = Uri.parse("google.navigation:q=RQM3+2HM, Sodo&mode=w");
                Intent intent = new Intent(Intent.ACTION_VIEW,intentUri);
                intent.setPackage("com.google.android.apps.maps");
                context.startActivity(intent);
            } else if(position ==4) {
                Uri intentUri = Uri.parse("google.navigation:q=RQM3+2HM, Sodo&mode=w");
                Intent intent = new Intent(Intent.ACTION_VIEW,intentUri);
                intent.setPackage("com.google.android.apps.maps");
                context.startActivity(intent);
            } else if(position ==5) {
                Uri intentUri = Uri.parse("google.navigation:q=RQM3+2HM, Sodo&mode=w");
                Intent intent = new Intent(Intent.ACTION_VIEW,intentUri);
                intent.setPackage("com.google.android.apps.maps");
                context.startActivity(intent);
            } else if(position ==6) {
                Uri intentUri = Uri.parse("google.navigation:q=RQM3+2HM, Sodo&mode=w");
                Intent intent = new Intent(Intent.ACTION_VIEW,intentUri);
                intent.setPackage("com.google.android.apps.maps");
                context.startActivity(intent);
            } else if(position ==7) {
                Uri intentUri = Uri.parse("google.navigation:q=RQM3+2HM, Sodo&mode=w");
                Intent intent = new Intent(Intent.ACTION_VIEW,intentUri);
                intent.setPackage("com.google.android.apps.maps");
                context.startActivity(intent);
            } else if(position ==8) {
                Uri intentUri = Uri.parse("google.navigation:q=RQM3+2HM, Sodo&mode=w");
                Intent intent = new Intent(Intent.ACTION_VIEW,intentUri);
                intent.setPackage("com.google.android.apps.maps");
                context.startActivity(intent);
            } else if(position ==9) {
                Uri intentUri = Uri.parse("google.navigation:q=RQM3+2HM, Sodo&mode=w");
                Intent intent = new Intent(Intent.ACTION_VIEW,intentUri);
                intent.setPackage("com.google.android.apps.maps");
                context.startActivity(intent);
            } else if(position ==10) {
                Uri intentUri = Uri.parse("google.navigation:q=RQM3+2HM, Sodo&mode=w");
                Intent intent = new Intent(Intent.ACTION_VIEW,intentUri);
                intent.setPackage("com.google.android.apps.maps");
                context.startActivity(intent);
            } else if(position ==11) {
                Uri intentUri = Uri.parse("google.navigation:q=RQM3+2HM, Sodo&mode=w");
                Intent intent = new Intent(Intent.ACTION_VIEW,intentUri);
                intent.setPackage("com.google.android.apps.maps");
                context.startActivity(intent);
            } else if(position ==12) {
                Uri intentUri = Uri.parse("google.navigation:q=RQM3+2HM, Sodo&mode=w");
                Intent intent = new Intent(Intent.ACTION_VIEW,intentUri);
                intent.setPackage("com.google.android.apps.maps");
                context.startActivity(intent);
            } else if(position ==13) {
                Uri intentUri = Uri.parse("google.navigation:q=RQM3+2HM, Sodo&mode=w");
                Intent intent = new Intent(Intent.ACTION_VIEW,intentUri);
                intent.setPackage("com.google.android.apps.maps");
                context.startActivity(intent);
            } else if(position ==14) {
                Uri intentUri = Uri.parse("google.navigation:q=RQM3+2HM, Sodo&mode=w");
                Intent intent = new Intent(Intent.ACTION_VIEW,intentUri);
                intent.setPackage("com.google.android.apps.maps");
                context.startActivity(intent);
            } else if(position ==15) {
                Uri intentUri = Uri.parse("google.navigation:q=RQM3+2HM, Sodo&mode=w");
                Intent intent = new Intent(Intent.ACTION_VIEW,intentUri);
                intent.setPackage("com.google.android.apps.maps");
                context.startActivity(intent);
            } else if(position ==16) {
                Uri intentUri = Uri.parse("google.navigation:q=RQM3+2HM, Sodo&mode=w");
                Intent intent = new Intent(Intent.ACTION_VIEW,intentUri);
                intent.setPackage("com.google.android.apps.maps");
                context.startActivity(intent);
            } else if(position ==17) {
                Uri intentUri = Uri.parse("google.navigation:q=RQM3+2HM, Sodo&mode=w");
                Intent intent = new Intent(Intent.ACTION_VIEW,intentUri);
                intent.setPackage("com.google.android.apps.maps");
                context.startActivity(intent);
            } else if(position ==18) {
                Uri intentUri = Uri.parse("google.navigation:q=RQM3+2HM, Sodo&mode=w");
                Intent intent = new Intent(Intent.ACTION_VIEW,intentUri);
                intent.setPackage("com.google.android.apps.maps");
                context.startActivity(intent);
            } else if(position ==19) {
                Uri intentUri = Uri.parse("google.navigation:q=RQM3+2HM, Sodo&mode=w");
                Intent intent = new Intent(Intent.ACTION_VIEW,intentUri);
                intent.setPackage("com.google.android.apps.maps");
                context.startActivity(intent);
            } else if(position ==20) {
                Uri intentUri = Uri.parse("google.navigation:q=RQM3+2HM, Sodo&mode=w");
                Intent intent = new Intent(Intent.ACTION_VIEW,intentUri);
                intent.setPackage("com.google.android.apps.maps");
                context.startActivity(intent);
            } else if(position ==21) {
                Uri intentUri = Uri.parse("google.navigation:q=RQM3+2HM, Sodo&mode=w");
                Intent intent = new Intent(Intent.ACTION_VIEW,intentUri);
                intent.setPackage("com.google.android.apps.maps");
                context.startActivity(intent);
            } else if(position ==22) {
                Uri intentUri = Uri.parse("google.navigation:q=RQM3+2HM, Sodo&mode=w");
                Intent intent = new Intent(Intent.ACTION_VIEW,intentUri);
                intent.setPackage("com.google.android.apps.maps");
                context.startActivity(intent);
            } else if(position ==23) {
                Uri intentUri = Uri.parse("google.navigation:q=RQM3+2HM, Sodo&mode=w");
                Intent intent = new Intent(Intent.ACTION_VIEW,intentUri);
                intent.setPackage("com.google.android.apps.maps");
                context.startActivity(intent);
            } else if(position ==24) {
                Uri intentUri = Uri.parse("google.navigation:q=RQM3+2HM, Sodo&mode=w");
                Intent intent = new Intent(Intent.ACTION_VIEW,intentUri);
                intent.setPackage("com.google.android.apps.maps");
                context.startActivity(intent);
            } else if(position ==25) {
                Uri intentUri = Uri.parse("google.navigation:q=RQM3+2HM, Sodo&mode=w");
                Intent intent = new Intent(Intent.ACTION_VIEW,intentUri);
                intent.setPackage("com.google.android.apps.maps");
                context.startActivity(intent);
            } else if(position ==26) {
                Uri intentUri = Uri.parse("google.navigation:q=RQM3+2HM, Sodo&mode=w");
                Intent intent = new Intent(Intent.ACTION_VIEW,intentUri);
                intent.setPackage("com.google.android.apps.maps");
                context.startActivity(intent);
            } else if(position ==27) {
                Uri intentUri = Uri.parse("google.navigation:q=RQM3+2HM, Sodo&mode=w");
                Intent intent = new Intent(Intent.ACTION_VIEW,intentUri);
                intent.setPackage("com.google.android.apps.maps");
                context.startActivity(intent);
            } else if(position ==28) {
                Uri intentUri = Uri.parse("google.navigation:q=RQM3+2HM, Sodo&mode=w");
                Intent intent = new Intent(Intent.ACTION_VIEW,intentUri);
                intent.setPackage("com.google.android.apps.maps");
                context.startActivity(intent);
            } else if(position ==29) {
                Uri intentUri = Uri.parse("google.navigation:q=RQM3+2HM, Sodo&mode=w");
                Intent intent = new Intent(Intent.ACTION_VIEW,intentUri);
                intent.setPackage("com.google.android.apps.maps");
                context.startActivity(intent);
            } else if(position ==30) {
                Uri intentUri = Uri.parse("google.navigation:q=RQM3+2HM, Sodo&mode=w");
                Intent intent = new Intent(Intent.ACTION_VIEW,intentUri);
                intent.setPackage("com.google.android.apps.maps");
                context.startActivity(intent);
            } else if(position ==31) {
                Uri intentUri = Uri.parse("google.navigation:q=RQM3+2HM, Sodo&mode=w");
                Intent intent = new Intent(Intent.ACTION_VIEW,intentUri);
                intent.setPackage("com.google.android.apps.maps");
                context.startActivity(intent);
            } else if(position ==32) {
                Uri intentUri = Uri.parse("google.navigation:q=RQM3+2HM, Sodo&mode=w");
                Intent intent = new Intent(Intent.ACTION_VIEW,intentUri);
                intent.setPackage("com.google.android.apps.maps");
                context.startActivity(intent);
            } else if(position ==33) {
                Uri intentUri = Uri.parse("google.navigation:q=RQM3+2HM, Sodo&mode=w");
                Intent intent = new Intent(Intent.ACTION_VIEW,intentUri);
                intent.setPackage("com.google.android.apps.maps");
                context.startActivity(intent);
            } else if(position ==34) {
                Uri intentUri = Uri.parse("google.navigation:q=RQM3+2HM, Sodo&mode=w");
                Intent intent = new Intent(Intent.ACTION_VIEW,intentUri);
                intent.setPackage("com.google.android.apps.maps");
                context.startActivity(intent);
            } else if(position ==35) {
                Uri intentUri = Uri.parse("google.navigation:q=RQM3+2HM, Sodo&mode=w");
                Intent intent = new Intent(Intent.ACTION_VIEW,intentUri);
                intent.setPackage("com.google.android.apps.maps");
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return blockName.size();
    }

    public class BlockViewHolder extends RecyclerView.ViewHolder {
        private TextView textViewblockName, textViewblockDescribe;
        private ImageView imageView;
        private CardView cardView;
        public BlockViewHolder(@NonNull View itemView) {
            super(itemView);
            textViewblockName = itemView.findViewById(R.id.blockName);
            textViewblockDescribe = itemView.findViewById(R.id.blockDescribe);
            imageView = itemView.findViewById(R.id.profile_image);
            cardView = itemView.findViewById(R.id.blocksList);

        }
    }
}
