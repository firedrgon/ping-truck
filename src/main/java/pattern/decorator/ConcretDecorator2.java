package pattern.decorator;

/**
 * ConcretDecorator1
 *
 * @author shenyp
 * @date 2016/12/8
 */
public class ConcretDecorator2 extends Decorator {

    public ConcretDecorator2(Component component) {
        super(component);
    }

    @Override
    public void talk() {
        super.talk();
        this.sing();
    }

    public void sing() {
        System.out.println("会走路！");
    }
}
