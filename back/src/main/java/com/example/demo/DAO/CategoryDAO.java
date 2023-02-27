package com.example.demo.DAO;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.inf.Category;
import java.util.List;

public interface CategoryDAO extends JpaRepository<Category, Integer> {
}
