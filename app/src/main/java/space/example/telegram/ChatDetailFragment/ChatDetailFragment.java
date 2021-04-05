package space.example.telegram.ChatDetailFragment;

import android.graphics.drawable.Drawable;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import space.example.telegram.R;


public class ChatDetailFragment extends Fragment {

    private TextView userName2, userLastMessage2, userTime2;
    private String name, lastMessage, time;


    public ChatDetailFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        Bundle bundle = getArguments();
        if (bundle != null) {
            name = bundle.getString("user Name");
            lastMessage = bundle.getString("user last message");
            time = bundle.getString("user time");
        }
        super.onCreate(savedInstanceState);
        
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_chat_detail, container, false);
        userName2 = view.findViewById(R.id.txt_user_name);
        userLastMessage2 = view.findViewById(R.id.txt_message);
        userTime2 = view.findViewById(R.id.txt_time);
        userName2.setText(name);
        userLastMessage2.setText(lastMessage);
        userTime2.setText(time);
        return view;
    }
}