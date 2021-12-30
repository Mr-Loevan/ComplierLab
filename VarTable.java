import java.util.HashMap;
import java.util.Stack;

public class VarTable {
    Stack<HashMap<String, Var>> varTables = new Stack<>();
    class Var{
        int reg;
        int val;
        public Var(int reg){
            this.reg = reg;
        }
        public  Var(int reg,int val){
            this.reg = reg;
            this.val = val;
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
    public void put(String s,int val){
        varTables.peek().put(s,new Var(val));
    }
    public void put(String s,int val1,int val2){
        varTables.peek().put(s,new Var(val1,val2));
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
}
