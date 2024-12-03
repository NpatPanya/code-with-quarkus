package org.acme.SOAP_service.ArrayListofObject;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)  // Use this to access getters instead of fields directly
public class History {
    @XmlElement
    private int transactionID;
    @XmlElement
    private int amount;
    @XmlElement
    private Details details;

    public History(int transactionID, int amount, Details details) {
        this.transactionID = transactionID;
        this.amount = amount;
        this.details = details;
    }

    public History() {}

    // Getters and Setters
//   @XmlElement
    public int getTransactionID() {
        return transactionID;
    }

    public void setTransactionID(int transactionID) {
        this.transactionID = transactionID;
    }

//    @XmlElement
    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }




    @Override
    public String toString() {
        return "History [transactionID=" + transactionID + ", amount=" + amount + "," + details + "]";
    }
}
