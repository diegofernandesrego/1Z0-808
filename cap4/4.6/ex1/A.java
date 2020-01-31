
class A{
    public static void main(String[] args){
        StringBuffer sb = new StringBuffer(20);
        sb.append("guilherme").delete(2,3);
        System.out.println(sb);
    }
}