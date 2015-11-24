package phasefour.explistview;

import android.app.ExpandableListActivity;
import android.os.Bundle;
import android.widget.SimpleExpandableListAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ExpandableListMain extends ExpandableListActivity {

    public static String TAG = "DEBUGGING";
    private SimpleExpandableListAdapter expListAdapter;

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        expListAdapter = new SimpleExpandableListAdapter(
                        this,
                        createGroupList(),              // Creating group List.
                        R.layout.group_row,             // Group item layout XML.
                        new String[] { "Group Item" },  // the key of group item.
                        new int[] { R.id.row_name },    // ID of each group item.-Data under the key goes into this TextView.
                        createChildList(),              // childData describes second-level <span id="IL_AD6" class="IL_AD">entries</span>.
                        R.layout.child_row,             // Layout for sub-level entries(second level).
                        new String[] {"Sub Item"},      // Keys in childData maps to display.
                        new int[] { R.id.grp_child}     // Data under the keys above go into these TextViews.
                );

        setListAdapter(expListAdapter);

    }

    /* Creating the Hashmap for the row */
    @SuppressWarnings("unchecked")
    private List createGroupList() {
        ArrayList result = new ArrayList();
        for( int i = 0 ; i < 5 ; ++i ) {
            HashMap m = new HashMap();
            m.put( "Group Item","Group Item " + i ); // the key and it's value.
            result.add(m);
        }
        return (List)result;
    }

    /* creatin the HashMap for the children */
    @SuppressWarnings("unchecked")
    private List createChildList() {

        ArrayList result = new ArrayList();
        for( int i = 0 ; i < 5 ; ++i ) {

            ArrayList secList = new ArrayList();
            for( int n = 0 ; n < 6 ; n++ ) {
                HashMap child = new HashMap();
                child.put( "Sub Item", "Sub Item " + n );
                secList.add( child );
            }
            result.add(secList);

        }
        return result;
    }


}