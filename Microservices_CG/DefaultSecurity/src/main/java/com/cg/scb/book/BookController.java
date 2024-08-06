package com.cg.scb.book;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/books")
public class BookController {

	@Autowired
	public BookService service;
	
	@GetMapping
	public List<Book> getAllBooks(){
		return service.findAllBook();
	}
	
	@PostMapping
	public ResponseEntity<Book> createBook(@RequestBody Book book){
		Book book1 = service.createBook(book);
		return new ResponseEntity(book1,HttpStatus.CREATED);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Book> getBookById(@PathVariable Integer id){
		Book book = service.getBookById(id);
		return new ResponseEntity(book,HttpStatus.OK);
	}
	
	
	@PutMapping()
	public ResponseEntity<Book> updateBookById(@RequestBody Book book){
		Book book1 = service.udpateBookById(book);
		return new ResponseEntity(book1,HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<HttpStatus> deleteById(@PathVariable Integer id){
		
		service.deleteById(id);
		return new ResponseEntity(HttpStatus.NO_CONTENT);
	}
	
	@GetMapping("/name/{name}")
	public ResponseEntity<List<Book>> findByBookName(@PathVariable String name){
		List<Book> listByName =  service.findByBookName(name);
		if(!listByName.isEmpty()) {
			return new ResponseEntity(listByName, HttpStatus.FOUND);
		} else {
			throw new BookNotFoundByNameException("Book not found by name!");
		}
	}
	
	@GetMapping("/first_two/{name}")
	public ResponseEntity<List<Book>> findFirstTwoByBookName(@PathVariable String name){
		List<Book> listByName =  service.findFirstTwoByBookName(name);
		if(!listByName.isEmpty()) {
			return new ResponseEntity(listByName, HttpStatus.FOUND);
		} else {
			throw new BookNotFoundByNameException("Book not found by name!");
		}
	}
	
	@GetMapping("/top_two/{name}")
	public ResponseEntity<List<Book>> findTopTwoByBookName(@PathVariable String name){
		List<Book> listByName =  service.findTopTwoByBookName(name);
		if(!listByName.isEmpty()) {
			return new ResponseEntity(listByName, HttpStatus.FOUND);
		} else {
			throw new BookNotFoundByNameException("Book not found by name!");
		}
	}
	
	@GetMapping("/top_two/{name}/{price}")
	public ResponseEntity<List<Book>> findTopTwoByBookName(@PathVariable String name,@PathVariable int price){
		List<Book> listByName =  service.findTopTwoByBookNameAndGreaterThan(name,price);
		if(!listByName.isEmpty()) {
			return new ResponseEntity(listByName, HttpStatus.FOUND);
		} else {
			throw new BookNotFoundByNameException("Book not found by name!");
		}
	}
	
}
