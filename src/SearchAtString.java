public class SearchAtString {
        public static void main(String[] args) {
           String name="TALIF ALI";
            char target='T';
            System.out.println(Search(name,target));
}


static boolean Search(String str, char target) {
     if (str.length() == 0) {
         return false;
            }
    for (int i = 0; i < str.length(); i++) {

        if (target==str.charAt(i)) {
            return true;
        }
    }
     return false;
    }
}
