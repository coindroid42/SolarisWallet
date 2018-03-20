package solaris.org.solariswallet.ui.contacts_activity;

import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.TextView;

import solaris.org.solariswallet.R;
import solaris.org.solariswallet.ui.base.tools.adapter.BaseRecyclerViewHolder;

/**
 * Created by mingxiao on 2018.3.19.
 */

public class ContactViewHolderBase extends BaseRecyclerViewHolder {

    CardView cv;
    TextView name;
    TextView address;

    ContactViewHolderBase(View itemView) {
        super(itemView);
        cv = (CardView) itemView.findViewById(R.id.cardView);
        name = (TextView) itemView.findViewById(R.id.name);
        address = (TextView) itemView.findViewById(R.id.address);
    }
}
