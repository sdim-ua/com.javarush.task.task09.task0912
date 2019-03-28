
public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        try{
        int num = Integer.parseInt("XYZ");
        System.out.println(num);
        }
        catch(NumberFormatException e){
             System.out.println(e.getClass());
        }
        //напишите тут ваш код
    }
}
