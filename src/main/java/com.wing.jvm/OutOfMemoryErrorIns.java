import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/7/6.
 *
 * VM ARGS  -Xms20m -Xmx20m -XX:+HeadpDumpOnOutOfMemoryError
 */
public class OutOfMemoryErrorIns {
    static class OOMObject{}

    /**
     *
     * @param args
     */
    public static void main(String[] args){
        List<OOMObject>  list=new ArrayList<OOMObject>();
        while(true){
            list.add(new OOMObject());
        }
    }
}
