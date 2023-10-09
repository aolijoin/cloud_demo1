package cn.jiyun.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

@Data
@ToString
@TableName("student")
public class Student implements Serializable {
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    private String atn;
    private String name;
    private String sex;
    private String personId;
}
