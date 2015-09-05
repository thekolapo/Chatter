package com.cchum.chatter;

import java.util.ArrayList;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
/**
 * Created by Kolapo on 8/1/2015.
 */
public class ChatterRecyclerViewAdapter extends RecyclerView.Adapter<ChatterViewHolder>{

    private ArrayList<ChatterModel> mModels;
    private Context context;

    // Pass in the context and event list into the constructor
    public ChatterRecyclerViewAdapter(Context context, ArrayList<ChatterModel> models){
        this.context = context;
        mModels = new ArrayList<>(models);
    }

    @Override
    public ChatterViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // Inflate the custom layout
        View itemView = LayoutInflater.from(context).
                inflate(R.layout.layout_chatter_row, parent, false);
        // Return a new holder instance
        return new ChatterViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(ChatterViewHolder holder, int position) {
        final ChatterModel model = mModels.get(position);
        holder.bind(model);
    }

    @Override
    public int getItemCount() {
        return mModels.size();
    }

}
