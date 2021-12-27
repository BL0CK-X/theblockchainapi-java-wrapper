

# GetCandyMetadataRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**candyMachineId** | **String** | The ID of the candy machine. This is the same as &#x60;config_address&#x60; for &#x60;v2&#x60; candy machines (supply either).  |  [optional]
**configAddress** | **String** | The configuration address of the candy machine. This is the same as &#x60;candy_machine_id&#x60; for &#x60;v2&#x60; candy machines (supply either).  |  [optional]
**uuid** | **String** | The uuid of the candy machine. This is an alphanumeric string of length six (e.g., HpVdfP), which corresponds to the first six characters of the config_address.  |  [optional]
**network** | [**NetworkEnum**](#NetworkEnum) |  |  [optional]
**candyMachineContractVersion** | [**CandyMachineContractVersionEnum**](#CandyMachineContractVersionEnum) | The candy machine contract of the candy machine for which you are retrieving the metadata. If you are providing &#x60;v1&#x60; candy machine ID, set this to &#x60;v1&#x60;. If you are providing &#x60;v2&#x60; candy machine ID, set this to &#x60;v2&#x60;. If you don&#39;t know which version your candy machine is, check out &lt;a href&#x3D;\&quot;#operation/solanaGetAccountIsCandyMachine\&quot;&gt;this endpoint&lt;/a&gt;.  |  [optional]



## Enum: NetworkEnum

Name | Value
---- | -----
DEVNET | &quot;devnet&quot;
MAINNET_BETA | &quot;mainnet-beta&quot;



## Enum: CandyMachineContractVersionEnum

Name | Value
---- | -----
V1 | &quot;v1&quot;
V2 | &quot;v2&quot;



