public class ConditionFactory {
    public static final String EQ = "eq";
    public static final String LT = "lt";
    public static final String GT = "gt";
    public static final String LorET = "loret";
    public static final String GorET = "goret";
    public static final String CONTAINS = "contains";


    public static Condition getCondition(String type){
        Condition condition = null;
        if(type.equalsIgnoreCase(ConditionFactory.EQ)){
            condition = new Condition_EQ();
        }else if(type.equalsIgnoreCase(ConditionFactory.LT)){
            condition = new Condition_LT();
        }else if(type.equalsIgnoreCase(ConditionFactory.GT)){
            condition = new Condition_GT();
        }else if(type.equalsIgnoreCase(ConditionFactory.GorET)){
            condition = new Condition_GorET();
        }else if(type.equalsIgnoreCase(ConditionFactory.LorET)){
            condition = new Condition_LorET();
        }else if(type.equalsIgnoreCase(ConditionFactory.CONTAINS)){
            condition = new Condition_Contain();
        }else{
            System.out.println("错误的条件选项");
        }
        return condition;
    }
}
