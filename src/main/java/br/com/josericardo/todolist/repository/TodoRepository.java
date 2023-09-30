package br.com.josericardo.todolist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.josericardo.todolist.entity.Todo;



public interface TodoRepository extends JpaRepository<Todo, Long> {

}
