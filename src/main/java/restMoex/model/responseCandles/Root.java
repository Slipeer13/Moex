package restMoex.model.responseCandles;

import restMoex.controller.Controller;
import restMoex.model.RootResponse;

import java.util.Date;

public class Root implements RootResponse {
    Resp resp;
    public long responseTime = (new Date().getTime() - Controller.date.getTime());

    public Resp getResp() {
        return resp;
    }

    public void setResp(Resp resp) {
        this.resp = resp;
    }
}
