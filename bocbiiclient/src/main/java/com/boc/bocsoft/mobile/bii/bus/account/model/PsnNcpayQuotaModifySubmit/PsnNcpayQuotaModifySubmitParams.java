package com.boc.bocsoft.mobile.bii.bus.account.model.PsnNcpayQuotaModifySubmit;

import com.boc.bocsoft.mobile.bii.bus.account.model.PublicSecurityParams;

/**
 * @author wangyang
 *         2016/10/11 16:34
 *         修改交易限额提交交易参数
 */
public class PsnNcpayQuotaModifySubmitParams extends PublicSecurityParams{

    /** 账户Id */
    private String accountId;
    /** 账户AccountNumber */
    private String accountNumber;
    private String customerName;
    /** 当前限额 */
    private String currentQuota;
    /** 交易类型 */
    private String operateType = "修改交易限额";
    /** 交易日期 */
    private String tranDate;
    /** 服务类型 1：无卡在线支付,2：代扣交易,3: 订购交易,5: 境外磁条交易,6：小额免密免签消费,7：免密或凭签名消费 */
    private String serviceType;

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getCurrentQuota() {
        return currentQuota;
    }

    public void setCurrentQuota(String currentQuota) {
        this.currentQuota = currentQuota;
    }

    public String getOperateType() {
        return operateType;
    }

    public void setOperateType(String operateType) {
        this.operateType = operateType;
    }

    public String getTranDate() {
        return tranDate;
    }

    public void setTranDate(String tranDate) {
        this.tranDate = tranDate;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
}
