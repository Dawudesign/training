public class SearchStr {
    public static String searchStr(String str) {
        String res = "";
        String[] strArr = str.split("");
        int count = strArr.length;

        if ( strArr[0].hashCode() == strArr[1].hashCode()) {
            for (int i = 0; i < count; i++ ){
                if (
                        strArr[i].hashCode() != strArr[i + 1].hashCode() && 
                        strArr[i].hashCode() != strArr[i - 1].hashCode()
                ) {
                    res = strArr[i];
                    break;
                }
            }
        } else {
            res = strArr[0];
        }
        return res;
    }

    public static void main (String[] args ){
        String str = "aaaabbbcdddefffghhdcccccc";
        System.out.println(searchStr(str));
    }
}
