package messages;
/*
消息队列
 */
public class ChangeMessages {
    /*
    数据库操作类型
     */
    SqlType sqltype;
    /*
    账号ID
     */
    String Account;
    /*
    用户所在的组织机构编码编码
     */
    String OrganizationNumber;
    Object object;
    enum SqlType{
        INSERT,UPDATE,DELETE
    }

}
