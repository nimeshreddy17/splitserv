package impl;

import interfaces.ComputeHandler;
import lombok.Builder;
import lombok.Data;
import models.SplitwiseAddRequest;

import java.util.HashMap;

@Data
@Builder
public class ShareComputeHandler implements ComputeHandler {

    private UserServiceImpl userService;

    @Override
    public void compute(SplitwiseAddRequest request, HashMap<String, Double> balancesList) {

    }
}
