import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/7/6.
 *
 * VM ARGS  -XX:MaxPermSize=10m -XX:PermSize=10m
 */
public class RunTimeConstantPoolOOM {

    /**
     *
     * @param args
     */
    public static void main(String[] args) throws Throwable{

        String str1=new StringBuilder("py").append("thon").toString();
        System.out.println(str1.intern()==str1);

        String str2=new StringBuilder("li").append("nux").toString();
        System.out.println(str2.intern()==str2);

        List<String> list=new ArrayList<String>();
        int i=0;
        while(true){
            list.add(String.valueOf(i++).intern());
        }
    }
}
