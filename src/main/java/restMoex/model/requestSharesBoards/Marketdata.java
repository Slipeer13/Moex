package restMoex.model.requestSharesBoards;


import java.util.List;

public class Marketdata {
    public List<String> columns;
    public List<List<Object>> data;

    public List<String> getColumns() {
        return columns;
    }

    public void setColumns(List<String> columns) {
        this.columns = columns;
    }

    public List<List<Object>> getData() {
        return data;
    }

    public void setData(List<List<Object>> data) {
        this.data = data;
    }
}
