package com.lld.mtb.implementations;

import com.lld.mtb.interfaces.IPayment;
import org.springframework.stereotype.Component;

@Component
public class CashPayment implements IPayment {
    @Override
    public void pay(int amount) {

    }
}
