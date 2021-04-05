package space.example.telegram;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.MyViewHolder> {

    private onClickViewHolder listener;

    List<ItemChat> list = new ArrayList<>();

    public RecyclerAdapter(onClickViewHolder listener) {
        this.listener = listener;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
         View view = inflater.inflate(R.layout.item_chat,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.onBind(list.get(position));
    }



    @Override
    public int getItemCount() {
        return list.size();
    }
    public void adding(ItemChat itemChat){
        list.add(itemChat);
        notifyDataSetChanged();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView userName, lastMessage, userTime;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            userName= itemView.findViewById(R.id.item_user_name_txt);
            lastMessage = itemView.findViewById(R.id.item_chat_last_massage_txt);
            userTime = itemView.findViewById(R.id.item_time_txt);


        }
        private void onBind(ItemChat itemChat) {
            userName.setText(itemChat.getChatName());
            lastMessage.setText(itemChat.getLastMassage());
            userTime.setText(itemChat.getUserTime());
            itemView.setOnClickListener(v -> {
                listener.onClick(itemChat);
            });
        }
    }
    public  interface onClickViewHolder{
        void onClick(ItemChat itemChat);
    }

}
