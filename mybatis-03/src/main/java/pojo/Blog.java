package pojo;
import lombok.Data;
import lombok.ToString;

import java.util.Date;
/**
 * @author 517
 * @date 2021-03-11 - 10:15
 */
@Data
@ToString
public class Blog {
    private String id;
    private String title;
    private String author;
    private Date createTime;
    private int views;
}
