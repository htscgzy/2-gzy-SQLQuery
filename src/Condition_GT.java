public class Condition_GT extends Condition{
    public Condition_GT() {
        super("GT");
    }


    @Override
    public String getCondition() {
        return this.getProperty()+" > "+this.getData();
    }
}
