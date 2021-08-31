package restMoex.model.requestCandles;

public class Metadata {
    public Open open;
    public Close close;
    public High high;
    public Low low;
    public Volume value;
    public Volume volume;
    public Begin begin;
    public End end;

    public Open getOpen() {
        return open;
    }

    public void setOpen(Open open) {
        this.open = open;
    }

    public Close getClose() {
        return close;
    }

    public void setClose(Close close) {
        this.close = close;
    }

    public High getHigh() {
        return high;
    }

    public void setHigh(High high) {
        this.high = high;
    }

    public Low getLow() {
        return low;
    }

    public void setLow(Low low) {
        this.low = low;
    }

    public Volume getValue() {
        return value;
    }

    public void setValue(Volume value) {
        this.value = value;
    }

    public Volume getVolume() {
        return volume;
    }

    public void setVolume(Volume volume) {
        this.volume = volume;
    }

    public Begin getBegin() {
        return begin;
    }

    public void setBegin(Begin begin) {
        this.begin = begin;
    }

    public End getEnd() {
        return end;
    }

    public void setEnd(End end) {
        this.end = end;
    }
}
