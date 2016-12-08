package pattern.decorator;

/**
 * Decorator
 *
 * @author shenyp
 * @date 2016/12/8
 */
public class Decorator implements Component {
    private Component component;
    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void talk() {
        component.talk();
    }
}
