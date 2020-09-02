package homework.enums;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Evgeny Borisov
 */
public class HttpCodeService {
    private void defineType(int code){
        boolean error = true;

        for (Code c : Code.values()){
            if ((c.ordinal() + 1 == code / 100) && code < 600) {
                c.doProcess();
                error = false;
            }
        }

        if (error){
            System.out.println("Code is invalid!");
        }
    }

    public void processHttp(String text) {
        //todo dgasfdjgsafd  httpcode: 404   sjdghfkjdshgafsdah
        String regexHttp = "httpcode:\\s?\\d+";
        Pattern pattern = Pattern.compile(regexHttp);
        Matcher matcher = pattern.matcher(text);

        if (matcher.find()) {
            String str = matcher.group();

            int code = Integer.parseInt(str.split("httpcode:")[1]);
            this.defineType(code);
        }
        else {
            System.out.println("Cannot define httpcode");
        }

    }

    public static void main(String[] args) {
        HttpCodeService service = new HttpCodeService();
        service.processHttp("todo dgasfdjgsafd  httpcode:204   sjdghfkjdshgafsdah");
    }


}
