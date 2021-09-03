Docker image: https://hub.docker.com/r/slipeer13/moex
Порт приложения в контейнере 8080

Для получения цены последней сделки по тикеру акции запрос:/shares/{ticker}
  ticker = SECID https://iss.moex.com/iss/engines/stock/markets/shares/boards/TQBR/securities 

Для получения истории изменения цены акции по диапазону дат, запрос:/shares/candles/{ticker}?fromDate={ГГГГ-ММ-ДД}&toDate={ГГГГ-ММ-ДД}
  ticker = SECID https://iss.moex.com/iss/engines/stock/markets/shares/boards/TQBR/securities

Для получения истории изменения цены облигации по диапазону дат, запрос:/bonds/candles/{ticker}?fromDate={ГГГГ-ММ-ДД}&toDate={ГГГГ-ММ-ДД}
  ticker = SECID https://iss.moex.com/iss/engines/stock/markets/bonds/boards/TQCB/securities
