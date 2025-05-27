package com.api.taks;

import com.api.taks.entity.Todo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.reactive.server.WebTestClient;

@SpringBootTest
class TaksApplicationTests {
	@Autowired
	private WebTestClient webTestClient;

	@Test
	void testCreateTodoSucess() {
		var todo = new Todo(1, false, "desc todo 1", "todo 1");

		webTestClient.post().uri("/todos")
				.bodyValue(todo)
				.exchange()
				.expectStatus().isOk()
				.expectBody()
				.jsonPath("$").isArray()
				.jsonPath("$.length()").isEqualTo(1)
				.jsonPath("$[0].nome").isEqualTo(todo.getNome())
				.jsonPath("$[0].descricao").isEqualTo(todo.getDecricao())
				.jsonPath("$[0].realizado").isEqualTo(todo.isRealizacao())
				.jsonPath("$[0].prioridade").isEqualTo(todo.getPrioridade());
	}


	@Test
	void testCreateTodoFailure() {

	}

}
