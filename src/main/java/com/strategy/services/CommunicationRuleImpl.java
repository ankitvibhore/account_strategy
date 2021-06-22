package com.strategy.services;


import com.strategy.entity.Account;
import com.strategy.entity.OfferReminder;
import com.strategy.ruleSet.CommunicationRuleApply;

import java.util.ArrayList;
import java.util.List;

public class CommunicationRuleImpl implements CommunicationRuleApply<Account, OfferReminder> {


    @Override
    public List<OfferReminder> applyRule(Account data) {
        if (data.getPlacementDate() > 3 && (data.getOfferTag() == "Oasis" || data.getOfferTag() == "Apollo") &&
                (data.getTreatmentTool() == "FRP" || data.getTreatmentTool() == "care") && data.getStrategyId() == "W11") {
            List<OfferReminder> rules = new ArrayList<>();
            for (OfferReminder rem : getRules())
                rules.add(rem);
            return rules;
        }

        private static List<String> getRules()
        {

        }



    }
}
