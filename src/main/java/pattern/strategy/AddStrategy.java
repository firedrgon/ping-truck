package pattern.strategy;

/**
 * AddStrategy
 *
 * @author shenyp
 * @date 2016/11/28
 */
public class AddStrategy implements Strategy {
    @Override
    public int cal(int a, int b) {
        return a + b;
    }
}
