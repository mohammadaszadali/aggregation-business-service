
package com.dtag.bmp.service.aggregation.dto.types;


public class PaymentDetail {

    private String accountHolder;
    private String bic;
    private String iban;
    private String bankAccountNumber;
    private Object bankAccountType;
    private Object bankCardType;
    private Object bankCode;
    private String bankName;
    private Object cardExpiryDate;
    private Object cardNumber;
    private Object chequeNumber;
    private Object cvv;
    private String nameOnCard;

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public String getBic() {
        return bic;
    }

    public void setBic(String bic) {
        this.bic = bic;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public String getBankAccountNumber() {
        return bankAccountNumber;
    }

    public void setBankAccountNumber(String bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }

    public Object getBankAccountType() {
        return bankAccountType;
    }

    public void setBankAccountType(Object bankAccountType) {
        this.bankAccountType = bankAccountType;
    }

    public Object getBankCardType() {
        return bankCardType;
    }

    public void setBankCardType(Object bankCardType) {
        this.bankCardType = bankCardType;
    }

    public Object getBankCode() {
        return bankCode;
    }

    public void setBankCode(Object bankCode) {
        this.bankCode = bankCode;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public Object getCardExpiryDate() {
        return cardExpiryDate;
    }

    public void setCardExpiryDate(Object cardExpiryDate) {
        this.cardExpiryDate = cardExpiryDate;
    }

    public Object getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(Object cardNumber) {
        this.cardNumber = cardNumber;
    }

    public Object getChequeNumber() {
        return chequeNumber;
    }

    public void setChequeNumber(Object chequeNumber) {
        this.chequeNumber = chequeNumber;
    }

    public Object getCvv() {
        return cvv;
    }

    public void setCvv(Object cvv) {
        this.cvv = cvv;
    }

    public String getNameOnCard() {
        return nameOnCard;
    }

    public void setNameOnCard(String nameOnCard) {
        this.nameOnCard = nameOnCard;
    }

}
