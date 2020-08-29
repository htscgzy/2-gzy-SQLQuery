import java.util.LinkedList;
import java.util.Scanner;

public class SQLUI {

    public static void main(String[] args) {

        String test_data = "Customers";
        LinkedList<String> testProperties = new LinkedList<>();
        testProperties.add("ID");
        testProperties.add("Company Name");
        testProperties.add("Contact Name");
        testProperties.add("Contact Title");
        testProperties.add("Postal Code");
        testProperties.add("Country");
        Combine combine = new Combine(test_data,testProperties);

        String[] connector = {"eq","lt","gt","loret","goret","contains"};
        String[] opertion = {"and","or"};



        Scanner scanner = new Scanner(System.in);

        int index = 0;
        while (true){
            int flag = 1;
            System.out.print("请输入数据库属性名");
            for(String s:testProperties){
                System.out.print(flag+s+",");
                flag++;
            }
            System.out.println("0 结束");
            int propertyinput = scanner.nextInt();
            if(propertyinput == 0)
                break;
            if(propertyinput >= flag || propertyinput < 0) {
                System.out.println("错误的属性名！请重新输入");
            }else {
                if(index == 0){
                    index++;
                    System.out.println("请输入运算符 1 等于,2 小于,3 大于,4 小于等于,5 大于等于,6 包含");
                    int opinput = scanner.nextInt()-1;
                    if(opinput < 0 || opinput > 6){
                        System.out.println("错误的运算符！请重新输入");
                        break;
                    }
                    System.out.println("请输入查询内容");
                    String datainput = scanner.next();
                    combine.addCondition(connector[opinput],"",testProperties.get(propertyinput-1),datainput);

                }else {
                    System.out.println("请输入连接符 1 and,2 or");
                    int connectorinput = scanner.nextInt();
                    System.out.println("请输入运算符 1 等于,2 小于,3 大于,4 小于等于,5 大于等于,6 包含");
                    int opinput = scanner.nextInt()-1;
                    if(opinput < 0 || opinput > 6){
                        System.out.println("错误的运算符！请重新输入");
                        break;
                    }
                    System.out.println("请输入查询内容");
                    String datainput = scanner.next();
                    combine.addCondition(connector[opinput],opertion[connectorinput-1],testProperties.get(propertyinput-1),datainput);
                }
            }
        }
        System.out.println(combine.createSQL());
    }
}
