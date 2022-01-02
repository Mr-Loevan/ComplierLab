import java.util.HashMap;
import java.util.Stack;
import java.util.Vector;

public class VarTable {
    Stack<HashMap<String, Var>> varTables = new Stack<>();
    Var currentVar;
    public Integer get(String s){
        int len = varTables.size();
        for (int i = len-1; i >=0; i--) {
            if(varTables.get(i).get(s)!=null){
                currentVar = varTables.get(i).get(s);
                return currentVar.reg;
            }
        }
        return null;
    }
    public Integer getScope(String s){
        if(varTables.peek().get(s)!=null){
            currentVar = varTables.peek().get(s);
            return currentVar.reg;
        }else
            return null;
    }
    public Var getVar(String s){
        int len = varTables.size();
        for (int i = len-1; i >=0; i--) {
            if(varTables.get(i).get(s)!=null){
                currentVar = varTables.get(i).get(s);
                return currentVar;
            }
        }
        return null;
    }
    public void put(String s,int val){
        varTables.peek().put(s,new Var(val));
    }
    public void put(String s,int val,boolean isConst){
        Var var = new Var(val);
        var.isConst = isConst;
        varTables.peek().put(s,var);
    }
    public Var putArray(String s, int val, int dimension, Vector<Integer> dimensions){
        currentVar = new Var(val,dimension,dimensions);
        varTables.peek().put(s,currentVar);
        return currentVar;
    }
    public Var putArray(String s, int val, int dimension, Vector<Integer> dimensions,boolean isConst){
        currentVar = new Var(val,dimension,dimensions);
        currentVar.isConst = isConst;
        varTables.peek().put(s,currentVar);
        return currentVar;
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
