import java.lang.reflect.Array;

public class Main {
    public static class StarTriangle{
        int width;
        String symbol ="[*}";
        public StarTriangle(int yourwidth){
            width=yourwidth;
        }
        public String toString(){
            String str="";
            for(int i=0;i<width;i++){
                for(int j=0;j<=i;j++){
                    str=str.concat(symbol);
                }
                str=str+'\n';
            }

            return str;
        }

    }

    public static void main(String[] args) {
	// write your code here
        StarTriangle s=new StarTriangle(3);
        System.out.print(s.toString());
        /*
        String symbol ="[*}";
            String symbol2=symbol;
            String[] triangle=new String[width];
            triangle[0]=symbol;
            for(int i=1;i<width;i++){
                symbol2=symbol2.concat(symbol);
                triangle[i]=symbol2;
            }
            for(int i=0;i<width;i++){
                System.out.println(triangle[i]);
            }
       */
    }
}
