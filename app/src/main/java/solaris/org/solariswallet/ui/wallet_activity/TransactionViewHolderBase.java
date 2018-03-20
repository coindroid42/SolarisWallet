package solaris.org.solariswallet.ui.wallet_activity;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import solaris.org.solariswallet.R;
import solaris.org.solariswallet.ui.base.tools.adapter.BaseRecyclerViewHolder;
import solaris.org.solariswallet.ui.transaction_detail_activity.TransactionDetailActivity;

/**
 * Created by ming on 2018.3.19.
 */


public class TransactionViewHolderBase extends BaseRecyclerViewHolder {

    CardView cv;
    TextView title;
    TextView description;
    TextView amount;
    TextView amountLocal;
    ImageView imageView;
    TextView txt_scale;
    private final Context context;

    public TransactionViewHolderBase(View itemView) {
        super(itemView);
        context = itemView.getContext();
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Intent intent = new Intent(context, TransactionDetailActivity.class);
                context.startActivity(intent);
            }
        });
        cv = (CardView) itemView.findViewById(R.id.cardView);
        title = (TextView) itemView.findViewById(R.id.title);
        description = (TextView) itemView.findViewById(R.id.description);
        amount = (TextView) itemView.findViewById(R.id.amount);
        txt_scale = (TextView) itemView.findViewById(R.id.txt_scale);
        amountLocal = (TextView) itemView.findViewById(R.id.txt_local_currency);
        imageView = (ImageView) itemView.findViewById(R.id.imageView);
    }

}