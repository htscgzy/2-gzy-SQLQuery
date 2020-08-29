public abstract class Condition {

    private String op;
    private String connector;
    private String property;
    private String data;

    public Condition(String op) {
        this.op = op;
    }

    public String getConnector() {
        return connector;
    }

    public void setConnector(String connector) {
        this.connector = connector;
    }

    public String getProperty() {
        return property;
    }

    public String getData() {
        return data;
    }

    public void setProperty(String property) {
        this.property = property;
    }

    public void setData(String data) {
        this.data = data;
    }

    public abstract String getCondition();

    public String getConntectorAndCondition(){
        return this.connector.toLowerCase()+" "+ getCondition();
    }
}
