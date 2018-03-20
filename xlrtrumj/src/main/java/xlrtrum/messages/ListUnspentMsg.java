package xlrtrum.messages;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by mingxiao on 2018.3.19.
 */

public class ListUnspentMsg extends BaseMsg<ListUnspentMsg> {

    private String address;

    public ListUnspentMsg(String address) {
        super(Method.LIST_UNSPENT.getMethod());
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public void toJson(JSONObject jsonObject) throws JSONException {
        JSONObject addressJson = new JSONObject();
        addressJson.put("address",address);
        jsonObject.put("params",addressJson);
    }
}
