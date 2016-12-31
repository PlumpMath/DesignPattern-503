
import java.util.*;


public class SharedStringFactory {
    private Hashtable ht;
    
    public SharedStringFactory(){
        ht = new Hashtable();
    }
    
    public SharedString getSharedStrng(String arg){
        if(ht.containsKey(arg)){
            return (SharedString)ht.get(arg);
        }
        else{
            SharedString str = new SharedString(arg);
            ht.put(arg, str);
            return (SharedString)ht.get(arg);
        }
    }
}
