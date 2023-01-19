import org.hamcrest.CoreMatchers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collection;


import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class UserTest {

    @Test
    public void testUser(){
        //Given - подготовка тестового окружения
        int id = 1;
        String name = "Петя";
        int age = 21;
        String expected = "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';

        //When - выполнение тестового сценария
        User sut = new User(1,"Петя",21);
        String result = sut.toString();

        //Then - проверк
        Assertions.assertEquals(result, expected);
    }
    @Test
    public void test1(){
        Collection<User> user = new ArrayList<>();
        user.add(new User(1,"2",30));
        user.add(new User(2,"3",18));
        user.add(new User(3,"4",35));
        assertThat(user.size(), CoreMatchers.equalTo(3));
    }
    @Test
    public void test2(){
        String a = "Привет! Как дела?";
        assertThat(a,containsString("Привет!"));
        assertThat(a,both(containsString("Как")).and(containsString("дела")));

    }

}