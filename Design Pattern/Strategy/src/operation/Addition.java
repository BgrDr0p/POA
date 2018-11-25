package operation;
import operation.IStrategy;
public class Addition implements IStrategy {

    @Override
    public int doOperation(int num1, int num2)
    {
        return num1 + num2;
    }


}
