package cn.fintecher.pangolin.entity.domain;

import cn.fintecher.pangolin.entity.managentment.Operator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.util.Date;

/**
 * @Author:peishouwen
 * @Desc: 对账更新日志
 * @Date:Create in 15:36 2018/8/8
 */
@Data
@Document(indexName = "pay_amt_log", type = "pay_amt_log", shards = 1, replicas = 0)
@ApiModel(value = "PayAmtLog", description = "对账更新日志")
public class PayAmtLog {
    @Id
    @ApiModelProperty(notes = "ID")
    private String id;

    @ApiModelProperty(notes = "案件ID")
    private String caseId;

    @ApiModelProperty(notes = "卡号")
    private String cardNo;

    @ApiModelProperty(notes = "最后一次还款日（还款金额和余额）")
    @Field(type = FieldType.Date)
    private Date latestPayDate;

    @ApiModelProperty(notes = "余额")
    private Double leftAmt;

    @ApiModelProperty(notes = "美元余额")
    private Double leftAmtDollar;

    @ApiModelProperty(notes = "最近还款金额")
    private Double latestPayAmt;

    @ApiModelProperty(notes = "最近还款金额(美元)")
    private Double latestPayAmtDollar;

    @ApiModelProperty(notes = "操作员")
    private String operator;

    @ApiModelProperty(notes = "操作员姓名")
    private String operatorName;

    @ApiModelProperty(notes = "操作时间")
    @Field(type = FieldType.Date)
    private Date operatorTime;
}
