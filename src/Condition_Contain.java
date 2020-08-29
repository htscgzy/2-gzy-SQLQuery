public class Condition_Contain extends Condition{

    public Condition_Contain() {
        super("Contain");
    }


    @Override
    public String getCondition() {
        return this.getProperty()+" like "+"\'%"+this.getData()+"%\'";
    }


}
