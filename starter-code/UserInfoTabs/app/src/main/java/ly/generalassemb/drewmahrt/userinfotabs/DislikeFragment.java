package ly.generalassemb.drewmahrt.userinfotabs;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class DislikeFragment extends Fragment {


    public DislikeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View dislikeFragView = inflater.inflate(R.layout.fragment_dislike, container, false);
        ListView listView = (ListView) dislikeFragView.findViewById(R.id.dislike_listview);
        String[] dislikes = new String[]{"Birds","And birds","And all the birds","Cold weather","No flavored oatmeal in the pantry"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getContext(),android.R.layout.simple_list_item_1,dislikes);
        listView.setAdapter(adapter);
        return dislikeFragView;
    }

}
