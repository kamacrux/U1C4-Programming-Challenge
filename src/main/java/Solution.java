public class Solution {
    /**
     * DO NOT MODIFY THE METHOD NAME OR THE PARAMETERS
     * PLEASE REFER TO THE PROBLEMS.MD FILE FOR QUESTION DETAILS
     **/

    public Solution() {}

    public boolean endsLy(String x) {
        String xSub = "";
        if (x.length()<2){
            xSub = x;
        } else {
            xSub = x.substring(x.length()-2);
        }
        if (xSub.equals("ly")) {
            return true;
        } else {
            return false;
        }
    }

    public String conCat(String s1, String s2) {
        String kitty = s1.substring(s1.length()-1);
        String kitten = "";
        if (s2.length()<1){
            kitten = s2;
        } else {
            kitten = s2.substring(0,1);
        }
        if (kitty.equals(kitten)){
            return s1.substring(0,s1.length()-1) + s2;
        } else {
        return s1 + s2;
    }
    }

    public String withoutX(String s1) {
        String xhi = s1.substring(0,1);
        String hix = s1.substring(s1.length()-1);
        if ((xhi.equals("x") && (hix.equals("x")))) {
            return s1.substring(1,s1.length()-1);
        } else if (hix.equals("x")) {
            return s1.substring(0,s1.length()-1);
        } else if (xhi.equals("x")) {
            return s1.substring(1, s1.length());
        } else {
            return s1;
        }
    }

    public String fizzString(String s1) {
        String fizzy = s1.substring(0,1);
        String buzzy = s1.substring(s1.length()-1);
        if ((fizzy.equals("f")) && (buzzy.equals("b"))) {
            return "FizzBuzz";
        } else if (buzzy.equals("b")) {
            return "Buzz";
        } else if ((fizzy.equals("f"))) {
            return "Fizz";
        } else {
            return s1;
        }
    }

    public String fizzString2(int x) {
        if ((x % 3 == 0) && (x % 5 == 0)){
            return "FizzBuzz!";
        } else if (x % 3 == 0){
            return "Fizz!";
        } else if (x % 5 == 0){
            return "Buzz!";
        } else {
            return x + "!";
            }
    }

}
