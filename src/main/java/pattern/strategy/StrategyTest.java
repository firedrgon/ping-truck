package pattern.strategy;

/**
 * StrategyTest
 *
 * @author shenyp
 * @date 2016/11/28
 */
public class StrategyTest {
    public static void main(String[] args) {
        AddStrategy addStrategy = new AddStrategy();
        Context context = new Context(addStrategy);
        int cal = context.cal(3, 44);
        System.out.println(cal);
    }
}
