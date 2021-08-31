package restMoex.service;

import restMoex.model.RootResponse;
import restMoex.model.responseSharesBoards.Root;

public interface MarketService {
    RootResponse read(String ticker, String fromDate, String toDate);
}
