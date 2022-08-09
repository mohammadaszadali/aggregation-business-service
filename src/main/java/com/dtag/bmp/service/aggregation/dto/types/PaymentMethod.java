
package com.dtag.bmp.service.aggregation.dto.types;


public class PaymentMethod {

    private String description;
    private Object paymentMethodId;
    private String paymentMethodName;
    private Object validTill;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Object getPaymentMethodId() {
        return paymentMethodId;
    }

    public void setPaymentMethodId(Object paymentMethodId) {
        this.paymentMethodId = paymentMethodId;
    }

    public String getPaymentMethodName() {
        return paymentMethodName;
    }

    public void setPaymentMethodName(String paymentMethodName) {
        this.paymentMethodName = paymentMethodName;
    }

    public Object getValidTill() {
        return validTill;
    }

    public void setValidTill(Object validTill) {
        this.validTill = validTill;
    }

}
