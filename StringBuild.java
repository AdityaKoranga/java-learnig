public class StringBuild {
    public static void p(String s){
        System.out.println(s);
    }

    public static void main(String[] args) {
        String name="Hello Friends Brother";
        p("Length is : "+ name.length());
        p("In upper case "+name.toUpperCase());
        p("In lower case : "+name.toLowerCase());
        p("third character is : "+name.charAt(2));

        StringBuilder sb= new StringBuilder(name);
        String rname= sb.reverse().toString();
        p("Reverse string is : "+rname);
    }
}
