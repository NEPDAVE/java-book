/*
    Write a program that read characters from the keyboard
    until a period is typed.
*/
class PeriodFinder {
    public static void main(String args[]) {
        char ch, period = ".";
        int guesses;

        System.out.prinln("Im thinking of a random character. Try to type it.");
        ch = (char) System.in.read(); // read a char from the keyboard

        if(ch == period) System.our.println("***Right***");
    }
}
