package restMoex.model.responseSharesBoards;

import restMoex.controller.Controller;
import restMoex.model.RootResponse;

import java.util.Date;

public class Root implements RootResponse {
    public Resp resp;
    public long responseTime = (new Date().getTime() - Controller.date.getTime());

    public Resp getResp() {
        return resp;
    }

    public void setResp(Resp resp) {
        this.resp = resp;
    }

    public long getResponseTime() {
        return responseTime;
    }

    public void setResponseTime(int responseTime) {
        this.responseTime = responseTime;
    }
}
