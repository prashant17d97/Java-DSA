class Loops {
    public static void main(String[] args) {
        // forLoop();
        // whileLoop();
        doWhileLoop();
    }
    
    public static void forLoop() {
        for (char a = 'A'; a <= 'Z'; a++) {
            System.out.println(a);
        }

    }

    public static void whileLoop() {
        char c = 'A';
        while (c <= 'Z') {
            System.out.println(c);
            c++;
        }
    }

    public static void doWhileLoop() {
        char a = 'A';
        do {
            System.out.print(a+", ");
            a++;
        } while (a <= 'Z');
    }

}