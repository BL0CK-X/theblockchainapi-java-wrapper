

# GetCandyDetailsResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**uuid** | **String** | The uuid of the candy machine |  [optional]
**goLiveDate** | **BigDecimal** | The unix timestamp of the start date of the candy machine  |  [optional]
**price** | **BigDecimal** | The price in Lamports for minting an NFT from the candy machine. 1e9 Lamport  &#x3D; 1 SOL  |  [optional]
**itemsAvailable** | **BigDecimal** | The number of NFTs available for mint from the candy machine  |  [optional]
**itemsRedeemed** | **BigDecimal** | The number of NFTs minted already from the candy machine  |  [optional]
**tokenMint** | **String** |  |  [optional]
**configAddress** | **String** | The configuration public key address of the candy machine  |  [optional]
**wallet** | **String** | The public key address of the wallet that recevies the proceeds from NFT mints  |  [optional]
**bump** | **BigDecimal** |  |  [optional]



