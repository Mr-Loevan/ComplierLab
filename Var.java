import java.util.Vector;

public class Var{
    int reg;
    int dimension;
    Vector<Integer> dimensions;
    int capacity;
    int [] bias;
    boolean isConst;
    public Var(int reg){
        this.reg = reg;
    }
    public Var(int reg,int dimension,Vector<Integer> dimensions){
        this.reg = reg;
        this.dimension = dimension;
        this.dimensions = dimensions;
        this.capacity=1;
        this.dimensions.forEach(item -> capacity*=item);
        this.bias = new int[dimension];
        bias[dimension-1]=1;
        for (int i = dimension-2; i >= 0; i--)
            bias[i] = bias[i+1]* dimensions.get(i + 1);
    }
}
