import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String[] quotes = {
                "The only thing we have to fear is fear itself. – Franklin D. Roosevelt",
                "I think, therefore I am. – René Descartes",
                "That's one small step for man, one giant leap for mankind. – Neil Armstrong",
                "In the middle of difficulty lies opportunity. – Albert Einstein",
                "To be, or not to be, that is the question. – William Shakespeare",
                "The unexamined life is not worth living. – Socrates",
                "Stay hungry, stay foolish. – Steve Jobs",
                "The journey of a thousand miles begins with a single step. – Lao Tzu",
                "That which does not kill us makes us stronger. – Friedrich Nietzsche",
                "Life is what happens when you're busy making other plans. – John Lennon"
        };
        Scanner scanner = new Scanner(System.in);


        do {
            try {
                System.out.print("pick a number 0-9: ");
                int quoteNum = scanner.nextInt();
                System.out.println(quotes[quoteNum]);}

            catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException){
                System.out.println("OUT OF BOUND TRY AGAIN");
            }
        }while (true);






    }
}
