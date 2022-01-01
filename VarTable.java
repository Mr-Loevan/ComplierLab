import java.util.HashMap;
import java.util.Stack;
import java.util.Vector;

public class VarTable {
    Stack<HashMap<String, Var>> varTables = new Stack<>();
    Var currentVar;
    class Var{
        int reg;
        int dimension;
        Vector<Integer> dimensions;
        int capacity;
        int [] bias;
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
    public Integer get(String s){
        int len = varTables.size();
        for (int i = len-1; i >=0; i--) {
            if(varTables.get(i).get(s)!=null){
                return varTables.get(i).get(s).reg;
            }
        }
        return null;
    }
    public Integer getScope(String s){
        if(varTables.peek().get(s)!=null){
            return varTables.peek().get(s).reg;
        }else
            return null;
    }
    public Var getVar(String s){
        return varTables.peek().get(s);
    }
    public void put(String s,int val){
        varTables.peek().put(s,new Var(val));
    }
    public void putArray(String s, int val, int dimension, Vector<Integer> dimensions){
        currentVar = new Var(val,dimension,dimensions);
        varTables.peek().put(s,currentVar);
    }
    public void pushIn(){
        varTables.push(new HashMap<String, Var>());
    }
    public void popOut(){
        varTables.pop();
    }
    public boolean isGlobal(){
        return this.varTables.size() == 1;
    }
    public boolean isGlobal(String s){//no need to consider const or not
        int len = varTables.size();
        for(int i=len-1; i >0;i--){
            if(varTables.get(i).get(s)!=null){
                return false;
            }
        }
        if(varTables.get(0).get(s)==null){
            return false;
        }
        return true;
    }
}
