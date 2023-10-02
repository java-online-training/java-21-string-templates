

public class StringTemplateDemo {

    public static void printFormated(String name, String age, String birthdate){
        System.out.println(STR."Hello /{name}, You are /{age} years old and your birthday is on the /{birthdate}.");
    }

    public static void main(String[] args){
        printFormated("Ernie", "47", "28.02.1977");
    }
    
}
