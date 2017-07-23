/**
 * Created by Administrator on 2017/7/6.
 *
 * VM ARGS  -XX:MaxPermSize=10m -XX:PermSize=10m
 */
public class ReferenceCountingGC {

    public Object instance=null;

    private static  final int _1MB=1024*1024;

    private byte[] bigSize=new byte[2 * _1MB];
    /**
     *
     * @param args
     */
    public static void main(String[] args) throws Throwable{
        ReferenceCountingGC objA=new ReferenceCountingGC();
        ReferenceCountingGC objB=new ReferenceCountingGC();

        objA.instance=objB;
        objB.instance=objA;

        objA=null;
        objB=null;

        System.gc();
        String aa="sfdsdfsdf";
        System.out.print(aa.substring(2));
    }
}
