package book_management.backend.exeption;

public class NotFoundException extends RuntimeException{
    public NotFoundException (String message){
        super(message);
    }
}
