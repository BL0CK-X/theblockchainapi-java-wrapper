

# GetCandyMetadataResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**authority** | **String** | The update authority of the candy machine |  [optional]
**bump** | **BigDecimal** |  |  [optional]
**candyMachineId** | **String** | The ID of the candy machine  |  [optional]
**configAddress** | **String** | The configuration public key address of the candy machine  |  [optional]
**creators** | [**List&lt;GetCandyMetadataResponseCreators&gt;**](GetCandyMetadataResponseCreators.md) |  |  [optional]
**goLiveDate** | **BigDecimal** | The unix timestamp of the start date of the candy machine  |  [optional]
**isMutable** | **Boolean** |  |  [optional]
**itemsAvailable** | **BigDecimal** | The number of NFTs available for mint from the candy machine  |  [optional]
**itemsRedeemed** | **BigDecimal** | The number of NFTs minted already from the candy machine  |  [optional]
**maxNumberOfLines** | **BigDecimal** |  |  [optional]
**maxSupply** | **BigDecimal** |  |  [optional]
**price** | **BigDecimal** | The price in Lamports for minting an NFT from the candy machine. 1e9 Lamport  &#x3D; 1 SOL  |  [optional]
**retainAuthority** | **Boolean** |  |  [optional]
**sellerFeeBasisPoints** | **BigDecimal** | The royalty the creators receive on each sale after the primary sale (the initial minting) (denominated in basis points (e.g., 75 basis points &#x3D; 0.75%))  |  [optional]
**symbol** | **String** |  |  [optional]
**tokenMint** | **String** |  |  [optional]
**uuid** | **String** | The uuid of the candy machine |  [optional]
**wallet** | **String** | The public key address of the wallet that recevies the proceeds from NFT mints  |  [optional]



