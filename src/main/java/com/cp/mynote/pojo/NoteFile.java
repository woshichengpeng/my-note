package com.cp.mynote.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * @author cp
 * @create 2019-12-30 13:57
 */
@Data
public class NoteFile implements Serializable {
    String FileId;//服务器端ID
    String LocalFileId;//客户端ID
    String Type;//images/png,doc,xls,根据fileName确定
    String Title;
    boolean HasBody;//传过来的值是否要更新内容，如果有true，则必须传文件
    boolean IsAttach;//是否是附件，不是附件就是图片
}
