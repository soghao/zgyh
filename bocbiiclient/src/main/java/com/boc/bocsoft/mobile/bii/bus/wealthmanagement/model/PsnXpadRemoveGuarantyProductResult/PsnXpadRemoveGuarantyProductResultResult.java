package com.boc.bocsoft.mobile.bii.bus.wealthmanagement.model.PsnXpadRemoveGuarantyProductResult;

/**
 * 组合购买解除
 * Created by zhx on 2016/9/5
 */
public class PsnXpadRemoveGuarantyProductResultResult {

    /**
     * transactionId : 2205131824
     * guarantyBuyInfo : {"cashRemit":"1","canBeCanceled":"1","status":"A","curCode":"001","prodCode":"1","cancelPrice":1,"buyAmt":null,"returnDate":null,"currency":"001","amount":1,"trfPrice":null,"prodName":"1","cancelDate":null,"account":"100400096390","channel":"1","tranSeq":"187887"}
     */

    // 网银交易序号
    private long transactionId;
    private GuarantyBuyInfoEntity guarantyBuyInfo;

    public void setTransactionId(long transactionId) {
        this.transactionId = transactionId;
    }

    public void setGuarantyBuyInfo(GuarantyBuyInfoEntity guarantyBuyInfo) {
        this.guarantyBuyInfo = guarantyBuyInfo;
    }

    public long getTransactionId() {
        return transactionId;
    }

    public GuarantyBuyInfoEntity getGuarantyBuyInfo() {
        return guarantyBuyInfo;
    }

    public static class GuarantyBuyInfoEntity {
        /**
         * cashRemit : 1
         * canBeCanceled : 1
         * status : A
         * curCode : 001
         * prodCode : 1
         * cancelPrice : 1
         * buyAmt : null
         * returnDate : null
         * currency : 001
         * amount : 1
         * trfPrice : null
         * prodName : 1
         * cancelDate : null
         * account : 100400096390
         * channel : 1
         * tranSeq : 187887
         */

        // 组合交易流水号
        private String tranSeq;
        // 银行账号
        private String account;
        // 产品代码
        private String prodCode;
        // 产品名称
        private String prodName;
        // 币种（001：人民币元 014：美元 012：英镑 013：港币 028: 加拿大元 029：澳元 038：欧元 027：日元）
        private String currency;
        // 钞汇标识（1：钞 2：汇 0：人民币）
        private String cashRemit;
        // 质押金额
        private String buyAmt;
        // 购买价格
        private String trfPrice;
        // 解质价格
        private String cancelPrice;
        // 状态（0：正常 1：解除）
        private String status;
        // 交易日期（即质押日期）
        private String returnDate;
        // 解质日期
        private String cancelDate;
        // 渠道（交易渠道 0：理财系统交易 1：（核心系统 OFP）柜面 2：网银 3：电话银行自助 4：电话银行人工 5:手机银行 6:家居银行 7:微信银行 8:自助终端 9：OCRM）
        private String channel;
        private int amount;
        private String canBeCanceled;
        private String curCode;

        public void setCashRemit(String cashRemit) {
            this.cashRemit = cashRemit;
        }

        public void setCanBeCanceled(String canBeCanceled) {
            this.canBeCanceled = canBeCanceled;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public void setCurCode(String curCode) {
            this.curCode = curCode;
        }

        public void setProdCode(String prodCode) {
            this.prodCode = prodCode;
        }

        public void setCancelPrice(String cancelPrice) {
            this.cancelPrice = cancelPrice;
        }

        public void setBuyAmt(String buyAmt) {
            this.buyAmt = buyAmt;
        }

        public void setReturnDate(String returnDate) {
            this.returnDate = returnDate;
        }

        public void setCurrency(String currency) {
            this.currency = currency;
        }

        public void setAmount(int amount) {
            this.amount = amount;
        }

        public void setTrfPrice(String trfPrice) {
            this.trfPrice = trfPrice;
        }

        public void setProdName(String prodName) {
            this.prodName = prodName;
        }

        public void setCancelDate(String cancelDate) {
            this.cancelDate = cancelDate;
        }

        public void setAccount(String account) {
            this.account = account;
        }

        public void setChannel(String channel) {
            this.channel = channel;
        }

        public void setTranSeq(String tranSeq) {
            this.tranSeq = tranSeq;
        }

        public String getCashRemit() {
            return cashRemit;
        }

        public String getCanBeCanceled() {
            return canBeCanceled;
        }

        public String getStatus() {
            return status;
        }

        public String getCurCode() {
            return curCode;
        }

        public String getProdCode() {
            return prodCode;
        }

        public String getCancelPrice() {
            return cancelPrice;
        }

        public String getBuyAmt() {
            return buyAmt;
        }

        public String getReturnDate() {
            return returnDate;
        }

        public String getCurrency() {
            return currency;
        }

        public int getAmount() {
            return amount;
        }

        public String getTrfPrice() {
            return trfPrice;
        }

        public String getProdName() {
            return prodName;
        }

        public String getCancelDate() {
            return cancelDate;
        }

        public String getAccount() {
            return account;
        }

        public String getChannel() {
            return channel;
        }

        public String getTranSeq() {
            return tranSeq;
        }
    }
}
