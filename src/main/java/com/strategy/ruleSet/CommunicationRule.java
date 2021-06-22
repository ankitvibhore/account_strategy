package com.strategy.ruleSet;

import java.util.List;

public interface CommunicationRuleApply<Account,OfferReminder> {
    List<OfferReminder> applyRule(Account data);
}
