

# BalanceResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**balance** | **BigDecimal** | The balance of the token in the wallet | 
**integerBalance** | **BigDecimal** | Not included if retreiving SOL balance |  [optional]
**decimals** | **BigDecimal** | Not included if retreiving SOL balance. Sometimes not included if the balance of the token is &#39;0&#39;. |  [optional]
**network** | [**NetworkEnum**](#NetworkEnum) |  | 
**unit** | [**UnitEnum**](#UnitEnum) | Not included if retreiving an SPL token/NFT balance |  [optional]



## Enum: NetworkEnum

Name | Value
---- | -----
DEVNET | &quot;devnet&quot;
MAINNET_BETA | &quot;mainnet-beta&quot;



## Enum: UnitEnum

Name | Value
---- | -----
LAMPORT | &quot;lamport&quot;
SOL | &quot;sol&quot;



