package restMoex.service;

import com.google.gson.Gson;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import restMoex.model.RootResponse;
import restMoex.model.requestCandles.Root;
import restMoex.model.responseCandles.Resp;

@Service
public class CandlesBondsService implements MarketService {
    public RootResponse read(String ticker, String fromDate, String toDate) {
        final RestTemplate restTemplate = new RestTemplate();
        String url = "http://iss.moex.com/iss/engines/stock/markets/bonds/securities/" + ticker + "/candles.json?from=" + fromDate + "&till=" + toDate + "&interval=10";
        return getRoot(restTemplate, url);
    }

    static RootResponse getRoot(RestTemplate restTemplate, String url) {
        final String json = restTemplate.getForObject(url, String.class);
        Gson gson = new Gson();
        restMoex.model.requestCandles.Root root = gson.fromJson(json, Root.class);
        Resp resp = new Resp();
        resp.setColumns(root.getCandles().getColumns());
        resp.setData(root.getCandles().getData());
        restMoex.model.responseCandles.Root rootResponse = new restMoex.model.responseCandles.Root();
        rootResponse.setResp(resp);

        return rootResponse;
    }

}
