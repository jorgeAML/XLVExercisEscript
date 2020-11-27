import java.util.StringTokenizer;

public class SumLong {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder();
        for(String text: args){
            sb.append(text);
            sb.append(";");
        }
        String allString=new String(sb);
        StringTokenizer stk=new StringTokenizer(allString, " \";");
        int sum=0;
        while(stk.hasMoreTokens()){
            sum+=Integer.parseInt(stk.nextToken());
        }
        System.out.println(sum+"");
    }
}
