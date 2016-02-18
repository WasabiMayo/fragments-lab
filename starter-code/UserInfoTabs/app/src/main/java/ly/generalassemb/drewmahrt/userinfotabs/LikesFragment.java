package ly.generalassemb.drewmahrt.userinfotabs;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class LikesFragment extends Fragment {


    public LikesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View likeFragView = inflater.inflate(R.layout.fragment_likes, container, false);
        ListView listView = (ListView) likeFragView.findViewById(R.id.like_listview);
        String[] likes = new String[]{"Spicy food", "IPA", "Morning stretching", "Coding"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getContext(),android.R.layout.simple_list_item_1,likes);
        listView.setAdapter(adapter);
        return likeFragView;
    }

}
