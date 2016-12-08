package pattern.decorator;

/**
 * Client
 *
 * @author shenyp
 * @date 2016/12/8
 */
public class Client {
    public static void main(String[] args) {
        Component component = new ConcretComponent();
        ConcretDecorator1 decorator1 = new ConcretDecorator1(component);
        decorator1.talk();
        System.out.println("======================");
    }
}
