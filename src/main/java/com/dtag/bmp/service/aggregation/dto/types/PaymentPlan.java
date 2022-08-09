
package com.dtag.bmp.service.aggregation.dto.types;


public class PaymentPlan {

    private Object customerAccount;
    private Object maxTrialTimes;
    private Object maximumAmount;
    private Object paymentDay;
    private PaymentDetail paymentDetail;
    private PaymentMethod paymentMethod;
    private Object paymentPeriod;
    private Object paymentPlanId;
    private Object priority;
    private Object status;
    private Object totalAmount;
    private Object validFrom;
    private Object validTill;

    public Object getCustomerAccount() {
        return customerAccount;
    }

    public void setCustomerAccount(Object customerAccount) {
        this.customerAccount = customerAccount;
    }

    public Object getMaxTrialTimes() {
        return maxTrialTimes;
    }

    public void setMaxTrialTimes(Object maxTrialTimes) {
        this.maxTrialTimes = maxTrialTimes;
    }

    public Object getMaximumAmount() {
        return maximumAmount;
    }

    public void setMaximumAmount(Object maximumAmount) {
        this.maximumAmount = maximumAmount;
    }

    public Object getPaymentDay() {
        return paymentDay;
    }

    public void setPaymentDay(Object paymentDay) {
        this.paymentDay = paymentDay;
    }

    public PaymentDetail getPaymentDetail() {
        return paymentDetail;
    }

    public void setPaymentDetail(PaymentDetail paymentDetail) {
        this.paymentDetail = paymentDetail;
    }

    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public Object getPaymentPeriod() {
        return paymentPeriod;
    }

    public void setPaymentPeriod(Object paymentPeriod) {
        this.paymentPeriod = paymentPeriod;
    }

    public Object getPaymentPlanId() {
        return paymentPlanId;
    }

    public void setPaymentPlanId(Object paymentPlanId) {
        this.paymentPlanId = paymentPlanId;
    }

    public Object getPriority() {
        return priority;
    }

    public void setPriority(Object priority) {
        this.priority = priority;
    }

    public Object getStatus() {
        return status;
    }

    public void setStatus(Object status) {
        this.status = status;
    }

    public Object getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Object totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Object getValidFrom() {
        return validFrom;
    }

    public void setValidFrom(Object validFrom) {
        this.validFrom = validFrom;
    }

    public Object getValidTill() {
        return validTill;
    }

    public void setValidTill(Object validTill) {
        this.validTill = validTill;
    }

}
