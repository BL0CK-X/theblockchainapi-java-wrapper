

# GetConfigInfoRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**configAddress** | **String** | The config address of the candy machine.  If you don&#39;t know the address of a candy machine, you can use the \&quot;Get Candy Machine Details\&quot; endpoint to get the configuration public key address.  If you don&#39;t know the candy machine ID to call this endpoint, you can find it with the \&quot;Get NFT&#39;s Candy Machine ID\&quot; endpoint.  | 
**network** | [**NetworkEnum**](#NetworkEnum) |  |  [optional]



## Enum: NetworkEnum

Name | Value
---- | -----
DEVNET | &quot;devnet&quot;
MAINNET_BETA | &quot;mainnet-beta&quot;



