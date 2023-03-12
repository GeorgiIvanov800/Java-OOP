package MathOperations;

public class MathOperation {


    public int add(int a, int b) {
        return a + b;
    }


    public int add(int a, int b, int c) {
        return add(a , b) + c;
    }

    public int add(int a, int b, int c, int d) {
        return add(a , b,  c) + d;
    }

    public String getDocument(String title, String header, String body, String footer) {
        return  title + header + body + footer;
    }

    public String getDocument(String title, String body) {
        return getDocument(title, null, body, null);
    }
}
