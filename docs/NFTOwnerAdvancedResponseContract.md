

# NFTOwnerAdvancedResponseContract

The contract the NFT interacted with most recently. If there is none, this is null. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**contractType** | [**ContractTypeEnum**](#ContractTypeEnum) | The type of the contract that it last interacted with |  [optional]
**contractId** | **String** | The string identifier (not the public key) that we denote the contract with. |  [optional]
**contractBlockchainIdentifier** | **String** | The public key of the contract |  [optional]
**contractName** | **String** | The readable name of the contract (e.g., Magic Eden) |  [optional]



## Enum: ContractTypeEnum

Name | Value
---- | -----
MARKETPLACE | &quot;marketplace&quot;
OTC | &quot;otc&quot;
LOAN | &quot;loan&quot;
STAKING | &quot;staking&quot;
BURNED | &quot;burned&quot;



