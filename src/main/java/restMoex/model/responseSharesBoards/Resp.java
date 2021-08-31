package restMoex.model.responseSharesBoards;

import restMoex.model.requestSharesBoards.Marketdata;

import java.util.ArrayList;
import java.util.List;

public class Resp {
    public List<Datum> data = new ArrayList<Datum>();;
    public void setData(Marketdata marketdata) {
        Datum datum = new Datum();
            for (List<Object> list : marketdata.getData()) {
                datum.ticker = (String) list.get(0);
                datum.lastPrice = (Double) list.get(1);
            }
            data.add(datum);
    }
}
