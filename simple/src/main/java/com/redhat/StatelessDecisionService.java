package com.redhat;

import java.util.Collection;
import java.util.Map;

public interface StatelessDecisionService {
	Map<String, Object> runRules(Collection<Object> facts, String processId);
}