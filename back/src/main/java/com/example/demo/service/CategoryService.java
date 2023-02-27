package com.example.demo.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import java.util.List;

import com.example.demo.DAO.CategoryDAO;
import com.example.demo.inf.Category;
@Service
public class CategoryService {
    @Autowired
    CategoryDAO categorydao;

    public List<Category>list(){
        Sort sort=new Sort(Sort.Direction.DESC,"id");
        return categorydao.findAll(sort);
    }
    public Category get(int id) {
        Category c= categorydao.findById(id).orElse(null);;
        return c;
    }

}
