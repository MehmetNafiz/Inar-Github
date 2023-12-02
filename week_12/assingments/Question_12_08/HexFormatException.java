package week_12.assingments.Question_12_08;

public class HexFormatException extends Exception {
    HexFormatException(String a){
        super("It is not a hex string.!");
    }
}
