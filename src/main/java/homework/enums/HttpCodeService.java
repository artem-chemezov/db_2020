package homework.enums;

/**
 * @author Evgeny Borisov
 */
public class HttpCodeService {


    public void processHttp(String text) {
        //todo dgasfdjgsafd  httpcode: 404   sjdghfkjdshgafsdah

        int code = Integer.parseInt(text.substring(text.indexOf("httpcode: ") + 10, text.indexOf("httpcode: ") + 13 ));
        Code code_type = Code.INVALID;
        if (code > 99 && code < 200){
            code_type = Code.INFORMATIONAL;
        }
        else if (code < 300) {
            code_type = Code.SUCCESS;
        }
        else if (code < 400) {
            code_type = Code.THREEXXREDIRECTION;
        }
        else if (code < 500) {
            code_type = Code.FOURXXCLIENTERROR;
        }
        else if (code < 600) {
            code_type = Code.FIVEXXSERVERERROR;
        }
        code_type.doProcess();
    }

    public static void main(String[] args) {
        HttpCodeService service = new HttpCodeService();
        service.processHttp("todo dgasfdjgsafd  httpcode: 104   sjdghfkjdshgafsdah");
    }


}
