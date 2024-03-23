public class StringToArray {

    public static void main(String[] args) {
        String str = "helDo world";
        StringTo obj = new StringTo();
        obj.get(str);

    }
}

class StringTo {
    public void get(String str) {
        char arr[] = str.toCharArray();
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 'D') {
                count++;
                break;

            }
        }

        if (count == 1) {
            System.out.println("is present");
        }

    }
}