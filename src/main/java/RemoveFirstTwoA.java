

public class RemoveFirstTwoA {
    public String removeA(String str) {

        String res = str;

        if(str.length()<=2 && str.contains("A"))
            res = str.replace("A","");
        else if(str.contains("A")) {
            String firstPartOfString = str.substring(0,2);
            String lastPartOfString = str.substring(2,str.length());
            res = firstPartOfString.replace("A", "") + lastPartOfString;
        }
        return res;
    }

}
