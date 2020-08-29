import org.junit.Test;

import java.util.LinkedList;

public class test {

    @Test
    public void testCreateSQL_noCondition(){

        String test_data = "Customers";
        LinkedList<String> testProperties = new LinkedList<>();
        testProperties.add("ID");
        testProperties.add("Company Name");
        testProperties.add("Contact Name");
        testProperties.add("Contact Title");
        testProperties.add("Postal Code");
        testProperties.add("Country");
        Combine combine = new Combine(test_data,testProperties);

        System.out.println(combine.createSQL());
    }

    @Test
    public void testCreateSQL_oneCondition(){

        String test_data = "Customers";
        LinkedList<String> testProperties = new LinkedList<>();
        testProperties.add("ID");
        testProperties.add("Company Name");
        testProperties.add("Contact Name");
        testProperties.add("Contact Title");
        testProperties.add("Postal Code");
        testProperties.add("Country");
        Combine combine = new Combine(test_data,testProperties);

        combine.addCondition(ConditionFactory.EQ,"","Postal Code","321");
        System.out.println(combine.createSQL());
    }

    @Test
    public void testCreateSQL_multiConditions(){

        String test_data = "Customers";
        LinkedList<String> testProperties = new LinkedList<>();
        testProperties.add("ID");
        testProperties.add("Company Name");
        testProperties.add("Contact Name");
        testProperties.add("Contact Title");
        testProperties.add("Postal Code");
        testProperties.add("Country");
        Combine combine = new Combine(test_data,testProperties);

        combine.addCondition(ConditionFactory.EQ,"","ID","321");
        combine.addCondition(ConditionFactory.EQ,"AND","Company Name","HT");
        System.out.println(combine.createSQL());
    }

    @Test
    public void testCreateSQL_multiconntectorsConditions(){

        String test_data = "Customers";
        LinkedList<String> testProperties = new LinkedList<>();
        testProperties.add("ID");
        testProperties.add("Company Name");
        testProperties.add("Contact Name");
        testProperties.add("Contact Title");
        testProperties.add("Postal Code");
        testProperties.add("Country");
        Combine combine = new Combine(test_data,testProperties);

        combine.addCondition(ConditionFactory.GorET,"","ID","321");
        combine.addCondition(ConditionFactory.CONTAINS,"AND","Company Name","HT");
        System.out.println(combine.createSQL());
    }

    @Test
    public void testCreateSQL_invalidConditions(){

        String test_data = "Customers";
        LinkedList<String> testProperties = new LinkedList<>();
        testProperties.add("ID");
        testProperties.add("Company Name");
        testProperties.add("Contact Name");
        testProperties.add("Contact Title");
        testProperties.add("Postal Code");
        testProperties.add("Country");
        Combine combine = new Combine(test_data,testProperties);

        combine.addCondition(ConditionFactory.EQ,"","ID","321");

        //invalid property
        combine.addCondition(ConditionFactory.EQ,"AND","Postal","31");
        System.out.println(combine.createSQL());
    }


}
