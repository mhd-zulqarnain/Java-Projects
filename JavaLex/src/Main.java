import java.io.*;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {




    public static void main(String args[]){
        String sen="// the name is";
        String clean=sen.substring(0,3);
        int dQuote = sen.indexOf("");
        System.out.println(sen.substring(dQuote + 1));



    }
   /*public static String[] keywordString = {"abstract", "assert", "boolean",
            "break", "byte", "case", "catch", "char", "class", "const",
            "continue", "default", "do", "double", "else", "enum",
            "extends", "for", "final", "finally", "float", "goto",
            "if", "implements", "import", "instanceof", "int",
            "interface", "long", "native", "new", "package", "private",
            "protected", "public", "return", "short", "static",
            "strictfp", "super", "switch", "synchronized", "this",
            "throw", "throws", "transient", "try", "void", "volatile",
            "while", "true", "false", "null"};

    public static void main(String[] args) throws IOException {


        String[] buffer=new String[20];
       String[] operators = new String[]{"+","*","/","%","="};
        int i, j = 0;


        File f=new File("input.txt");
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(
                        new FileInputStream(f)));
        int c;
        try {
            while((c = reader.read()) != -1) {
                char ch = (char) c;

                for (i = 0; i < 5; ++i){
                    if (operators[i].equals(ch))
                        System.out.println(ch+"is operator\n");
                }

                if (Character.isLetterOrDigit(ch)){
                    buffer[j++] = String.valueOf(ch);
                }
                else if ((ch == ' ' || ch == '\n') && (j != 0)){
                    buffer[j] = "\0";
                    j = 0;

                    if (isKeyword(buffer))
                    System.out.println(buffer.toString()+" is keyword");
                    else
                    System.out.println(buffer.toString()+" indentifier\n");

                }

            }

        }catch (IOException e){
            System.out.println("Exception "+e);
        }

        for (i =0 ;j>20;i++){
            System.out.print(buffer[i]);
        }
    }

    public static boolean isKeyword(String buffer[]){
        boolean keyword = false;
        for (int i = 0; i < 32; ++i){
            if (keywordString[i].compareTo(buffer.toString()) == 0){
               return true;
            }
        }
        return keyword;
    }
*/
}
