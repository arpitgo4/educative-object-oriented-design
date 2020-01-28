package com.lld.mtb.implementations;

import com.lld.mtb.interfaces.IPayment;
import org.springframework.stereotype.Component;

@Component
public class CreditCardPayment implements IPayment {

    @Override
    public boolean pay(int amount) {
        return false;
    }

}
