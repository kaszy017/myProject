package move;

/**
 * Created by kaszy on 2017-09-10 12:43.
 */
public class MyMove02 {
    public static String change(String from){
        char[] froms = from.toCharArray();
        int length = froms.length;
        for(int i=0;i<length/2;i++){
            char temp = froms[i];
            froms[i]=froms[length-1-i];
            froms[length-1-i]=temp;
        }
        return String.valueOf(froms);
    }

    public static String rightmove(String from,int index){
        from = change(from);
        String first = from.substring(0,index);
        String second = from.substring(index);
        first = change(first);
        second = change(second);
        from = first+second;
        return from;
    }

    public static void main(String[] args) {
        String rightmove = "123124";
        System.out.println("右移三位的结果为:"+rightmove(rightmove,3));
    }
}
