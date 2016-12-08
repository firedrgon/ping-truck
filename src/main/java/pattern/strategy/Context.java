package pattern.strategy;

/**
 * Context
 *
 * @author shenyp
 * @date 2016/11/28
 */
public class Context{
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public Strategy getStrategy() {
        return strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public int cal(int a, int b) {
        return strategy.cal(a, b);
    }
}
