package by.belstu.it.kachanova;

public class TextFunction {
    public String getValue(){
        int x=5;
        Something(x);
        return "Hello from First project";
    }
    public int test;

    public TextFunction() {
    }

    public TextFunction(int test) {
        this.test = test;
    }

    public void setTest(int test) {
        this.test = test;
    }

    public int getTest() {
        return test;
    }

    private void Something(int x) {
        System.out.println("цифра "+ x);
    }

}

