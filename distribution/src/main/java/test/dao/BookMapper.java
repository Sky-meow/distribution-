package test.dao;

import java.util.List;
import test.model.Book;

public interface BookMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book
     *
     * @mbg.generated
     */
    int insert(Book record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book
     *
     * @mbg.generated
     */
    List<Book> selectAll();
}