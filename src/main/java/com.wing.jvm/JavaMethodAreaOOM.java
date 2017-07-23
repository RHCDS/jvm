import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/7/6.
 *
 * VM ARGS  -XX:MaxPermSize=10m -XX:PermSize=10m
 */
public class JavaMethodAreaOOM {

    /**
     * 1.7 版本以上，不会报错，已经关于intern()的机制和原理发生了变化
     *
     * @param args
     */
    public static void main(String[] args) throws Throwable{

        List<String> list=new ArrayList<String>();
        int i=0;

        while(true){
            list.add(String.valueOf(i++).intern());
        }
    }
}
