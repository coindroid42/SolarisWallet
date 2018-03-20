package solaris.org.solariswallet.ui.settings_rates;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import org.solarisj.core.Peer;

import java.util.List;

import solaris.org.solariswallet.SolarisApplication;
import solaris.org.solariswallet.R;
import solaris.org.solariswallet.rate.db.SolarisRate;
import solaris.org.solariswallet.ui.base.BaseRecyclerFragment;
import solaris.org.solariswallet.ui.base.tools.adapter.BaseRecyclerAdapter;
import solaris.org.solariswallet.ui.base.tools.adapter.BaseRecyclerViewHolder;
import solaris.org.solariswallet.ui.base.tools.adapter.ListItemListeners;
import solaris.org.solariswallet.ui.settings_activity.SettingsActivity;
import solaris.org.solariswallet.ui.settings_network_activity.NetworkViewHolder;

/**
 * Created by ming on 2018.3.19.
 */

public class RatesFragment extends BaseRecyclerFragment<SolarisRate> implements ListItemListeners<SolarisRate> {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = super.onCreateView(inflater, container, savedInstanceState);
        setEmptyText("No rate available");
        setEmptyTextColor(Color.parseColor("#cccccc"));
        return view;
    }

    @Override
    protected List<SolarisRate> onLoading() {
        return solarisModule.listRates();
    }

    @Override
    protected BaseRecyclerAdapter<SolarisRate, ? extends SolarisRateHolder> initAdapter() {
        BaseRecyclerAdapter<SolarisRate, SolarisRateHolder> adapter = new BaseRecyclerAdapter<SolarisRate, SolarisRateHolder>(getActivity()) {
            @Override
            protected SolarisRateHolder createHolder(View itemView, int type) {
                return new SolarisRateHolder(itemView,type);
            }

            @Override
            protected int getCardViewResource(int type) {
                return R.layout.rate_row;
            }

            @Override
            protected void bindHolder(SolarisRateHolder holder, SolarisRate data, int position) {
                holder.txt_name.setText(data.getCode());
                if (list.get(0).getCode().equals(data.getCode()))
                    holder.view_line.setVisibility(View.GONE);
            }
        };
        adapter.setListEventListener(this);
        return adapter;
    }

    @Override
    public void onItemClickListener(SolarisRate data, int position) {
        solarisApplication.getAppConf().setSelectedRateCoin(data.getCode());
        Toast.makeText(getActivity(),R.string.rate_selected,Toast.LENGTH_SHORT).show();
        getActivity().onBackPressed();
    }

    @Override
    public void onLongItemClickListener(SolarisRate data, int position) {

    }

    private  class SolarisRateHolder extends BaseRecyclerViewHolder{

        private TextView txt_name;
        private View view_line;

        protected SolarisRateHolder(View itemView, int holderType) {
            super(itemView, holderType);
            txt_name = (TextView) itemView.findViewById(R.id.txt_name);
            view_line = itemView.findViewById(R.id.view_line);
        }
    }
}
