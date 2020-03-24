package com.github.wukong.googlece.models.targetHttpsProxies;

public class SetUrlMapRequest implements com.github.wukong.googlece.models.AbstractGoogleRequest {
	protected java.lang.String project;

	protected java.lang.String targetHttpsProxy;

	protected com.google.api.services.compute.model.UrlMapReference content;

	public void setProject(java.lang.String project) {
		this.project = project;
}
	public java.lang.String getProject() {
		return this.project;
}
	public void setTargetHttpsProxy(java.lang.String targetHttpsProxy) {
		this.targetHttpsProxy = targetHttpsProxy;
}
	public java.lang.String getTargetHttpsProxy() {
		return this.targetHttpsProxy;
}
	public void setContent(com.google.api.services.compute.model.UrlMapReference content) {
		this.content = content;
}
	public com.google.api.services.compute.model.UrlMapReference getContent() {
		return this.content;
}
}