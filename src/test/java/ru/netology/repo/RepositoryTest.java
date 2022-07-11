package ru.netology.repo;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import ru.netology.childclass.Book;
import ru.netology.childclass.Smartphohe;
import ru.netology.parentclass.Product;
import ru.netology.repo.Repository;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.doReturn;

public class RepositoryTest {
    Product item1 = new Book(1, "BookName1", 100, "Author1");
    Product item2 = new Book(2, "BookName2", 200, "Author2");
    Product item3 = new Smartphohe(3, "SmartphoneName1", 10_000, "Maker1");
    Product item4 = new Smartphohe(4, "SmartphoneName2", 20_000, "Maker2");
    Product item5 = new Smartphohe(5, "SmartphoneName3", 30_000, "Maker3");

    Product[] items = {item1, item2, item3, item4};
    Repository repo = new Repository();
    @Test
    public void shouldSave() {
        repo.save(item1);
        repo.save(item2);
        repo.save(item3);
        repo.save(item4);
        repo.save(item5);
 /*       doReturn(items).when(repo).getItems();*/
        Product[] expected = {item1, item2, item3, item4, item5};
        assertArrayEquals (expected, repo.findAll());

    }

    @Test
    public void shouldRemove() {
        repo.save(item1);
        repo.save(item2);
        repo.save(item3);
        repo.save(item4);
        repo.save(item5);
        repo.removeById(item3.getId());
 /*       doReturn(items).when(repo).getItems();*/
        Product[] expected = {item1, item2, item4, item5};
        assertArrayEquals(expected, repo.getItems());
    }
}
