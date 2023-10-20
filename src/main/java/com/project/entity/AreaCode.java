package com.project.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import jdk.jfr.DataAmount;

import javax.annotation.processing.Generated;

@TableName("codes")
public class AreaCode {
    @TableId(value = "id", type = IdType.AUTO)
    private int id;
    private int uid;
    private String name;
    private String startTime;
    private String endTime;
    private int changes_uid;
}
