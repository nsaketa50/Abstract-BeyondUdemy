package kgTeacher;

public class StringConcatenate {
    public static void main(String[] args) {
        System.out.println(concatenateStri("hi"));
        System.out.println(concatenateStri("hi", "Saketa"));
    }

    public static String concatenateStri(String... toConcat) {
        StringBuilder sb = new StringBuilder();
        for (String str : toConcat) {
            sb.append(str).append(" ");
        }
        return sb.toString();
    }

}