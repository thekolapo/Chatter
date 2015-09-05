package com.cchum.chatter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by fredicruz on 9/5/2015.
 */
public class ChatterViewHolder extends RecyclerView.ViewHolder {
    public TextView tvName;
    public TextView tvChat;
    public ImageView ivImage;
    public TextView tvPostDate;

    public ChatterViewHolder(View itemView) {
        super(itemView);

        this.tvName = (TextView) itemView.findViewById(R.id.tv_username);
        this.tvChat = (TextView) itemView.findViewById(R.id.tv_chat);
        this.ivImage = (ImageView) itemView.findViewById(R.id.img_profile);
        this.tvPostDate = (TextView) itemView.findViewById(R.id.tv_time);
    }

    public void bind(ChatterModel chat) {
        tvName.setText(chat.getUserName());
        tvChat.setText(chat.getChat());
        ivImage.setImageDrawable(new RoundImage(chat.getBitmap()));
    }

}
