package book_management.backend.repository;

import book_management.backend.database.BookDatabase;
import book_management.backend.exeption.NotFoundException;
import book_management.backend.model.Book;
import book_management.backend.request.CreateBookRequest;
import book_management.backend.request.UpdateBookRequest;
import book_management.backend.utils.FileUtils;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BookRepository {

    public List<Book> findAll(){
        return BookDatabase.books;
    }

    public Book findById(int id){
        for (Book b : BookDatabase.books
             ) {
            if (b.getId() == id){
                return b;
            }
        }
        throw new NotFoundException("Không tìm thấy quyển sách có id = " + id);
    }

    public void delete(Book book) {
        BookDatabase.books.remove(book);
        FileUtils.setDataToFile("books.json", BookDatabase.books);
    }

    public Book update(int id, UpdateBookRequest request){
        Book book = findById(id);
        book.setTitle(request.getTitle());
        book.setAuthor(request.getAuthor());
        FileUtils.setDataToFile("books.json", BookDatabase.books);

        return book;
    }


    public void save(Book book) {
        BookDatabase.books.add(book);
        FileUtils.setDataToFile("books.json", BookDatabase.books);
    }

}
