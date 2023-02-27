package com.example.demo.service;

import com.example.demo.inf.Book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import com.example.demo.util.CastUtils;
import com.example.demo.DAO.BookDAO;
import com.example.demo.inf.Category;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    private BookDAO bookdao;
    @Autowired
    private CategoryService categoryservice;


    public List<Book> list(){
        List<Book>booklist;;
            Sort sort=new Sort(Sort.Direction.DESC,"id");
            booklist=bookdao.findAll(sort);
        return booklist;
    }
    public void Update(Book book){
        bookdao.save(book);
    }
    public void deleteById(int id){
        bookdao.deleteById(id);
    }
    public List<Book> listByCategory(int cid) {
        Category category = categoryservice.get(cid);
        return bookdao.findAllByCategory(category);
    }

    public List<Book> Search(String keywords) {
        return bookdao.findAllByTitleLikeOrAuthorLike('%' + keywords + '%', '%' + keywords + '%');
    }

}
