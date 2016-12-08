package pattern.decorator;

/**
 * ConcretDecorator1
 *
 * @author shenyp
 * @date 2016/12/8
 */
public class ConcretDecorator1 extends Decorator {

    public ConcretDecorator1(Component component) {
        super(component);
    }

    @Override
    public void talk() {
        super.talk();
        this.sing();
    }

    private void sing() {
        System.out.println("会唱歌！");
    }
}
