package com.github.kop.bbs.module.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
    * 话题评论点赞日志主键
    */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "bbs_topic_comment_thumbs_log")
public class TopicCommentThumbsLog {
    /**
     * 话题评论点赞日志主键
     */
    @TableId(value = "tc_thumbs_log_id", type = IdType.INPUT)
    private Long tcThumbsLogId;

    /**
     * 话题评论主键
     */
    @TableField(value = "topic_comment_id")
    private Long topicCommentId;

    /**
     * 点赞类型 1 点赞 2踩
     */
    @TableField(value = "thumbs_type")
    private Integer thumbsType;

    /**
     * 创建时间
     */
    @TableField(value = "create_time")
    private LocalDateTime createTime;

    /**
     * 创建用户
     */
    @TableField(value = "create_user_id")
    private Long createUserId;

    /**
     * 逻辑删除标记位
     */
    @TableField(value = "deleted")
    private Integer deleted;

    /**
     * 乐观锁
     */
    @TableField(value = "version")
    private Long version;
}