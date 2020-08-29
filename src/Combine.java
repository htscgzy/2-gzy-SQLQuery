import java.util.LinkedList;

public class Combine {

    private String dataform;
    private LinkedList<String> properties;

    private LinkedList<Condition> conditions = new LinkedList<>();

    public Combine(String dataform, LinkedList<String> properties) {
        this.dataform = dataform;
        this.properties = properties;
    }

    public void addCondition(String type, String connector, String property, String data){

        if(properties.indexOf(property)<0){
            System.out.println("错误的属性！！");
            return;
        }

        Condition condition = ConditionFactory.getCondition(type);
        if(condition == null){
            return;
        }
        condition.setConnector(connector);
        condition.setData(data);
        condition.setProperty(property);
        conditions.add(condition);
    }

    public String createSQL(){

        StringBuilder stringBuilder = new StringBuilder();
        if(conditions.size() == 0)
            stringBuilder.append("select * from "+this.dataform);
        else{
            stringBuilder.append("select * from "+this.dataform+" where");
            for(Condition condition:conditions){
                if(condition.getConnector() == ""){
                    stringBuilder.append(condition.getConntectorAndCondition());
                    continue;
                }
                stringBuilder.append(" ");
                stringBuilder.append(condition.getConntectorAndCondition());
            }
        }

        stringBuilder.append(";");
        return stringBuilder.toString();

    }


}