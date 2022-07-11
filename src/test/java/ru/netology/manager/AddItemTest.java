package ru.netology.manager;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import ru.netology.childclass.Book;
import ru.netology.childclass.Smartphohe;
import ru.netology.parentclass.Product;
import ru.netology.repo.Repository;
import org.mockito.Mockito;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.doReturn;

public class AddItemTest {
    Repository repo = Mockito.mock(Repository.class);
    Manager manager = new Manager(repo);
    Product item1 = new Book(1, "BookName1", 100, "Author1");
    Product item2 = new Book(2, "BookName2", 200, "Author2");
    Product item3 = new Smartphohe(3, "SmartphoneName1", 10_000, "Maker1");
    Product item4 = new Smartphohe(4, "SmartphoneName2", 20_000, "Maker2");
    Product item5 = new Smartphohe(5, "SmartphoneName3", 30_000, "Maker3");
    @Test
    public void shouldAddOneItem() {
        Product[] items = {item1};
        doReturn(items).when(repo).getItems();
        Product[] expected = {item1};
        Product[] actual = repo.getItems();
        assertArrayEquals (expected, actual);
    }
}
