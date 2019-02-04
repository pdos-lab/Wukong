package com.github.wukong.azurevm.models.virtualMachineScaleSetExtensions;

public class GetRequest implements com.github.wukong.azurevm.models.AbstractAzureRequest {
	protected java.lang.String resourceGroupName;

	protected java.lang.String vmScaleSetName;

	protected java.lang.String vmssExtensionName;

	public void setResourceGroupName(java.lang.String resourceGroupName) {
		this.resourceGroupName = resourceGroupName;
}
	public java.lang.String getResourceGroupName() {
		return this.resourceGroupName;
}
	public void setVmScaleSetName(java.lang.String vmScaleSetName) {
		this.vmScaleSetName = vmScaleSetName;
}
	public java.lang.String getVmScaleSetName() {
		return this.vmScaleSetName;
}
	public void setVmssExtensionName(java.lang.String vmssExtensionName) {
		this.vmssExtensionName = vmssExtensionName;
}
	public java.lang.String getVmssExtensionName() {
		return this.vmssExtensionName;
}
}