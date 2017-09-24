package move;

/**
 * Created by kaszy on 2017-09-10 12:28.
 */
public class MyMove {
    public static String rechange(String from){
        char[] froms = from.toCharArray();//String.toCharArray 方法 ,作用：将字符串转换为字符数组。
        int length = froms.length;
        for(int i=0;i<length/2;i++){
            char temp = froms[i];
            froms[i]=froms[length-1-i];
            froms[length-1-i]=temp;
        }
        //在读取数据时需要对数据的强制转换，可采用String.valueOf(a)，把a强制转换成字符串类型
        return String.valueOf(froms);
    }

    public static String rightmove(String from,int index){
        from = rechange(from);
        String first = from.substring(0,index);
        String second = from.substring(index);
        first=rechange(first);
        second=rechange(second);
        from=first+second;
        return from;
    }

    public static void main(String[] args) {
        String rightstring = "abcdefghij";
        System.out.println("右移3位结果为："+rightmove(rightstring,3));
    }
}
