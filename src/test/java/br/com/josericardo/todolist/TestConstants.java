package br.com.josericardo.todolist;

import java.util.ArrayList;
import java.util.List;

import br.com.josericardo.todolist.entity.Todo;

public class TestConstants {
  public static final List<Todo> TODOS = new ArrayList<>() {
    {
      add(new Todo(9995L, "@josericardo", "Curtir", false, 1));
      add(new Todo(9996L, "@josericardo", "Comentar", false, 1));
      add(new Todo(9997L, "@josericardo", "Compartilhar", false, 1));
      add(new Todo(9998L, "@josericardo", "Se Inscrever", false, 1));
      add(new Todo(9999L, "@josericardo", "Ativar as Notificações", false, 1));
    }
  };

  public static final Todo TODO = TODOS.get(0);
}
