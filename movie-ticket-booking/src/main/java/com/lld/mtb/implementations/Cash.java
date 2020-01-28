package com.lld.mtb.implementations;

import com.lld.mtb.interfaces.IPayment;

public class Cash implements IPayment {

    @Override
    public boolean pay(int amount) {
        return false;
    }
}
