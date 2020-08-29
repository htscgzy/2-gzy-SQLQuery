public class Condition_LorET extends Condition {
    public Condition_LorET() {
        super("LorET");
    }


    @Override
    public String getCondition() {
        return this.getProperty()+" <= "+this.getData();
    }
}
