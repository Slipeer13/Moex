package restMoex.service;

import com.google.gson.Gson;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import restMoex.model.RootResponse;
import restMoex.model.responseSharesBoards.Resp;
import restMoex.model.requestSharesBoards.Root;


@Service
public class SharesService implements MarketService {

    public RootResponse read(String ticker, String fromDate, String toDate) {
        final RestTemplate restTemplate = new RestTemplate();
        String url = "https://iss.moex.com/iss/engines/stock/markets/shares/boards/TQBR/securities/" + ticker + "/securities.json?iss.meta=off&iss.only=marketdata&marketdata.columns=SECID,LAST";
        return getRoot(restTemplate, url);
    }

    static RootResponse getRoot(RestTemplate restTemplate, String url) {
        final String json = restTemplate.getForObject(url, String.class);
        Gson gson = new Gson();
        Root root = gson.fromJson(json, Root.class);
        Resp resp = new Resp();
        resp.setData(root.getMarketdata());
        restMoex.model.responseSharesBoards.Root rootResponse = new restMoex.model.responseSharesBoards.Root();
        rootResponse.setResp(resp);

        return rootResponse;
    }


}
