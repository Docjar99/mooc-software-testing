package tudelft.romanMio;
import java.io.Reader;
public class rome {
    public int romeToInt(String roman) {

        int tam = roman.length();
        char[] romanArray = roman.toCharArray();
        for(char ch: romanArray) {
            System.out.println(ch);
            int res = 0;
            switch(ch) {
                case 'I':
                    res += 1;
                    break;
                case 'V':
                    res += 5;
                    break;
                case 'X':
                    res += 10;
                    break;
                case 'L':
                    res += 50;
                    break;

            }
            System.out.println(res);

        }

        return 0;
    }
}
