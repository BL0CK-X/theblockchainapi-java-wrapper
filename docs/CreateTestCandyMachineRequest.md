

# CreateTestCandyMachineRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**wallet** | [**Wallet**](Wallet.md) |  | 
**network** | [**NetworkEnum**](#NetworkEnum) |  |  [optional]
**candyMachineContractVersion** | [**CandyMachineContractVersionEnum**](#CandyMachineContractVersionEnum) | The contract you want to use to create the candy machine. Note: Metaplex disabled the creation of &#x60;v1&#x60; candy machines on their smart contract, and so we no longer support the creation of &#x60;v1&#x60; test candy machines.  |  [optional]
**includeGatekeeper** | **Boolean** | Whether or not to include a gatekeeper for testing purposes. Only applies to v2 candy machines. |  [optional]



## Enum: NetworkEnum

Name | Value
---- | -----
DEVNET | &quot;devnet&quot;
MAINNET_BETA | &quot;mainnet-beta&quot;



## Enum: CandyMachineContractVersionEnum

Name | Value
---- | -----
V2 | &quot;v2&quot;



