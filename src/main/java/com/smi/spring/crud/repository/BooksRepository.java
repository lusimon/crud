package com.smi.spring.crud.repository;

import org.springframework.data.repository.CrudRepository;

import com.smi.spring.crud.model.Books;

//repository that extends CrudRepository  
public interface BooksRepository extends CrudRepository<Books, Integer>  
{  
}  
