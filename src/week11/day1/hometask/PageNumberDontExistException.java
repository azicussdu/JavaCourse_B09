package week11.day1.hometask;

public class PageNumberDontExistException extends RuntimeException {
    public PageNumberDontExistException(String message){
        super(message);
    }
}
