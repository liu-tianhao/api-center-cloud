package cn.zealon.readingcloud.account.dao;

import cn.zealon.readingcloud.common.pojo.account.UserBookshelf;
import cn.zealon.readingcloud.common.pojo.account.UserLikeSee;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 用户喜欢
 * @author: zealon
 * @since: 2020/4/14
 */
public interface UserLikeSeeMapper extends BaseMapper<UserLikeSee> {

    int deleteByUserIdAndBookId(@Param("userId") Integer userId,
                                @Param("bookId") String bookId);

//    int insert(UserLikeSee userLikeSee);

    int selectCountByUserAndBookId(@Param("userId") Integer userId,
                                   @Param("bookId") String bookId);

    List<UserLikeSee> findPageWithResult(@Param("userId") Integer userId);

    Integer findPageWithCount(@Param("bookId") String bookId);
}
