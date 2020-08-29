public class Condition_LT extends Condition{

    public Condition_LT() {
        super("LT");
    }


    @Override
    public String getCondition() {
        return this.getProperty()+" < "+this.getData();
    }
}
