class Hello1 {
    public String empName;
    public int empclass;
    public static String company;
    static int a;

    static {
        z=0;
        a = 45;
        company = "NSEIL";
    }

    public void human() {
        // Hellow b = new Hellow();

        System.out.println(empName + " " + empclass + " " + company + " " + a);
    }
}

class Hellow {

    public static void main(String args[]) {
        System.out.println("Hiii");
        Hello1 ram = new Hello1();
        Hello1 sam = new Hello1();
        ram.empName = "ramanand";
        ram.empclass = 2;
        sam.empName = "samanand";
        sam.empclass = 3;
        ram.human();
        sam.human();
    }
}