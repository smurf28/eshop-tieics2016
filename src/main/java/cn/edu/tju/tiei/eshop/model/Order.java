package cn.edu.tju.tiei.eshop.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

public class Order implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order.customer_id
     *
     * @mbg.generated
     */
    private String customerId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order.status_id
     *
     * @mbg.generated
     */
    private Integer statusId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order.price
     *
     * @mbg.generated
     */
    private BigDecimal price;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order.payment_method_id
     *
     * @mbg.generated
     */
    private Integer paymentMethodId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order.send_method_id
     *
     * @mbg.generated
     */
    private Integer sendMethodId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order.place_time
     *
     * @mbg.generated
     */
    private java.sql.Timestamp placeTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order.send_time
     *
     * @mbg.generated
     */
    private java.sql.Timestamp sendTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order.invoice_title
     *
     * @mbg.generated
     */
    private String invoiceTitle;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order.invoice_item
     *
     * @mbg.generated
     */
    private String invoiceItem;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table order
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order.id
     *
     * @return the value of order.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order.id
     *
     * @param id the value for order.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order.customer_id
     *
     * @return the value of order.customer_id
     *
     * @mbg.generated
     */
    public String getCustomerId() {
        return customerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order.customer_id
     *
     * @param customerId the value for order.customer_id
     *
     * @mbg.generated
     */
    public void setCustomerId(String customerId) {
        this.customerId = customerId == null ? null : customerId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order.status_id
     *
     * @return the value of order.status_id
     *
     * @mbg.generated
     */
    public Integer getStatusId() {
        return statusId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order.status_id
     *
     * @param statusId the value for order.status_id
     *
     * @mbg.generated
     */
    public void setStatusId(Integer statusId) {
        this.statusId = statusId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order.price
     *
     * @return the value of order.price
     *
     * @mbg.generated
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order.price
     *
     * @param price the value for order.price
     *
     * @mbg.generated
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order.payment_method_id
     *
     * @return the value of order.payment_method_id
     *
     * @mbg.generated
     */
    public Integer getPaymentMethodId() {
        return paymentMethodId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order.payment_method_id
     *
     * @param paymentMethodId the value for order.payment_method_id
     *
     * @mbg.generated
     */
    public void setPaymentMethodId(Integer paymentMethodId) {
        this.paymentMethodId = paymentMethodId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order.send_method_id
     *
     * @return the value of order.send_method_id
     *
     * @mbg.generated
     */
    public Integer getSendMethodId() {
        return sendMethodId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order.send_method_id
     *
     * @param sendMethodId the value for order.send_method_id
     *
     * @mbg.generated
     */
    public void setSendMethodId(Integer sendMethodId) {
        this.sendMethodId = sendMethodId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order.place_time
     *
     * @return the value of order.place_time
     *
     * @mbg.generated
     */
    public String getPlaceTime() {
        return placeTime.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order.place_time
     *
     * @param placeTime the value for order.place_time
     *
     * @mbg.generated
     */
    public void setPlaceTime(String placeTime) {
        this.placeTime = Timestamp.valueOf(placeTime);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order.send_time
     *
     * @return the value of order.send_time
     *
     * @mbg.generated
     */
    public String getSendTime() {
        return sendTime.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order.send_time
     *
     * @param sendTime the value for order.send_time
     *
     * @mbg.generated
     */
    public void setSendTime(String sendTime) {
        this.sendTime = Timestamp.valueOf(sendTime);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order.invoice_title
     *
     * @return the value of order.invoice_title
     *
     * @mbg.generated
     */
    public String getInvoiceTitle() {
        return invoiceTitle;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order.invoice_title
     *
     * @param invoiceTitle the value for order.invoice_title
     *
     * @mbg.generated
     */
    public void setInvoiceTitle(String invoiceTitle) {
        this.invoiceTitle = invoiceTitle == null ? null : invoiceTitle.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order.invoice_item
     *
     * @return the value of order.invoice_item
     *
     * @mbg.generated
     */
    public String getInvoiceItem() {
        return invoiceItem;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order.invoice_item
     *
     * @param invoiceItem the value for order.invoice_item
     *
     * @mbg.generated
     */
    public void setInvoiceItem(String invoiceItem) {
        this.invoiceItem = invoiceItem == null ? null : invoiceItem.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order
     *
     * @mbg.generated
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Order other = (Order) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCustomerId() == null ? other.getCustomerId() == null : this.getCustomerId().equals(other.getCustomerId()))
            && (this.getStatusId() == null ? other.getStatusId() == null : this.getStatusId().equals(other.getStatusId()))
            && (this.getPrice() == null ? other.getPrice() == null : this.getPrice().equals(other.getPrice()))
            && (this.getPaymentMethodId() == null ? other.getPaymentMethodId() == null : this.getPaymentMethodId().equals(other.getPaymentMethodId()))
            && (this.getSendMethodId() == null ? other.getSendMethodId() == null : this.getSendMethodId().equals(other.getSendMethodId()))
            && (this.getPlaceTime() == null ? other.getPlaceTime() == null : this.getPlaceTime().equals(other.getPlaceTime()))
            && (this.getSendTime() == null ? other.getSendTime() == null : this.getSendTime().equals(other.getSendTime()))
            && (this.getInvoiceTitle() == null ? other.getInvoiceTitle() == null : this.getInvoiceTitle().equals(other.getInvoiceTitle()))
            && (this.getInvoiceItem() == null ? other.getInvoiceItem() == null : this.getInvoiceItem().equals(other.getInvoiceItem()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCustomerId() == null) ? 0 : getCustomerId().hashCode());
        result = prime * result + ((getStatusId() == null) ? 0 : getStatusId().hashCode());
        result = prime * result + ((getPrice() == null) ? 0 : getPrice().hashCode());
        result = prime * result + ((getPaymentMethodId() == null) ? 0 : getPaymentMethodId().hashCode());
        result = prime * result + ((getSendMethodId() == null) ? 0 : getSendMethodId().hashCode());
        result = prime * result + ((getPlaceTime() == null) ? 0 : getPlaceTime().hashCode());
        result = prime * result + ((getSendTime() == null) ? 0 : getSendTime().hashCode());
        result = prime * result + ((getInvoiceTitle() == null) ? 0 : getInvoiceTitle().hashCode());
        result = prime * result + ((getInvoiceItem() == null) ? 0 : getInvoiceItem().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", customerId=").append(customerId);
        sb.append(", statusId=").append(statusId);
        sb.append(", price=").append(price);
        sb.append(", paymentMethodId=").append(paymentMethodId);
        sb.append(", sendMethodId=").append(sendMethodId);
        sb.append(", placeTime=").append(placeTime);
        sb.append(", sendTime=").append(sendTime);
        sb.append(", invoiceTitle=").append(invoiceTitle);
        sb.append(", invoiceItem=").append(invoiceItem);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}