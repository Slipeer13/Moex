package restMoex.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import restMoex.model.RootResponse;
import restMoex.service.CandlesBondsService;
import restMoex.service.CandlesService;
import restMoex.service.MarketService;
import restMoex.service.SharesService;

import java.util.Date;

@RestController
public class Controller {
    MarketService marketService;
    RootResponse rootResponse;
    public static Date date;

    @RequestMapping(value = "/{engine}/{ticker}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public RootResponse restMethodShares(@PathVariable String engine, @PathVariable String ticker) {
        if (engine.equals("shares")) {
            date = new Date();
            marketService = new SharesService();
            rootResponse = marketService.read(ticker, null, null);
        }

        return rootResponse;
    }

    @RequestMapping(value = "/{engine}/candles/{ticker}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public RootResponse restMethodCandles(String fromDate, String toDate, @PathVariable String engine, @PathVariable String ticker) {
        if (engine.equals("shares")) {
            date = new Date();
            marketService = new CandlesService();
            rootResponse = marketService.read(ticker, fromDate, toDate);
        }
        if (engine.equals("bonds")) {
            date = new Date();
            marketService = new CandlesBondsService();
            rootResponse = marketService.read(ticker, fromDate, toDate);
        }


        return rootResponse;
    }

}
