package pattern.decorator;

/**
 * ConcretComponent
 *
 * @author shenyp
 * @date 2016/12/8
 */
public class ConcretComponent implements Component {
    @Override
    public void talk() {
        System.out.println("会说话!");
    }
}
