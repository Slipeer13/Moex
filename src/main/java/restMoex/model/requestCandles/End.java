package restMoex.model.requestCandles;

public class End {
    public String type;
    public int bytes;
    public int max_size;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getBytes() {
        return bytes;
    }

    public void setBytes(int bytes) {
        this.bytes = bytes;
    }

    public int getMax_size() {
        return max_size;
    }

    public void setMax_size(int max_size) {
        this.max_size = max_size;
    }
}
