import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/7/6.
 *
 * VM ARGS  -Xss128k
 */
public class JavaVMStackSOFIns {
   private int stackLength=1;
    public void stackLeak(){
        stackLength++;
        stackLeak();
    }

    /**
     *
     * @param args
     */
    public static void main(String[] args) throws Throwable{
        JavaVMStackSOFIns javaVMStackSOFIns=new JavaVMStackSOFIns();
        try {
            javaVMStackSOFIns.stackLeak();
        }catch (Throwable e){
            System.out.println("stack length "+javaVMStackSOFIns.stackLength);
            throw e;
        }
    }
}
