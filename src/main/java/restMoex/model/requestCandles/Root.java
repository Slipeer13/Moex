package restMoex.model.requestCandles;

import restMoex.model.RootResponse;

public class Root implements RootResponse {
    public Candles candles;

    public Candles getCandles() {
        return candles;
    }

    public void setCandles(Candles candles) {
        this.candles = candles;
    }
}
