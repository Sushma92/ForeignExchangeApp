export class TradingInfo {
    fromCurrency : string;
    toCurrency : string;
    fromCurrencyValue : Float32Array;
    toCurrencyValue : Float32Array;
    tradingDate : Date;
    tradeCompletionDate : Date;
    totalAmount : Float32Array;
    totalDiscount : Float32Array;
    profit : Float32Array;
    overallSum : Float32Array;
}
