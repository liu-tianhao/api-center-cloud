package cn.zealon.readingcloud.book.dao;

import cn.zealon.readingcloud.common.pojo.book.BookAuthor;
import cn.zealon.readingcloud.common.pojo.book.BookChapter;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import java.util.List;

/**
 * 图书章节
 * @author: zealon
 * @since: 2020/3/18
 */
public interface BookChapterMapper extends BaseMapper<BookChapter> {

    BookChapter selectById(@Param("id") Integer id);

    List<BookChapter> findPageWithResult(@Param("bookId") Integer bookId);

    int findPageWithCount(@Param("bookId") Integer bookId);

    /**
     * 查询上一章节ID
     * @param bookId
     * @param currentSortNumber
     * @return
     */
    @Select("select id from book_chapter  " +
            " where book_id=#{bookId} " +
            " and sort_number < #{currentSortNumber} " +
            " order by sort_number desc limit 1")
    Integer selectPreChapterId(@Param("bookId") Integer bookId,
                               @Param("currentSortNumber") Integer currentSortNumber);

    /**
     * 查询下一章节ID
     * @param bookId
     * @param currentSortNumber
     * @return
     */
    @Select("select id from book_chapter  " +
            " where book_id=#{bookId} " +
            " and sort_number > #{currentSortNumber} " +
            " order by sort_number asc limit 1")
    Integer selectNextChapterId(@Param("bookId") Integer bookId,
                                @Param("currentSortNumber") Integer currentSortNumber);

}
