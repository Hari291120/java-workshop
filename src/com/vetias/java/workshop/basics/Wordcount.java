package workshop.basics;

public class Wordcount {
    public static void main(String[] args) {
        String sentence =" This program show how can we split a string into multiple .we need to find sentence word the program";
        String Words[]= sentence.split(" ");
        System.out.println(Words.length);

        String dot[]=sentence.split(" \\.");
        System.out.println(dot.length);
        System.out.println(sentence.length());
    }
}