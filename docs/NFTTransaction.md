

# NFTTransaction


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**blockTime** | **BigDecimal** | An epoch time stamp in UTC time that represents the time of the block where the transaction was processed  |  [optional]
**exchange** | [**ExchangeEnum**](#ExchangeEnum) | The NFT exchange on which the transaction occurred |  [optional]
**exchangeReadable** | [**ExchangeReadableEnum**](#ExchangeReadableEnum) | A readable version of the NFT exchange |  [optional]
**mintAddress** | **String** | The mint address of the NFT  |  [optional]
**operation** | [**OperationEnum**](#OperationEnum) | The operation of the transaction |  [optional]
**seller** | **String** | The public key of the wallet that listed the NFT |  [optional]
**buyer** | **String** | The public key of the buyer. This only exists in &#x60;buy&#x60; transactions.  |  [optional]
**transactionSignature** | **String** | The signature of the transaction. You can look up each transaction on explorer.solana.com  |  [optional]



## Enum: ExchangeEnum

Name | Value
---- | -----
SOLSEA | &quot;solsea&quot;
MAGIC_EDEN | &quot;magic-eden&quot;
ALPHA_ART | &quot;alpha-art&quot;
DIGITAL_EYES | &quot;digital-eyes&quot;
SOLANART | &quot;solanart&quot;
EXCHANGE_ART | &quot;exchange-art&quot;



## Enum: ExchangeReadableEnum

Name | Value
---- | -----
SOLSEA | &quot;SolSea&quot;
MAGIC_EDEN | &quot;Magic Eden&quot;
ALPHA_ART | &quot;Alpha Art&quot;
DIGITAL_EYES | &quot;Digital Eyes&quot;
SOLANART | &quot;Solanart&quot;
EXCHANGE_ART | &quot;Exchange.art&quot;



## Enum: OperationEnum

Name | Value
---- | -----
BUY | &quot;buy&quot;
LIST | &quot;list&quot;
DE_LIST | &quot;de_list&quot;
UPDATE_LISTING | &quot;update_listing&quot;



