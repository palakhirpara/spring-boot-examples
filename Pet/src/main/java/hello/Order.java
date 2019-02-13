package hello;

//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;
import javax.validation.Valid;

public class Order {
    @JsonProperty("id")
    private Long id = null;
    @JsonProperty("petId")
    private Long petId = null;
    @JsonProperty("quantity")
    private Integer quantity = null;
    @JsonProperty("shipDate")
    private Object shipDate = null;
    @JsonProperty("status")
    private Order.StatusEnum status = null;
    @JsonProperty("complete")
    private Boolean complete = false;

    public Order() {
    }

    public Order id(Long id) {
        this.id = id;
        return this;
    }

    @ApiModelProperty("")
    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Order petId(Long petId) {
        this.petId = petId;
        return this;
    }

    @ApiModelProperty("")
    public Long getPetId() {
        return this.petId;
    }

    public void setPetId(Long petId) {
        this.petId = petId;
    }

    public Order quantity(Integer quantity) {
        this.quantity = quantity;
        return this;
    }

    @ApiModelProperty("")
    public Integer getQuantity() {
        return this.quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Order shipDate(Object shipDate) {
        this.shipDate = shipDate;
        return this;
    }

    @ApiModelProperty("")
    @Valid
    public Object getShipDate() {
        return this.shipDate;
    }

    public void setShipDate(Object shipDate) {
        this.shipDate = shipDate;
    }

    public Order status(Order.StatusEnum status) {
        this.status = status;
        return this;
    }

    @ApiModelProperty("Order Status")
    public Order.StatusEnum getStatus() {
        return this.status;
    }

    public void setStatus(Order.StatusEnum status) {
        this.status = status;
    }

    public Order complete(Boolean complete) {
        this.complete = complete;
        return this;
    }

    @ApiModelProperty("")
    public Boolean getComplete() {
        return this.complete;
    }

    public void setComplete(Boolean complete) {
        this.complete = complete;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (o != null && this.getClass() == o.getClass()) {
            Order order = (Order)o;
            return Objects.equals(this.id, order.id) && Objects.equals(this.petId, order.petId) && Objects.equals(this.quantity, order.quantity) && Objects.equals(this.shipDate, order.shipDate) && Objects.equals(this.status, order.status) && Objects.equals(this.complete, order.complete);
        } else {
            return false;
        }
    }

    public static enum StatusEnum {
        PLACED("placed"),
        APPROVED("approved"),
        DELIVERED("delivered");

        private String value;

        private StatusEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String toString() {
            return String.valueOf(this.value);
        }

        @JsonCreator
        public static Order.StatusEnum fromValue(String text) {
            Order.StatusEnum[] var1 = values();
            int var2 = var1.length;

            for(int var3 = 0; var3 < var2; ++var3) {
                Order.StatusEnum b = var1[var3];
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }

            return null;
        }
    }
}
