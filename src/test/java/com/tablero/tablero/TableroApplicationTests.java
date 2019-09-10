package com.tablero.tablero;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;
import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Example;
import org.springframework.test.context.junit4.SpringRunner;

import com.tablero.tablero.model.Nota;
import com.tablero.tablero.repo.RepositorioNota;


@RunWith(SpringRunner.class)
@SpringBootTest
public class TableroApplicationTests {

	@Autowired
	private RepositorioNota repository;
	
	
	   @Autowired
	    public void setRepository(RepositorioNota repository) {
	        this.repository = repository;
	    }
	   
	    @Test
	    public void findAllNotesIsEmpty() {
	        List<Nota> notas = repository.findAll();
	       // assertNotNull(notas);
	        assertTrue(notas.isEmpty());
	    }
	    
	    @Test
	    public void deleteNotaWithId() {
	    	 Nota nota = new Nota("id", "Java 8 in Action", "Programming", "", "");
	        repository.delete(nota);
	        assertNotNull(nota);
	    }
	    
	    @Test
	    public <S> void findNoteById() {
	    	 Nota nota = new Nota("id", "Java 8 in Action", "Programming", "", "");
		        String id = "id";
				Optional<Nota> note = repository.findById(id);
	        assertNotNull(note);
	    }
	    
	    @Test
	    public void createNote() {
	    	 Nota nota = new Nota("id", "Java 8 in Action", "Programming", "", "");
	       Nota savedNota = repository.save(nota);
	       String id = "id";
			Optional<Nota> note = repository.findById(id);
	        assertEquals("Java 8 in Action", note.get().getNombreNota());
	   
	    }
	    
		

}
