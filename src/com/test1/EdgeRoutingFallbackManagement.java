package com.test1;

public class EdgeRoutingFallbackManagement {
	private long fallbackManagementId;
	private long conditionalEdgeRoutingId;
	private long workflowExecutionId;
	private long routingExecutionId;
	private String sourceNodeId;
	private String originalTargetNodeId;
	private String fallbackTargetNodeId;
	private String fallbackStrategy;
	private String fallbackTriggerType;
	private String fallbackTriggerReason;
	private String fallbackCondition;
	private long maximumFallbackAttempt;
	private long currentFallbackAttempt;
	private long retryBackoffInterval;
	private long fallbackPriority;
	private String fallbackStartTime;
	private String fallbackEndTime;
	private long fallbackExecutionDuration;

	public EdgeRoutingFallbackManagement() {

	}

	public EdgeRoutingFallbackManagement(long fallbackManagementId, long conditionalEdgeRoutingId,
			long workflowExecutionId, long routingExecutionId, String sourceNodeId, String originalTargetNodeId,
			String fallbackTargetNodeId, String fallbackStrategy, String fallbackTriggerType,
			String fallbackTriggerReason, String fallbackCondition, long maximumFallbackAttempt,
			long currentFallbackAttempt, long retryBackoffInterval, long fallbackPriority, String fallbackStartTime,
			String fallbackEndTime, long fallbackExecutionDuration) {
		super();
		this.fallbackManagementId = fallbackManagementId;
		this.conditionalEdgeRoutingId = conditionalEdgeRoutingId;
		this.workflowExecutionId = workflowExecutionId;
		this.routingExecutionId = routingExecutionId;
		this.sourceNodeId = sourceNodeId;
		this.originalTargetNodeId = originalTargetNodeId;
		this.fallbackTargetNodeId = fallbackTargetNodeId;
		this.fallbackStrategy = fallbackStrategy;
		this.fallbackTriggerType = fallbackTriggerType;
		this.fallbackTriggerReason = fallbackTriggerReason;
		this.fallbackCondition = fallbackCondition;
		this.maximumFallbackAttempt = maximumFallbackAttempt;
		this.currentFallbackAttempt = currentFallbackAttempt;
		this.retryBackoffInterval = retryBackoffInterval;
		this.fallbackPriority = fallbackPriority;
		this.fallbackStartTime = fallbackStartTime;
		this.fallbackEndTime = fallbackEndTime;
		this.fallbackExecutionDuration = fallbackExecutionDuration;
	}

	public long getFallbackManagementId() {
		return fallbackManagementId;
	}

	public void setFallbackManagementId(long fallbackManagementId) {
		this.fallbackManagementId = fallbackManagementId;
	}

	public long getConditionalEdgeRoutingId() {
		return conditionalEdgeRoutingId;
	}

	public void setConditionalEdgeRoutingId(long conditionalEdgeRoutingId) {
		this.conditionalEdgeRoutingId = conditionalEdgeRoutingId;
	}

	public long getWorkflowExecutionId() {
		return workflowExecutionId;
	}

	public void setWorkflowExecutionId(long workflowExecutionId) {
		this.workflowExecutionId = workflowExecutionId;
	}

	public long getRoutingExecutionId() {
		return routingExecutionId;
	}

	public void setRoutingExecutionId(long routingExecutionId) {
		this.routingExecutionId = routingExecutionId;
	}

	public String getSourceNodeId() {
		return sourceNodeId;
	}

	public void setSourceNodeId(String sourceNodeId) {
		this.sourceNodeId = sourceNodeId;
	}

	public String getOriginalTargetNodeId() {
		return originalTargetNodeId;
	}

	public void setOriginalTargetNodeId(String originalTargetNodeId) {
		this.originalTargetNodeId = originalTargetNodeId;
	}

	public String getFallbackTargetNodeId() {
		return fallbackTargetNodeId;
	}

	public void setFallbackTargetNodeId(String fallbackTargetNodeId) {
		this.fallbackTargetNodeId = fallbackTargetNodeId;
	}

	public String getFallbackStrategy() {
		return fallbackStrategy;
	}

	public void setFallbackStrategy(String fallbackStrategy) {
		this.fallbackStrategy = fallbackStrategy;
	}

	public String getFallbackTriggerType() {
		return fallbackTriggerType;
	}

	public void setFallbackTriggerType(String fallbackTriggerType) {
		this.fallbackTriggerType = fallbackTriggerType;
	}

	public String getFallbackTriggerReason() {
		return fallbackTriggerReason;
	}

	public void setFallbackTriggerReason(String fallbackTriggerReason) {
		this.fallbackTriggerReason = fallbackTriggerReason;
	}

	public String getFallbackCondition() {
		return fallbackCondition;
	}

	public void setFallbackCondition(String fallbackCondition) {
		this.fallbackCondition = fallbackCondition;
	}

	public long getMaximumFallbackAttempt() {
		return maximumFallbackAttempt;
	}

	public void setMaximumFallbackAttempt(long maximumFallbackAttempt) {
		this.maximumFallbackAttempt = maximumFallbackAttempt;
	}

	public long getCurrentFallbackAttempt() {
		return currentFallbackAttempt;
	}

	public void setCurrentFallbackAttempt(long currentFallbackAttempt) {
		this.currentFallbackAttempt = currentFallbackAttempt;
	}

	public long getRetryBackoffInterval() {
		return retryBackoffInterval;
	}

	public void setRetryBackoffInterval(long retryBackoffInterval) {
		this.retryBackoffInterval = retryBackoffInterval;
	}

	public long getFallbackPriority() {
		return fallbackPriority;
	}

	public void setFallbackPriority(long fallbackPriority) {
		this.fallbackPriority = fallbackPriority;
	}

	public String getFallbackStartTime() {
		return fallbackStartTime;
	}

	public void setFallbackStartTime(String fallbackStartTime) {
		this.fallbackStartTime = fallbackStartTime;
	}

	public String getFallbackEndTime() {
		return fallbackEndTime;
	}

	public void setFallbackEndTime(String fallbackEndTime) {
		this.fallbackEndTime = fallbackEndTime;
	}

	public long getFallbackExecutionDuration() {
		return fallbackExecutionDuration;
	}

	public void setFallbackExecutionDuration(long fallbackExecutionDuration) {
		this.fallbackExecutionDuration = fallbackExecutionDuration;
	}

}
