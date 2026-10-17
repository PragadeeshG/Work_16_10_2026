package com.test1;

public class EdgeRoutingPerformanceMonitoring {
	private long routingPerformanceId;
	private long conditionalEdgeRoutingId;
	private long workflowDefinitionId;
	private String sourceNodeId;
	private String targetNodeId;
	private String routingFunctionName;
	private long totalRoutingExecutions;
	private long successfulRoutingCount;
	private long failedRoutingCount;
	private long fallbackRoutingCount;
	private long conditionalMatchCount;
	private long averageRoutingLatency;
	private long maximumRoutingLatency;
	private long minimumRoutingLatency;
	private long routingTimeoutCount;
	private long ruleEvaluationFailureCount;
	private String routingSuccessRate;
	private String fallbackTriggerRate;

	public EdgeRoutingPerformanceMonitoring() {

	}

	public EdgeRoutingPerformanceMonitoring(long routingPerformanceId, long conditionalEdgeRoutingId,
			long workflowDefinitionId, String sourceNodeId, String targetNodeId, String routingFunctionName,
			long totalRoutingExecutions, long successfulRoutingCount, long failedRoutingCount,
			long fallbackRoutingCount, long conditionalMatchCount, long averageRoutingLatency,
			long maximumRoutingLatency, long minimumRoutingLatency, long routingTimeoutCount,
			long ruleEvaluationFailureCount, String routingSuccessRate, String fallbackTriggerRate) {
		super();
		this.routingPerformanceId = routingPerformanceId;
		this.conditionalEdgeRoutingId = conditionalEdgeRoutingId;
		this.workflowDefinitionId = workflowDefinitionId;
		this.sourceNodeId = sourceNodeId;
		this.targetNodeId = targetNodeId;
		this.routingFunctionName = routingFunctionName;
		this.totalRoutingExecutions = totalRoutingExecutions;
		this.successfulRoutingCount = successfulRoutingCount;
		this.failedRoutingCount = failedRoutingCount;
		this.fallbackRoutingCount = fallbackRoutingCount;
		this.conditionalMatchCount = conditionalMatchCount;
		this.averageRoutingLatency = averageRoutingLatency;
		this.maximumRoutingLatency = maximumRoutingLatency;
		this.minimumRoutingLatency = minimumRoutingLatency;
		this.routingTimeoutCount = routingTimeoutCount;
		this.ruleEvaluationFailureCount = ruleEvaluationFailureCount;
		this.routingSuccessRate = routingSuccessRate;
		this.fallbackTriggerRate = fallbackTriggerRate;
	}

	public long getRoutingPerformanceId() {
		return routingPerformanceId;
	}

	public void setRoutingPerformanceId(long routingPerformanceId) {
		this.routingPerformanceId = routingPerformanceId;
	}

	public long getConditionalEdgeRoutingId() {
		return conditionalEdgeRoutingId;
	}

	public void setConditionalEdgeRoutingId(long conditionalEdgeRoutingId) {
		this.conditionalEdgeRoutingId = conditionalEdgeRoutingId;
	}

	public long getWorkflowDefinitionId() {
		return workflowDefinitionId;
	}

	public void setWorkflowDefinitionId(long workflowDefinitionId) {
		this.workflowDefinitionId = workflowDefinitionId;
	}

	public String getSourceNodeId() {
		return sourceNodeId;
	}

	public void setSourceNodeId(String sourceNodeId) {
		this.sourceNodeId = sourceNodeId;
	}

	public String getTargetNodeId() {
		return targetNodeId;
	}

	public void setTargetNodeId(String targetNodeId) {
		this.targetNodeId = targetNodeId;
	}

	public String getRoutingFunctionName() {
		return routingFunctionName;
	}

	public void setRoutingFunctionName(String routingFunctionName) {
		this.routingFunctionName = routingFunctionName;
	}

	public long getTotalRoutingExecutions() {
		return totalRoutingExecutions;
	}

	public void setTotalRoutingExecutions(long totalRoutingExecutions) {
		this.totalRoutingExecutions = totalRoutingExecutions;
	}

	public long getSuccessfulRoutingCount() {
		return successfulRoutingCount;
	}

	public void setSuccessfulRoutingCount(long successfulRoutingCount) {
		this.successfulRoutingCount = successfulRoutingCount;
	}

	public long getFailedRoutingCount() {
		return failedRoutingCount;
	}

	public void setFailedRoutingCount(long failedRoutingCount) {
		this.failedRoutingCount = failedRoutingCount;
	}

	public long getFallbackRoutingCount() {
		return fallbackRoutingCount;
	}

	public void setFallbackRoutingCount(long fallbackRoutingCount) {
		this.fallbackRoutingCount = fallbackRoutingCount;
	}

	public long getConditionalMatchCount() {
		return conditionalMatchCount;
	}

	public void setConditionalMatchCount(long conditionalMatchCount) {
		this.conditionalMatchCount = conditionalMatchCount;
	}

	public long getAverageRoutingLatency() {
		return averageRoutingLatency;
	}

	public void setAverageRoutingLatency(long averageRoutingLatency) {
		this.averageRoutingLatency = averageRoutingLatency;
	}

	public long getMaximumRoutingLatency() {
		return maximumRoutingLatency;
	}

	public void setMaximumRoutingLatency(long maximumRoutingLatency) {
		this.maximumRoutingLatency = maximumRoutingLatency;
	}

	public long getMinimumRoutingLatency() {
		return minimumRoutingLatency;
	}

	public void setMinimumRoutingLatency(long minimumRoutingLatency) {
		this.minimumRoutingLatency = minimumRoutingLatency;
	}

	public long getRoutingTimeoutCount() {
		return routingTimeoutCount;
	}

	public void setRoutingTimeoutCount(long routingTimeoutCount) {
		this.routingTimeoutCount = routingTimeoutCount;
	}

	public long getRuleEvaluationFailureCount() {
		return ruleEvaluationFailureCount;
	}

	public void setRuleEvaluationFailureCount(long ruleEvaluationFailureCount) {
		this.ruleEvaluationFailureCount = ruleEvaluationFailureCount;
	}

	public String getRoutingSuccessRate() {
		return routingSuccessRate;
	}

	public void setRoutingSuccessRate(String routingSuccessRate) {
		this.routingSuccessRate = routingSuccessRate;
	}

	public String getFallbackTriggerRate() {
		return fallbackTriggerRate;
	}

	public void setFallbackTriggerRate(String fallbackTriggerRate) {
		this.fallbackTriggerRate = fallbackTriggerRate;
	}

}