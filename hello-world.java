// Hello World Program

class HelloWorld {
    public static void main(String[] args) {
        String msg1 = "hello, ";
        String msg2 = "world!";
        
        // Prints out using println
        System.out.println(msg1.concat(msg2));
        
        // Joins the string using format
        String msg = String.format("%s%s",msg1,msg2);
        
        // Prints out using println
        System.out.println(msg.toString());
    }
}
