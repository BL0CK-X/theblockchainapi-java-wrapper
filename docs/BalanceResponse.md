

# BalanceResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**balance** | **BigDecimal** | The balance of the token in the wallet | 
**integerBalance** | **BigDecimal** | Not included if retreiving SOL balance |  [optional]
**decimals** | **BigDecimal** | Not included if retreiving SOL balance |  [optional]
**network** | [**NetworkEnum**](#NetworkEnum) |  | 
**unit** | [**UnitEnum**](#UnitEnum) | Not included if retreiving an SPL token balance |  [optional]



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



