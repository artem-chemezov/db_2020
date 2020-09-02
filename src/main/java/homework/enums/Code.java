package homework.enums;

enum Code {
    INFORMATIONAL {
        @Override void doProcess(){
            System.out.println("It's informational!");
        }
    },
    SUCCESS {
        @Override void doProcess(){
            System.out.println("SUCCESS!!!");
        }
    },
    THREEXXREDIRECTION {
        @Override void doProcess(){
            System.out.println("It's 3xx Redirection");
        }
    },
    FOURXXCLIENTERROR {
        @Override void doProcess(){
            System.out.println("It's 4xx Client Error");
        }
    },
    FIVEXXSERVERERROR {
        @Override void doProcess(){
            System.out.println("It's 5xx Server Error");
        }
    },
    INVALID {
        @Override void doProcess(){
            System.out.println("Code is invalid!");
        }
    };

    abstract void doProcess();
}
