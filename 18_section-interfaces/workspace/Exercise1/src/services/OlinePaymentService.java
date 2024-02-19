package services;

public interface OlinePaymentService {
    public Double paymentFee(Double amount);

    public Double interest(Double amount, Integer months);
}
