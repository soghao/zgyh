package com.boc.bocsoft.mobile.bocmobile.buss.loan.eloan.changeRepaymentAccount.model;

/**
 * PsnLOANPayeeAcountCheck收款账户检查,请求参数
 * Created by xintong on 2016/6/24.
 */
public class CollectionAccountCheckReq {

    //创建交易会话后的id
    private String conversationId;
    //收款账户标识
    private String accountId;
    //贷款币种
    private String currencyCode;

    public String getConversationId() {
        return conversationId;
    }

    public void setConversationId(String conversationId) {
        this.conversationId = conversationId;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }
}
