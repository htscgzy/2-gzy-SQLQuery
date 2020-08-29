public class Condition_EQ extends Condition{
    public Condition_EQ() {
        super("EQ");
    }


    @Override
    public String getCondition() {
        return this.getProperty()+" = "+this.getData();
    }
}
