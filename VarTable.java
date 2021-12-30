import java.util.HashMap;
import java.util.Stack;

public class VarTable {
    Stack<HashMap<String, Integer>> varTables = new Stack<>();
    public Integer get(String s){
        int len = varTables.size();
        for (int i = len-1; i >=0; i--) {
            if(varTables.get(i).get(s)!=null){
                return varTables.get(i).get(s);
            }
        }
        return null;
    }
    public Integer getScope(String s){
        if(varTables.peek().get(s)!=null){
            return varTables.peek().get(s);
        }else
            return null;
    }
    public void put(String s,int val){
        varTables.peek().put(s,val);
    }
    public void pushIn(){
        varTables.push(new HashMap<String, Integer>());
    }
    public void popOut(){
        varTables.pop();
    }
}
