public class Solution {

    public static boolean validatePin(String pin) {
        if(pin.length() == 4 || pin.length() == 6){
            return pin.split("^[0-9]+").length == 0;
        }
        return false;
    }


    public static void main(String[] args) {
        System.out.println(validatePin("3234"));
    }
}
