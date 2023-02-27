package com.example.demo.conrtroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import javax.validation.Valid;
import java.io.File;
import java.io.IOException;

import com.example.demo.result.Result;
import com.example.demo.service.BookService;
import com.example.demo.result.ResultFactory;

@RestController
public class BookController {
    @Autowired
    BookService bookservice;

    @GetMapping("/api/books")
    public Result books()throws Exception{
        return ResultFactory.buildSuccessResult(bookservice.list());
    }
    @GetMapping("/api/search")
    public Result searchResult(@RequestParam("keywords") String keywords) {
        if ("".equals(keywords)) {
            return ResultFactory.buildSuccessResult(bookservice.list());
        } else {
            return ResultFactory.buildSuccessResult(bookservice.Search(keywords));
        }
    }
    @GetMapping("/api/categories/{cid}/books")
    public Result listByCategory(@PathVariable("cid") int cid) {
        if (0 != cid) {
            return ResultFactory.buildSuccessResult(bookservice.listByCategory(cid));
        } else {
            return ResultFactory.buildSuccessResult(bookservice.list());
        }
    }


}
