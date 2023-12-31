package cn.zealon.readingcloud.account.dao;

import cn.zealon.readingcloud.common.pojo.account.UserBookshelf;
import cn.zealon.readingcloud.common.pojo.book.BookAuthor;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 用户书架
 * @author: zealon
 * @since: 2020/4/10
 */
public interface UserBookshelfMapper extends BaseMapper<UserBookshelf> {

    int deleteById(Integer id);

//    int insert(UserBookshelf userBookshelf);

    int updateByUserIdAndBookId(UserBookshelf userBookshelf);

    int selectCountByUserAndBookId(@Param("userId") Integer userId,
                                   @Param("bookId") String bookId);

    UserBookshelf selectById(Integer id);

    List<UserBookshelf> findPageWithResult(@Param("userId") Integer userId);
}
