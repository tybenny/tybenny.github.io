package custom_exeption;

public class NotFoundExeption extends RuntimeException{
        public NotFoundExeption(String message){
            super(message);
        }
}
