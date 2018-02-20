/**
 * Created by Zul Qarnain on 2/13/2018.
 */
public class FNSClass {

    String q0[][] = {{" ","q1", " "}};
    String q1[][] = {{"q2", " ", " "}};
    String q2[][] = {{"q3", " ", " "}};
    String q3[][] = {{"q3", " ", " "}};
    String q4[][] = {{" ", " ", "q4"}};

    public static void main(String args[]){
        FNSClass fnsClass =new FNSClass();
        fnsClass.imulate();
    }
    public void imulate() {
        String res[][] =new String[][]{};
        String arr[][]=new String[][]{};

        String input[][] = {
                {" ", "q1", " "},
                {"q2", "    ", " "},
                {"q3", " ", " "},
                {"q3", " ", " "},
                {" ", " ", "q4"}
        };/* String input[][] = {
                {" ", "q1", " "},
                {"q2", " ", " "},
                {"q3", " ", " "},
                {"q3", " ", " "},
                {" ", " ", "q4"}
        };*/
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                arr =getTransaction(i);
                if(input[i][j].equals(arr[0][j])){
                    res=arr;
                }
                else {
                    System.out.println("not match");
                    return;
                }
            }
            if(res[0][2].equals("q4"))
            System.out.println("matched");
        }

    }

    private String[][] getTransaction(int i) {
        switch (i) {
            case 0:
                return q0;
            case 1:
                return q1;
            case 2:
                return q2;
            case 3:
                return q3;
            case 4:
                return q4;
            default:
                return null;


        }
    }

}
