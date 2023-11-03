package cn.zealon.readingcloud.book.dao;

import cn.zealon.readingcloud.common.pojo.book.BookAuthor;
import cn.zealon.readingcloud.common.pojo.book.DataDictionary;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 图书作者
 * @author: tangyl
 * @since: 2020/3/14
 */
public interface BookAuthorMapper extends BaseMapper<BookAuthor> {

    List<BookAuthor> findPageWithResult(@Param("name") String name);

    Integer findPageWithCount(String name);
}
