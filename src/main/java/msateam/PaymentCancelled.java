package msateam;


public class PaymentCancelled extends AbstractEvent {

    private Long payId;
    private Long rsvId;
    private Long seatId;
    private String status;

    public PaymentCancelled(){
        super();
    }

    public Long getPayId() {
        return payId;
    }

    public void setPayId(Long PayId) {
        this.payId = payId;
    }
    public Long getRsvId() {
        return rsvId;
    }

    public void setRsvId(Long RsvId) {
        this.rsvId = rsvId;
    }
    public Long getSeatId() {
        return seatId;
    }

    public void setSeatId(Long SeatId) {
        this.seatId = seatId;
    }
    public String getStatus() {
        return status;
    }

    public void setStatus(String Status) {
        this.status = status;
    }
}
