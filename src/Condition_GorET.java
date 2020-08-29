public class Condition_GorET extends Condition{

    public Condition_GorET() {
        super("GorET");
    }


    @Override
    public String getCondition() {
        return this.getProperty()+" >= "+this.getData();
    }
}
