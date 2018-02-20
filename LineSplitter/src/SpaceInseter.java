/**
 * Created by Zul Qarnain on 2/20/2018.
 */
public class SpaceInseter {

    public String[] explode(String s){
        String arr[] = new String[s.length()];
        for(int i = 0; i< s.length();i++){
            arr[i] = String.valueOf(s.charAt(i));
        }
        return arr;
    }
}
