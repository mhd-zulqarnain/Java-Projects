public class Main {

    public static void main(String[] args) {
        String input = "Hello World! new line.";
        SpaceInseter mSi = new SpaceInseter();
        String formatted = "";
        String[] words = input.split(" ");

        for (int i = 0; i < words.length; i++) {
            String[] arr = mSi.explode(words[i]);
            for (int j = 0; j < arr.length; j++) {
                if (j==0&&i==0) {
                    formatted = formatted + "<s>";
                }
                if (arr[j].equals("!")) {
                    formatted = formatted + "</s>";
                }else if (arr[j].equals(".")) {
                    formatted = formatted + "</s>";
                }
                else
                    formatted = formatted + arr[j];
            }
            formatted=formatted+" ";
        }

        System.out.println(formatted);
    }


}
