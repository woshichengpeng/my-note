package com.cp.mynote;

import com.cp.mynote.pojo.Note;
import com.cp.mynote.pojo.User;
import com.cp.mynote.repository.NoteRepository;
import com.cp.mynote.repository.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @author cp
 * @create 2020-01-02 11:33
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class MongoTest {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private NoteRepository noteRepository;


    @Test
    public void testSearch() throws Exception {
        User user1 = userRepository.findByEmail("admin@leanote.com");
        List<User> all = userRepository.findAll();
        System.out.println(user1);
        System.out.println(user1.getUserId().getClass().toString());
        System.out.println(all);

    }

    @Test
    public void testAdd() throws Exception {
        User user = new User("cp", "woshichengpeng@gmail.com");
        List<User> all = userRepository.findAll();
        System.out.println(all);
        userRepository.save(user);
        all = userRepository.findAll();
        System.out.println(all);

    }

    @Test
    public void testRemove() throws Exception {
        User user = userRepository.findByEmail("woshichengpeng@gmail.com");
        List<User> all = userRepository.findAll();
        System.out.println(all);
//        userRepository.deleteByEmail("woshichengpeng@gmail.com")
        userRepository.delete(user);
        all = userRepository.findAll();
        System.out.println(all);
    }

    @Test
    public void testDate() throws Exception {
        System.out.println(noteRepository.findAll());
        Note note = noteRepository.findByTitle("a");
        System.out.println(note.getCreatedTime());
    }
}
